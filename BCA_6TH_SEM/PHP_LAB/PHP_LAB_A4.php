<!doctype html>
<html>
    <head>
        <title>PHP Calculator</title>
    </head>
    <body>
        <?php
        // Initialize variables
        $n1 = $n2 = $op = $result = "";
        $as = $ss = $ms = $ds = ""; // These will mark the selected option in the dropdown

        // Check if the form has been submitted
        if (isset($_POST["btn"])) {
            $n1 = $_POST["num1"]; // First number input
            $n2 = $_POST["num2"]; // Second number input
            $op = $_POST["operation"]; // Selected operation from dropdown

            // Validate that both inputs are numeric
            if (is_numeric($n1) && is_numeric($n2)) {
                // Perform the chosen operation
                switch ($op) {
                    case "Add":
                        $result = $n1 + $n2;
                        $as = "selected"; // Mark this option as selected
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
                            // Error message for division by zero
                            $result = "<h3 style='color: red;'>Error: Division by zero!</h3>";
                        }
                        $ds = "selected";
                        break;
                }
            } else {
                // Error message for invalid (non-numeric) input
                $result = "<h3 style='color: red;'>Error: Please enter numeric values!</h3>";
            }
        }
        ?>
       
        <h2>PHP Calculator</h2>

        <!-- Calculator Form -->
        <form method="post">
            <!-- First number input -->
            <input type="text" name="num1" value="<?=$n1?>" required placeholder="Enter first number">

            <!-- Operation dropdown (retains selected value) -->
            <select name="operation">
                <option value="Add" <?= $as ?>>+</option>
                <option value="Sub" <?= $ss ?>>-</option>
                <option value="Mul" <?= $ms ?>>*</option>
                <option value="Div" <?= $ds ?>>/</option>
            </select>

            <!-- Second number input -->
            <input type="text" name="num2" value="<?=$n2?>" required placeholder="Enter second number">

            <!-- Submit button -->
            <input type="submit" name="btn" value="Calculate">
        </form>

        <!-- Display the result -->
        <h3>Result: <?= $result; ?></h3>
    </body>
</html>
