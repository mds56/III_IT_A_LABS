#include <stdio.h>
#include <string.h>
char input[20];
char op, op1, op2;

char temp[5]={'v','w','x','y','z'};
int temp_pointer=0;

void scan()
{
    for(int i=0;i<strlen(input); i++)
    {
        if((input[i]=='+')||(input[i]=='-')||(input[i]=='*')||(input[i]=='/'))
        {
            op=input[i];
            op1=input[i-1];
            op2=input[i+1];
            printf("\n");
            printf("%c = %c %c %c",temp[temp_pointer],op1,op,op2);
            printf("\n");
            input[i+1]=temp[temp_pointer++];
        }
    }
}

int main(){
   printf("\nEnter expression:");
   scanf("%s" , input);
   input[strlen(input)-1]='\0';
   scan();

   return 0;
}
