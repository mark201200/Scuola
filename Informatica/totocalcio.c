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

int check_uguale(int v[],int a[][14])
{
    int i,j,check;
    for (i=0;i<4;i++){
        for(j=0;j<14;j++){

        }
    }


}


int main(){
int toto[4][14];
ins_mat(toto);
stampa_mat(toto);


}
