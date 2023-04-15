#include <iostream>
#include <math>
void main(){
  const float π=3.1415926; /*Ініціалізуємо π*/
  float x=2, y;
  y=pow(x*x+7.2,1/5)-fabs(x/5)+sin(π*x/3);
  cout<<"\n y="<<y<<"/n";
}
