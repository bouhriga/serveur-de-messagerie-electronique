package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.Iuser;
import DAO.userDAO;
import Model.user;

@WebServlet("/modifierprofiladminform")

public class modifierprofiladminform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifierprofiladminform() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int id = Integer.parseInt(request.getParameter("id"));
		String Email = request.getParameter("email");
		String date = request.getParameter("date");
		String password = request.getParameter("motpasse");
		System.out.println("pas"+password);
		Iuser service = new userDAO();
		 user  ur = new user(id,Email,password,nom,prenom,date);
		 user  u = new user(id,Email,nom,prenom,date);
		if (password.equals("")) {
			 service.updateprofil2(u);
			System.out.println("nil nil"+password);
			HttpSession httpSession = request.getSession();
	        httpSession.setAttribute("user",u);
			 RequestDispatcher rd = request.getRequestDispatcher("liste");
				rd.forward(request, response);
		}else {
			 service.updateprofil(ur);
			System.out.println("pass pass"+password);
			HttpSession httpSession = request.getSession();
	        httpSession.setAttribute("user",ur);
			 RequestDispatcher rd = request.getRequestDispatcher("liste");
				rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
