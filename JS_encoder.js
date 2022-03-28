/*Funzione che prende una hex string e la
  converte in ASCII */
function hex_to_ascii(str1)
 {
	var hex  = str1.toString();
	var str = '';
	for (var n = 0; n < hex.length; n += 2) { //Loop per ogni carattere nella stringa
		str += String.fromCharCode(parseInt(hex.substr(n, 2), 16)); //Ottiene il codice ASCII dalla conversione da esadecimale e
                                                                    //lo concatena ad str
	}
	return str;
 }

var encodedString = hex_to_ascii('4a1b48d7322394a78326cd283f0834093e65421a7e98e90e5b452d160b5d07d8');
console.log(btoa(encodedString)) //btoa è una funzione che converte in Base64 una stringa ASCII