
import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
import java.math.BigDecimal;
 
public class Product
{
    // Returns Factorial of N
 
    // Driver method
    public static void main(String args[]) throws Exception
    {
		Scanner clv = new Scanner(System.in);
		int a = clv.nextInt(); 
		long sum = 1;
		BigInteger z = new BigInteger("1");
		for(int i=0; i<a; i++){
			int b = clv.nextInt();
		    z= z.multiply(BigInteger.valueOf(b));
	    }
		//BigInteger bigInteger = (BigInteger) Math.pow(10, 9)+7;
		//BigInteger k = z.mod(bigInteger);
		BigDecimal k = BigDecimal.valueOf(Math.pow(10, 9) +7);
		
		BigInteger r = k.toBigInteger();
		BigInteger m = z.mod(r);
		System.out.print(m);
		
    }
}