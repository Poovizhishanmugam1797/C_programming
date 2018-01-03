#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
int main(void)
{
	int a[10],n,max,i,b[20];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	  scanf("%d",&a[i]);
	max=a[0];
	for(i=1;i<n;i++)
	  { 
	    if(a[i]>max)
	    max=a[i];
	    
     }//for
     int k=0;
   
     for(i=0;i<n;i++)
      {
	  if(a[i]==max)
        {
		 b[k]=a[i];
         break;
        }  
      else
	     {
		 b[k]=a[i];
	     k++;
	     }
	 }
       for(i=0;i<=k;i++) 
	     
         printf("%d",b[i]);
    
     return 0;
 }//main
		    
	  
	     	
		    
	  
