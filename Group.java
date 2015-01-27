package javalesson3home;
import java.util.*;

public class Group {

	private Student [] group;
	private int len;
	
	public Group ()
	{
		group = new Student[5];
		len = 0;
	}
	
	
	public Student searchBySurname(String sur)
	{
		for(int i=0; i < len;++i)
		{
			if(group[i].getSurname().compareToIgnoreCase(sur)==0)
				return group[i];
		}
		System.out.println("There is no such student");
		return new Student("","",0,"");
	}
	
	public void add(Student st) //throws MyArrayOutOfRangeException
	{
		//if( len > 4)
			//throw new MyArrayOutOfRangeException();
		group[len++] = st;
	}
	
	public void printInfo()
	{
		for ( int i=0; i < len; ++i)
		{
			System.out.println("Student ¹ " + i+ ": "); 
			group[i].printInfo();
		}
	}
	
	public void sortStudents (int flag)
	{
		if ( flag == 0)//surname
			Arrays.sort(group,new SortBySurname());
		else if (flag == 1)
			Arrays.sort(group, new SortByFaculty());
		return;
	}
}
