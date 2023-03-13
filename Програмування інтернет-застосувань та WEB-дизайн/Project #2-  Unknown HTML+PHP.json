<?php

const TYPE_PERSONAL = 'personal';
const TYPE_COMPANY = 'company';

function post($key, $defaultValue = null) {
    return !empty($_POST) && isset($_POST[$key]) ? $_POST[$key] : $defaultValue;
}

function isCheckboxEnabled($name) {
    return !empty($_POST) && isset($_POST[$name]) && $_POST[$name] == 'on';
}

function isRadioValueEnabled($radioName, $radioValue) {
    return !empty($_POST) && isset($_POST[$radioName]) && $_POST[$radioName] == $radioValue;
}

if (!empty($_POST)) {
    echo 'Username: ' . post('name', '') . '<br/>';
    echo 'Email: ' . post('email', '') . '<br/>';
    if (isRadioValueEnabled('type', TYPE_COMPANY)) { // personal
        echo 'Company name: ' . post('company_name', '') . '<br/>';
        echo 'Company address: ' . post('company_address', '') . '<br/>';
    }

    if (isCheckboxEnabled('roof')) {
        echo 'Roof enabled </br>';
    }
    if (isCheckboxEnabled('door')) {
        echo 'Door enabled </br>';
    }
}

?>
<style>
    div {
        margin: 12px;
    }

    input[type=text],
    input[type=email]
    {
        height: 30px;
        width: 320px;
    }
    button {
        background-color: green;
        color: white;
        width: 160px;
        height: 32px;
        border: 2px solid white;
    }
</style>
<form method="post">
    <h2>User info</h2>
    <div>
        <label for="name">Name</label>
        <input required type="text" name="name" id="name" value="<?=post('name')?>"/>
    </div>

    <div>
        <label for="email">Email</label>
        <input required type="email" name="email" id="email" value="<?=post('email')?>">
    </div>

    <div>
        <label for="personal">Personal</label>
        <input type="radio" id="personal" name="type" value="<?=TYPE_PERSONAL?>" <?=isRadioValueEnabled('type', TYPE_PERSONAL) ? 'checked' : ''?>>

        <label for="company">Company</label>
        <input type="radio" id="company" name="type" value="<?=TYPE_COMPANY?>" <?=isRadioValueEnabled('type', TYPE_COMPANY) ? 'checked' : ''?>>
    </div>

    <div>
        <h6>Check equipments</h6>
        <label>Roof</label>
        <input type='checkbox' name="roof" <?= isCheckboxEnabled('roof') ? 'checked' : ''?>>

        <label>Door</label>
        <input type='checkbox' name="door" <?=isCheckboxEnabled('door') ? 'checked' : ''?>>
    </div>
    <br>
    ====================================================================================
    <h2>Company info</h2>

    <div>
        <label for="cname">Company Name</label>
        <input type="text" name="company_name" id="cname"/>
    </div>
    <div>
        <label for="caddress">Company address</label>
        <input type="text" name="company_address" id="caddress">
    </div>

    <button type="submit">Save</button>
</form>
