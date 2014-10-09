import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class MeinHamster extends Hamster implements InformationHamster {
    int anzahlReihen = Territorium.getAnzahlReihen();
    int anzahlSpalten = Territorium.getAnzahlSpalten();
    
    public int kachelnImTerritorium () {
    	return anzahlReihen * anzahlSpalten;
    }
    
    public int mauernImTerritorium () {
    	int anzahlMauern =0;
    	
    	for(int i = 0; i < anzahlReihen;i++){
    		for(int j = 0; j < anzahlSpalten;j++) {
    			if( Territorium.mauerDa(i,j)){
    				anzahlMauern++;
    			}
    		}
    	}
    	return anzahlMauern;
    }
    
   	public int koernerImTerritorium () {
    	return Territorium.getAnzahlKoerner();
    }
 
}
