#include<stdio.h>
#include<string.h>
int main(void)
{
	char s[20],c;
	int i,count=0,count1=0,n;
	scanf("%s",s); 
	for(i=0;i<n;i++)
	  printf("%c",s);
	  n=strlen(s);
	for(i=0;i<n;i++)
	   {
	    c=s[i];
	    if(isalpha(c))
	      count=count+1;
		if(isdigit(c))
		  count1=count1+1;  
	   }//for
	   printf("%d %d",count,count1);
	   return 0;
}//main
