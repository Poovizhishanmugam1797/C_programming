#include<stdio.h>
#include<string.h>
int main(void)
{
	char ch[30],r,c[30];
	int n,count[30],i,j,p,t=0;
	int max=0;
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
	        {
			printf("\n\n\t\t count of %c: %d",ch[i],count[i]);
	        p++;
	        if(count[i]>max)
	           max=count[i];
	        //if(count[i]==max)
			   //c[t++]=ch[i];   
	       }
	    }
	    printf("\n%d\n",p);
	    
	   /*int t=0;
	    for(i=0;i<p;i++)
	       if(count[i]>max)
	         
			  max=count[i];*/
	   printf("%d",max);		  
       for(i=0;i<n;i++)  			  
		if(count[i]==max)
		  c[t++]=ch[i];
		  	 	 
		    
		    
	    printf("\n\n\t\t  The Maximum Count   : %d\n",max);
	    for(i=0;i<t;i++)
	    printf("\n\n\t\t  %c",c[i]);
		      
	    
	 
	
	     	    
		   
	  
	return 0;
}
