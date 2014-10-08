import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class Wettlauf {
    
    static Hamster rennRunde(Hamster [] sprinter) {
    	
    	for(int i=0;i<sprinter.length; i++) {
    		if(sprinter[i].vornFrei()){
    			sprinter[i].vor();
    		}
    		if(!sprinter[i].vornFrei()){
    			return sprinter[i];
    		}
    	}
    	return null;
    }
    
    static Hamster durchfuehren(Hamster[] sprinter){
    	Hamster sieger = null;
    	
    	do {
    		sieger = Wettlauf.rennRunde(sprinter);
    	}
    	while (sieger == null); 
    		return sieger;
    }
}
