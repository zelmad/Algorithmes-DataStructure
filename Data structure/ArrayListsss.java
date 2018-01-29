import java.util.*;
import java.io.*;

public class ArrayListsss{

            /*inserts an element x at 
    the back of the ArrayList A */
    static void add_to_ArrayList(ArrayList<Integer> A, int x)
    {
    // Your code here
        A.add(x);
    }   
    
    /*sort the ArrayList A in ascending order*/
   static void sort_ArrayList_Asc(ArrayList<Integer> A)
    {
    // Your code here   
        Collections.sort(A);

    }
    
    /*reverses the ArrayList A*/
    static void reverse_ArrayList(ArrayList<Integer> A)
    {
    // Your code here
        Collections.reverse(A);
    }
    
    /*returns the size of the ArrayList A */
    static int size_Of_ArrayList(ArrayList<Integer> A)
    {
    // Your code here
        return A.size();
    }
    
    /*sorts the ArrayList A in descending order*/
    static void sort_ArrayList_Desc(ArrayList<Integer> A)
    {
    // Your code here
        Collections.sort(A);
        Collections.reverse(A);
    }
    /*prints space separated 
    elements of ArrayList A*/
    static void print_ArrayList(ArrayList<Integer> A)
    {
        // Your code here
        for(int i = 0; i < A.size(); i++)
        {
            System.out.print(A.get(i)+" ");
        }
    }
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int testCase = Integer.parseInt(scn.nextLine());
        for(int i=0; i< testCase; i++){
            ArrayList<Integer> list = new ArrayList<>();
            String str = scn.nextLine();
            int followTesCas = Integer.parseInt(str);
            String[] tab = scn.nextLine().split(" ");
            for(int u = 0; u < tab.length; u++){
                if(tab[u].equals("a"))
                { 
                    if(u < tab.length - 1){
                        add_to_ArrayList(list, Integer.parseInt(tab[u+1]));
                    }
                }
                else if(tab[u].equals("b")) {
                    sort_ArrayList_Asc(list);
                }
                else if(tab[u].equals("c")){
                    reverse_ArrayList(list);
                }
                else if(tab[u].equals("d")) {
                    System.out.print(size_Of_ArrayList(list)+" ");
                }
                else if(tab[u].equals("f")){
                    sort_ArrayList_Desc(list);
                }
                else if(tab[u].equals("e")){
                    print_ArrayList(list);
                }
            }
            System.out.println();
        }
    }
}