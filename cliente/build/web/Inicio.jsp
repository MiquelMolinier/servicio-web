<%-- 
    Document   : Inicio
    Created on : 06-jul-2020, 23:32:21
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formato de fecha = d/m/yyyy</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Fecha</th>
                    <th>Tipo de cambio</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>6/7/2020</td>
                    <td>4.5</td>
                </tr>
                <tr>
                    <td>6/8/2020</td>
                    <td>4.6</td>
                </tr>
                <tr>
                    <td>6/9/2020</td>
                    <td>4.7</td>
                </tr>
                <tr>
                    <td>Otra fecha</td>
                    <td>4.8</td>
                </tr>
            </tbody>
        </table>

        <form action="tipoCambio" method="POST">
            <table>
                <thead>
                    <tr>
                        <th>Fecha</th>
                        <th>Valor</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Año</td>
                        <td><input type="text" name="anio" value="" /></td>
                    </tr>
                    <tr>
                        <td>Mes</td>
                        <td><input type="text" name="mes" value="" /></td>
                    </tr>
                    <tr>
                        <td>Dia</td>
                        <td><input type="text" name="dia" value="" /></td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Ingresar" />
        </form>

    </body>
</html>
