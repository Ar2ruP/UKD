/*Ввести 2-значне число (без 0), вивести його задом на перед*/

#include <iostream>
#include <math.h>
using namespace std;
int main(){
  int a,b,c;
  cout<<"Введіть двоцифрове число, у якому немає 0";
  cin>>a;
  b=a%10;
  c=a%100/10;
  cout<<b<<c;
  return 0;
}
