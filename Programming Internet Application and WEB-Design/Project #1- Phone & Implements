<?php

class Phone implements PhoneInterface
{
    public function call (Phone $phone)
    {
        $result=$this->name.' calling to '.$phone->name.'</br>';
       $result2=$phone->pickup();
       return $result.$result2;

    }

    public function pickup ()
    {
        return $this->name.' picking up the phone ';
    }

    public $name;
}

interface PhoneInterface
{
    public function call(Phone $phone);

    public function pickup();
}

$APPLE = new Phone();
$APPLE->name = "iPhone";
$SAMSUNG = new Phone();
$SAMSUNG->name = "SAMSUNG";

echo $APPLE->call($SAMSUNG);
