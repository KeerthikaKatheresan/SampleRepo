import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.mavenNov22.MavenNov25.Student;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(20);
		ts.add(34);
		ts.add(5);
		
		System.out.println(ts);	//op displayed as sorted and print
		System.out.println(ts.ceiling(10));
		System.out.println(ts.floor(35));
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println(ts.headSet(20));//number less than 34
		System.out.println(ts.tailSet(20)); //everything from a given element onward.
		//System.out.println(ts.tailSet(1));
		System.out.println(ts.higher(5));//the next bigger element after the given one.
		System.out.println(ts.lower(6));
		
		
		TreeSet<Student> tss=new TreeSet<Student>();
		tss.add(new Student(123,"Swapna",40,90,"Hyderabad"));
		tss.add(new Student(124,"Keerthhi",21,95,"Tj"));
		tss.add(new Student(125,"tupa",90,90,"Chennai"));
		tss.add(new Student(126,"moha",45,90,"Chennai"));
		tss.add(new Student(201, "Arjun", 22, 88, "Delhi"));
		tss.add(new Student(200, "Arjun", 22, 88, "Delhi"));
		
		for(Student s:tss)
		{
			System.out.println(s);//need to specify comparable
		}
		
		

	}

}
