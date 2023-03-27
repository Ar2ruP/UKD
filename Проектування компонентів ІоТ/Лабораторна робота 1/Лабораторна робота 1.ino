
void setup() {
  pinMode(red, OUTPUT);  
}

void loop() {
  for(int i=0; i<=130; i++) {
    analogWrite(red, i);
    delay(15);
  }
   for(int i=110; i>=0; i--) {
    analogWrite(red, i);
    delay(15);
}
}
