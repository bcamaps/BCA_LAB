<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Age Calculator</title>
</head>
<body>

<?php
$bdate = "";
$result = "";

if (isset($_POST["btn"])) {
    $bdate = $_POST["birthdate"]; // Get the birthdate from the form
    $today = new DateTime();
    $bd = new DateTime($bdate); // Convert input to DateTime object

    if ($today < $bd) {
        $result = "<h3 style='color: red;'>Yet to be born!</h3>";
    } else {
        $age = $today->diff($bd);
        $result = "<h3>Your age is {$age->y} years, {$age->m} months, and {$age->d} days.</h3>";
    }
}
?>

<h2>Age Calculator</h2>
<form method="post">
    Enter your birth date: 
    <input type="date" name="birthdate" value="<?= htmlspecialchars($bdate) ?>" required>
    <input type="submit" name="btn" value="Calculate Age">
</form>

<?= $result ?>

</body>
</html>
