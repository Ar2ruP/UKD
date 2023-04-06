#include <stdio.h>      
#include <stdlib.h> 
#include <iostream>
using namespace std;

int main()
{
    int even=0,odd=0,i=0;
  int a[20];
  for(i=0;i<20;i++){
  a[i]=rand()%20;}
  for(i=0;i<20;i++){
    if(a[i]%2==0){
        even++;
        }
    if(a[i]%2!=0){
        odd++;
        }  
  }
  if(even>odd){
  cout<<"Парних чисел більше";
  }else{
      cout<<"Непарних чисел більше";
  }
}
