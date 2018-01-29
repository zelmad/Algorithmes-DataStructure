//created by zelmad mohamed.
//import util library.

import java.util.*;

public class PriorityQueueImpl{
	
	public static void main(String[] args){
		
		PriorityQueue<String> pqueue = new PriorityQueue<String>();
		
		pqueue.add("C");
		pqueue.add("C++");
		pqueue.add("Java");
		pqueue.add("Python");
		
		Iterator<String> it1 = pqueue.iterator();
		while(it1.hasNext()){
			System.out.println("elets of priorityqueue are = "+it1.next());
		}
		
		String firstElts = pqueue.peek();
		System.out.println("After peeking the first elets of queue = " +firstElts);
		
		String pollElets = pqueue.poll();
		System.out.println("after polling an element in queue");
		
		Iterator<String> it2 = pqueue.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		
		pqueue.remove("Java");
		System.out.println("after removing an element in queue");
		
		Iterator<String> it3 = pqueue.iterator();
		while(it3.hasNext()){
			System.out.println(it3.next());
		}
		
		boolean b = pqueue.contains("Python");
		System.out.println("after testing existence of an element in queue = "+b);
		pqueue.add("je suis from tamtattoucht");
	    Object[] tab = pqueue.toArray();
		System.out.println("after transforming the pqueue to array");
		for(int j= 0; j<tab.length; j++){
			System.out.println("elets are = "+tab[j]);
		}
	}
	//frequency fonction.
}