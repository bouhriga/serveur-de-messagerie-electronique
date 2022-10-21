<%@page import="Model.user"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<head>
	<title>Envoyer l'email</title>
	<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/liste.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
	#wrapper{
		width: fit-content;
		font-size:14px;
	}
</style>
</head>
<body>
 <div id="wrapper">
 
   <%

	Collection<user> users = (Collection<user>)request.getAttribute("users");
%>

  <h1>Bienvenue dans Bmail &nbsp; <a href="profiladmin.jsp" ><i class="fa-solid fa-user"></i></a></h1>
 

  <table id="keywords" cellspacing="0" cellpadding="0">
    <thead>
      <tr>
   
        <th><span>Nom</span></th>
        <th><span>Prénom</span></th>
        <th><span>Email</span></th>
        <th><span>Date de naissance</span></th>
          <th><span>Active</span></th>
          <th>Modifier</th>
          <th>Supprimer</th>
          <th>Bloquer</th>
          <th>Debloquer</th>
      </tr>
    </thead>
    <%
	for(user e : users){
%>
     <tbody>
      <tr>
        <td><%=e.getNom() %></td>
        <td><%=e.getPrenom() %></td>
        <td><%=e.getEmail() %></td>
        <td><%=e.getbirthday() %></td>
        <td><%=e.getactive() %></td>
       <td><a href="modifieruserform?id=<%=e.getId() %>" ><i class="fa-solid fa-pen"></i></a></td>
       <td><a href="supetd?id=<%=e.getId() %>" ><i class="fa-solid fa-trash-can"></i></a></td>
       <td><a href="bloqserv?id=<%=e.getId() %>" ><i class="fa-solid fa-lock"></i></a></td>
       <td><a href="debloserv?id=<%=e.getId() %>" ><i class="fa-solid fa-unlock"></i></a></td>
      </tr>
      
    	<%
	}
%>
    </tbody>
  </table>
 </div> 
<script >
$(function(){
	  $('#keywords').tablesorter(); 
	});
	</script>
</body>
</html>