#include <stdio.h>
/*
totocalcio:

Verifica se le 4 giocate sono vincenti.

*/

void ins_mat(int a[][14]){
    int i,j;
    for (i=0;i<4;i++){
        for(j=0;j<14;j++){
            printf("Inserisci il numero %d della giocata %d\n",j,i);
            scanf("%d",&a[i][j]);
        }
    }
}

void stampa_mat(int a[][14]){
    int j;

        for(j=0;j<14;j++){
            printf("%d %d %d %d",a[0][j],a[1][j],a[2][j],a[3][j]);
            printf("\n");
        }


}

void check_uguale(int v[],int a[][14])
{
    int i,j;
    int win[4]={1,1,1,1};
    for (i=0;i<4;i++){
        for(j=0;j<14;j++){
            if(a[i][j]!=v[j]){
            win[i]=0;
            }
        }
    }
    printf("Le giocate vincenti sono:");
    for(i=0;i<4;i++){
        if(win[i]==1) printf("%d",i);
    }


}


int main(){
int toto[4][14];
int v[14]={1,1,1,1,1,1,1,1,1,1,1,1,1,1};
ins_mat(toto);
stampa_mat(toto);
check_uguale(v,toto);


}
