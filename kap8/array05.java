import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class array05 implements de.hamster.model.HamsterProgram {public void main() {
	
	int AnzahlSpalten	= Territorium.getAnzahlSpalten();
	int AnzahlReihen	= Territorium.getAnzahlReihen();
	int maxAnzahlElemente = AnzahlSpalten*AnzahlReihen;
	

	//zweidimensionales Arry deklarieren
	Hamster [] kaefig;
	
	// .. und definieren
	kaefig = new Hamster[maxAnzahlElemente];
	
	// und nun produzieren wir Hamster wie blöde....
	
	for (int i = 0; i < maxAnzahlElemente; i++) {
			kaefig [i] = new Hamster(i/AnzahlSpalten,i%AnzahlSpalten, Hamster.OST, 0, Hamster.GRUEN);
		}
	}
}