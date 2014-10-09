import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class appMain implements de.hamster.model.HamsterProgram {public void main() {
	
	// in benötige **minimal** einen Hamster der "rechtsFrei():boolean" kann
	//
	// diese Minimalforderung ist durch jeden Hamster erfüllt, der von der
	// **abstrakten** Klasse MeinHamster abgeleitet ist, denn alle davon
	// abgeleiteten konkreten Klassen **müssen** das "rechtsFrei():boolean" implementieren

	MeinHamster x;
	
	// x = new MeinHamster(); // geht NICHT weil meinHamster eine **ABSTRAKTE** Klasse ist
	
	x = new CptFutureHamster(); // das geht, weil DeinHamster als konkrete rechtsFrei() implementiert
	x.init(0,0,Hamster.OST,50);
	
	pruefeUndLege(x);
	while(x.vornFrei()) {
		x.vor();
		pruefeUndLege(x);
	}
    
}

void pruefeUndLege(MeinHamster x){
	
	if(x.rechtsFrei()) {
		x.gib();
	}
}
}