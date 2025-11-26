import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class CollectionVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector<Integer> v=new Vector<Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(56);
		hs.add(34);
		hs.add(99);
		System.out.println(hs);
		hs.add(99); //duplicate cannot be added
		for(Integer i:hs)
		{
			System.out.println(hs);
		}
		// access element using iterator
		Iterator<Integer> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		hs.forEach(i->System.out.println(i));
		hs.forEach(System.out::println);
		hs.add(null);
		System.out.println("********");
		hs.forEach(i->System.out.println(i));
		
		
		//LinkedHashSet
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(67);
		lhs.add(null);
		lhs.add(null);
		System.out.println(lhs);
		
		
		

	}

}
