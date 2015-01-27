package javalesson3home;

import java.util.Comparator;

public class SortByFaculty implements Comparator <Student>{

	@Override
	public int compare(Student st1, Student st2)
	{
		if(st1.getFaculty().compareTo(st2.getFaculty()) < 0)
			return -1;
		if(st1.getFaculty().compareTo(st2.getFaculty()) > 0)
			return 1;
		return 0;
	}
}
