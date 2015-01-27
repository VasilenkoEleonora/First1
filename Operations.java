package javalesson3home;

import java.util.Scanner;

public  class Operations {

	public static void sortingOperation(Group group)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose how to sort : by surname(0) by faculty(1)");
		int sort = scan.nextInt();
		group.sortStudents(sort);
		group.printInfo();
		scan.close();
	}
}
