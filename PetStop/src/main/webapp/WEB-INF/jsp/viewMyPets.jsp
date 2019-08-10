<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.PetStop.model.User"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PET STOP</title>
 <meta name="viewport" id="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no"/>

    <link rel="stylesheet" href="css/index.css">
</head>
<body >
<%! User u = null; %>
<% u = (User)session.getAttribute("sessionuser");%>

<center><h2>My Page </h2></center>
<div class="container" style="margin-top: 20px;">
		<jsp:useBean id="pagedListHolder" scope="request"
			type="org.springframework.beans.support.PagedListHolder" />
		<c:url value="/pet/viewmypets" var="pagedLink">
			<c:param name="p" value="~" />
		</c:url>

		<%-- <tg:paging pagedListHolder="${pagedListHolder}"
			pagedLink="${pagedLink}" /> --%>

<table class="table table-bordered">
<b></b><a href="/pet/viewallpets">Back</a></b><span><h3 stye="color:green" align="right"><%="Hi "+u.getUserName() %></h3></span>
<tr><th>Sr No<th>PET ID</th><th>PET NAME</th><th>PET AGE</th><th>PET PLACE</th></tr>
<c:forEach items="${pagedListHolder.pageList}" var="temp" varStatus="status">

                    <tr>
                    	<td>${status.index + 1}</td>
                    	<td>${temp.petId}</td>
                        <td>${temp.petName}</td>
                        <td>${temp.petAge}</td>
                        <td>${temp.petPlace}</td>
                                           
                    </tr>
                </c:forEach>
</table>
<tg:paging pagedListHolder="${pagedListHolder}"
			pagedLink="${pagedLink}" />
	</div>


</body>
</html>