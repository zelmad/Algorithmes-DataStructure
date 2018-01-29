import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    public static int power(int n, int p)throws Throwable
	{
        if((n < 0)||(p < 0)||(n<0 && p<0))
		{
            throw new Throwable("n and p should be non-negative");
        }
		int sum = 1;
		for(int i=0;i<p;i++){
			sum*=n;
		}
        return sum;      
    }
}
//la classe principale.
class Exception2{

    public static void main(String[] args)
	{
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0)
		{
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
			{
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Throwable e)
			{
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
