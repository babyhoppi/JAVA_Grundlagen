import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class uebung01 implements de.hamster.model.HamsterProgram {public void main() {

	int anzahlReihen 	= Territorium.getAnzahlReihen();
	int anzahlSpalten 	= Territorium.getAnzahlSpalten();
	int maxSpalte		= anzahlSpalten-1;
	
    BauerAufgabe2 sorti 	= new BauerAufgabe2(anzahlReihen,0,Hamster.OST,anzahlSpalten);
    
    //alle Hamster im Kaefig sollen von links nach rechts gehen
    for(int i=0; i < anzahlReihen; i++){
    		if(!green[i].kornDa()){
    			green[i].gib();
    		}
    	while (green[i].vornFrei()) {
    		green[i].vor();
    		green[i].gib();
    	}
    }
     for(int i=0; i < anzahlReihen; i++){
     	if(red[i].kornDa()){
    			red[i].nimm();
    		}	
    	while (red[i].vornFrei()) {
    		red[i].vor();
    		red[i].nimm();
    	}
    }
    
    
}
}