
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compare_the_triplets {
    static int z=0;
	static int r=0;
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        if(a0==b0 && a1==b1 && a2==b2){
			z=0;
			r=0;
		}
		else if((a0>b0 && a1==b1 && a2==b2) || (a0==b0 && a1>b1 && a2==b2) || (a0==b0 && a1==b1 && a2>b2) || ((a0>b0 && a1>b1 && a2==b2) || (a0==b0 && a1>b1 && a2>b2) || (a0>b0 && a1==b1 && a2>b2))){
			z=1;
			r=0;
		}
		else if((a0<b0 && a1==b1 && a2==b2)||(a0==b0 && a1==b1 && a2<b2)||(a0==b0 && a1<b1 && a2==b2)||(a0==b0 && a1==b1 && a2<b2)||((a0<b0 && a1<b1 && a2==b2) || (a0==b0 && a1<b1 && a2<b2) || (a0<b0 && a1==b1 && a2<b2))){
			z=0;
			r=1;
		}
		else if((a0>b0 && a1<b1 && a2==b2) || (a0<b0 && a1>b1 && a2==b2) || (a0==b0 && a1>b1 && a2<b2)|| (a0==b0 && a1<b1 && a2>b2)  || (a0>b0 && a1==b1 && a2<b2) || (a0<b0 && a1==b1 && a2>b2)){
			z=1;
			r=1;
		}
		else if((a0>b0 && a1>b1 && a2<b2) || (a0>b0 && a1<b1 && a2>b2) || (a0<b0 && a1>b1 && a2>b2)){
			z=2;
			r=1;
		}
		else if((a0<b0 && a1<b1 && a2>b2) || (a0<b0 && a1>b1 && a2<b2) || (a0>b0 && a1<b1 && a2<b2)){
			z=1;
			r=2;
		}
		else if(a0>b0 && a1>b1 && a2>b2){
			z=3;
			r=0;
		}
		else if(a0<b0 && a1<b1 && a2<b2){
			z=0;
			r=3;
		}
		int tab[]={z, r};
		return tab;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}