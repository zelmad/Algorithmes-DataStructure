import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DeuxDArrays {

    static ArrayList<Integer> list=new ArrayList<>();
    static int function(int[][] mat){
        int sum = 0;
        for(int i=0;i<4;i++){
            for(int j=0; j<4;j++){
				sum=(mat[i][j]+mat[i][j+1]+mat[i][j+2]+mat[i+1][j+1]+mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
				list.add(sum);
			    sum = 0;
			}
		}
		Collections.sort(list);
		return list.get(list.size()-1);
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print(function(arr));
    }
}
