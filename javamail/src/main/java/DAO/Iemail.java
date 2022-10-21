package DAO;

import java.util.Collection;

import Model.Email;
import Model.user;

public interface Iemail {
	public void add(Email email);
	public Collection<Email> findAll(user user);
	public void delete(int id);
	public Email findId(int id);
}
