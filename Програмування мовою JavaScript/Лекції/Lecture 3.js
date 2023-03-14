//functions

//Приклад 1
function someFunc() {   //Створення функції
    console.log("Hello function");
}

someFunc(); //Виклик функції


//Приклад 2
function add(a, b) {
    let result = a + b;
    console.log(result);
}

add(3, 4);

//Приклад 3
function addAndReturn(a, b) {
    return a + b;
}

let result = addAndReturn(7, 6);
console.log(result);

//Приклад 4

function someFun() {
    console.log("Hello function");
    for (element of arguments) {
        console.log(element);
    }
}

someFun(1, 2, 3);

//Приклад 5

function add(a, b) {
    let result = a + b;
    console.log(result);
}

let result = add();
console.log(result);

//Приклад 6

const numbers = [1, 2, 3, 4, 5];

function iteraction(value, index) {
    console.log(index + "->" + value);
}

numbers.forEach(iteraction);

//Приклад 7

function add(a, b) {
    return a + b;
}

let result = add(1, 2);
console.log(result);


let addRef = add;
let result2 = addRef(2, 3);
console.log(result2);

//Приклад 8
const numbers = [1, 2, 3, 4, 5];
Array.prototype.myForEach = function (callbackfn) {
    for (index in this) {
        callbackfn(this[index], index);
    }
}
numbers.myForEach(function (value, index) {
    console.log(index + "->" + value);
});
