import java.io.*;
import java.util.*;

public class Array {

    static String function(int n, String chaine){

        String[] tab= new String[n];

        String ch3=""; String ch4="";

        for(int y=0; y<n ;y++){
            tab[y]=String.valueOf(chaine.charAt(y));
        }
        for(int t=0;t<tab.length;t++){
            if(t%2==0){
                ch3+=tab[t];
            }
			else{
				ch4+=tab[t];
			}
        }
		return (ch3+" "+ch4);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner enter=new Scanner(System.in);
        int nbr = enter.nextInt();
        for(int i=0;i<nbr; i++){
            String ch1 = enter.next();
            System.out.println(function(ch1.length(), ch1));
        }
    }
}
