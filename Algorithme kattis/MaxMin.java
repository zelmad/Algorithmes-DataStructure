import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxMin{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        System.out.println();
        long maxSum = 0;
        long minSum = 0;
        for(int i=0; i<4; i++){
            minSum += arr[i];
        }
        for(int j = arr.length-1; j > 0; j--){
            maxSum += arr[j];
        }
        System.out.print(minSum +" "+maxSum);
    }
}
