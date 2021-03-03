<!DOCTYPE html>
<html>
<head>
	<title>DEMOAPP</title>
</head>
<body>
	<ul>
		<?php 
			$json = file_get_contents('http://app:8080/api/get');
			$json_string = json_decode($json, JSON_PRETTY_PRINT);

			echo $json;
		?>
	</ul>
</body>
</html>