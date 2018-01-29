import java.io.*;
import java.util.*;

public class Swapbits{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);
		int a = enter.nextInt();
		int[] tab=new int[4];
		for(int i=0; i<a; i++)
		{
			String chaine = enter.next();
			String[] chn = chaine.split(" ");
			tab[i] = Integer.parseInt(chn[i]);
		}
		System.out.println(function(tab[0],tab[1],tab[2],tab[3]));
	}
	static int function(int a, int b, int c,int d){
		int[] arr = changetobinaire(a);
		boolean flag = true;
		if(flag){
			for(int i=b;i<d+b;i++){
			arr[i]=oneorzero(arr[i]);
			}
			for(int j=c;j<c+d;j++){
				arr[j]=oneorzero(arr[j]);
			}
			flag = false;
		}
		int sum = changetonbr(arr);
		return sum;
	}
	static int[] changetobinaire(int a){
		ArrayList<Integer> list=new ArrayList<Integer>();
		boolean flag=true;
		int t=a;
		while(flag){
			list.add(t%2);
			t=t/2;
			if(t==0){
				flag=false;
			}
		}
		int[] arr=new int[list.size()];
		for(int i=0;i<list.size();i++){
			arr[i]=list.get(list.size()-1-i);
		}
		return arr;
	}
	static int changetonbr(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=Math.pow(2, arr.length-1-i);
		}
		return sum;
	}
	static int oneorzero(int a){
		if(a==0){
			a=1;
		}
		else if(a==1){
			a=0;
		}
		return a;
	}
}