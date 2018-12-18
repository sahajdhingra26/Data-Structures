// Three properties to check 
// 1. opening = closed
// 2. last unlcosed, first closed
// 3. all closing should be on right of opened and vice-versa


// algo
// 1. scan from left to right 
//    => if opening - add to list
//    => if closing remove last opening symbol from list


#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

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


bool isPair(char opening,char closing)
{
  if(opening == '(' && closing == ')') return true;
  else if(opening == '{' && closing == '}') return true;
  else if(opening == '[' && closing == ']') return true;
  return false;
}

bool isBalanced(char *expression){
  int i;
  for(i=0;i<sizeof(expression);i++){
    if(expression[i]=='(' || expression[i]=='{' || expression[i]=='[')
      push(expression[i]);
    else if(expression[i]==')' || expression[i]=='}' || expression[i]==']'){
      if(top==NULL || !isPair(top->data,expression[i]))
        return false;
      else
        pop();
    }
  }
  return top==NULL ? true:false;

}


int main() {
  char expression[]="NULL";
  printf("Enter an expression\n");
  scanf("%s",expression);
  if(isBalanced(expression))
    printf("Balanced\n");
  else
    printf("Not Balanced\n");
  return 0;
}
