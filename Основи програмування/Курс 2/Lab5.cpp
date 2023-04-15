/*Розрахувати відстань між двома містами, якщо автомобіль рухаючись два періоди часу тривалістю 1 година та дві години змінював свою швидкість 70 км/год на першому відрузку, до 90 км/год на другому. */

#include <iostream>
#include <math.h>
using namespace std;
int main{
  int speed1=70, speed2=90, time1=1, time2=2, way1, way2, Way;
  way1=speed1*time1;
  way2=speed2*time2;
  Way=way1+way2;
  cout<<Way;
  return 0;
}
