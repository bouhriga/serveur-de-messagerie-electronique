/**
 * 
 */
package DAO;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import Model.Email;
import Model.user;


public class emailDAO implements Iemail{
public void add(Email Email) {
	try {
		Connection conn = (Connection) Singleton.getInstance().getConnection();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO box  VALUES (NULL, ?, ?, ?,?,DATE_FORMAT(?,'%a %b %e %T %Y'))");
		stmt.setString(1, Email.getFrom());
		stmt.setString(2, Email.getTo());
		stmt.setString(3, Email.getSubject());
		stmt.setString(4, Email.getMessage());
		stmt.setObject(5, Email.getCreatedAt());
		stmt.execute();
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}	
		
	}
public Collection<Email> findAll(user user) {
	Collection<Email> emails = new ArrayList<Email>();
	
	try {
		Connection conn = Singleton.getInstance().getConnection();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM box WHERE froom = ?");
		System.out.println("dfghjkkkkkkkk");
		stmt.setString(1,user.getEmail());
		ResultSet result = stmt.executeQuery();
		while(result.next()) {
			int id = result.getInt("id");
			String from = result.getString("froom");
			String to= result.getString("to");
			String objet= result.getString("objet");
			String email= result.getString("email");
			String date= result.getString("date");
		
			Email u = new Email(id,from,to,objet,email,date);
			System.out.println("2"+u.getMessage()+u.getSubject()+u.getd());
			emails.add(u);
		}
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
	return emails;
}
public void delete(int id) {
	try {

		Connection conn = Singleton.getInstance().getConnection();
		PreparedStatement stmt = conn.prepareStatement("DELETE FROM box WHERE id = ?");
		stmt.setInt(1, id);
		stmt.execute();
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
}

public Email findId(int id) {
	Email u = null;
	try {
		Connection conn = Singleton.getInstance().getConnection();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM box WHERE id = ? ");
		stmt.setInt(1, id);
		ResultSet result = stmt.executeQuery();
		if ( result.next()) {
			int idd = result.getInt("id");
			String froom = result.getString("froom");
			String to = result.getString("to");
			String objet = result.getString("objet");
			String email = result.getString("email");
			String date = result.getString("date");
			u = new Email(idd, froom, to,objet,email,date);
		
	}
} catch (SQLException ex) {
	System.out.println("Erreur SQL : " + ex.getMessage());
}
	return u;
}
}
