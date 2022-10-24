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
        type="submit" id="yes" >
        yes</button>
</form>

<form method="get" action="http://localhost:8081/users" id="form" value="Click Here">
    <button type="submit" id="no">No</button>
<#--     <input type="submit" value="Click Here">-->
</form>

</body>
</html>