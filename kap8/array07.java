/**
*	prozedurales rechtsUm()
*
*	@param Hamster[] das Feld enthält die zu drehenden Hamster
*/

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class array07 implements de.hamster.model.HamsterProgram {void rechtsUm(Hamster [] x) {

	for(int i =0; i < x.length; i++){
		x[i].linksUm();
		x[i].linksUm();
		x[i].linksUm();
	}

}

public void main() {
		// ein Käfig voller Helden
	    Hamster [] kaefig = new Hamster[Territorium.getAnzahlReihen()];

		//in jeder Reihe einen Hamster platzieren
		for(int i =0; i <kaefig.length; i++){
			kaefig[i] = new Hamster(i,0,Hamster.OST,0,Hamster.GRUEN);
		}
		rechtsUm(kaefig);	
}
}