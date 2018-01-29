/*
* Enumeration in java he is valuable for *vector* and *hashTable*.
* create :
        *Enumeration e = v.elements();
*methods:
        * hasMoreElement().
        * nextElement().
*/

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationss{
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i =0; i<10; i++)
			v.addElement(i);
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			int i = (Integer) e.nextElement();
			System.out.println("next elements = "+ i);
		}
	}
}
