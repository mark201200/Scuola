#include <stdio.h>

void ins_mat(int a[][14]){
    int i,j;
    for (i=0;i<4;i++){
        for(j=0;j<14;j++){
            printf("Inserisci il numero %d della giocata %d\n",j+1,i+1);
            scanf("%d",&a[i][j]);
        }
    }
}

void ins_vet(int a[]){
    int i;
        for(i=0;i<14;i++){
            printf("Inserisci il numero %d della giocata vincente \n",i+1);
            scanf("%d",&a[i]);
        }
}

void stampa_mat(int a[][14],int b[]){
    int j;
    printf("\n\n\n\nVINCENTE\tGiocata 1\tGiocata 2\tGiocata 3\tGiocata 4\n\n");
        for(j=0;j<14;j++){
            printf("%d\t\t%d\t\t%d\t\t%d\t\t%d",b[j],a[0][j],a[1][j],a[2][j],a[3][j]);
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
    printf("\nLe giocate vincenti sono:\n");
    for(i=0;i<4;i++){
        if(win[i]==1) printf("Giocata numero %d\n",i+1);
    }
}

int main(){
int toto[4][14];
int v[14];
printf("\n\nINSERIMENTO GIOCATA VINCENTE\n\n");
ins_vet(v);
printf("\n\nINSERIMENTO GIOCATE\n\n");
ins_mat(toto);
stampa_mat(toto,v);
check_uguale(v,toto);
}
