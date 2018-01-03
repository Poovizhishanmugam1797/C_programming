#include<stdio.h>
#include<math.h>
#include<ctype.h>
#include<string.h>
int main(void)
{
	int a[10],n,i,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	  scanf("%d",&a[i]);
    for(i=0;i<(n-1);i++)
	   for(j=(i+1);j<n;j++)
	       printf("(%d, %d)",a[i],a[j]);	  
	       return 0;
}//main
