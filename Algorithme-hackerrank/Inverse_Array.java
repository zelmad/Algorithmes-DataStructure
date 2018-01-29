import java.io.*;
import java.util.*;


public class Inverse_Array {
    static int[] array_inverse(int n, int[] arr){
		int[] az=new int[n];
        for(int i=0; i<n/2; i++){
            int ass = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = ass;
			az[i] = arr[i];
			az[n-1-i] = arr[n-1-i];
        }
		if(n%2 != 0){
			az[n/2]=arr[n/2];
		}
		return az; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
		int[] arrr=new int[arr.length];
		arrr = array_inverse(arr.length, arr);
		for(int y=0;y<arrr.length;y++){
			System.out.print(arrr[y]+" ");
		}
        in.close();
    }
}