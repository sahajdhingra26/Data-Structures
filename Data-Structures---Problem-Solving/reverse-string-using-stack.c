#include <stdlib.h>
#include <stdio.h>

struct Node {
  char data;
  struct Node* link;
};

struct Node* top = NULL;


void push(char x){
  struct Node* temp;
  temp =malloc(sizeof(struct Node));
  temp->data = x;
  temp->link =top; // if list empty temp ->next = null (because head is null). If list is not empty then temp->next = head which stores the first element of the list 
  top=temp;
}


void pop(){
  if(top==NULL) return;  // already empty
    struct Node* temp=top;
    temp=top;
  	top=temp->link;
  	free(temp);
  	return;
}

void reverse(char *arr,int length){
  int i;
  for(i=0;i<length;i++){
    push(arr[i]);
  }
  for(i=0;i<length;i++){
    arr[i]=top->data;
    pop();
  }

}


int main() {
  int choice,element,total,i,position;
  char arr[5];
  printf("Enter a string of max 5 letters\n");
  scanf("%s",arr);
  reverse(arr,sizeof(arr));
  printf("Reverse of the string is %s",arr);
  return 0;
}
