package org.read;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
private int id;
private String name;
private String email;
private long phno;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

}
