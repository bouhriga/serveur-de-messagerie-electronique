<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="Model.user"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/profil.css">
 <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<!--         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">  -->
        	<link rel="stylesheet" type="text/css" href="css/fin.css">
          
</head>
<body>
<%@ include file="dashboard.html" %>
<div class="container">
    <div class="main-body">    
<form action="" >
<%
HttpSession httpSession = request.getSession();
user e = (user) httpSession.getAttribute("user");
%>
       
            <div class="w-75 m-auto">
              <div class="card mb-3">
                <div class="card-body">
                   <center><h3><i class="fa-solid fa-user"></i>  Vos informations  </h3></center>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getNom() %>
                    </div>
                  </div> 
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Prenom</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getPrenom() %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getEmail() %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Date de naissance</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getbirthday() %>
                    </div>
                  </div>
                  
                 
            
                </div>
                <a class="btn btn-primary " target="__blank" href="profiluser2.jsp"> Modifier  </a>
              </div>

             
            </div>
          </div>
  </form>
        </div>
    </div>
  
</body>

</html>