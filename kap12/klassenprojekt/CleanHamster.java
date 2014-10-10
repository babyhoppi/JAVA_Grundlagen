import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class CleanHamster extends ZahlHamster {

	CleanHamster(int i)
    {
    	super(0,i,Hamster.SUED,0);
    	zeichne();
    }   
    public void zeichne() {
   		int i = 0;
    	while(i<Territorium.getAnzahlReihen()){
    		while(kornDa()){
    			this.nimm();
    		}
    		this.vor();
    		i++;
    	}
    }    
}
