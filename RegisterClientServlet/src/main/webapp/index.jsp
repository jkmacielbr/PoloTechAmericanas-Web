<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
</head>
<body>
<div align="center">
    <form action="RegisterClientServlet" method="post">
        <p>
            Enter your name: <input type="text" name="name" required>
        </p>

        <p>
            Enter your CPF: <input type="number" name="cpf" required>
        </p>

        <p>
            Enter your E-mail: <input type="email" name="email" required>
        </p>
        <p><input type="submit" value="Register"></p>


    </form>
</div>

</body>
</html>