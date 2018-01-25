#include <stdio.h>
int d;
void stampamat(int m[][d]){
    int i,j;
    for(i=0;i<d;i++){
        for(j=0;j<d;j++){
            printf("%d ",m[j][i]);
        }
        printf("\n");
    }
}

int main(){
    int i,j,s;
    printf("Inserisci grandezza matrice\n");
    scanf("%d",&d);
    int m[d][d];
    for(i=0;i<d;i++){
        for(j=0;j<d;j++){
            m[i][j]=1;
        }
    }
    int zero[d];
    memset(zero,0,sizeof(zero));
    for(i=0;i<d;i++){
    do{
    printf("Dove metti lo 0 nella colonna %d?\n",i+1);
    scanf("%d",&s);
    }while (zero[s-1]==1||s>d);
    zero[s-1]=1;
    m[s-1][i]=0;
    }
    stampamat(m);
}
