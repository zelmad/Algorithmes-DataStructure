# include <stdio.h>
# include <stdlib.h>

int main(){
	int i, j;
	int a, b;
	int tab[b];
	scanf("%d", &a);
	for(i=0;i<a;i++){
		scanf("%d", &b);
		for(j=0;j<b;j++){
			scanf("%d", &tab[j]);
		}
		int sum = 0;
		int t = 0;
		int r = 2;
		while(r <= b-2){
			if(tab[t] >= tab[r]){
				sum += tab[t]*tab[r-1];
				t++;
				r++;
			}
			else{
				sum += tab[t]*(tab[r-1]+tab[r+1]);
				t++;
				r++;
			}
		}
		printf("%d", sum);
	}
}