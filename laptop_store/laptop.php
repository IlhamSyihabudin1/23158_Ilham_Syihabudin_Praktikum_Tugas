<?php
require_once "method.php";
$obj = new Laptop();
$request_method = $_SERVER["REQUEST_METHOD"];

switch ($request_method) {
    case 'GET':
        if (!empty($_GET["id"])) {
            $obj->get_laptop(intval($_GET["id"]));
        } else {
            $obj->get_laptops();
        }
        break;

    case 'POST':
        if (!empty($_GET["id"])) {
            $obj->update_laptop(intval($_GET["id"]));
        } else {
            $obj->insert_laptop();
        }
        break;

    case 'DELETE':
        $obj->delete_laptop(intval($_GET["id"]));
        break;

    default:
        header("HTTP/1.0 405 Method Not Allowed");
        break;
}
?>
