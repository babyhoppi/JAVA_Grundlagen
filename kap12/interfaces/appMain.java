import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class appMain implements de.hamster.model.HamsterProgram {public void main() {
    
    // wir benötigen für die Lösung **prüfbare** Hamster
	Pruefbar x = new MeinHamster();
	
	((MeinHamster)x).init(2,0,Hamster.OST, 10);
	
	while( ((MeinHamster)x).vornFrei()) {
		if (((MeinHamster)x).rechtsFrei() && ((MeinHamster)x).linksFrei() ) {
			((MeinHamster)x).gib();
		}
		((MeinHamster)x).vor();
	}

}
}