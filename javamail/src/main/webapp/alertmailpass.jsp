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
  text: "Ce nom d'utilisateur est déjà utilisé et les mots de passe ne correspondent pas.Veuillez réessayer!",
  icon: "error",
  button: "Ok",
  
        	}).then(function(e){
        		location.href='sinscrire.jsp';
        	});
        	     
        
   
    </script>
  
</body>
</html>