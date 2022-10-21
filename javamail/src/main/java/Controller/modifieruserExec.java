package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Iuser;
import DAO.userDAO;
import Model.user;

/**
 * Servlet implementation class modifieruserExec
 */
@WebServlet("/modifieruserExec")
public class modifieruserExec extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifieruserExec() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int UserID = Integer.parseInt(request.getParameter("UserID"));
		String email = request.getParameter("email");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date = request.getParameter("date");
		 Iuser service = new userDAO();
		 user ur = new user(UserID, email,nom,prenom,date);
		 service.update(ur);
		 RequestDispatcher rd = request.getRequestDispatcher("liste");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
