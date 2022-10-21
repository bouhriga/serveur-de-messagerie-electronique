package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Iuser;
import DAO.userDAO;
import Model.user;


@WebServlet("/loginserv")
public class loginserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
        String passwrd = request.getParameter("password");
        	System.out.print(email);
        	System.out.print(passwrd);
        	Iuser service = new userDAO();
        	if (service.findOne(email,passwrd)) {
        		if(service.Active(email,passwrd)) {
        			if(service.is_admin(email)){
        				user user =service.findOne(email);
            			HttpSession httpSession = request.getSession();
            	        httpSession.setAttribute("user",user);
            	        System.out.println("c'est un admin");
            	        response.sendRedirect("liste");
        			}else {
        				user userr =service.findOne(email);
        				user user = new user(userr.getId(),userr.getNom(),userr.getPrenom(),userr.getEmail(),passwrd,userr.getactive(),userr.getid_domain(),userr.getbirthday(),userr.getis_admin());
            			HttpSession httpSession = request.getSession();
            	        httpSession.setAttribute("user",user);
            	        System.out.println("c'est un utilisateur");
            	        response.sendRedirect("dash.jsp");
        			}
     
        		}else {
        		
        		response.sendRedirect("alertbloc.jsp");
        		}
        	}else {
        	
            		response.sendRedirect("alertlogin.jsp");
            	
        	}
        }
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
