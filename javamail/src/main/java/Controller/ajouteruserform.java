package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Iuser;
import DAO.userDAO;
import Model.user;

/**
 * Servlet implementation class ajouteruserform
 */

@WebServlet("/ajouteruserform")

public class ajouteruserform extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		String date = request.getParameter("date");
		String mail = request.getParameter("mail");
		String email = mail+"@bouhriga.local";
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");

		
		
		
    	Iuser service = new userDAO();
    	System.out.println(mail+email+pass1+"  "+pass2);
    	if(service.mailexist(email)){
			if(pass1.equals(pass2)) {
				response.sendRedirect("alertmail.jsp");
			}else {
    			response.sendRedirect("alertmailpass.jsp");
        	}
		}else {
			if(pass1.equals(pass2)) {
			        user user = new user(nom, prenom,email,pass1,date);
				   	System.out.println("user"+user.getEmail()+user.getNom()+"  "+user.getPassword());
				    service.add(user);
				    response.sendRedirect("login.jsp");
				    	
				  
		    }else {
			   
			    response.sendRedirect("alertpass.jsp");
		    }
        }
    	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
