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

 <form action="modifierprofiluser" >
<%
HttpSession httpSession = request.getSession();
user e = (user) httpSession.getAttribute("user");
%>
<%@ include file="dashboard.html" %>
            <div class="w-75 m-auto">
              <div class="card mb-3">
                <div class="card-body">
               
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Nom</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                         <input type="text" class="form-control" value=" <%=e.getNom() %>" name="nom" id="nom" required >
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Prenom</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                         <input type="text" class="form-control" value=" <%=e.getPrenom() %>" name="prenom" id="prenom" required >
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Email</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                         <input type="email" class="form-control" value=" <%=e.getEmail() %>"  readonly name="email" id="email" required >
                    </div>
                  </div>
                  <hr>
                   <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Date de naissance</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                         <input type="date" class="form-control" value="<%=e.getbirthday() %>" name="date" id="date" required >
                    </div>
                  </div>
                  <hr>
                  <div class="row">
                    <div class="col-sm-3">
                      <h6 class="mb-0">Mot de Passe</h6>
                    </div>
                    <div class="col-sm-9 text-secondary">
                     <input type="password" class="form-control"  name="motpasse" id="motpasse"  >
                    </div>
                  </div>
                  <hr>
                  <input  name="id" type="hidden" value="<%=e.getId() %>">
                  <div class="row">
                    <div class="col-sm-12">
                      <center><input type="submit" id="submit" value="Modifier" name="submit" class="btn btn-primary"></center>
                    </div>
                  </div>
                </div>
              </div>

            </div>
          </div>

        </div>
    </div>
     </form>
</body>
</html>