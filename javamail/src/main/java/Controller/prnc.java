package Controller;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Email;
import Model.user;
import sendmail.ReceivingMail;


@WebServlet("/prnc")

public class prnc extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ReceivingMail receivingMail = new ReceivingMail();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public prnc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession httpSession = request.getSession();
        user user = (user) httpSession.getAttribute("user");
       Collection<Email> emails=receivingMail.receiving(user);
       for(Email e : emails){
    	   System.out.print("le message de boite++++++++++++++++++++++++"+e.getMessage());
       }
       request.setAttribute("emails",emails);
       RequestDispatcher dispatcher = getServletContext()
               .getRequestDispatcher("/home.jsp");
       dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
