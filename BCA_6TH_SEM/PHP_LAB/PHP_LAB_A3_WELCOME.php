<?php
session_start(); // Start the session to access session variables

$result = "";

// Check if the logout link was clicked
if (isset($_GET["logout"])) {
    session_destroy(); // End the session and clear all data
    header("Location: PHP_LAB_A3_INDEX.php"); // Redirect to login page
    die(); // Stop further execution
}

// Check if the user is logged in by checking the session
if (isset($_SESSION["un"])) {
    $uname = $_SESSION["un"]; // Get the username from session
    $pwd = $_SESSION["pw"];   // Get the password from session (not used here, but stored)
} else {
    // If not logged in, redirect to login page
    header("Location: PHP_LAB_A3_INDEX.php");
    die();
}
?>
<!DOCTYPE html> 
<html>
    <head>
        <meta charset="UTF-8"> 
        <title>Welcome Page</title>
    </head>
    <body>
        <!-- Welcome message using the stored username -->
        <h2>Welcome <?= htmlspecialchars($uname) ?></h2> 
        <p>This is a secure area. You're logged in.</p>

        <!-- Logout link sends a GET request with ?logout=1 -->
        <p>
            <a href="PHP_LAB_A3_WELCOME.php?logout=1">Logout</a>
        </p>
    </body>
</html>
