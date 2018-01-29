import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Zelmad {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
        double b = Double.parseDouble(scan.next());
		scan.nextLine();
        String zed = scan.nextLine();
		System.out.println(i+a);
		System.out.println(d+b);
		System.out.println(zed+s);

	    scan.close();
	}
}