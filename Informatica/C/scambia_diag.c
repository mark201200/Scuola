#include <stdio.h>
int d;

void stampamat(int m[][d]){
    int i,j;
    for(i=0;i<d;i++){
        for(j=0;j<d;j++){
            printf("%d ",m[i][j]);
        }
        printf("\n");
    }
}

void insmat(int m[][d]){
    int i,j;
    for(i=0;i<d;i++){
        printf("Riga %d ",i);
        for(j=0;j<d;j++){
            printf("Elemento %d\n",j);
            scanf("%d",&m[i][j]);
        }
    }
}

void scambia(int m[][d]){
    int swap,i;
    for(i=0;i<d;i++){
        swap=m[i][d-1-i];
        m[i][d-1-i]=m[i][i];
        m[i][i]=swap;
    }
}

int main(){
  printf("Inserisci grandezza matrice:\n");
  scanf("%d",&d);
  int mat[d][d];
  insmat(mat);
  scambia(mat);
  stampamat(mat);
}
