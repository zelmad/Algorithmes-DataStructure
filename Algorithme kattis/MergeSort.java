
import java.util.*;
//import java.io.*;

public class MergeSort{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int a = scanner.nextInt();
        String chaine = scanner.next();
        int sum =0;
        for(int i=0; i<a; i++){
            if(chaine.charAt(i) == '0'){
                list.add(i);
            }
        }
        if(list.size() != 0){
            System.out.println(list.get(list.size()-1));
        }
        else if(list.size() == 0){
            System.out.println(0);
        }
    }
}