/*
10.	Creare un oggetto Lezione con le proprietà giorno, ora,
materia, docente, aula. Presentare in una tabella
l'orario della settimana e quando si fa passa il mouse
in una cella compare il nome del docente e l'aula.
*/

var lezione;

var ore = {
  "8": 1,
  "9": 2,
  "10": 3,
  "11": 4,
  "12": 5,
}

var giorni = {
  "lunedì": 1,
  "martedì": 2,
  "mercoledì": 3,
  "giovedì": 4,
  "venerdì": 5,
  "sabato": 6,
}

function creazione() {
  if (window.FileList && window.File && window.FileReader) {
    document.getElementById('file-selector').addEventListener('change', caricaTesto);
  }
}

function caricaTesto(event) {
  status.textContent = '';
  const file = event.target.files[0]; //prende il primo file letto

  if (!file.type) {
    status.textContent = 'Error: The File.type property does not appear to be supported on this browser.';
    return;
  }

  //Crea il FileReader
  const reader = new FileReader();

  //si assegna il gestore dell'evento load: se la lettura va a buon fine esegue la funzione anonima che visualizza il contenuto
  reader.addEventListener('load', event => {
    lezione = JSON.parse(event.target.result);
    console.log(lezione);
    //riempi tabella
    lezione.forEach((item) => {
      console.log(ore[item.ora] + "_" + giorni[item.giorno])
      document.getElementById(ore[item.ora] + "_" + giorni[item.giorno]).innerHTML = item.materia
      console.log(item)
    });
  });

  //legge il file come un file di testo
  reader.readAsText(file);
}

function mostra(event) {
  let id = event.currentTarget.id.split("_")
  console.log(id)
  let ora
  for (let property in ore) {
    console.log(`${property}: ${ore[property]}`);
    if (ore[property] == id[1]) {
      ora = property
      break
    }
  }
  let giorno
  for (let property in giorni) {
    console.log(`${property}: ${giorni[property]}`);
    if (giorni[property] == id[1]) {
      giorno = property
      break
    }
  }

  console.log(giorno + " alle ore " + ora);
  lezione.forEach((item) => {
    if (item.ora == ora && item.giorno == giorno) {
      document.getElementById(event.currentTarget.id).innerHTML = item.docente + " _ " + item.aula
    }
  });
  ora = giorno = id = " "
}