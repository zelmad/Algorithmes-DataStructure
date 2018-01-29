//created by zelmad mohamed
// learn java to be a proffesional.

import java.util.TreeMap;
import java.util.NavigableMap;

public class NavigableMapImpl{
	
	public static void main(String[] args){
		
		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
		
		nm.put("C", 888);
		nm.put("A", 651);
		nm.put("B", 299);
		nm.put("H", 8797);
		nm.put("Y", 452);
		nm.put("D", 9752);
		nm.put("A", 2897);
		nm.put("C", 26542);
		nm.put("A", 762372527);
		
		System.out.printf("Descending Set  : %s%n", nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n", nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n", nm.firstEntry());
        System.out.printf("Last Key : %s%n", nm.lastKey());
        System.out.printf("First Key : %s%n", nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n", nm.descendingMap());
	}
}
