//VOWEL/CONSONANT
#include<stdio.h>
#include<ctype.h>
#include<string.h>
int main(void)
{
	char ch;
		printf("Input  : ");
	scanf("%s",&ch);
	char c=tolower(ch);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
	   printf("Output : vowel");
	else
	   printf("Output : consonant"); 
	   return 0;
}//main
