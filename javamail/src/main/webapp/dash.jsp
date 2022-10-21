<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Model.user"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Bmail</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

 

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  	<link rel="stylesheet" type="text/css" href="css/fin.css">

  <!-- Main Stylesheet File -->
  <link href="css/style1.css" rel="stylesheet">
</head>

<body id="page-top">
 <%@ include file="dashboard.html" %>
  <!--/ Nav Star /-->
  <nav class="navbar navbar-b navbar-trans navbar-expand-md fixed-top" id="mainNav">

  </nav>
    <section >
  <!--/ Nav End /-->
<%
HttpSession httpSession = request.getSession();
user e = (user) httpSession.getAttribute("user");
%>
  <!--/ Intro Skew Star /-->
  <div id="home" class="intro route bg-image" style="background-image: url(img/img-header.svg)">
    <div class="overlay-itro"></div>
    <div class="intro-content display-table">
      <div class="table-cell">
        <div class="container">
          <!--<p class="display-6 color-d">Hello, world!</p>-->
          <h1 class="intro-title mb-4">Bienvenue chez Bmail</h1>
          <p class="intro-subtitle"><span class="text-slider-items"> <%=e.getNom() %> <%=e.getPrenom() %>,<%=e.getNom() %> <%=e.getPrenom() %>,<%=e.getNom() %> <%=e.getPrenom() %>,<%=e.getNom() %> <%=e.getPrenom() %>,<%=e.getNom() %> <%=e.getPrenom() %></span><strong class="text-slider"></strong></p>
        </div>
      </div>
    </div>
  </div>
    </section>
  <!--/ Intro Skew End /-->



  

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/popper/popper.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/counterup/jquery.waypoints.min.js"></script>
  <script src="lib/counterup/jquery.counterup.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/lightbox/js/lightbox.min.js"></script>
  <script src="lib/typed/typed.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/mn.js"></script>

</body>
</html>

