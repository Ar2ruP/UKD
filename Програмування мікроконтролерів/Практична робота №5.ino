//Реалізувати почергове відтворення цифр на цифровому індикаторі HL1,що відповідають даті народження студента (14052002)

int pins[8]={2, 3, 4, 5, 6, 7, 8 ,9,};
byte numbers[10] = {/*1*/ B11110010, /*4*/ B00110011,/*0*/ B10000000,/*5*/B00100101, B11110010,/*2*/ B01001001, /*0*/ B10000000,/* */ B11111111, /*0*/B10000000,/*2*/ B01001001};
int number=0;
void setup(){
for(int i=0;i<8;i++)
pinMode(pins[i],OUTPUT);}
void loop(){
 Serial.begin(9600);
showNumber(number);
delay(1000);
number=(number+1)%10;}
void showNumber(int num){
for(int i=0;i<10;i++){
if(bitRead(numbers[num],8-i)==HIGH)
digitalWrite(pins[i],HIGH);
else
digitalWrite(pins[i],LOW);}
}
