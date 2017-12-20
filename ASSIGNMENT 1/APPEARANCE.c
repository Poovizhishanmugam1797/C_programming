#include<stdio.h>
#include<string.h>
int main(void)
{
	char ch[20],r;
	int n,count[10],i,j;
	scanf("%s",ch);
	printf("%s",ch);
	n=strlen(ch);
	
	for(i=0;i<n;i++)
	   count[i]=1;
	   
	for(i=0;i<(n-1);i++)
	  for(j=i+1;j<n;j++)
	   
	   if(ch[i]!=ch[j])
	     continue;
	   else
	     {
		 count[i]=count[i]+1;
	      ch[j]=r;
	     }
	  for(i=0;i<n;i++)
	    {
		 if(ch[i]!=r)
	     printf("\n\n\t\t count of %c: %d",ch[i],count[i]);
	    }
	 
	
	     	    
		   
	  
	return 0;
}
