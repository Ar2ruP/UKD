<?php

class Product
{
    public $name;
    public $price;

    public function __construct($name, $price)
    {
        $this->name;
        $this->price;
    }
}

class Seller
{
    public $name;
    public $type;
    public $products;
    public $clearBalance;
    public $income;

    public function __construct($name)
    {
        $this->name = $name;
        $this->income = 0;
        $this->products = [];
    }

    public function addProduct(Product $product)
    {
        $this->products[] = $product;
        $this->clearBalance += $product->price;

    }
}

class Buyer
{
    public $name;

    public function Buy($productName, seller $seller)
    {
        $actualProduct = null;
        foreach ($seller->products as $product) {
            if ($productName == $product->name) {
                $actualProduct = $product;
                break;
            }
        }
        if ($actualProduct == null) {
            throw new Exception('Product not found');
        }
        $seller->income += $actualProduct->price;
        echo  $this->name." bought product ".$actualProduct->name." in the ".$seller->name;
    }
}

$Seller = new Seller("АТБ");
$Seller->addProduct(new Product("Апельсини", 5));
var_dump($Seller);
