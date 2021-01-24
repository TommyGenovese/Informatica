<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exercise 1</title>
    <?php
        $numero = 13;
        function visualize($s){
            echo("Arrivededrci " .$s);
            //global accede a una variabile esterna alla funzione
            global $numero;
            echo($numero);
        }
    ?>
</head>
<body>
    <h1>Exercise 1</h1>
    <?php
        $nome = "Simone";
        $num = 17;
        echo($numero);
        echo("<h6>Benvenuto </h6>" .$nome. "<br><br><br><br>");
        visualize($nome);
    ?>
    <p>End of the page</p>
</body>
</html>