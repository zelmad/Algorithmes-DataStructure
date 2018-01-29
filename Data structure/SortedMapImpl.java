// use to solve roblemes "copy that."
//created by zelmad mohamed.
//import util library.

import java.util.*;

public class SortedMapImpl{
	
	public static void main(String[] args){
		SortedMap<Integer, String> smap = new TreeMap<Integer, String>();
		
		smap.put(4, "zelamd");
		smap.put(3, "mo");
		smap.put(2, "from");
		smap.put(1, "tamtattoucht");
		
		Set i = smap.entrySet();
		
		Iterator it =i.iterator();
		
		while(it.hasNext()){
			
			Map.Entry me = (Map.Entry) it.next();
			
			int key = (Integer) me.getKey();
			
			String value = (String) me.getValue();
			
			System.out.print("the key an value respectivelly are "+key+" "+value);
			System.out.println();
		}
		
	}
}
