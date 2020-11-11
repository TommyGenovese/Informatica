class Graphics {
	constructor() {}
	
	static loadGrids(element1, element2, gridSize) {
		Graphics.checkElement(element1);
		Graphics.checkElement(element2);
		Graphics.printPlayerGrid(element1, gridSize);
		Graphics.printOpponentGrid(element2, gridSize); 
	}
	
	//definizione dei pulsanti
	static buttonID(grid, w, h) {
		var cellValue = grid === 'player' ? Player.grid[w][h] : Opponent.grid[w][h];
		if (cellValue === 1 && grid === 'player') {
				cellValue = -1;
		}
		switch(cellValue) {
			case 0:
				return 'cell_nothing';
			case -1:
				return 'cell_player_boat';
			case 1:
				return 'cell_boat';
			case 2:
				return 'cell_water';
			case 3:
				return 'cell_touched';
			case 4:
				return 'cell_sunken';
			default:
				throw 'Cell code must be 0, 1, 2, 3 or 4';
		}
	}
	
	//crea i pulsanti e la tabella del gocatore
	static printPlayerGrid(element, gridSize) {
		Graphics.checkElement(element);
		element.innerHTML = '<h3>Your grid</h3><button class="grid_btn" data-type="info" id="invisible" disabled></button> ';
		element.innerHTML += '<br>';
		for (var j = 0; j < gridSize; j++) {
			for (var i = 0; i < gridSize; i++) {
				element.innerHTML += '<button title="' + String.fromCharCode(i+65) + (j+1) + '" class="grid_btn" id="' + Graphics.buttonID('player', i, j) + '" data-type="player" data-h="' + j + '" data-w="' + i + '">' + Player.grid[i][j] + '</button>';
			}
			element.innerHTML += '<br>';
		}
	}
	

	//crea i pulsanti e la tabella del computer
	static printOpponentGrid(element, gridSize) {
		Graphics.checkElement(element);
		element.innerHTML = '<h3>Opponent\'s grid</h3><button class="grid_btn" data-type="info" id="invisible" disabled></button> ';
		element.innerHTML += '<br>';
		for (var j = 0; j < gridSize; j++) {
			for (var i = 0; i < gridSize; i++) {
				element.innerHTML += '<button title="' + String.fromCharCode(i+65) + (j+1) + '" class="grid_btn" id="' + Graphics.buttonID('opponent', i, j) + '" data-type="opponent" data-h="' + j + '" data-w="' + i + '">' + Opponent.grid[i][j] + '</button>';
			}
			element.innerHTML += '<br>';
		}
	}
	
	//ricarica la griglia con le modifiche fatte
	static updateGrid(grid, element) {
		Graphics.checkElement(element);
		if (grid !== 'player' && grid !== 'opponent') {
			throw 'Invalid grid (must be player or opponent)';
		}
		var dataType = grid;
		var GridClass = grid === 'player' ? Player : Opponent;
		var w = 0, h = 0;
		
		for (var i = 0; i < Math.pow(Game.gridSize, 2); i++) {
			element.querySelectorAll('[data-type="' + dataType + '"]')[i].innerHTML = GridClass.grid[w][h];
			element.querySelectorAll('[data-type="' + dataType + '"]')[i].id = Graphics.buttonID(grid, w, h);
			if (w === Game.gridSize-1) {
				h++;
				w = 0;
			} else {
				w++;
			}
		}
	}
	
	//sblocca o blocca le celle quando si finisce o inizia il gioco
	static unBlockCells(block) {
		if (typeof block !== typeof true) {
			throw 'block must be true of false';
		}
		var cells = document.getElementsByClassName('grid_btn');
		Graphics.checkElement(cells);
		var value = block ? 'none' : 'auto';
		for (var i = 0; i < cells.length; i++) {
			cells[i].style.pointerEvents = value;
		}
	}
	
	static checkElement(element) {
		if (element === null) {
			throw 'DOM Element does not exist';
		}
	}
}