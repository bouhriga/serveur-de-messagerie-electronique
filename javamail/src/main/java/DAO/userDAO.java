package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import Model.user;

public class userDAO implements Iuser{
	
	public void update(user user) {
		try {
			
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE users SET   email = ?, nom = ?,prenom = ?,birthday=? WHERE id = ?");
			stmt.setString(1,  user.getEmail());
			stmt.setString(2, user.getNom());
			stmt.setString(3, user.getPrenom());
			stmt.setString(4, user.getbirthday());
			stmt.setInt(5, user.getId());
			
			stmt.execute();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}
	
	public user findId(int id) {
		user u = null;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ? ");
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			if ( result.next()) {
				int UserID = result.getInt("id");
				String Email = result.getString("email");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String Password = result.getString("password");
				String birthday = result.getString("birthday");
				u = new user(UserID, Email, Password,nom,prenom,birthday);
			
		}
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
		return u;
	}
	public void debloquer(int id) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE users SET  active = ? WHERE id = ?");
			stmt.setInt(1, 1);
			stmt.setInt(2, id);
			stmt.execute();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}
	public void delete(int id) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM users WHERE id = ?");
			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}
	public void bloquer(int id) {
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE users SET  active = ? WHERE id = ?");
			stmt.setInt(1, 0);
			stmt.setInt(2, id);
			stmt.execute();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
	}
	//tous les utilisateurs
	public Collection<user> findAll() {
		Collection<user> users = new ArrayList<user>();
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users where is_admin = ?");
			stmt.setInt(1, 1);
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String Email = result.getString("email");
				String nom= result.getString("nom");
				String prenom= result.getString("prenom");
				String Password= result.getString("password");
				int Active = result.getInt("active");
				String birthday= result.getString("birthday");
				int id_domain= result.getInt("domaine_id");
				int is_admin= result.getInt("is_admin");
				System.out.println(nom);
				user u = new user(id,nom,prenom,Email, Password,Active,id_domain,birthday,is_admin);
				users.add(u);
			}
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return users;
	}

	//ajouter au login pour l'admin???
	public boolean is_admin(String email) {
		boolean m = false;
		
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE is_admin = ? and email = ?");
			stmt.setInt(1, 0);
			stmt.setString(2, email);
			ResultSet result = stmt.executeQuery();
			m=result.next();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return m;
	}
	public boolean mailexist(String email) {
		boolean m = false;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? ");
			stmt.setString(1, email);
			ResultSet result = stmt.executeQuery();
			m=result.next();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return m;
	}
	public void add(user user) {
		
		int D=1;
		try {

			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO users  VALUES (NULL, ?, ?, ?, ENCRYPT(?,'key'),?,?,?,?)");
			stmt.setString(1, user.getEmail());
			stmt.setString(2, user.getNom());
			stmt.setString(3, user.getPrenom());
			stmt.setString(4, user.getPassword());
			stmt.setInt(5, 1);
			stmt.setInt(6, 1);
			stmt.setString(7, user.getbirthday());
			stmt.setInt(8, 1);
			stmt.execute();
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		
	}
	public boolean findOne(String email,String password) {
		boolean m = false;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? and password =ENCRYPT(?,'key')");
			stmt.setString(1, email);
			System.out.print(email);
			stmt.setString(2,password);
			ResultSet result = stmt.executeQuery();
			m=result.next();
			System.out.print(m);
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return m;
	}

	public boolean Active(String email,String password) {
		boolean m = false;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? and password = ENCRYPT(?,'key')and active = ?");
			stmt.setString(1, email);
			stmt.setString(2, password);
			stmt.setInt(3, 1);
			ResultSet result = stmt.executeQuery();
			m=result.next();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		return m;
	}
	
	public user find(String email) {
		user u = null;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? ");
			stmt.setString(1, email);
			ResultSet result = stmt.executeQuery();
			if ( result.next()) {
				int id = result.getInt("id");
				String Email = result.getString("email");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String password = result.getString("password");
				int active = result.getInt("active");
				int id_domain = result.getInt("domaine_id");
				String birthday = result.getString("birthday");
				int is_admin = result.getInt("is_admin");

				u = new user(id,nom,prenom,Email,password,active,id_domain,birthday,is_admin);
			
		}
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
		return u;
	}
	public user findOne(String email) {
		user u = null;
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE email = ? ");
			stmt.setString(1, email);
			ResultSet result = stmt.executeQuery();
			if ( result.next()) {
				int id = result.getInt("id");
				String Email = result.getString("email");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String password = result.getString("password");
				int active = result.getInt("active");
				int id_domain = result.getInt("domaine_id");
				String birthday = result.getString("birthday");
				int is_admin = result.getInt("is_admin");

				u = new user(id,nom,prenom,Email,password,active,id_domain,birthday,is_admin);
			
		}
	} catch (SQLException ex) {
		System.out.println("Erreur SQL : " + ex.getMessage());
	}
		return u;
	}

	public void updateprofil(user ur) {
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE users SET   email = ?, password = ENCRYPT(?,'key') ,nom=? ,prenom=?, birthday=? WHERE id = ?");
			stmt.setString(1, ur.getEmail());
			stmt.setString(2, ur.getPassword());
			stmt.setString(3, ur.getNom());
			stmt.setString(4, ur.getPrenom());
			stmt.setString(5, ur.getbirthday());
			stmt.setInt(6, ur.getId());
			stmt.execute();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		
	}
	public void updateprofil2(user ur) {
		try {
			Connection conn = Singleton.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement("UPDATE users SET   email = ? ,nom=? ,prenom=?, birthday=? WHERE id = ?");
			stmt.setString(1, ur.getEmail());
			stmt.setString(2, ur.getNom());
			stmt.setString(3, ur.getPrenom());
			stmt.setString(4, ur.getbirthday());
			stmt.setInt(5, ur.getId());
			stmt.execute();
			
		} catch (SQLException ex) {
			System.out.println("Erreur SQL : " + ex.getMessage());
		}
		
	}

	
		
	}

