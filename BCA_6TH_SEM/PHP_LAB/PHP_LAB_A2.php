<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Armstrong Number Checker</title>
    </head>
    <body>
    <?php
    $n = isset($_POST["number"]) ? $_POST["number"] : " ";
    ?>
    <form method="post">
        <h2>Armstrong Number Checker</h2>
        Enter a number:
        <input type="number" name="number" required>
        <input type="submit" name="btn" value="Check">
    </form>
    <?php
    function isArmstrong($num) {
        $n = $num;
        $digits = strlen($num);
        $sum = 0;
        while ($n > 0) {
            $r = $n % 10;
            $n = (int)($n / 10);
            $sum += pow($r, $digits);
        }
        return $sum == $num;
    }

    if (isset($_POST["btn"])) {
        $num = $_POST["number"];
        if (is_numeric($num) && $num > 0) {
            if (isArmstrong($num)) {
                echo "<p>$num is an Armstrong number</p>";
                echo "Armstrong numbers from 1 to $num are: ";
                for ($i = 1; $i <= $num; $i++) {
                    if (isArmstrong($i)) {
                        echo "$i &nbsp;";
                    }
                }
            } else {
                echo "<p>$num is not an Armstrong number</p>";
            }
        } else {
            echo "<p>Please enter a valid positive integer</p>";
        }
    }
    ?>
    </body>
</html>