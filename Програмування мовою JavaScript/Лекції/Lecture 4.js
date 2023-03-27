let obj = {};
console.log(typeof obj); //створити і перевірити обєкт


let rectangle = {
    colour: "black"
};
rectangle.width = 5.37;
rectangle.height = 3.81;
console.log(rectangle.colour);
console.log(rectangle.height);
console.log(rectangle.width);


function Rectangle(color, width, height) {
    this.color=color;
    this.width=width;
    this.height=height
}
let rect1=new Rectangle('Black',14,15);

console.log(rect1.color);
console.log(rect1.width);
console.log(rect1.height)


function Rectangle(color, width, height) {
    this.color = color;
    this.width = width;
    this.height = height
}

let colors = ["black", "red", "white", "blue", "gray"];
for (let i = 0; i <= 5; i++) {
    let width = Math.random() * 10;
    let height = Math.random() * 10;
    let rectangle=new Rectangle(colors[i],width,height);
    console.log(colors:${rectangle.colors})
}
