package setfam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Object> set =new HashSet<Object>();
		Set<Integer> set2=new HashSet<Integer>();
		
		set2.add(1);
		set2.add(2);
		
		set.add(1);
		set.add(12);
		set.add(2);
		set.add("Alen");
		set.add(set2);
		set.add(true);
		set.add(true);
		set.add(set2);
		
		System.out.println(set);
		
		System.out.println(set.add("Ram"));
		System.out.println(set);
		System.out.println(set.add("Ram"));
		
		Set<Object> linkedHashSet =new LinkedHashSet<Object>();
		
		linkedHashSet.add(12);
		linkedHashSet.add(12);
		linkedHashSet.add(null);
		linkedHashSet.add("Alen");
		linkedHashSet.add(set2);
		linkedHashSet.add(true);
		linkedHashSet.add(true);
		linkedHashSet.add(set2);
		
		System.out.println(linkedHashSet);
		
		
		Iterator iterator= linkedHashSet.iterator();  
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}

}
