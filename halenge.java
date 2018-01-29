/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;
import java.math.BigInteger;


class halenge {
    public static void main(String args[] ){
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/

        //Scanner
        Scanner s = new Scanner(System.in);
        BigInteger a =new BigInteger(s.nextInt());
        BigInteger b =new BigInteger(s.nextInt());
        int sum = 1;
        //BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
        if(a <= b){
            for(int i=2;i <= a;i++){
                if(a.mod(i)==0 && b.mod(i)==0){
                    sum+=1;
                }
            }
        }
        else if(b < a){
            for(int i=2;i<=b;i++){
                if(a.mod(i)==0 && b.mod(i)==0){
                    sum+=1;
                }
            }
        }
        System.out.print(sum);
    }
}
