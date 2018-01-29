import java.io.*;
import java.util.*;
 public class Matrix{
	 //déclaration de la fonction qui vérifier s'il existe au moin une somme de ligne et colonne qui est égale a la valeur !=1.
	static String VerifyMatrix(int n, int[][] mat){
		int somme=0;//la variable qui correspond aux nombres totals different de 1.
		for(int y=0;y<n;y++){
			for(int r=0;r<n;r++){
				int sum=0;//la var qui correspend juste a un element de la matrice.
				if(mat[y][r]>1){
					for(int t=0;t<n;t++){
						if(mat[y][t]+mat[t][r]==mat[y][r]){
							sum+=1;
						}
						else{
							sum+=0;
						}
					}
				}
				if(sum > 0){
					somme+=1;
				}
				else{
					somme+=0;
				}
			}
		}
		if(somme > 0){
			return "Yes";
		}
		else{
			return "Non";
		}
	}
	//l'appellation de la méthode main qui appele elle aussi la fonction de vérification VerifyMatrix et elle l'applique sur notre matrice a d'entré.
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[][] mat=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=in.nextInt();
			}
		}
		System.out.print(VerifyMatrix(n, mat));
	}
 }