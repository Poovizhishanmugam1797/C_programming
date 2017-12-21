#include<stdio.h>
#include<string.h>
int main()
{
    char a[20],b[20];
    int n;
    scanf("%s",a);
    //for(int i=0;i<n;i++)
       //b[i]=tolower(a[i]);
    n=strlen(a);
    for(int i=(n-1);i>=0;i--)
       printf("%c",a[i]);
    printf("\n");   
    for(int i=(n-1);i>=0;i--)
      {
       if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='i'))
         continue;
       else
         printf("%c",a[i]);
      }//for 
 
    return 0;
}
