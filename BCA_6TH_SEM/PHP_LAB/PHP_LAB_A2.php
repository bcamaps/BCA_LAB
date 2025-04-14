<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Armstrong Number Checker</title>
    </head>
    <body>
    <?php
    // Get the submitted number if the form is posted, else set it to a space
    $n = isset($_POST["number"]) ? $_POST["number"] : " ";
    ?>
    
    <!-- Form to enter a number -->
    <form method="post">
        <h2>Armstrong Number Checker</h2>
        Enter a number:
        <input type="number" name="number" required> <!-- Number input field -->
        <input type="submit" name="btn" value="Check"> <!-- Submit button -->
    </form>

    <?php
    // Function to check if a number is an Armstrong number
    function isArmstrong($num) {
        $n = $num;
        $digits = strlen($num); // Count number of digits
        $sum = 0;

        // Loop through each digit
        while ($n > 0) {
            $r = $n % 10; // Get last digit
            $n = (int)($n / 10); // Remove last digit
            $sum += pow($r, $digits); // Add digit^number_of_digits to sum
        }

        // Return true if sum equals the original number
        return $sum == $num;
    }

    // Check if the form was submitted
    if (isset($_POST["btn"])) {
        $num = $_POST["number"];

        // Validate the input is a positive number
        if (is_numeric($num) && $num > 0) {

            // Check if it's an Armstrong number
            if (isArmstrong($num)) {
                echo "<p>$num is an Armstrong number</p>";

                // Also display all Armstrong numbers from 1 to the entered number
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
            // Input is not valid
            echo "<p>Please enter a valid positive integer</p>";
        }
    }
    ?>
    </body>
</html>
