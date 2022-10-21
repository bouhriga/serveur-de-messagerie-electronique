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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
</head>
<body>
<header>

		
			<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light"  >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Collapsible wrapper -->
    <div class="collapse navbar-collapse" id="navbarSupportedContent">

      <center><h3>Mes informations</h3></center> 
    </div>
   
</nav>
<!-- Navbar -->
	</header>
<div class="container">
    <div class="main-body">    
<form action="" >
<%
HttpSession httpSession = request.getSession();
user e = (user) httpSession.getAttribute("user");
%>
          <div class="row gutters-sm">
            <div class="col-md-4 mb-3">
              <div class="card">
                <div class="card-body">
                  <div class="d-flex flex-column align-items-center text-center">
                    <img src="5.PNG"  class="rounded-circle" width="150">
                    <div class="mt-3">
                    <p class="text-secondary mb-1">Bienvenue dans Bmail</p>
                      <h4>Notre Admin <%=e.getNom() %> <%=e.getPrenom() %></h4>
                      
                       <a class="btn btn-secondary" target="__blank" href="liste"> Retourner </a>
                     <a class="btn btn-primary " target="__blank" href="profiladmin2.jsp"> Modifier  </a>
                     <a class="btn btn-info "  target="__blank" href="logout">Deconnecter</a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-8">
              <div class="card mb-3">
                <div class="card-body">
                
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
              </div>

             
            </div>
          </div>
  </form>
        </div>
    </div>
  
</body>

</html>