<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<script>
        
swal({
	  title: "Merci beaucoup!",
	  text: "Impossible de se connecter à votre compte, votre compte est bloquer!",
	  icon: "error",
	  button: "Ok",
	  
	}).then(function(e){
		location.href='login.jsp';
	});
	     
   
    </script>
</body>
</html>