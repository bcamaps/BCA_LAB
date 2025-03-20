<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Contact Form</title>
    </head>
    <body>
        <?php
        $l1 = $l2 = $l3 = $l4 = " ";
        $name = $email = $message = " ";
        if (isset($_POST["btn"])) {
            $name = htmlspecialchars($_POST["name"]);
            $email = htmlspecialchars($_POST["email"]);
            $message = htmlspecialchars($_POST["message"]);
            $l1 = "<h2>Form Submission Result</h2>";
            $l2 = "<p><b>Name:</b> $name</p>";
            $l3 = "<p><b>Email:</b> $email</p>";
            $l4 = "<p><b>Message:</b> $message</p>";
        }
        ?>
        <table>
            <tr>
                <td>
                    <h2>Contact Form</h2>
                    <form method="post">
                        <p>Name: <br><input type="text" value= "<?= $name ?>" name= "name" placeholder="Type Name" required></p>
                        <p>Email: <br><input type="text" value= "<?= $email ?>" name= "email" placeholder="Type Email" required></p>
                        <p>Message: <br><textarea name="message" placeholder="Type Message" required><?= htmlspecialchars($message) ?></textarea></p>
                        <p><input type="submit" name="btn" value="Submit"></p>
                    </form>
                </td>
                <td width = "20%"></td>
                <td>
                    <?= $l1 ?>
                    <?= $l2 ?>
                    <?= $l3 ?>  
                    <?= $l4 ?>
                </td>
            </tr>
        </table>
    </body>
</html>
