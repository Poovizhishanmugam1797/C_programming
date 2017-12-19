//to check whether the Number is positive/not
#include<stdio.h>
int main(void)
{
	int n;
		printf("Input  : ");
	scanf("%d",&n);
	if(n==0)
	   printf("Output : Zero "); 
	if(n<0)
	   printf("Output : Negative");
	if(n>0)
	   printf("Output : positive");
	return 0;
}//main
