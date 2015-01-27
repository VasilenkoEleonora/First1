package javalesson3home;

import java.util.*;

public class Student extends Person{

	private String faculty;
	public Student(String _name,String _surname,int _age, String _faculty)
	{
		super(_name,_surname,_age);
		faculty = _faculty;
	}
	
	public void printInfo()
	{
		super.printInfo();
		System.out.println("     Faculty: " + faculty);
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	
}
