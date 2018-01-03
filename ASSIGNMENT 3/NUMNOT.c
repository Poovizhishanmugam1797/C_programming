#include<stdio.h>

#include<math.h>
#include<ctype.h>
#include<string.h>
int main(void)
{
	int i;
	char s[20],c;
    int count=0,count1=0;
	scanf("%s",s); 
	for(i=0;i<strlen(s);i++)
	   printf("%c",s[i]);
for(i=0;i<strlen(s);i++) 
{
	c=s[i];
	if(isdigit(c))
	  
	  count=count+1;
	  
      
    if(isalpha(c))
	  
	  count1=count1+1;

	
 }//for
 
     if(count==strlen(s))
   		printf("true");
     else
   		printf("false");
       
 
	  return 0;
}//main
