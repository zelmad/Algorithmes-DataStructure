import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
		// Add your code here
    Difference(int[] elements){
        this.elements = elements;
    }
    int computeDifference(){
        int sum = 0;int a = 0;
        for(int i=0;i<elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                int r = elements[i]-elements[j];
                sum = Math.abs(r);
                if(sum > a){
                    maximumDifference = sum;
                    a = sum;
                }
            }
        }
        return maximumDifference;
    }

} // End of Difference class

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}