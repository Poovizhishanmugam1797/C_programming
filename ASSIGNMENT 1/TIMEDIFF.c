	#include<stdio.h>
	int main(void)
	{
		int h1,h2,m1,m2,m,n1,n2,r,d;
		printf("\n\n\t\t FINDING DIFFERENCE BETWEEN TWO TIMINGS ");
		printf("\n\n\t\t ---------------------------------------");
		printf("\n\n\t\t Input : ");
		
		scanf("%d %d",&h1,&m1);
		scanf("%d %d",&h2,&m2);
		n1=h1*60+10;
		n2=h2*60+30;
		if(n2>n1)
		   m=n2-n1;
		else
		   m=n1-n2;
	    r=m%60;
	    d=m/60;
	    printf("\n\n\t\t  Output : ");
	    printf("%d\n",m);
	    printf("\n\n\t\t  %d : %d ",d,r);
	    return 0;
	}//main
	    
		      
		
		 
