<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>Distance Calculator Result</title>
</head>
<body>
    <h2>Distance Calculator Result</h2>
    <?php
    require_once 'PHP_LAB_B3-DISTANCECALCULATOR.php';
     
    $feet1 = $_POST['feet1'];
    $inches1 = $_POST['inches1'];
    $feet2 = $_POST['feet2'];
    $inches2 = $_POST['inches2'];

    $calculator = new DistanceCalculator($feet1, $inches1, $feet2, $inches2);
    $sum = $calculator->add();
    $difference = $calculator->difference();
    
    echo "Sum of distances: " . $sum['feet'] . " feet " . $sum['inches'] . " inches<br>";
    echo "Difference of distances: " . $difference['feet'] . " feet " . $difference['inches'] . " inches<br>";
    ?>
    
    </body>
</html>
