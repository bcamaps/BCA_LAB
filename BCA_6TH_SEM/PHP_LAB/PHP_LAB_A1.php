<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Contact Form</title>
    </head>
    <body>
        <?php
        // Initialize label and input variables with empty strings
        $l1 = $l2 = $l3 = $l4 = " ";
        $name = $email = $message = " ";

        // Check if the form has been submitted
        if (isset($_POST["btn"])) {
            // Sanitize user input to prevent XSS
            $name = htmlspecialchars($_POST["name"]);
            $email = htmlspecialchars($_POST["email"]);
            $message = htmlspecialchars($_POST["message"]);

            // Prepare formatted strings for displaying the result
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
                    <!-- HTML Form (submits to same page) -->
                    <form method="post">
                        <!-- Input for Name (pre-filled with previous input if submitted) -->
                        <p>Name: <br><input type="text" value="<?= $name ?>" name="name" placeholder="Type Name" required></p>

                        <!-- Input for Email (pre-filled with previous input if submitted) -->
                        <p>Email: <br><input type="text" value="<?= $email ?>" name="email" placeholder="Type Email" required></p>

                        <!-- Textarea for Message (pre-filled with previous input if submitted) -->
                        <p>Message: <br><textarea name="message" placeholder="Type Message" required><?= htmlspecialchars($message) ?></textarea></p>

                        <!-- Submit Button -->
                        <p><input type="submit" name="btn" value="Submit"></p>
                    </form>
                </td>

                <!-- Empty cell for spacing -->
                <td width="20%"></td>

                <!-- Display form submission results -->
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
