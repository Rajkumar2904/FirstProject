package org.read;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Conversion {
public static void main(String[] args) throws JAXBException {
	JAXBContext ja = JAXBContext.newInstance(Employee.class);
	Unmarshaller un = ja.createUnmarshaller();
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\XmlFile\\xml\\EmployeeDetails.xml");
	Object o = un.unmarshal(f);
	Employee e=(Employee)o;
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getEmail());
	System.out.println(e.getPhno()); 
}
}
