import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class appMain implements de.hamster.model.HamsterProgram {public void main() {
    
    // wir benötigen für die Lösung **prüfbare** Hamster
	InformationHamster x = new MeinHamster();
	
	((MeinHamster)x).init(0,0,Hamster.OST, 10);
	
	((MeinHamster)x).schreib("Kacheln im Territorium" + ((MeinHamster)x).kachelnImTerritorium());
	((MeinHamster)x).schreib("Mauern im Territorium" + ((MeinHamster)x).mauernImTerritorium());
	((MeinHamster)x).schreib("Körner im Territorium" + ((MeinHamster)x).koernerImTerritorium());
}
}