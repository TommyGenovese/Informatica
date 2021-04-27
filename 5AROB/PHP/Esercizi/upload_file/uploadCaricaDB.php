<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>PHP</title>
</head>

<body>
	<h1>Esito upload</h1>
    <?php
		//print_r($_FILES); //$_FILE contiene i file ricevuti e tutte le loro informazioni
		if ($_FILES["txtFile"]["error"] == UPLOAD_ERR_OK) {
			$fileRicevuto=$_FILES["txtFile"];
            //$fileRicevuto["name"] restituisce il path completo del file ricevuto
            //basename restituisce il vero nome contenuto dopo l'ultimo slash
            //$target_file rappresenta il percorso dove salvare il file sul server
            $target_file = "Uploads/" . basename($fileRicevuto["name"]);
            $size=$fileRicevuto["size"];
            $mimeType=$fileRicevuto["type"];
            echo("Nome file: $target_file<br>");
            echo("Dimensione: $size<br>");
            echo("MIME type: $mimeType<br><br>");
            if(file_exists($target_file))
                echo("Attenzione il file esiste già.<br>");
            else
            {
                echo("I dati contenuti nel file sono stati caricati correttamente nel DB.<br><br>");
				$connection = new mysqli( "localhost","root","","Disneyland");
				$command = $connection->prepare("INSERT INTO Personaggi VALUES (?,?)");
				$personaggi = file( $_FILES["txtFile"]["tmp_name"], FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
				//var_dump($personaggi);
				foreach ($personaggi as $linea) {
					$dati = explode(",", $linea);
					$personaggio = trim($dati[0]);
					$citta = trim($dati[1]);
					$command->bind_param("ss", $personaggio, $citta);
					if ($command->execute())
						echo " Il personaggio $personaggio &egrave; stato aggiunto al database.<br>";
					else
						echo " Errore: il personaggio $personaggio NON &egrave; stato aggiunto al database.<br>";
				}
				$command->close();
				$connection->close();
				//move_uploaded_file esegue la copia fisica del file sul server
				//il primo parametro rappresenta il puntatore al file ricevuto
				//il secondo parametro rappresenta il percorso dove salvare il file
				move_uploaded_file($fileRicevuto["tmp_name"], $target_file);
				echo "<br>Il file uploadato ora si trova nella sottodirectory Upload.<br><hr>";
				//oppure eliminare il file una volta caricati i dati
				//unlink($fileRicevuto["tmp_name"]);
			}
        }
    ?>
    <a href="index.html">INDEX</a>
</body>

</html>