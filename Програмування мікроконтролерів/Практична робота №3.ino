//Послуговуючись операціями бітового зсуву відтворити світлові ефекти через led-випромінювачі (див. рис. 1) згідно свого варіанту завдання: Подвійна біжуча тінь (зліва направо)

int i;
int j;

void setup(){
DDRD = DDRD | B11111100; 
}

void loop(){
    j = B11111111;
for (i=0; i<7; i++){
    PORTD = PORTD & B00000000;
	PORTD = PORTD | j; 
	delay(1000);
    j = j >> 1;
	}
}
