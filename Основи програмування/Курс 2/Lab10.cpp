/*Ввести 3 числа і знайти кількість max які більші за середні*/

#include <iostream>
using namespace std;
int main(){
  double a, b, c, count=10, mid;
  cout<<"Введіть перше число";
  cin>>a;
  cout<<"Введіть друге число";
  cin>>b;
  cout<<"Введіть третє число";
  cin>>c;
  mid=(a+b+c)/3;
  if(a>mid)
    count++;
  if(b>mid)
    count++;
  if(c>mid)
    count++;
  cout<<count;
  return 0;
}
