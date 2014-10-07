import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class arrays01 implements de.hamster.model.HamsterProgram {public void main() {
	
	//ein int-Array deklarieren
	int [] x;
	
	// .. und definieren
	x = new int [100];    
	
	// ein Hamster-Array deklarieren
	Hamster [] kaefig;
	
	// .. und definieren
	kaefig = new Hamster[10];
	
	Hamster [] reihen = new Hamster [Territorium.getAnzahlReihen()];
}
}