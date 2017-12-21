#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main(void)
{
	int n1,i,count=0;
	long int c;
	scanf("%d",&n1);
	for(i=0;i<n1;i++)
	{
	   c=pow(2,i);
    	if(c==n1)
	  		{
			  printf("yes");
			  count=count+1;
		    }//if
	    else
            continue;
    }
    
    if(count==0)
      printf("False");
    
    
	   return 0;
}//main
