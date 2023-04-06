const int button = 10;   
int count = 0;         
int button_old = 1;    
void setup() {
  DDRD = DDRD | B11111111;
  Serial.begin(9600);
  pinMode(button, INPUT_PULLUP);
}
void loop() {
  if ((digitalRead(button)==LOW)&&(button_old==1))
  { 
    if(count>248) count=0;
    count = count - 2 ;
    PORTD = count;
    String pt = "_";
    Serial.print(PORTD,BIN);
    Serial.println(pt+count);
  }
  button_old = digitalRead(button); 
  delay(10);
}
