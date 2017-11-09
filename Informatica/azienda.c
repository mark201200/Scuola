
/*
 * un'azienda possiede una rete di vendita gestita da 20 agenti
 * memorizzare in una tabellale informazioni relative ai nominativi degli agenti e ai rispettivi indirizzi
 * mentre in una mateice deve essere memorizzato il fatturato mensile di tutti i mesi per i 20 agenti
 *
 * 1) per ogni agente,il nominativo , l'indirizzo ,e il fatturato annuo
 * il nominativo dell'agente che ha raggiunto il fatturato piu alto
 * per ogni mese, l'importo fatturato da tutti gli agenti
 */

#include <stdio.h>

#define MAX 2

typedef struct{
    char via[35];
    int numero;

}indirizzo;

typedef struct {
    char nome[20];
    char cognome[20];
    indirizzo indirizzo1
    float fatturato[12];
}agente;

float fatturato_annuo(agente agenti[MAX],int n){
 int j;
    float fatt = 0;
            for(j=0;j<12;j++){
                fatt=fatt+agenti[n].fatturato[j];
            }

    return fatt;
}

float fatturato_mensile(agente agenti[MAX],int n){
    int j;
    float fatt = 0;
    for(j=0;j<MAX;j++){
        fatt=fatt+agenti[j].fatturato[n];
    }

    return fatt;
}

int fatturatoMax(agente agenti[MAX]){
    int i,j;
    float max = fatturato_annuo(agenti,0);
    for(i=0;i<MAX;i++){
        if(fatturato_annuo(agenti,i)>max) {
            max=fatturato_annuo(agenti,i);
            j=i;
        }
    }
    return j;
}

void ins_agenti(agente agenti[MAX]){
    int i,j;
    for(i=0;i<MAX;i++){
        printf("Inserisci nome agente %d\n",i);
        scanf("%s",&agenti[i].nome);
        printf("Inserisci cognome agente %d\n",i);
        scanf("%s",&agenti[i].cognome);
        printf("Inserisci via agente %d\n",i);
        scanf("%s",&agenti[i].indirizzo1.via);
        printf("Inserisci numero civico agente %d\n",i);
        scanf("%d",&agenti[i].indirizzo1.numero);
        for(j=0;j<12;j++){
            printf("Inserisci fatturato mese %d agente %d\n",j,i);
            scanf("%f",&agenti[i].fatturato[j]);
        }
    }
}

int main(){
    agente agenti[MAX];
    ins_agenti(agenti);
}


