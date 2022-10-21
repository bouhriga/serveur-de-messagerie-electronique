package DAO;

import java.sql.SQLException;
import java.util.Collection;

import Model.user;


public interface Iuser {
	public boolean findOne(String email,String password);
	public boolean Active(String email, String passwrd);
	public user findOne(String email);	
	public void add(user user);
	boolean mailexist(String email);
	public boolean is_admin(String email);
	public Collection<user> findAll();
	public void delete(int id);
	public void bloquer(int id);
	public void debloquer(int id);
	public user findId(int id);
	public void update(user ur);
	public void updateprofil(user ur);
	public void updateprofil2(user u);
	
}
