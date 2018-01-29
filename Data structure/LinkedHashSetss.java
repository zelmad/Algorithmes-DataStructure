/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* You are required to complete below methods 
* created by zelmad mohamed from institute of telecommunications.
*/
import java.util.*;

public class LinkedHashSetss{

	 /*inserts an element x to the set s */
    static void insert(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
    	s.add(x);
    }
	
    /*prints the contents of the set s in ascending order */
    static void print_Contents_Increasing_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
    	HashSet<Integer> hash = new HashSet<Integer>(s);
    	TreeSet<Integer> se = new TreeSet<Integer>(hash);
    	Iterator<Integer> it = se.iterator();
    	while(it.hasNext()){
    		System.out.print(it.next()+" ");
    	}

    }
     /*prints the contents of the set s in ascending order */
    static void print_Contents_Insertion_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
    	Iterator<Integer> it = s.iterator();
    	while(it.hasNext()){
    		System.out.print(it.next()+" ");
    	}
    }
	
    /*erases an element x from the set s */	
    static void erase(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
    	s.remove(x);
    }
	
    /*returns the size of the set s */
    static int size(LinkedHashSet<Integer> s)
    {
        // Your code here
       return s.size();
   }
		
    /*returns 1 if the element x is
    present in set s else returns -1 */
    static int find(LinkedHashSet<Integer> s, int x)
    {
	// Your code here	
    	if(s.contains(x)){
    		return 1;
    	}else{
    		return -1;
    	}
    }

	public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int testCase = Integer.parseInt(scn.nextLine());
        for(int i=0; i< testCase; i++){

            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            String str = scn.nextLine();
            int followTesCas = Integer.parseInt(str);
            String[] tab = scn.nextLine().split(" ");
            for(int u = 0; u < tab.length; u++){

                if(tab[u].equals("a"))
                { 
                    if(u < tab.length - 1){
                        insert(set, Integer.parseInt(tab[u+1]));
                    }
                }
                else if(tab[u].equals("b")) {
                    print_Contents_Increasing_Order(set);
                }
                else if(tab[u].equals("c")){
                    if(u < tab.length - 1){
                        erase(set , Integer.parseInt(tab[u+1]));
                    }
                }
                else if(tab[u].equals("d")) {
                    if(u < tab.length - 1){
                        System.out.print(find(set, Integer.parseInt(tab[u+1]))+" ");
                    }
                }
                else if(tab[u].equals("e")){
                    System.out.print(size(set)+" ");
                }
                else if(tab[u].equals("f")){
                    print_Contents_Insertion_Order(set);
                }
            }
            System.out.println();
        }
    }
}
