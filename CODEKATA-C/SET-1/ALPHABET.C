//ALPHABET/NOT
#include<stdio.h>
#include<ctype.h>

int main(void)
{
	char ch;
	printf("Input  : ");
	scanf("%s",&ch);
	printf("Output : ");
	if(isalpha(ch))
	
		printf(" Alphabet ");
	else
	    printf(" Not Alphabet ");
return 0;
}//main
