<!DOCTYPE html>
<html lang="en">
<body>

<table border="1">
    <body>
    <#list data as item>
        <p> ${item.name} </p>
        <img src=${item.photoUrl}>
    </#list>
</body>
</table>
</body>
</html>