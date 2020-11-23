<?php

interface AnimalInterface {

    public function generalName();

}

class BaseAnimal {

    public $power;

    public function attack(BaseAnimal $object) {
        if ($this->power > $object->power) {
            return $this->generalName() . ' IS WINNER';
        } else {
            return $object->generalName() . ' IS WINNER';
        }
    }
}

class Dog extends BaseAnimal implements AnimalInterface{

    public function generalName()
    {
        return "DOG";
    }
}

class Cat extends BaseAnimal implements AnimalInterface {

    public function generalName()
    {
        return 'CAT';
    }

}
$cat = new Cat();
$cat->power = 1;


$dog = new Dog();
$dog->power = 5;

echo $dog->attack($cat);
echo $cat->attack($dog);
?>
