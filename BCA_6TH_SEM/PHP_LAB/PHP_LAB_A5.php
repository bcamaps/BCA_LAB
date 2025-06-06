<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Age Calculator</title>
</head>
<body>
    <h2>Age Calculator</h2>
    <form method="post">
        <label for="birthdate">Enter your birth date: </label><br> 
        <input type="date" id="birthdate" name="birthdate"><br> 
        <input type="submit" value="Calculate">
    </form>

<?php
function calculateAge($birthdate) {
    $today = new DateTime();
    $diff = $today->diff(new DateTime($birthdate));
    $years = $diff->y;
    $months = $diff->m;
    $days = $diff->d;
    return array($years, $months, $days);
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $birthdate = $_POST["birthdate"];
    if (!empty($birthdate)) {
        list($years, $months, $days) = calculateAge($birthdate);
        echo "<h3>Your age is: $years years, $months months, and $days days</h3>";
    } else {
        echo "<h3>Please enter your birth date.</h3>";
    }
}
?>
</body>
</html>
