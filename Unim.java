import java.util.*;
import java.io.*;
import java.lang.Math;

public class Unim{
	static int DetIncFunc(int[] arr,int n){
		int sum = 0;
		for(int i=1;i<n/2;i++){
			if(arr[i] == arr[i-1]){
				sum = i-1;
				break;
			}
		}						
	return sum;
	}
	static int DetDecFunc(int[] ar,int n){
		int sum = 0;
		for(int i=n-1;i>=n/2;i--){
			if(ar[i-1] == ar[i]){
				sum = i;
				break;
			}
		}
		return sum;
	}
	static int ResInc(int arr[], int n){
		int somme = 0;
		for(int i=1;i<n/2;i++){
			if(arr[i] > arr[i-1]){
				somme+=1;
			}
		}
    	return somme;	
	}
	static int ResDec(int[] ar, int n){
		int somme = 0;
		for(int i=n-1;i>=n/2;i--){
			if(ar[i-1] > ar[i]){
				somme += i;
			}
		}
		return somme;
	}
	static String verif(int[] ar, int a, int b){
		int sum = 0;
		for(int u=a+1;u<=b;u++){
			if(ar[u] == ar[u-1]){
				sum+=1;
			}
		}
		if(sum == b-a){
			return "tr";
		}else {
			return "ff";
		}
		
		
		//return "";
	}
	static String DinalFunction(int[] arr , int n){
		int a = DetIncFunc(arr , n);
		int b = DetDecFunc(arr , n);
		int sa = ResInc(arr, n);
		int sb = ResDec(arr, n);
		if(sa == sb){
			if(verif(arr, a, b)=="tr"){
				return "YES";
			}
			else{
				return "NO";
			}
		}
		else{
			return "NO";
		}
		//return "";
	}
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		int[] tab= new int[a];
		for(int i=0; i<a; i++){
			tab[i]=in.nextInt();
		}
		System.out.print(DinalFunction(tab, tab.length));
	}
}