#include <stdio.h>
#include <stdlib.h>

typedef struct node {
int val;
struct node * next;
} node_t;


void push(node_t ** head,int val){
node_t * nn= malloc(sizeof(node_t));
nn->val=val;
nn->next=*head;
*head=nn;

}

int pop(node_t ** head){
int val=(*head)->val;
node_t *next=(*head)->next;
free(head);
*head=next;
return val;

}




void stampalist(node_t * head){
node_t * current= head;
while(current!=NULL){
    printf("%d\n",current->val);
    current=current->next;
}
}


int main(){

node_t * head = NULL;
head = malloc(sizeof(node_t));
if (head == NULL) {
    return 1;
}
head->val = 1;
int n;
printf("Numero volte\n");
scanf("%d",&n);
node_t * attuale=head;
printf("contrnuti\n");
for(int i=0;i<n;i++){
    if(i<n-1)
        attuale->next=malloc(sizeof(node_t));
    scanf("%d",&attuale->val);
    if(i<n-1)
        attuale=attuale->next;
}
attuale->next=NULL;

printf("stampa\n");
push(&head,10);
printf("PUSHED\n");
stampalist(head);
printf("Popped %d\n",pop(&head));
stampalist(head);

}
