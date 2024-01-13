package com.SpringFramework3.SpringFrameworkProg3.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Entity or Bean class or Pojo CLass
/* => The @Value annotation in spring is used to inject values into spring bean field or methods
 * => @value is mostly used to inject values from external source (e.g. properties files or environment variables)  */

@Component
public class student {
	@Value("1")
	private int id;
	@Value("Manisha")
	private String name;
	@Value("101")
	private int rollno;

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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void display() {
		System.out.println("ID = " + id);
		System.out.println("Name = " + name);
		System.out.println("RollNo  = " + rollno);

	}

}
