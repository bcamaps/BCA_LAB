<?php
session_start();

$result = "";
if (isset($_GET["logout"])) {
    session_destroy();
    header("Location: PHP_LAB_A3_INDEX.php");
    die();
}

if (isset($_SESSION["un"])) {
    $uname = $_SESSION["un"];
    $pwd = $_SESSION["pw"];
} else {
    // Redirect to login page if session is not set
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
        <h2>Welcome <?= htmlspecialchars($uname) ?></h2> 
        <p>This is a secure area. You're logged in.</p>
        <p>
            <a href="PHP_LAB_A3_WELCOME.php?logout=1">Logout</a>
        </p>
    </body>
</html>