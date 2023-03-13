// Цикл "for"
for (let i = 1; i < 10; i++) {
    let result = i ** 2; //Присвоюємо result i в квадраті
    console.log(result); //Виводимо result
}


// Цикл "while"
let i = 1;
while (i < 10) {
    let result = i ** 2;
    console.log(result);
    i++; //i=i+1
}


// Цикл Do While
do {
    let number = Math.random() * 10;
    sum += number;
    counter++;
} while (sum < 100);


//Приклад #1
let sum = 0, counter = 0;
while (sum < 100) {
    let number = Math.random() * 10;
    sum += number; //sum=sum+number
    counter++;
}
console.log('sum=${sum}, counter=${counter}');


// Приклад #2
let sum = 0, counter = 0;
for (; ; counter++) {
    if (sum >= 100) break;
    let number = Math.random() * 10;
    sum += number;
}
console.log('sum=${sum}, counter=${counter}');


// Приклад 3
let message = "";
do {
    message = prompt("Enter message: ");
    if (message === "exit") break;
    alert(message);
} while (true);


// Масиви приклад
let numbers = [1, 2, 3, 4, 5];  //Створюємо масив
console.log(numbers[2]);
numbers[2] = 33;    //Перепризначення числа 3 на 33
console.log(numbers[25]);
numbers[9]=123;
let anything=[2, true, "Hello", {"a":8}, [1,2,3]];
