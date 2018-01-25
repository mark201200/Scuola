#include <stdio.h>
#include <stdlib.h>
#include <string.h>
FILE *filmuno,*filmdue,*filmtre;
int c1=0,c2=0;


typedef struct
{
    int n,ncand;
    char titolo[25],cogRegista[25],nomRegista[25];
} film;

film filmistica,filmistica2;
void insFilm()
{
    int i=1,s=0;
    do
    {
        c1++;
        filmistica.n=i;
        printf("Inserisci titolo film %d file 1\n",i);
        scanf("%s",&filmistica.titolo);
        printf("Inserisci cognome e nome regista film %d file 1\n",i);
        scanf("%s %s",&filmistica.cogRegista,&filmistica.nomRegista);
        printf("Inserisci numero candidature film %d file 1\n",i);
        scanf("%d",&filmistica.ncand);
        printf("Inserisci 1 per fermarti, 0 per contnuare.\n");
        scanf("%d",&s);
        i++;
        fwrite(&filmistica,sizeof(film),1,filmuno);
    }
    while(s!=1);


    i=1,s=0;

    do
    {
        c2++;
        filmistica.n=i;
        printf("Inserisci titolo film %d file 2\n",i);
        scanf("%s",&filmistica.titolo);
        printf("Inserisci cognome e nome regista film %d file 2\n",i);
        scanf("%s %s",&filmistica.cogRegista,&filmistica.nomRegista);
        printf("Inserisci numero candidature film %d file 2\n",i);
        scanf("%d",&filmistica.ncand);
        printf("Inserisci 1 per fermarti, 0 per contnuare.\n");
        scanf("%d",&s);
        i++;
        fwrite(&filmistica,sizeof(film),1,filmdue);
    }
    while(s!=1);
    rewind(filmuno);
    rewind(filmdue);
}

void verificaDuplicati()
{
    int i,j;

    for(i=0; i<c1; i++)
    {
        fread(&filmistica,sizeof(film),1,filmuno);
        for(j=0; j<c2; j++)
        {
            fread(&filmistica2,sizeof(film),1,filmdue);
            if(!strcmp(filmistica.titolo,filmistica2.titolo)&&!strcmp(filmistica.cogRegista,filmistica2.cogRegista)&&!strcmp(filmistica.nomRegista,filmistica2.nomRegista)&&filmistica.ncand==filmistica2.ncand)
            {
                fwrite(&filmistica,sizeof(film),1,filmtre);
                printf("\n\nCCQCCQCCQ\n");
            }

        }

    }
    fread(&filmistica,sizeof(film),1,filmtre);
    printf("\n\nNOME: %s",filmistica.titolo);
 fread(&filmistica,sizeof(film),1,filmtre);
    printf("\n\nNOME: %s",filmistica.titolo);
}


int main()
{
    filmuno=fopen("film1.bin","w+");
    filmdue=fopen("film2.bin","w+");
    filmtre=fopen("film3.bin","w+");

    insFilm();
    verificaDuplicati();



}

