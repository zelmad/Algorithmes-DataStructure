#include<stdlib.h>
#include<stdio.h>

int main(){

	int a=0 , b=0, c=0;	
	scanf("%d", a);
	scanf("%d", b);
	int arr[a][b];
	int ar[a][b];

	int i,j;
	for(i=0; i<a; i++){
		for(int j=0; j<b; j++){

			int e = scanf("%d", c);
			arr[i][j] = e;
			ar[j][i] = e;
		}
	}

	for(int u=0; u<b; u++){
		for(int t=0; t<a; t++){
			int r = ar[u][t];
			printf("%d ",r);
		}
		printf("\n");
	}
	return 0;
}