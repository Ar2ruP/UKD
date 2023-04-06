int RedPin = 7; 
int YelowPin = 6; 
int GreePin = 5; 
void setup()
{
pinMode(RedPin, OUTPUT); 
pinMode(YelowPin, OUTPUT);
pinMode(GreePin, OUTPUT);
}
void loop()
{
digitalWrite(RedPin, HIGH);
delay(5000);
digitalWrite(RedPin, LOW);
digitalWrite(YelowPin, HIGH);
delay(1000);
digitalWrite(YelowPin, LOW);
digitalWrite(GreePin, HIGH);
delay(5000);
digitalWrite(GreePin, LOW);
digitalWrite(YelowPin, HIGH);
delay(2000);
digitalWrite(YelowPin, LOW);
}
 
