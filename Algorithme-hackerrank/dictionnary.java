//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class dictionnary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
		Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // add the key and value to the dictionnary.
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.get(s)!=null){
                System.out.println(s+"="+phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
