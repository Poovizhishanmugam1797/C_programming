#include<stdio.h>
int count=10;
void func();
int main(void)
{
  int count=0;
  void local()
{
   int count=5;
   printf("%d",count);
}//local
local();
printf("\n%d",count);

  
  func();
 return 0;
}
void func()
{
 printf("\n%d",count);
}
