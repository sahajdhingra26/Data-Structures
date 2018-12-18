#include <stdlib.h>
#include <stdio.h>

struct Node {
  int data;
  struct Node* link;
};

struct Node* top = NULL;

void push(int x){
  struct Node* temp;
  temp =malloc(sizeof(struct Node));
  temp->data = x;
  temp->link =top; // if list empty temp ->next = null (because head is null). If list is not empty then temp->next = head which stores the first element of the list 
  top=temp;
}


void pop(){
  if(top==NULL) return;  // already empty
  struct Node* temp1=top;
  	top=temp1->link;
  	free(temp1);
  	return;
}


void printStack(){
  struct Node* temp=top;
  printf("Stack is :");
  while(temp !=NULL){
    printf(" %d",temp->data);
    temp=temp->link;
  }
  printf("\n");
}


int main() {
  int choice,element,total,i,position;
  printf("Enter the operation you want to perform on stack\n1)Push\n2)Pop\n");
  scanf("%d",&choice);
  switch(choice)
    {
        case 1:
          printf("\nHow many elements you want to push?\n");
          scanf("%d",&total);
          for (i=0;i<total;i++){	
          	printf("\nEnter the element\n");
          	scanf("%d",&element);
          	push(element);
          	printStack();
          }       
            break;
        case 2:
        	  push(3);
          	push(2);
          	push(1);
          	printStack();
          	pop();
          	printStack();
            break;    
        default:
            printf("Error! Please enter a valid choice");    
    }
  return 0;
}
