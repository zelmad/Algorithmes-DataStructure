/*
* Iterator
          --- any collection object.
          --- creat by """"Iterator itr = objet.iterator()"""";
          --- methods : 
                       __ public boolean hasNext();
                       __ public object next();
                       __ public void remove();
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorss{

	public static void main(String[] args){

		ArrayList list = new ArrayList();
		for(int i = 0; i<10; i++)
			list.add(i);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){

			int i = (Integer) itr.next();
			System.out.print(i+" ");

			if(i%2 != 0)
				itr.remove();
		}
		System.out.println();
		System.out.println(list);
	}
}