#include<stdio.h>

void stampav(int a[],int d){
int i=0;
for(i=0;i<d;i++){
    printf("\n%d",a[i]);
}
printf("\n");
}

int main(){
	int i,j,trovato,usi;
    int lun_a;
    int lun_b;
    int lun_max,lun_min;


		printf("inserire la lunghezza del vettore 1 : ");
		scanf("%d",&lun_a);
		int A[lun_a];

		printf("inserire la lunghezza del vettore 2 : ");
		scanf("%d",&lun_b);
        int B[lun_b];

        if(lun_a>lun_b){
            lun_max=lun_a;
            lun_min=lun_b;
        }
        else{
            lun_max=lun_b;
            lun_min=lun_a;
        }

	for(i=0;i<lun_a;i++){
		printf("Valore del %d elemento del vettore 1 : ",i+1);
		scanf("%d",&A[i]);
	}

	for(i=0;i<lun_b;i++){
		printf("Valore del %d elemento del vettore 2 : ",i+1);
		scanf("%d",&B[i]);
	}


	//UNIONE
	int unione[lun_a+lun_b];
	usi = 0;
	for(i=0;i<lun_a;i++){
		trovato = 0;
		for(j=0;j<i && !trovato;j++)
			if(A[i]==unione[j])
				trovato = 1;


		if(!trovato)
			unione[usi++] = A[i];
	}


	for(i=0;i<lun_b;i++){
		trovato=0;
		for(j=0;j<usi && !trovato;j++)
			if(B[i]==unione[j])
				trovato = 1;
		if(!trovato)
			unione[usi++] = B[i];
	}
	printf("\nUNIONE : \n");
	stampav(unione,usi);




	//intersezione
	int intersezione[lun_max];

	usi = 0;
	for(i=0;i<lun_a;i++){
		trovato = 1;
		for(j=0;j<lun_b && trovato;j++)
			if(A[i] == B[j])
				trovato = 0;

		for(j=0;j<usi && !trovato;j++)
			if(A[i]==intersezione[j])
				trovato = 1;

		if(!trovato)
			intersezione[usi++] = A[i];
	}

	printf("\nINTERSEZIONE : \n");
	stampav(intersezione,usi);


	//differenza
    int differenza[lun_max];

	usi = 0;
	for(i=0;i<lun_a;i++){
		trovato = 1;
		for(j=0;j<lun_b && trovato;j++)
			if(A[i] == B[j])
				trovato = 0;

		for(j=0;j<usi && trovato;j++)
			if(A[i]==differenza[j])
				trovato = 0;

		if(trovato)
			differenza[usi++] = A[i];
	}

	for(i=0;i<lun_b;i++){
		trovato = 1;
		for(j=0;j<lun_a && trovato;j++)
			if(B[i] == A[j])
				trovato = 0;

		for(j=0;j<usi && trovato;j++)
			if(B[i]==differenza[j])
				trovato = 0;

		if(trovato)
			differenza[usi++] = B[i];
	}

	printf("\nDIFFERENZA : \n");
	stampav(differenza,usi);


}

