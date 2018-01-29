/*
* this exemple is for testing the set 1 of methods in HashMap.
*/
/**
 *
 * @author zelmad
 */
import java.util.*;

public class hashmap {

    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "france");
        hm.put(2, "almend");
        hm.put(3, "suisse");
        hm.put(4, "london");
        hm.put(5, "Australia");
        hm.put(6, "America");
        
        System.out.println("let get some tests about keys in this HashMap");
        while(! hm.isEmpty()){
            System.out.println("what is your first chose+ " + hm.get(1));
            System.out.println("what is your fsecond chose = " + hm.get(2));
            break; 
        }

        // let's know the size of our map.
        System.out.println("the size of hash = "+ hm.size());
    }   
}