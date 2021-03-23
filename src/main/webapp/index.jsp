<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Calculator</title>

    <script type="text/javascript">
        function calc(errors){
            with(errors){
                if(isNaN(firstNum.value) || isNaN(secondNum.value)){
                    alert("Вы ввели некоректные данные!");
                    return false;
                }
                if(operator.value === "-1"){
                    alert("Пожалуйста, выберите операцию");
                    return false;
                }
            }
        }
    </script>
</head>

<body>
<form action="CalculateServlet" method="post" onsubmit="return calc(this);">
    <table align="center", border="5">
        <tr>
            <th>Calculator</th>
        </tr>
        <tr>
            <td>
                <input type="text" name="firstNum">
                <select name="operator">
                    <option value="-1">Operator</option>
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
                <input type="text" name="secondNum">
                <input type="submit" value="Calculate">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

