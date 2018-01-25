#include <stdio.h>
typedef struct {
    int ora;
    int minuti;
    int secondi;
} ora;

typedef struct{
    char titolo [20];
    char regista [20];
    char casa [20];
    ora orario;
} film;

int dim(){
    int n;
    do{
        printf("Inserisci il numero di film\n");
        scanf("%d",&n);
    } while (n<0);
    return n;
}

void caricatab(int n,film films[]){
    int i;
    for(i=0;i<n;i++){
        printf("Inserisci titolo film %d \n",i+1);
        scanf("%s",&films[i].titolo);
        printf("Inserisci regista film %d \n",i+1);
        scanf("%s",&films[i].regista);
        printf("Inserisci casa produttrice film %d \n",i+1);
        scanf("%s",&films[i].casa);
        do{
        printf("Inserisci ora di inizio film %d (formato hh:mm:ss) \n",i+1);
        scanf("%d:%d:%d",&films[i].orario.ora,&films[i].orario.minuti,&films[i].orario.secondi);
    } while(films[i].orario.ora<0||films[i].orario.ora>24||films[i].orario.minuti<0||films[i].orario.minuti>60||films[i].orario.secondi<0||films[i].orario.secondi>60);
    }
}


void stampatab(int n,film films[]){
    int i;
    for(i=0;i<n;i++){
       printf("%s\t%s\t%s\t%d:%d:%d\n",films[i].titolo,films[i].regista,films[i].casa,films[i].orario.ora,films[i].orario.minuti,films[i].orario.secondi);
    }
    }

int calcola(int n,film films[]){
    int i,c=0;
    for(i=0;i<n;i++){
        if(films[i].orario.ora==20&&films[i].orario.minuti==30&&films[i].orario.secondi==00){
            c++;
        }

    }
    return c;
}

int main(){
    int n=dim();
    film films[n];
    caricatab(n,films);
    stampatab(n,films);
    int c=calcola(n,films);
    printf("\n Il numero di film che iniziano alle 20:30:00 e' %d",c);
}
