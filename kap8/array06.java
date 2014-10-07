
/**
*	die Funktion erzeugt ein Hmaster-Array
*	
*	die Hamster werden in der linken oberen Ecke erzeugt.
*
*	@parm	anzahl Anzahl der zu erzeugenden Hamster
*	@return	Hamster-Array mit initialisierten Hamstern
*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class array06 implements de.hamster.model.HamsterProgram {Hamster [] erzeugeKaefig( int anzahl) {
	
	// überprüfe die Anzahl
	if(anzahl < 0 ) {
		return null;
	}
	// ein temporäres Warp-Hamster-Feld
	Hamster [] tmp = new Hamster[anzahl];
	
	// der letzte Hamster hat den Index (anzahl -1)
	//anzahl --;
	while(anzahl-- > 0 ){
		// erzeugt einen neuen Hamster und speichert diesen im Feld
		tmp[anzahl] = new Hamster(0,0,Hamster.OST,0,Hamster.GRUEN );
		
	}
	
	return tmp;
}

public void main() {
    Hamster [] kaefig = erzeugeKaefig(10);
}
}