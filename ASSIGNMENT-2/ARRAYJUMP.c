#include<stdio.h>
#include<string.h>
int main(void)
{
	   int n,i,a[10],j;
	   	printf("\n\n\t\t INPUT : ");
	   scanf("%d",&n);
		
		printf("\n\n\t\t ARRAY ELEMNTS : ");
		for(i=1;i<=n;i++)
		  scanf("%d",&a[i]);
	
		int jmp=1,k;
		i=1;
		  
	      
	    while(jmp<n)
	    {  
	    	
		    k=a[jmp];
		    for(j=1;j<=k;j++)
		       jmp++;
		   		    
		    if(jmp==n)
		    {
		    printf("\n\n\t\t TRUE");
		      break;
	     	}
		    if(jmp>n)
		    {
		    	printf("\n\n\t\t FALSE");
		      break;
	     	}
		
	    } 

	

		  
		  
		   
return 0;

}//class maxmin

