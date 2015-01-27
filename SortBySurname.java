package javalesson3home;

import java.util.Comparator;

public class SortBySurname implements Comparator<Student>
{
	@Override
	public int compare (Student st1,Student st2)
	{
		if(st1.getSurname().compareTo(st2.getSurname()) < 0)
			return -1;
		if(st1.getSurname().compareTo(st2.getSurname()) > 0)
			return 1;
		return 0;
	} 
}
	

