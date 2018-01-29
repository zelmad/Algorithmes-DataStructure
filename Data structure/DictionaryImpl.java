//created by zelmad mohamed.
//for Dictionnary Implementation.
 
import java.util.*;
public class DictionaryImpl{
	
	public static void main(String[] args){
		
		Dictionary dic = new Hashtable();
		
		dic.put("132", "code");
		dic.put("130", "programme");
		
		for(Enumeration i = dic.elements(); i.hasMoreElements();){
			System.out.println("dictionary element "+i.nextElement());
		}
		 
        // get() method :
        System.out.println("\nValue at key = 6 : " + dic.get("6"));
        System.out.println("Value at key = 456 : " + dic.get("132"));
 
        // isEmpty() method :
		System.out.println("check if our dictionary is empty it's " + dic.isEmpty());
	}
}