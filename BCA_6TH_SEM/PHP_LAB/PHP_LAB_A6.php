<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Dictionary</title>
    </head>
    <body>
        <h2>Dictionary</h2>
        <form method="post">
            <label for="word">Enter a word:</label><br>
            <input type="text" id="word" name="word"><br><br>
            <input type="submit" value="Search">
        </form>
        <?php
        $dictionary = array( 
            "apple" => "a round fruit with red or green skin and a whitish interior", 
            "computer" => "an electronic device for storing and processing data", 
            "book" => "a written or printed work consisting of pages glued or sewn together", 
            "cat" => "a small domesticated carnivorous mammal with soft fur",
            "house" => "a building for human habitation",
            "tree" => "a woody perennial plant with a single main stem", 
            "flower" => "the reproductive structure found in flowering plants", 
            "sun" => "the star around which the earth orbits",
            "moon" => "the natural satellite of the earth",
            "water" => "a colorless, transparent, odorless liquid essential for life"
        );

        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $word = strtolower($_POST["word"]);
            if (array_key_exists($word, $dictionary)) {
                $meaning = $dictionary[$word];
                echo "<p><strong>$word:</strong> $meaning</p>";
            } else {
                echo "<p><strong>Word not found.</strong></p>";
            }
        }
        ?>
    </body>
</html>
