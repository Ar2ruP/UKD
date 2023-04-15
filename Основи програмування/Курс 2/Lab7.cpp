/*Ввести 3 числа з клавіатури. Якщо перше більше за суму двох інших, вивести суму другого і третього числа. У іншому випадку порівняти друге і третє число. Якщо більшим є друге число, вивести це у вигляді тексту на екрані. Якщо більшим є третє число, вивести його суму з першим числом*/

#include <iostream>
using namespace std;
int main(){
  int Number1, Number2, Number3, Number13, Number23;
  cout<<"Введіть перше число ";
  cin>>Number1;
  cout<<"Введіть друге число ";
  cin>>Number2;
  cout<<"Введіть третє число ";
  cin>>Number3;
  Number13=Number1+Number3;
  Number23=Number2+Number3;
  if(Number1>Number23){
    cout<Number23;
  }
  if else(Number2>Number3){
    cout<<"Найбільше є друге число";
  }
  else cout<<Number13;
}
