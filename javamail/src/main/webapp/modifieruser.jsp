<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
 <%@page import="Model.user"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
<h1>Modifier l'utilisateur</h1>

<form action="modifieruserExec" method="get">
<%
	user e = (user)request.getAttribute("user");
%>

                       <input type="hidden"  name="UserID" value="<%=e.getId() %>">
 
  <div class="form-group row">
    <label for="prenom" class="col-sm-2 col-form-label">l'email</label>
    <div class="col-sm-6">
      <input type="text" name="email" class="form-control"  readonly value="<%=e.getEmail() %>"  >
    </div>
  </div>
  
  <div class="form-group row">
    <label for="note" class="col-sm-2 col-form-label">Nom </label>
    <div class="col-sm-6">
      <input type="text" name="nom" class="form-control"  value="<%=e.getNom() %>" >
    </div>
  </div>
  <div class="form-group row">
    <label for="note" class="col-sm-2 col-form-label">Prenom</label>
    <div class="col-sm-6">
      <input type="text" name="prenom" class="form-control"  value="<%=e.getPrenom() %>" >
    </div>
  </div>
 
   <div class="form-group row">
    <label for="note" class="col-sm-2 col-form-label">Date de naissance</label>
    <div class="col-sm-6">
      <input type="date" name="date" class="form-control"  value="<%=e.getbirthday() %>" >
    </div>
  </div>
  
  <button type="submit" class="btn btn-danger mb-2">Modifier</button>
</form>

</body>
</html>