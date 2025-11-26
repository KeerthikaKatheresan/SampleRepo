import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap 
//		HashMap<Integer,String> hm=new HashMap<Integer,String>();
//		hm.put(1, "hyd");
//		hm.put(43, "bglr");
//		hm.put(23, "ch");
//		hm.put(5, "dl");
//		System.out.println(hm);
//		hm.put(23, "ty");
//		System.out.println(hm);
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());//print all key value pair in clean 
//		System.out.println(hm.get(23)); //op:value
//		System.out.println(hm.getOrDefault(6,"Md"));//if value for 6 found na return that value or return "Md"(default)
//		
//		Set<Integer> keySet=hm.keySet();
//		Iterator<Integer> keyItr=keySet.iterator();
//		while(keyItr.hasNext())
//		{
//			System.out.println(keyItr.next());
//		}
//		
//		Collection<String> cv=hm.values();
//		Iterator<String> vitr=cv.iterator();
//		while(vitr.hasNext())
//		{
//			System.out.println(vitr.next());
//		}
//		
//		Set<Entry<Integer, String>> s1=hm.entrySet();
//		Iterator<Entry<Integer, String>> i1=s1.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
//		
		//TreeMap-> sorted based on key order TreeMap<K,V>
//		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
//		tm.put(1, 1);
//		tm.put(7, 49);
//		tm.put(2, 4);
//		tm.put(4, 16);
//		System.out.println(tm);
//		System.out.println(tm.get(2));
//		System.out.println(tm.ceilingEntry(5)); //op k-v based on least key greater than or equal 
//		System.out.println(tm.floorEntry(5)); //op k-v based on high key less than or equal 
//		System.out.println(tm.descendingKeySet());
//		System.out.println(tm.descendingMap()); //reverse order
		 
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();	//legacy class and you can convert it into enumuration
		//enumuration is similar to iterator but it is legacy
		ht.put(3,"kavi");
		ht.put(6,"bheli");
		ht.put(7,"mega");
		System.out.println(ht);
		Enumeration<Integer> keys=ht.keys();
		while(keys.hasMoreElements())
		{
			System.out.println(keys.nextElement());
		}
		
		Enumeration<String> values=ht.elements();
		while(values.hasMoreElements())
		{
			System.out.println(values.nextElement());
		}
		
		
		
		
		
		
		
		
		

	}

}
