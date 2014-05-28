<?php
/*
	connectDB.php

*/

/*$host="mysql.hostinger.web.tr";
$user="u144120537_iso";
$password="123456";
$db="u144120537_mydb";*/
  
 
$host="localhost";
$user="myuser";
$password="12345";
$db="examregistrationdbtest";

if(@!mysql_connect($host, $user, $password)){
   $mesaj="Couldn't connect to database!<br>";
   $mesaj.="Error !: ".mysql_error();
   die($mesaj);
}
  
if(@!mysql_select_db($db)){
   $mesaj="Database was not chosed!<br>";
   $mesaj.="Error ! ".mysql_error();
   die($mesaj);
}


?>