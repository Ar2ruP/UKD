#include <iostream>
using namespace std;
int main(){
  int ProgrammerSalleryFull, AccountantSalleryFull, ProgrammerSalleryPrecent, AccountantSalleryPercent;
  cout<<"Введіть заробітню плату програміста";
  cin>>ProgrammerSalleryFull;
  cout<<"Введіть заробітню плату бухгалтера";
  cin>>AccountantSalleryFull;
  ProgrammerSalleryPrecent=ProgrammerSalleryFull*18/100;
  cout<<ProgrammerSalleryPrecent;
  AccountantSalleryPercent=AccountantSalleryFull*(100-10)/100;
  cout<<AccountantSalleryPercent;
}
