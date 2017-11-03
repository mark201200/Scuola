
/* i dati relativi ad alcuni film sono memorizzati in una tabella
per ogni film si hanno le seguenti informazioni

titolo
autore
incasso
nazionalità

scrivere un programma che adempia alle seguenti richieste

stampa incasso medio di film di un autore

stampa dei dati relativi a un film il cui titolo è fornito In input

stampa dei dati che riguardano il film straniero che ha ottenuto il maggiore incasso
 */
#include <stdio.h>
#include <string.h>

typedef struct {
    char titolo[50];
    char autore[20];
    float incasso;
    char nazione[20];

} film;

void ins(film l[],int d){
    for(int i=0;i<d;i++){
        printf("Film  %d\n",i+1);
        printf("Inserisci titolo:\n");
        scanf("%s",&l[i].titolo);
        printf("Inserisci autore:\n");
        scanf("%s",&l[i].autore);
        printf("Inserisci incasso:\n");
        scanf("%f",&l[i].incasso);
        printf("Inserisci nazione:\n");
        scanf("%s",&l[i].nazione);
   }
}

float incassomedio(film l[],int d){
    char autore;
    int c=0;
    float media;
    printf("Inserisci autore:\n");
    scanf("%s",&autore);
    for(int i=0;i<d;i++){
        if(strcmp(l[i].autore,autore)==0){
         media=media+l[i].incasso;
         c++;
        }
    }
    return media/c;
}


int main(){
    int n;
    printf("n film");
    scanf("%d",&n);
    film list[n];
    ins(list,n);
    printf("%f",incassomedio(list,n));
}
