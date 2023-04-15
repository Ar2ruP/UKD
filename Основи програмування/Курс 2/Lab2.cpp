/* cos|2x|/1.12-cos(3x-2)+6.15 */
#include <iostream>
#include <math>
void main(){
  float x=2, y;
  y=cos(fabs(2*x))/1.12-cos(3*x-2)+6.15;
  cout<<"\n y="<<y<<"\n";
}
