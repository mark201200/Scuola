#include<stdio.h>
#include<stdlib.h>

typedef struct{
int latitudine;
int longitudine;
} coordinate;

int main(){
FILE *myfile;
int t,n;
coordinate c;
myfile=fopen("coordinate.bin","w+b");

do{
    printf("Inserisci latitudine\n");
    scanf("%d",&t);
    if(t != 100){
        c.latitudine=t;
        printf("Inserisci longitudine\n");
        scanf("%d",&c.longitudine);
        fwrite(&c,sizeof(coordinate),1,myfile);
    }
}while(t != 100);

rewind(myfile);
printf("Inserisci latitudine da cercare\n");
scanf("%d",&n);
fread(&c,sizeof(coordinate),1,myfile);

while(!feof(myfile)){
    if(c.latitudine==n)
        printf("\n%d %d\n",c.latitudine,c.longitudine);
    fread(&c,sizeof(coordinate),1,myfile);
}
}
