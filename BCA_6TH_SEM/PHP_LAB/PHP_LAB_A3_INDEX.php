<?php
    session_start(); // Start the session to store user data across pages
    $report = ""; // Initialize a variable to hold login error messages

    // Check if the login form is submitted
    if(isset($_POST["btn"])){ 
        $uname = $_POST["uname"]; // Get the entered username
        $pwd = $_POST["pword"];   // Get the entered password
        
        // Simple hardcoded login check (not recommended for real apps)
        if($uname == "user2" && $pwd == "password") {
            // Store username and password in session variables
            $_SESSION["un"] = $uname;
            $_SESSION["pw"] = $pwd;

            // Redirect to the welcome page
            header("Location: PHP_LAB_A3_WELCOME.php"); 
            die(); // Stop further script execution after redirect
        } else {
            // If login fails, show an error message
            $report = "Username or Password is Wrong. Please Try Again!";
        }
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h2>Login</h2>

        <!-- Login form -->
        <form method="post">
            <p>Username : <input type="text" name="uname" required></p>
            <p>Password : <input type="password" name="pword" required></p>
            <p><input type="submit" name="btn" value="Login"></p> 
        </form>

        <!-- Display error message if login fails -->
        <h3 style="color: red;"><?= $report ?></h3>
    </body>
</html>
