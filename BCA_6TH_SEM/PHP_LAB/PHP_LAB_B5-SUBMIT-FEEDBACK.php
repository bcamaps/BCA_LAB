<?php
//Database connection parameters
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "feedback_db";
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
//Retrieve form data
$name = $_POST['name'];
$email = $_POST['email'];   
$subject = $_POST['subject'];
$message = $_POST['message'];
// Prepare SQL statement to insert data into datbase

$sql = "INSERT INTO feedback (name, email, subject, message) VALUES ('$name', '$email', '$subject', '$message')";
// Execute SQL statement
if ($conn->query($sql) === TRUE) {
    echo "Feedback submitted successfully!";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
// Close the database connection
$conn->close();
?>
