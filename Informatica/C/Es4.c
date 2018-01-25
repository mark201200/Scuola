#include <stdio.h>
typedef struct {
int matricola;
char nome [20];
char cognome [20];
} studente;

typedef struct {
int matricola;
char esame[20];
int voto;
} esame;


void ins_studente(studente s[]){
for(int i=0;i<3;i++){
    printf("Inserisci matricola\n");
    scanf("%d",&s.matricola);
    printf("Inserisci Nome\n");
    scanf("%s",&s.nome);
    printf("Inserisci Cognome\n");
    scanf("%s",&s.cognome);
}
}












