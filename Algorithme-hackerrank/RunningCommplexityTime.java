import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningCommplexityTime {

    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
   
    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner clv = new Scanner(System.in);
        int a = clv.nextInt();
        for(int y=0;y<a;y++){
            int r = clv.nextInt();
            if(r >= 2 && isprime(r))
                System.out.println("Prime");
            else System.out.println("Not prime");           
        }
    }
}