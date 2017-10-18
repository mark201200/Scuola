#include <stdio.h>
int mcd(int a,int b){
    if(a==0||b==0) return -1;
    while(a!=b){
        if(a>b) a=a-b;
        else b=b-a;
    }
    if(a==1||b==1) return -1;
      else return a;
    }
int mcm(int a,int b){
    int a1=a;
    int b1=b;
    while(a!=b){
        if(a>b) b=b+b1;
           else a=a+a1;
    }
    return a;
}
void molt(int *a,int *b,int a2, int b2){
    int va=*a;
    int vb=*b;
    *a=va*a2;
    *b=vb*b2;
}
void add(int *a,int *b,int a2, int b2,int s){
    int v_mcm=mcm(*b,b2);
    int vb=*b;
    int va=*a;
    *b=v_mcm;
    if(s==0) *a=va*(v_mcm/vb)+a2*(v_mcm/b2);
        else *a=va*(v_mcm/vb)-a2*(v_mcm/b2);
}

int main(){
    int n,d,n1,d1,s;
    do{
        printf("Inserisci la frazione n 1 :");
        scanf("%d",&n);
        scanf("%d",&d);
    }  while(d==0);
    do{
        printf("Inserisci la frazione n 2 :");
        scanf("%d",&n1);
        scanf("%d",&d1);
    }  while(d1==0);
    printf("\nCosa vuoi fare?\n1:Moltiplicazione\n2:Divisione\n3:Addizione\n4:Sottrazione\n");
    scanf("%d",&s);
    switch (s){
        case 1:
            molt(&n,&d,n1,d1);
            break;

        case 2:
            molt(&n,&d,d1,n1);
            break;

        case 3:
            add(&n,&d,n1,d1,0);
            break;

        case 4:
            add(&n,&d,n1,d1,1);
            break;

    }
    int mcd_res=mcd(n,d);
    if(mcd_res==-1) printf("\n%d/%d",n,d);
        else printf("\n%d/%d",n/mcd_res,d/mcd_res);
}
