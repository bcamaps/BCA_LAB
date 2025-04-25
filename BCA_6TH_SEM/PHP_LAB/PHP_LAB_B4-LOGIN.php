<?php
// Database connection
$servername = "localhost";
$dbUsername = "root";
$dbPassword = "";
$dbname = "user";

$conn = new mysqli($servername, $dbUsername, $dbPassword, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Function to sanitize input data
function sanitize($data) {
    return htmlspecialchars(stripslashes(trim($data)));
}

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Sanitize user input
    $username = sanitize($_POST["username"]);
    $password = sanitize($_POST["password"]);

    // Use prepared statements to prevent SQL injection
    $stmt = $conn->prepare("SELECT * FROM user WHERE username = ? AND password = ?");
    $stmt->bind_param("ss", $username, $password);
    $stmt->execute();
    $result = $stmt->get_result();

    if ($result->num_rows > 0) {
        // Valid credentials, grant access
        echo "Login successful!";
        // You can redirect the user to a different page here
    } else {
        // Invalid credentials
        echo "Invalid username or password.";
    }

    $stmt->close();
}

// Close database connection
$conn->close();
?>
