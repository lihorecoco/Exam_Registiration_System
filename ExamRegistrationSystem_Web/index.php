<html >
<head>



<style>


.main{
	vertical-align:middle;
	width:900px;
	height:1000px;
	margin-top:20px;
	margin-left:auto;
	margin-right:auto;
	padding-bottom:10px;
	background-image: url("images/background.jpg");
	background-repeat: repeat-x;

	
	
}
.content{
	margin-top:15px;
	background-color:transparent;
	margin-left:10px;
	margin-right:10px;
	
	
	
}
.top{
	width:inherit;
	height:50px;
	background:#069;

	}
	
.table{

}
</style>
</head>
<body style="background-color:gray;">

<div class="main">
	<div class="top">
	<h1 style="text-align: center;">EXAM REGISTRATION SYSTEM</h1>
	</div>
	<div class="content">
	

<form name="form1" method="post" action="index.php" class="table" >

<table border="0" cellspacing="5" cellpadding="2" >
  <tr>
    <td class="sutun1"><b> First Name:</b></td>
    <td class="sutun2">
      <input name="name" type="text" size="35" maxlength="30" style="height: 30px ; width: 300px" />*</td>
  </tr>
   <tr>
    <td class="sutun1"><b>Last Name:</b></td>
    <td class="sutun2">
      <input name="lastname" type="text" size="35" maxlength="30" style="height: 30px ; width: 300px" />*</td>
  </tr>
  <tr>
    <td class="sutun1"><b>SSN:</b></td>
    <td class="sutun2"><input type="text" name="ssn" size="35" maxlength="30"  style="height: 30px ; width: 300px"/>*</td>
  </tr>
  <tr>
    <td class="sutun1"><b>E-mail:</b></td>
    <td class="sutun2"><input name="email" type="text" size="35" maxlength="30" style="height: 30px ; width: 300px" />*</td>
  </tr>
  <tr>
    <td class="sutun1"><b>Adress:</b></td>
    <td class="sutun2"><input name="adress" type="text" size="35" maxlength="30"  style="height: 30px ; width: 300px"/>*</td>
  </tr>
 <tr>
    <td class="sutun1"><b>Telephone No:</b></td>
    <td class="sutun2"><input name="telno" type="text" size="35" maxlength="30" style="height: 30px ; width: 300px" />*</td>
  </tr>
 
  
  <tr>
    <td class="sutun1">&nbsp;</td>
    <td class="sutun2"><input type="submit" name="submit" value="SAVE" style="height: 40px ; width: 300px ;"></td>
  </tr>
</table>

</form>
	
    <?php
function temizle($veri){
    $veri=trim($veri);
    $veri=stripslashes($veri);
    $veri=mysql_real_escape_string($veri);
    return $veri;
}
 
function bosmu($dizi){
    foreach($dizi as $deger){
        if($deger==false) 
            return false;
    }
    return true; 
}
 
function kayitlimi($ssn){
    $sonuc=mysql_query("select * from student where SSN='$ssn'");
    $kayit=mysql_fetch_array($sonuc);
    if($kayit)
        return true;
    else 
        return false;
}
 
if(isset($_POST["submit"])){
    require_once("DBConnectionManager.php"); 
    mysql_query("set names utf8");
 

    $name=temizle($_POST["name"]);
	$lastname=temizle($_POST["lastname"]);
    $email=temizle($_POST["email"]);
    $ssn=temizle($_POST["ssn"]);
    $adress=temizle($_POST["adress"]);
    $telno=temizle($_POST["telno"]);
   
   
//--------------------------------------------------------------------------    
    $durum=true; 
    $mesaj="";
     
    
	if(bosmu(array($name,$lastname,$email,$ssn,$adress))==false)
	{
		$durum=false;
		$mesaj="Fill the whole area";
		
	}

    if($durum==true and kayitlimi($ssn)){ 
        $durum=false;
        $mesaj="You are already registered";
    }
  
    if($durum==true){ 
    
        $sql="INSERT INTO student(SSN,first_name,last_name,email,phone_number,Address)";
        $sql.="values ('$ssn','$name', '$lastname',  '$email', '$telno', '$adress')";
        if (mysql_query($sql)){
         $mesaj="Your registration has been succesfully complited.<br>";
		
      }
      else{ // kayýt iþlemi yapýlamazsa
         $durum=false;
         $mesaj="<b>Hata:</b> ".mysql_error();
      } 
	  
	  		echo "<h1 style=\"color:red\" align=\"center\">".$mesaj."</h1>";
    }else{
		echo "<h1 style=\"color:red\" align=\"center\">".$mesaj."</h1>";
		}
     


}//if(iss)
?>

	</div>
</div>
</body>
</html>