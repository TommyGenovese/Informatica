function Termometro(){
	this.temperatura = 0;
	this.storico = [];
	this.setMisura = function(temp){
		if(temp != undefined && temp!=='' && !isNaN(temp)){ //se no 0 è ==''
			this.temperatura = Number(temp);	//altrimenti è una stringa
			this.storico[this.storico.length] = Number(temp);
		}else{
			alert("Non hai inserito un valore corretto")
		}
	}
	this.getStorico = function(){
		let s = ''
		for (el of this.storico)
			s += el + ' ';
		return s;
	}
	this.getFahrenheit = () => (this.temperatura * 9/5) + 32
	this.getCelsius = () => this.temperatura
	
	this.getTipo = function(){
		let s;
		if (this.storico.length > 0){
			if (this.temperatura>45) s = "molto caldo";
			else if(this.temperatura>35) s = "caldo";
			else if(this.temperatura>18) s = "ottimale";
			else if(this.temperatura>0) s = "freddo";
			else s = "molto freddo"
		} else
			s = "Non sono presenti misurazioni"
		return s;
	}
	
	this.getReport = function(){
		let max = this.storico[0]
		let min = this.storico[0]
		let somma = this.storico[0]
		for (k=1; k< this.storico.length; k ++){
			if (this.storico[k] > max) 
				max = this.storico[k]
			else if (this.storico[k] < min) 
				min = this.storico[k]
			somma += this.storico[k]
		}
		if (this.storico.length > 0){
			console.log(somma + ' ' + this.storico.length)
			let media = somma / this.storico.length
			return "Minima = " + min + " Massima = "+ max + " Media = " + media
		} else 
			return "Non sono presenti misurazioni"				
	}		
}

function  misura(temp){
	t1.setMisura(temp)
	celsius();
}

function storico(){
	output.innerHTML = "Queste le temperature immesse finora: " 
			+ t1.getStorico();
}

function fahrenheit(){
	if (t1.storico.length > 0){
		output.innerHTML = "L'ultima temperatura immessa in gradi Fahrenheit è = " 
			+ t1.getFahrenheit();
	} else
		output.innerHTML = "Non sono presenti misurazioni"	
}

function celsius(){
	if (t1.storico.length > 0){
		output.innerHTML = "L'ultima temperatura immessa in gradi Celsius è = " 
				+ t1.getCelsius();
	} else
		output.innerHTML = "Non sono presenti misurazioni"	
}

function tipo(){
	if (t1.storico.length > 0){
		output.innerHTML = "L'ultima temperatura immessa ci dice: "		+ t1.getTipo();	
	} else
		output.innerHTML = "Non sono presenti misurazioni"		
}

function report(){
	if (t1.storico.length > 0){
		output.innerHTML = t1.getReport();
	} else
		output.innerHTML = "Non sono presenti misurazioni"	
}

