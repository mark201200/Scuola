#include <stdio.h>
int mcd(int a,int b){
    while(a!=b){
        if(a>b) a=a-b;
        else b=b-a;
    }
    if(a==1||b==1) return -1;
      else return a;
    }

int main(){
    int n,d;
    printf("Inserisci la frazione :");
    scanf("%d/%d",&n,&d);
    int min=mcd(n,d);
    printf("\n%d/%d",n/min,d/min);
}
