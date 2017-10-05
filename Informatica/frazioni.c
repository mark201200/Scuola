#include <stdio.h>
int mcd(int a,int b){
    while(a!=b){
        if(a>b) a=a-b;
        else b=b-a;
    }
    if(a==1||b==1) return -1;
      else return a;
    }

void molt(int *a,int *b,int a2, int b2){
int va=*a;
int vb=*b;
*a=va*a2;
*b=vb*b2;
}

int main(){
    int n,d,n1,d1;
    do{
    printf("Inserisci la frazione n 1 :");
    scanf("%d/%d",&n,&d);
    }while(d==0);
    do{
    printf("Inserisci la frazione n 2 :");
    scanf("%d/%d",&n1,&d1);
    }while(d1==0);
    printf("\nCosa vuoi fare?\n");
    //Scegli tra semplifica,molt,divis,etc

    /* sta roba per ora non serve, uso la selezione
    int min=mcd(n,d);
    printf("\n%d/%d",n/min,d/min);
    molt(&n,&d,n1,d1);
    printf("Moltiplicazione:\n%d/%d",n,d);
    */
}
