//Questa è la classe del giocatore (non AI).
class Player {
	constructor() {
		Player.numBoatsAlive = Game.numBoats;
		Player.grid = [];
		Player.initializeGrid(Game.gridSize);
		Player.boats = [];
		Player.initializeBoats();
	}
	
	//inizializza la griglia del giocatore
	static initializeGrid(gridSize) {
		for (var i = 0; i < gridSize; i++) {
			Player.grid[i] = [];
			for (var j = 0; j < gridSize; j++) {
				Player.grid[i][j] = 0;
			}
		}
	}
	
	//Inizializza le barche del giocatore
	static initializeBoats() {
		for (var i = 0; i < Game.numBoatTypes; i++) {
			Player.boats[i] = [];
			for (var j = 0; j < Game.numBoatsPerType[i+1]; j++) {
				Player.boats[i][j] = [];
				for (var k = 0; k < i+1; k++) {
					Player.boats[i][j][k] = [];
					for (var d = 0; d < 2; d++) {
						Player.boats[i][j][k][d] = 0;
					}
				}
			}
		}
	}
	
	//piazza in modo randomico le barche
	static placeBoats() {
		Game.setGridRandomly('player');
		
	}
	
	//cella colpita
	static shootCell(w, h) {
		Game.shootCell('player', w, h);
	}
}