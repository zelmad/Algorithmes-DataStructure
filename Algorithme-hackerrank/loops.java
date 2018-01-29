import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long sum = 0;
        for(int i=1;i<11;i++){
            sum=n*i;
            System.out.println(n+" x "+i+" = "+sum);
        }
    }
}