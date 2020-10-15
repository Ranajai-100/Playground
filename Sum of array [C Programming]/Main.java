#include<stdio.h>
#include<string.h>

int getarraysum(int arr[],int len)
{
  
    int sum = 0,i;
    for(i=0;i<len;i++)
    {
        sum+= arr[i];
    }

    return sum;
}


int main() 
{ 
  int a,i;   
  scanf("%d",&a);       
  int arr[a];
  for(i=0;i<a;i++){
      scanf("%d",&arr[i]);
  }
  printf("%d",getarraysum(arr,a));
}
