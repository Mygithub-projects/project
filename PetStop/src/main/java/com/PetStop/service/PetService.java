package com.PetStop.service;

import java.util.List;

import com.PetStop.model.Pet;
import com.PetStop.model.User;


public interface PetService {
	public List<Pet> searchAllByPetNameOrPetAgeOrPetPlace(String petname,int petage,String petplace);
	Pet savePet(Pet pet);
	List<Pet> searchAllByUser(User user);
	public Pet searchByPetId(Pet pet);
	//public List<Pet> searchAllByOwnerId(int ownerid);
	//public List<Pet> searchAllByUser(int ownerid);
	List<Pet> searchAll();
	public List<Pet> searchAllByUserNot(User user);
	public List<Pet> searchAllByUserNotOrUserNull(User user);
	public Pet searchByPetId(Integer id);

}
