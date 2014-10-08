import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class mainApp1 implements de.hamster.model.HamsterProgram {public void main() {
    
    int anzahlReihen = Territorium.getAnzahlReihen();
    
    
    Hamster[] sprinter = new Hamster[anzahlReihen];
    
    for(int i = 0; i < anzahlReihen; i++){
    	sprinter[i] = new Hamster(i,0,Hamster.OST,0);
    	i++;
    	if(i< anzahlReihen){
    		sprinter[i] = new SchnellHamster(i,0,Hamster.OST,0);
    		i++;
    	}
    	if(i< anzahlReihen){
    		sprinter[i] = new SuperSchnellHamster(i,0,Hamster.OST,0);
    	}
    }
    
    Hamster sieger = Wettlauf.durchfuehren(sprinter);
    sieger.schreib("ICH HABE GEWONNEN");
    
}
}