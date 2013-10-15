package com.everis.dao;

import java.util.Collection;

import com.everis.model.entity.Login;

public interface LoginDAO {
	
public Login getLogin(int id);
public Collection getAllLogins();
public void saveLogin(Login login);
public void deleteLogin(Login login);

}
