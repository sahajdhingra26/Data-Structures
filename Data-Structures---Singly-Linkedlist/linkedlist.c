#include <stdlib.h>
#include <stdio.h>

// To execute C, please define "int main()"
struct Node {
  int data;
  struct Node* next;
};

struct Node* head;

void insertAtBeginning(int x){
  struct Node* temp;
  temp =malloc(sizeof(struct Node));
  temp->data = x;
  temp->next =head; // if list empty temp ->next = null (because head is null). If list is not empty then temp->next = head which stores the first element of the list 
  head=temp;
}

void insertAtNthPosition(int x, int n){
  struct Node* temp1;
  int i;
  temp1 =malloc(sizeof(struct Node));
  temp1->data = x;
  temp1->next =NULL; 
  if(n==1){  // if list is empty
  	temp1->next =head;
  	head=temp1;
  	return;
  }
  struct Node* temp2=head;
  for (i=0;i<n-2;i++){   // traverse to n-1 node
  	temp2=temp2->next;
  }
  temp1->next=temp2->next;
  temp2->next=temp1;
}  

void deleteAtNthPosition(int n){
  struct Node* temp1=head;
  if(n==1){
  	head=temp1->next;
  	free(temp1);
  	return;
  }
  int i;
  for(i=0;i<n-2;i++){
  	temp1=temp1->next;
  }
  //temp1 now points to (n-1)th Node
  struct Node* temp2=temp1->next;
  temp1->next =temp2->next; //(n+1)th Node
  free(temp2);
}


void printLinkedList(){
  struct Node* temp=head;
  printf("List is :");
  while(temp !=NULL){
    printf(" %d",temp->data);
    temp=temp->next;
  }
  printf("\n");
}


int main() {
  int choice,element,total,i,position;
  head = NULL; // empty list;
  printf("Enter the operation you want to perform on linkedlist\n1)Insert at beginning\n2)Insert at nth position\n3)Delete the node at nth position\n");
  scanf("%d",&choice);
  switch(choice)
    {
        case 1:
          printf("\nHow many elements you want to enter?\n");
          scanf("%d",&total);
          for (i=0;i<total;i++){	
          	printf("\nEnter the element\n");
          	scanf("%d",&element);
          	insertAtBeginning(element);
          	printLinkedList();
          }       
            break;
        case 2:
        	insertAtBeginning(3);
          	insertAtBeginning(2);
          	insertAtBeginning(1);
          	printLinkedList();
          	printf("\nEnter the position?\n");
          	scanf("%d",&position);
      	   	printf("\nEnter the element\n");
          	scanf("%d",&element);
          	insertAtNthPosition(element,position);
          	printLinkedList();
            break;    
        case 3:
        	insertAtBeginning(3);
          	insertAtBeginning(2);
          	insertAtBeginning(1);
          	printLinkedList();
          	printf("\nEnter the position?\n");
          	scanf("%d",&position);
          	deleteAtNthPosition(position);
          	printLinkedList();
            break;        

        default:
            printf("Error! Please enter a valid choice");    
    }
  return 0;
}
