#include "iostream"

void mergesort(int arr[], int l, int m, int n){
	int fn = m-l+1;
	int sn = n-m;
	int ftab[fn];
	int stab[sn];
	int i, j, k;
	for(i=0;i<fn;i++){
		ftab[i]=arr[l+i];
	}
	for(j=0;j<sn;j++){
		stab[j]= arr[m+1+j];
	}
	i=0;
	j=0;
	k=l;
	while(i<fn && j<sn){
		if(ftab[i] <= stab[j]){
			arr[k] = ftab[i];
			i++;
		}
		else{
			arr[k] = stab[j];
			j++;
		}
		k++;
	}
	while(i<fn){
		arr[k] = ftab[i];
		i++;
		k++;
	}
	while(j<sn){
		arr[k] = stab[j];
		k++;
		j++;
	}
}
void merge(int arr[], int l, int n){
	if(l<n){
		int m = l+(n-l)/2;
		merge(arr,l,m);
		merge(arr,m+1,n);

		mergesort(arr, l, m, n);
	}
}
void printArry(int arr[], int n){
	int i;
	for(i=0;i<n;i++){
		printf("%d \n", arr[i]);
	}
}
int main(void){
	int a=0;
	int i;
	scanf("%d \n", &a);
	int arr[a];
	for(i=0; i<a; i++){

		scanf("%d", &arr[i]);

	}
	int lengt = sizeof(arr)/sizeof(arr[0]);
	std::cout <<"the table before sorting \n";
	//printf("the table before sorting \n");
	printArry(arr, lengt);
	merge(arr, 0, lengt);
	std::cout <<"the table after sorting \n";
	//printf("the table after sorting \n");
	printArry(arr, lengt);
	//std::cout <<"hello! this is a c++ programme\n";

	return 0;

}