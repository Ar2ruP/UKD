/*Швидкість світла 299792 км/с. Яку відстань долає світло за годину,добу? */

#include <iostream>
#include <math.h>
using namespace std;
int main(){
  const float LightSpeed=299792;
  float SpeedH,SpeedD;
  SpeedH=LightSpeed*3600;
  SpeedD=LightSpeed*24;
  cout<<"Світло долає за день "<<SpeedD<<" км";
  cout<<"Світло долає за годину "<<SpeedH<<" км";
  return 0;
}
