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



bool isOperand(char C) 
{
  if(C >= '0' && C <= '9') return true;
  if(C >= 'a' && C <= 'z') return true;
  if(C >= 'A' && C <= 'Z') return true;
  return false;
}

// Function to verify whether a character is operator symbol or not. 
bool isOperator(char C)
{
  if(C == '+' || C == '-' || C == '*' || C == '/' || C== '$')
    return true;

  return false;
}

// Function to verify whether an operator is right associative or not. 
int isRightAssociative(char op)
{
  if(op == '$') return true;
  return false;
}

// Function to get weight of an operator. An operator with higher weight will have higher precedence. 
int getOperatorWeight(char op)
{
  int weight = -1; 
  switch(op)
  {
  case '+':
  case '-':
    weight = 1;
  case '*':
  case '/':
    weight = 2;
  case '$':
    weight = 3;
  }
  return weight;
}

// Function to perform an operation and return output. 
int hasHigherPrecedence(char op1, char op2)
{
  int op1Weight = GetOperatorWeight(op1);
  int op2Weight = GetOperatorWeight(op2);

  // If operators have equal precedence, return true if they are left associative. 
  // return false, if right associative. 
  // if operator is left-associative, left one should be given priority. 
  if(op1Weight == op2Weight)
  {
    if(IsRightAssociative(op1)) return false;
    else return true;
  }
  return op1Weight > op2Weight ?  true: false;
}

void infixToPostfix(char expression){
  struct Node* temp;
  char result[]="NULL";
  temp =malloc(sizeof(struct Node));
  int i;
  for(i=0;i<sizeof(expression);i++){
    if(!isOperator(expression))
      result=result+expression;
    else{
      while(top!=NULL){

      }
    } 

  }
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
