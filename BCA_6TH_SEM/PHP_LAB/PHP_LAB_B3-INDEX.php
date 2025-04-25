<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>Distance Calculator</title>
</head>
<body>
    <h2>Distance Calculator</h2>
    <form action="PHP_LAB_B3-CALCULATE.PHP" method="post">
        <label for="feet1">Distance 1 (Feet):</label>
        <input type="number" id="feet1" name="feet1" required>
        <label for="inches1">Inches:</label>
        <input type="number" id="inches1" name="inches1" required><br><br>

        <label for="feet2">Distance 2 (Feet):</label>
        <input type="number" id="feet2" name="feet2" required>
        <label for="inches2">Inches:</label>
        <input type="number" id="inches2" name="inches2" required><br><br>

        <input type="submit" value="Calculate">
    </form>
</body>
</html>

<?php

class DistanceCalculator {
    private $feet1;
    private $inches1;
    private $feet2;
    private $inches2;

    public function __construct($feet1, $inches1, $feet2, $inches2) {
        $this->feet1 = $feet1;
        $this->inches1 = $inches1;
        $this->feet2 = $feet2;
        $this->inches2 = $inches2;
    }

    public function add() {
        $totalInches = ($this->feet1 * 12 + $this->inches1) + ($this->feet2 * 12 + $this->inches2);
        $feet = floor($totalInches / 12);
        $inches = $totalInches % 12;
        return ['feet' => $feet, 'inches' => $inches];
    }

    public function difference() {
        $totalInches1 = ($this->feet1 * 12 + $this->inches1);
        $totalInches2 = ($this->feet2 * 12 + $this->inches2);
        $difference = abs($totalInches1 - $totalInches2);
        $feet = floor($difference / 12);
        $inches = $difference % 12;
        return ['feet' => $feet, 'inches' => $inches];
    }
}
?>
