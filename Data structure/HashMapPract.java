//created by zelmad mohamed.
//import util library.
import java.util.*;

public class HashMapPract{

    /*Inserts an entry with key x and value y in map */
    static void add_Value(HashMap<Integer,Integer> hm, int x, int y)
    {
	//Your code here
		hm.put(x, y);
    }
	
    /*Returns the value with key x from the map */
    static int find_value(HashMap<Integer, Integer> hm, int x)
    {
        //Your code here
		Integer r = 0;
		if(hm.containsKey(x)){
			r = hm.get(x);
			//System.out.println("voila notre r = "+ r);
		}
		else{
			r = -1;
		}
		return r;
    }
	
    /*Returns the size of the map */
    static int getSize(HashMap<Integer, Integer> hm)
    {
	//Your code here
		return hm.size();
    }
		
    /*Removes the entry with key x from the map */	
    static void removeKey(HashMap<Integer, Integer> hm, int x)
    {
	//Your code here	
		hm.remove(x);
    }
	
	//principal method main.
	
	public static void main(String[] args){
		//using HashMap (String) ket and (Integer) value;		
		
		//scanner for read our keyboard.
		Scanner scn = new Scanner(System.in);
		// test case.
		int testCase = Integer.parseInt(scn.nextLine());
		for(int i=0; i<testCase; i++){
			//nbr of operations.
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			int NbrOperation = Integer.parseInt(scn.nextLine());
			String chaine = scn.nextLine();
			String[] tab = chaine.split(" ");
 	        for(int j=0; j<tab.length; j++){
				//test the all cases of our nput.
				//case tab[j] == "a".
				if(tab[j].equals("a")){
					if(j+2 < tab.length){
						add_Value(hm, Integer.parseInt(tab[j+1]), Integer.parseInt(tab[j+2]));							
					}
				}
				//case tab[j] == "b".
				else if(tab[j].equals("b")){
					if(j+1 < tab.length){
						System.out.print(find_value(hm, Integer.parseInt(tab[j+1]))+" ");
					}
				}
				//case tab[j] == "c".
				else if(tab[j].equals("c")){
					System.out.print(getSize(hm)+" ");
				}
				//and finally case tab[j] == "d".
				else if(tab[j].equals("d")){
					if(j+1 < tab.length){
						removeKey(hm, Integer.parseInt(tab[j+1]));
					}
				}
//				hm.clear();
				
			}
			System.out.println();
		}
	}
}