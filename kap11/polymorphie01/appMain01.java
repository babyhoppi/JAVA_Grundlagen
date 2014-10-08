import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class appMain01 implements de.hamster.model.HamsterProgram {public void main() {
    Hamster x = new MeinHamster(0,0,Hamster.OST,0,Hamster.GRUEN);
    
    
    // alles Okay
    x.vor();
    x.gib();
    x.nimm();
    x.linksUm();
    
    
    // NICHT alles Okay er findet die Methode nicht
    // x.rechtsUm(); //FEHLER weil: Einschränkung der Signatur
    
    ((MeinHamster)x).rechtsUm(); // so klappt es 
    
    MeinHamster meiner = new MeinHamster(0,0,0,0);
    DeinHamster deiner = new DeinHamster(1,0,0,0);
    
    //wir dürfen jedes beliebige Hamster-ähnliche Objekt der Prozedur übergeben
    laufeZurWand(meiner);
    laufeZurWand(deiner);
}

void laufeZurWand(Hamster x){
	//	wir können uns darauf verlassen, dass x das vornFrei() und das vor() kann
	//	weil wir den Parameter x als Hamster deklariert haben
	while(x.vornFrei()){
		x.vor();
	}
}}