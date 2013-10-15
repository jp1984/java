package com.everis.model.entity;

public class Login {
private int id;
private String user;
private String password;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Login(int id, String user, String password) {
	setId(id);
	setUser(user);
	setPassword(password);
}


}
