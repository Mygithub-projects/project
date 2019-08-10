<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Pet Stop</title>

      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
      <style type='text/css'>
* {
    font: 16px sans-serif;
    padding: 5px;
    color: black;
    text-align:center;
}
label {
     
      color: rgb(75, 75, 75);
}


label {
  
    text-align:right;
    width: 50px;
}
input[type='text'] {
    color: black;
    border: 3px solid black;
}
input[type='text'][name='username'] {
  
    color: black;
    border: 3px solid black;
}
input[type='password'][name='password'] {
    
    color: black;
    border: 3px solid black;
}
input[type='password'][name='passwordConfirm'] {
  
    color: black;
    border: 3px solid black;
}


</style>
      
  </head>

  <body>
  <fieldset>
  <legend><b>USER REGISTRATION</b></legend>
  <table align="center">
    <tr><td><div class="container" align="center">
        <form:form method="POST" modelAttribute="userForm" class="form-signin">
     <tr><td></td><td>   <h1 class="form-signin-heading" align="center"><b>    USER REGISTRATION</b></h1></td></tr>
           
            <tr><td><spring:bind path="userName">
                <div class="form-group ${status.error ? 'has-error' : ''}" align="center">
               <form:label path="userName">Username</form:label></td>
		 
		   
                  <td><form:input type="text" path="userName" class="form-control" placeholder="Username"
                                autofocus="true"></form:input></td>
                   <td><form:errors path="userName" style="color: red"></form:errors></td></tr>
                   </div></td></tr>
               </spring:bind>

            <spring:bind path="password">
                <div class="form-group ${status.error ? 'has-error' : ''}" align="center">
                    <tr><td><form:label path="password">Password</form:label></td>
                    <td></t></t><form:input type="password" path="password" class="form-control" placeholder="Password"></form:input></td>
                   <td><form:errors path="password" style="color: red"></form:errors></font></td></tr>
                </div>
            </spring:bind>

            <spring:bind path="passwordConfirm">
                <div class="form-group ${status.error ? 'has-error' : ''}" align="center">
           
                <tr><td>  <form:label path="passwordConfirm">Confirm Password</form:label></td>
                    <td><form:input type="password" path="passwordConfirm" class="form-control"
                                placeholder="Confirm your password"></form:input></td>
                   <td> <form:errors path="passwordConfirm" style="color: red"></form:errors></td></tr>
                </div>
            </spring:bind>

          <tr>
          <td><button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button></td>
           <td><button class="btn btn-lg btn-primary btn-block" type="reset" value="reset">Reset</button></td>
          </tr>
          
        </form:form>

    </div>
     </fieldset>
    

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
    </table>
    
    
  </body>
</html>
