#include <stdio.h>
int main(){
    FILE *fp;
    fp=fopen("C:/Users/Marco/Desktop/Scuola/Informatica/input.txt","r");
    int n,u1=0,u2=0,op=0,pt=1,v=0,f=0,*ptr=&u1;
    char a;
    while(fscanf(fp,"%d",&n)!= EOF){
        fscanf(fp,"%c",&a);
        if(op==1){
            (*ptr)=(*ptr)+n;
            op=-1;
        }
        if(a=='+'){
            if(op!=-1) *ptr = (*ptr) + n;
            op=1;
            if(pt==2) pt=3;
        }
        else if(a==';'){
            if(pt==2)
                u2=u2+n;
            if(u1==u2) v++;
                else f++;
            ptr=&u1;
            op=0;
            u1=0;
            u2=0;
            pt=1;

        }
        else if(a=='='){
            if(op==0&&pt==1) u1=u1+n;
            ptr=&u2;
            n=0;
            pt=2;
            op=0;
        }
    }
printf("%d/%d",v,v+f);
}
