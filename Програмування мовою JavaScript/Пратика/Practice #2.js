class Shape{
    constructor(color) {
        this.color=color;
    }
}

class Circle extends Shape{
    constructor(radius) {
        this.radius=radius;
    }
}

class Rectangle extends Shape{

    static π = 3.14;
    static counter = 0;

    constructor(width, height) {
        this._height = height;
        this._width = width;
        Rectangle.counter++;
    }

    static getNumbersofRectangles() {
        return Rectangle.counter;
    }

    getπ() {
        return this.π;
    }

    set width(w) {
        if (w > 0) {
            this._width = w;
        } else {
            throw new Error("The width should be bigger than 0")
        }
    }

    set height(h) {
        if (h > 0) {
            this._height = h;
        } else {
            throw new Error("The height should be bigger than 0")
        }
    }

    get width() {
        return this._width;
    }

    get height() {
        return this._height;
    }

    perimeter() {
        return 2 * (this._height + this._width);
    }

    area() {
        return this._height * this._width;
    }
}

const rectangle = new Rectangle(4.86, 3.49);
console.log("Perimeter: " + rectangle.perimeter());
console.log("Area: " + rectangle.area());

rectangle.width = 7.35; //що станеться якщо змінимо значення?)

console.log("Perimeter: " + rectangle.perimeter());
console.log("Area: " + rectangle.area());
console.log("π:" + Rectangle.π());
const rectangles = [];
for (let i = 0; i < 10; i++) {
    rectangles.push(new Rectangle(3, 2));
    console.log();
}
