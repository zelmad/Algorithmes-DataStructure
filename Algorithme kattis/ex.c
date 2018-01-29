#include <stdio.h>
#include <stdlib.h>

int factorial(int w, int z){
	int i,j;
	int fsum = 1;
	int ssum = 1;
	if(w=0){
		fsum = 1;
	}
	if(z=0){
		ssum = 1;
	}
	else{
		for(i = z+1; i <= w; i++){
		    fsum *=i;
		}
		for(j=1; j<z; j++){
			ssum *=j;
		}
	}
	int somme = fsum/ssum;
	return somme;
}

int function(int arr[], int n){
	int a = 0,b = 0,c = 0,d = 0;
	if(arr[0] > arr[2] && arr[2]==0) a = 0;
	if(arr[0] > arr[3] && arr[3]==0) b = 0;
	if(arr[1] > arr[2] && arr[2]==0) c = 0;
	if(arr[1] > arr[3] && arr[3]==0) d = 0;
	else  {
			if(arr[0] <= arr[2]) a = arr[0] * arr[2]; 
			else{
				a=factorial(arr[0], arr[2]);
			}
			if(arr[0] <= arr[3]){
				b = arr[0] * arr[3]; 
			}
			else{
				b = factorial(arr[0], arr[3]);
			}
			if(arr[1] <= arr[2]){
				c = arr[1] * arr[2]; 
			}
			else{
				c = factorial(arr[1], arr[2]);
			}
			if(arr[1] <= arr[3]){
				d = arr[1] * arr[3]; 
			}
			else{
				d = factorial(arr[1], arr[3]);
			}
	}
	printf("%d", a+b+c+d);
}

int main()
{
	int a=0;int i=0;
	scanf("%d", &a);
	int arr[a];
	for(;i<a;i++){
		scanf("%d", &arr[i]);
	}
    int lengt = sizeof(arr)/sizeof(arr[0]);
    function(arr, lengt);
    return 0;
}