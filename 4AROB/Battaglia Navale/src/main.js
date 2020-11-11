var battleship = new Game;
Game.initGame();

document.addEventListener('DOMContentLoaded', function() {
	var gridBtns = document.getElementsByClassName('grid_btn');
	var playerGrid = document.getElementById('player_grid');
	var opponentGrid = document.getElementById('opponent_grid');
	var messageBoxElement = document.getElementById('message_box');
	

	var messageBox = new MessageBox(messageBoxElement);
	Graphics.loadGrids(playerGrid, opponentGrid, Game.gridSize);

	
	if (Game.turn === 'opponent') {
		//se inizia il computer oltre al messaggio inivia le azioni
		MessageBox.addMsg('The opponent starts.');
		Opponent.shootCell();
		Game.switchTurn();
		Graphics.updateGrid('player', playerGrid);
	} else {
		MessageBox.addMsg('You start!');
	}
	
	//Durante lo svlgimento della partita salva i seguenti dati
	for (var i = 0; i < gridBtns.length; i++) {
		gridBtns[i].addEventListener('click', function() {
			if (Game.hasStarted) {
				if (this.getAttribute('data-type') === 'opponent') {
					if (Game.turn === 'player') {
						Player.shootCell(this.getAttribute('data-w'), this.getAttribute('data-h'));
						Graphics.updateGrid('opponent', opponentGrid);
						if (Opponent.numBoatsAlive === 0) {
							Game.endGame('player');
						} else {
							Game.switchTurn();
							Opponent.shootCell();
							Graphics.updateGrid('player', playerGrid);
							if (Player.numBoatsAlive === 0) {
								Game.endGame('opponent');
							}
							Game.switchTurn();
						}
					} else {
						throw 'It is not your turn';
					}
				} else {
					throw 'data-type attribute must be equal to opponent';
				}
			} else {
				throw 'Game has already ended';
			}
		});
	}
});