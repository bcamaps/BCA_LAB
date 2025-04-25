<?php
class DistanceCalculator{
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
