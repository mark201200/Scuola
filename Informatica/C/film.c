
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
#include <stdlib.h>

typedef struct {
    char titolo[20];
    char autore[20];
    int incasso;
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
        scanf("%d",&l[i].incasso);
        printf("Inserisci nazione:\n");
        scanf("%s",&l[i].nazione);

   }
}

float incassomedio(film l[],int d){
    char autore1[20];
    int c=0;
    int i;
    float media=0;
    printf("Inserisci autor:\n");
    scanf("%s",&autore1);
    for(i=0;i<d;i++){
        if(strcmp(autore1,l[i].autore)==0){
         media=media+l[i].incasso;
         c++;
        }
    }
    return (float)media/c;
}




void info(film l[],int d){
    char titolo1[20];
    printf("\nInserisci titolo:\n");
    scanf("%s",&titolo1);
    for(int i=0;i<d;i++){
        if(strcmp(titolo1,l[i].titolo)==0){
         printf("\nTitolo: \"%s\"\n",l[i].titolo);
         printf("Autore: %s\n",l[i].autore);
         printf("Incasso: %f\n",l[i].incasso);
         printf("Nazione: %s\n",l[i].nazione);

        }

    }
}


int main(){
    int n;
    printf("n film");
    scanf("%d",&n);
    film list[n-1];
    ins(list,n);
    float a=incassomedio(list,n);

    printf("%f",a);

    info(list,n);
}
