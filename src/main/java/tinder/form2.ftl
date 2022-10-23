<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<p>Hello World </p>
<p>My name is ${name}</p>

<form method="post"  id="form">

    <button
<#--            href="http://localhost:8081/users" onclick="document.getElementById('form').submit()"-->
        type="submit" id="yes" action ="http://localhost:8081/users" onclick="document.getElementById('form').onclick">
        yes</button>
</form>

<form method="get" action="http://localhost:8081/users" id="form">
    <button type="submit" id="no">No</button>
</form>

</body>
</html>