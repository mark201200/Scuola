#include <stdio.h>
#include <time.h>
int m;
void stampamat(int ma[][m],int n){
    int i,j;
    for(i=0;i<n;i++){
        for(j=0;j<m;j++){
            printf("%d ",ma[j][i]);
        }
        printf("\n");
    }
}
int main(){
int n,i,j;
printf("Inserisci n\n");
scanf("%d",&n);

printf("Inserisci m\n");
scanf("%d",&m);

int mat[n][m];
srand(time(NULL));
for(i=0;i<n;i++){
    for(j=0;j<m;j++){
        mat[i][j]=rand()%10;
    }
}

stampamat(mat,n);


