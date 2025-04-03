<!doctype html>
<html>
    <head>
        <title>PHP Calculator</title>
    </head>
    <body>
        <?php
        $n1 = $n2 = $op = $result = "";
        $as = $ss = $ms = $ds = "";
       
        if (isset($_POST["btn"])) {
            $n1 = $_POST["num1"];
            $n2 = $_POST["num2"];
            $op = $_POST["operation"];
           
            if (is_numeric($n1) && is_numeric($n2)) {
                switch ($op) {
                    case "Add":
                        $result = $n1 + $n2;
                        $as = "selected";
                        break;
                    case "Sub":
                        $result = $n1 - $n2;
                        $ss = "selected";
                        break;
                    case "Mul":
                        $result = $n1 * $n2;
                        $ms = "selected";
                        break;
                    case "Div":
                        if ($n2 != 0) {
                            $result = $n1 / $n2;
                        } else {
                            $result = "<h3 style='color: red;'>Error: Division by zero!</h3>";
                        }
                        $ds = "selected";
                        break;
                }
            } else {
                $result = "<h3 style='color: red;'>Error: Please enter numeric values!</h3>";
            }
        }
        ?>
       
        <h2>PHP Calculator</h2>
        <form method="post">
            <input type="text" name="num1" value="<?=$n1?>" required placeholder="Enter first number">
            <select name="operation">
                <option value="Add" <?= $as ?>>+</option>
                <option value="Sub" <?= $ss ?>>-</option>
                <option value="Mul" <?= $ms ?>>*</option>
                <option value="Div" <?= $ds ?>>/</option>
            </select>
            <input type="text" name="num2" value="<?=$n2?>" required placeholder="Enter second number">
            <input type="submit" name="btn" value="Calculate">
        </form>
        <h3>Result: <?= $result; ?></h3>
    </body>
</html>
