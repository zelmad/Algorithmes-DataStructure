/*
  --ListIterator :
                --- it used just for list object.
                --- create by:
                             ___ ListIterator li = L.listIterate();
                --- methods: 
                             ___ public boolean hasNext();
                             ___ public object next();
                             ___ public int nextIndex();
                             ___ public boolean hasPrevious();
                             ___ public object previous();
                             ___ public int previousIndex();
                             ___ public void remove();
                             ___ public void set(Object obj);
                             ___ public void add(Object obj);
*/

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterateurss{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		for(int i=0; i< 10; i++)
			list.add(i);
		System.out.print(list);
		ListIterator li = list.listIterator();
		while(li.hasNext()){
			int i = (Integer) li.next();
			System.out.print(i+" ");
			if(i%2 == 0){
				i++;
				li.set(i);
				li.add(i);
		   }
		}
		System.out.println();
		System.out.println(list);
	}
}