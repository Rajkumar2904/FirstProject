package org.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Conversion {
public static void main(String[] args) throws Exception {
	JAXBContext ja = JAXBContext.newInstance(Employeeold.class);
	Unmarshaller un = ja.createUnmarshaller();
	File f=new File("C:\\Users\\HP\\eclipse-workspace\\XmlFile\\xml\\UpdateDetails.xml");
	Object o = un.unmarshal(f);
	Employeeold e=(Employeeold)o;
	System.out.println(e.getName());
	
	
}
}
