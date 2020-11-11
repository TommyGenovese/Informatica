//Classe che scrive il messaggio di inizio del gioco
class MessageBox {
	constructor(element) {
		Graphics.checkElement(element);
		MessageBox.element = element;
	}
	
	static clear() {
		MessageBox.element.innerHTML = '';
	}
	
	static addMsg(msg, important=false) {
		
		
	}
}