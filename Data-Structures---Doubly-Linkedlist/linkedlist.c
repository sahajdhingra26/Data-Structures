#include <stdlib.h>
#include <stdio.h>

// To execute C, please define "int main()"
struct Node {
  int data;
  struct Node* next;
  struct Node* prev;
};

struct Node* head;

struct Node* getNewNode(int x){
  struct Node* temp;
  temp =malloc(sizeof(struct Node));
  temp->data = x;
  temp->next =NULL;
  temp->next =NULL;
  return temp;
}
void insertAtBeginning(int x){
  struct Node* temp;
  temp=getNewNode(x); 
  if(head==NULL){  // if list is empty
    head=temp;
    return;
  } 
  head->prev=temp;
  temp->next=head;
  head=temp;
}

void insertAtEnd(int x){
  struct Node* temp1;
  temp1=getNewNode(x);


  struct Node* temp2=head; 
  while(temp2->next!=NULL){
    temp2=temp2->next;  // traverse to the end
  }
  temp2->next=temp1;
  temp1->prev=temp2;
  temp1->next=NULL;

}

void printReverseLinkedList(){
  struct Node* temp=head;
  if(temp==NULL) return; //empty list

  while(temp->next!=NULL){
    temp=temp->next;  // traverse to the end
  }
  printf("Reverse :");
  while(temp !=NULL){
    printf(" %d",temp->data);
    temp=temp->prev;
  }
  printf("\n");
}



void printLinkedList(){
  struct Node* temp=head;
  printf("Forward :");
  while(temp !=NULL){
    printf(" %d",temp->data);
    temp=temp->next;
  }
  printf("\n");
}


int main() {
  int choice,element,total,i,position;
  head = NULL; // empty list;
  printf("Enter the operation you want to perform on doubly linkedlist\n1)Insert at beginning\n2)Insert at end\n3)Reverse the linkedlist\n");
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
        	printf("\nHow many elements you want to enter?\n");
          scanf("%d",&total);
          for (i=0;i<total;i++){  
            printf("\nEnter the element\n");
            scanf("%d",&element);
            insertAtEnd(element);
            printLinkedList();
          }       
            break;    
        case 3:
        	  insertAtBeginning(3);
          	insertAtBeginning(2);
          	insertAtBeginning(1);
          	printLinkedList();
          	printReverseLinkedList();
            break;        

        default:
            printf("Error! Please enter a valid choice");    
    }
  return 0;
}
