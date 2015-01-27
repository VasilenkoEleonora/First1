package javalesson3home;
import java.util.*;

public class Main {
public static void main(String[] args) {
	
	Group group1 = new Group();
	Scanner scan = new Scanner(System.in);
	
	String name,surname,faculty;
	int age = 0;
	boolean exit = false;
	int SIZE = 5;
	System.out.println("Welcome to th STUDENTs Database!");
	while (!exit)	{
		for( int i=0; i < SIZE; ++i) {
			System.out.println("Enter information about " + (i+1) + " student");
			System.out.println("Name: ");  
		  	  name = scan.next();
			System.out.println("Surname: "); 
			  surname = scan.next();
			for (;;) {	
		        	try{
			         	System.out.println("Age: ");
					age = scan.nextInt();
					break;
				}
				catch(InputMismatchException e)	{
					System.out.println("Enter a number");
				}
			}
			System.out.println("Faculty: "); 
			faculty = scan.next();
			group1.add(new Student(name,surname,age,faculty));
		}
		group1.printInfo();
		Operations.sortingOperation(group1);
		System.out.println("What do you want to do? enter new student(e)/ sort(s)/ exit(x)");
		String choice = scan.nextLine();
		if(choice.compareTo("e") == 0)
			continue;
		else if(choice.compareTo("s") == 0){
			Operations.sortingOperation(group1);
		}
		else if(choice.compareTo("x") == 0){
			exit = true;
		}
		else
			System.out.println("Programm wil start again");
	}
	return;
}
}
