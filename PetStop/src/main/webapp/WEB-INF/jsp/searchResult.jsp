<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center><h2>SEARCHED RESULT </h2></center>
<div class="container" style="margin-top: 20px;">
		<jsp:useBean id="pagedListHolder" scope="request"
			type="org.springframework.beans.support.PagedListHolder" />
		<c:url value="/pet/advanceSearch" var="pagedLink">
			<c:param name="p" value="~" />
		</c:url>

<table>
<tr><th>PET ID</th><th>PET NAME</th><th>PET AGE</th><th>PET PLACE</th></tr>

<c:forEach  items="${pagedListHolder.pageList}" var="temp" >
					
                    <tr>

				<td>${temp.petId}</td> 
				<td>${temp.petName}</td>
				<td>${temp.petAge}</td> 
				<td>${temp.petPlace}</td>
                        
                    </tr>
                </c:forEach>
  
      
</table>
<tg:paging pagedListHolder="${pagedListHolder}"
			pagedLink="${pagedLink}" />
</body>
</html>