import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int sumNull = 0;
        int sumPositiv = 0;
        int sumNegativ = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == 0){
                sumNull += 1;
            }
            else if(arr[i] > 0){
                sumPositiv += 1;
            }
            else{
                sumNegativ += 1;
            }
        }
		double sumPostD = sumPositiv%n;
		double sumNullD = sumNull%n;
		double sumNegativD = sumNegativ%n;
		
		System.out.println(sumPositiv%n);
        System.out.println(%n);
		System.out.println(sumNegativ%n);
		//for the positive one.
		StringBuilder sbufN = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("%.6f%n", Math.PI);
		//for the null one.
		StringBuilder sbufN = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("%.6f%n", Math.PI);
		for the negativ one.
		StringBuilder sbufN = new StringBuilder();
		Formatter fmt = new Formatter(sbuf);
		fmt.format("%.6f%n", Math.PI);

    }
}
