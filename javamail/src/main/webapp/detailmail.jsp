<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="Model.Email"%>
    
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

	Email e = (Email)request.getAttribute("email");
%>
            <div class="w-75 m-auto">
              <div class="card mb-3">
                <div class="card-body">
                   <center><h3><i class="fa-solid fa-calendar-day"></i> Détails pour votre Email </h3></center>
                    <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">À </h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getTo() %>
                    </div>
                  </div> 
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Objet </h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <%=e.getSubject() %>
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                      <%=e.getMessage() %>
                    </div>
                  </div>
                  
                  
               

             
            </div>
          </div>
  </form>
        </div>
    </div>
  
</body>

</html>