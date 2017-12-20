#include<stdio.h>
#include<string.h>
int r;

	int value(char r)
	{
		if(r=='I')
			return 1;
		if(r=='V')
			return 5;
		if(r=='X')
			return 10;
		if(r=='L')
			return 50;
		if(r=='C')
			return 100;
		if(r=='D')
			return 100;
		if(r=='M')
			return 1000;
		
		return -1;
		
	}
	int rtd(char str[20])
	{
		 int res=0;
		 int n1,n2,i,n;
		 n=strlen(str);
		 for(i=0;i<n;i++)
			 {
			 n1=value(str[i]);
			if((i+1)<n)
				n2=value(str[i+1]);
			else
				n2=0;
			if(n1>=n2||n2==0)
				res=res+n1;
			else
				{
				res=res+(n2-n1);
			    i++;
				}
			 }//for
		 return res;
	}//rtd
int main(void)
{
	char str[20];
   scanf("%s",str);	
   int res1;
   res1=rtd(str);
   printf("%d",res1);
   return 0;
}//main
	 
	
	
	
