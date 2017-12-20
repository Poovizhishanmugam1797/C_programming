#include<stdio.h>
#include<string.h>
int main(void)
{
   char ch[10],j;
   int n,t;
   scanf("%s",ch);
   //printf("%s",ch);
   n=strlen(ch);
   //printf("%d",n);



   for(int i=0;i<n;i++)
        {
            j=i+1;
            if(ch[j]!='\0') 
              
            {
             t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++; 
           } //if 
              
         }//for
 
printf("%s",ch);

    
  return 0;
}
