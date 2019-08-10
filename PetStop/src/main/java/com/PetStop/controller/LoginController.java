package com.PetStop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.PetStop.model.User;
import com.PetStop.service.UserService;
import com.PetStop.validation.UserValidator;
@Controller
@Scope("request")
@SessionAttributes("sessionuser")
public class LoginController {

	
	/*@Autowired

	private User user;*/

	@Autowired

	private UserService userService;

	@Autowired 

	private UserValidator userValidator; 

	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	   public String init(Model model ) {
	     //model.addAttribute("user",new User());
	     return "login";
	   }

	   @RequestMapping(value="/receivevalues", method = RequestMethod.POST)
	   public ModelAndView submit(Model model,@ModelAttribute("user") User user,HttpSession session) {
		   User u =  userService.searchByUserNameAndPassword(user.getUserName(),user.getPassword());
		   System.out.println(u);
		   
		   if(u==null)
				{
			     System.out.println("Invalid user");
			   	 model.addAttribute("error", "Invalid Details");
				  return new ModelAndView("redirect:/login");
				 }
			else{
				System.out.println("valid user");
				model.addAttribute("msg","Welcome "+u.getUserName());
				session.setAttribute("sessionuser", u);
				return new ModelAndView("redirect:/pet/home");
				}	     
	   }
	   
	   @GetMapping("/registration") 

	   public ModelAndView registration(Model model)

	  	{ 

	  		return new ModelAndView("registration","userForm",new User()); 

	    } 

	  

	   @PostMapping("/registration") 

	   public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult,Model model) { 

	        userValidator.validate(userForm, bindingResult); 

	        if (bindingResult.hasErrors()) { 

	            return "registration"; 

	        } 

	        userService.save(userForm); 

	        model.addAttribute("user",userForm.getUserName());

	        return "successfullreg";

	        } 
	   @RequestMapping(value = "/logout", method = RequestMethod.GET)
	   public ModelAndView logout(Model model,HttpSession session ) {
	     session.invalidate();
	     return new ModelAndView("redirect:/login");
	   }
}
