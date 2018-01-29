/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* You are required to complete below methods 
* created by zelmad mohamed from institute of telecommunications.
*/

import java.util.*;

class Setsss
{
    /*inserts an element x to the set s */
    static void insert(Set<Integer> s, int x)
    {
	// Your code here
        s.add(x);
    }
	
    /*prints the contents of the set s in ascending order */
    static void print_contents(Set<Integer> s)
    {
	// Your code here
        Set<Integer> se = new TreeSet<Integer>(s);
        ArrayList<Integer> list = new ArrayList<>(se);
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
	
    /*erases an element x from the set s */	
    static void erase(Set<Integer> s, int x)
    {
	// Your code here
        s.remove(x);
    }
	
    /*returns the size of the set s */
    static int size(Set<Integer> s)
    {
        // Your code here
        return s.size();
    }
		
    /*returns 1 if the element x is
    present in set s else returns -1 */
    static int find(Set<Integer> s, int x)
    {
	// Your code here	
        if(s.contains(x)){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int testCase = Integer.parseInt(scn.nextLine());
        for(int i=0; i< testCase; i++){

            Set<Integer> set = new HashSet<>();
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
                    print_contents(set);
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
            }
            System.out.println();
        }
    }
}