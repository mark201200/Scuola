
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
    indirizzo indirizzo1;
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

void fatturato_mensile(agente agenti[MAX]){
    int i,j;
    float fatt = 0;
    printf("\n");
    for(i=0;i<12;i++) {
        fatt=0;
        for (j = 0; j < MAX; j++) {
            fatt = fatt + agenti[j].fatturato[i];
        }
        printf("Fatturato mese %d:\t%.2f\n",i+1,fatt);
    }

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

void ins_agenti(agente agenti[]){
    int i,j;
    for(i=0;i<MAX;i++){
        printf("Inserisci nome agente %d  ",i+1);
        scanf("%s",&agenti[i].nome);
        printf("Inserisci cognome agente %d  ",i+1);
        scanf("%s",&agenti[i].cognome);
        printf("Inserisci via agente %d",i+1);
        scanf(" %[^\n]s",&agenti[i].indirizzo1.via);
        printf("Inserisci numero civico agente %d  ",i+1);
        scanf("%d",&agenti[i].indirizzo1.numero);
        for(j=0;j<12;j++){
            printf("Inserisci fatturato mese %d agente %d  ",j+1,i+1);
            scanf("%f",&agenti[i].fatturato[j]);
        }
    }
}

void info_agenti(agente agenti[]){
    int i,j;
    printf("\n");
    for(i=0;i<MAX;i++){
        printf("Agente %d:\t%-20s %-20s\t%s %d\t\t%.2f\n",i+1,agenti[i].nome,agenti[i].cognome,agenti[i].indirizzo1.via,agenti[i].indirizzo1.numero,fatturato_annuo(agenti,i));
    }


}

int main(){
    agente agenti[MAX];
    ins_agenti(agenti);
    info_agenti(agenti);
    int fmax=fatturatoMax(agenti);
    printf("\nIl fatturato piu' alto e' stato raggiunto da %s %s!\n",agenti[fmax].nome,agenti[fmax].cognome);
    fatturato_mensile(agenti);
}


