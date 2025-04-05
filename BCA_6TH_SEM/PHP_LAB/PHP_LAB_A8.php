<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Word Frequency Counter</title>
</head>
<body>
    <h2>Word Frequency Counter</h2>
    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>"> 
        Enter a string: <input type="text" name="input_string" required>
        <br><br>
        <input type="submit" name="submit" value="Count Words">
    </form>
    <?php
    if($_SERVER["REQUEST_METHOD"]=="POST" && isset($_POST['submit']))
    {
        $input_string = strtolower($_POST["input_string"]);
        $word_array = str_word_count($input_string, 1);
        $word_count = array_count_values($word_array);
        arsort($word_count);
        echo "<h3>Word Frequency:</h3>";
        foreach($word_count as $word => $count)
        {
            echo "$word: $count<br>";
        }

        echo "<h3>Most used Word:</h3>";
        $most_used_word = key($word_count);
        echo "$most_used_word: " . $word_count[$most_used_word] . "<br>";

        $least_used_word = key(array_slice($word_count, -1, 1, true));
        echo "Least used word: " . $least_used_word . ": " . $word_count[$least_used_word] . "<br>";
    }
    ?>

    <br>
    <form method="post" action ="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
        <input type="hidden" name="input_string" value="<?php echo isset($_POST['input_string']) ? htmlspecialchars($_POST['input_string']) : ''; ?>">
        <input type="hidden" name="sorted" value="asc">
        <input type="submit" name="sort" value="Sort Ascending">
    </form>

    <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
        <input type="hidden" name="input_string" value="<?php echo isset($_POST['input_string']) ? htmlspecialchars($_POST['input_string']) : ''; ?>">
        <input type="hidden" name="sorted" value="desc">
        <input type="submit" name="sort" value="Sort Descending">
    </form>

    <?php
    if (isset($_POST["sort"])) {
        $input_string = strtolower($_POST['input_string']);
        $word_array = str_word_count($input_string, 1);
        $word_count = array_count_values($word_array);

        $sorted = $_POST['sorted'];
        if ($sorted == "asc") {
            ksort($word_count);
        } elseif ($sorted == "desc") {
            krsort($word_count);
        }

        echo "<h3>Sorted Word Frequency:</h3>";
        foreach($word_count as $word => $count) {
            echo "$word: $count<br>";
        }
    }
    ?>
</body>
</html>
