import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class array04 implements de.hamster.model.HamsterProgram {public void main() {

	//zweidimensionales Arry deklarieren
	Hamster [][] kaefig;
	
	// .. und definieren
	kaefig = new Hamster[Territorium.getAnzahlReihen()][Territorium.getAnzahlSpalten()];
	
	// und nun produzieren wir Hamster wie blöde....
	
	for (int i = 0; i < kaefig.length; i++) {
		for (int j = 0; j < kaefig[i].length; j++) {
			kaefig [i][j] = new Hamster(i,j, Hamster.OST, 0, Hamster.GRUEN);
		}
	}
    
}}