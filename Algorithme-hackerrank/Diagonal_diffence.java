import java.io.*;
import java.util.*;
import java.lang.Math;

public class Diagonal_diffence {
    
    static int CalculSumDiagonal(int n, int[][] mat){
        int sum1 = 0;
        int sum2 = 0;
        for(int y=0;y<n;y++){
            for(int r=0;r<n;r++){
                if(y==r){
                    sum1+=mat[y][r];
                }
                if(y+r==n-1){
                    sum2+=mat[y][r];
                }
            }
        }
        int result=Math.abs(sum1-sum2);
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] mat=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=in.nextInt();
            }
        }
        System.out.print(CalculSumDiagonal(n, mat));
    }
}