#include <stdio.h>
#define t 11
#define pag 3 //non funziona con 2 pagine
int j=0;
int miss=0;
void copiaPrec(int mem[pag][t],int c){
if(c==0)
    return;
for(int i=0;i<pag;i++)
    mem[i][c]=mem[i][c-1];
}

int checkIns(int *mem[pag][t],int ric[t],int c){
if(c==0)
    return 0;
for(int i=0;i<pag;i++) {
    if(mem[i][c]==ric[c]){
        miss++;
        return 1;
}
}
return 0;
}

void insRichiesta(int mem[pag][t],int ric[t],int c){
if(j>pag-1) j=0;
mem[j][c]=ric[c];
j++;
}

int trova_LRU(int mem[pag][t],int ric[t],int c){
for(int i=0;i<c;i++){
   for(int ii=0;ii<pag;ii++){
        if(ric[i]==mem[ii][c]){
                printf("%d ",ii);
                return ii;
        }
   }
}
}

checkVuoto(int *mem[pag][t],int ric[t],int c){
for(int i=0;i<pag;i++){
    if(mem[i][c]==0) return i;
}
return 0;
}

void stampa(int mem[pag][t]){
for(int i=0;i<pag;i++){
    for(int ii=0;ii<t;ii++){
        printf("%d ",mem[i][ii]);
    }
    printf("\n");
}
}

int main(){
int memoria[pag][t] = {0};
int richieste[t] = {1,2,1,3,1,4,3,4,2,1,2};
for (int i=0;i<t;i++){
    copiaPrec(memoria,i);
    if(checkIns(memoria,richieste,i)==0&&checkVuoto(memoria,richieste,i)==0){
            //insRichiesta(memoria,richieste,i);
            int lru=trova_LRU(memoria,richieste,i);
          //  printf("%d ",lru);
            memoria[lru][i]=richieste[i];
    }
    else if(checkVuoto(memoria,richieste,i)!=0&&checkIns(memoria,richieste,i)==0){
        memoria[checkVuoto(memoria,richieste,i)][i]=richieste[i];
    }
}
printf("\n\n");
stampa(memoria);
printf("\nMISS = %d",t-miss);
return 0;
}
