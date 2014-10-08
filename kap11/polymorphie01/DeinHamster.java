import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class DeinHamster extends MeinHamster {

	    DeinHamster() {
	    	super();
	    }
 	
 	DeinHamster(int r, int s, int b, int a) {
 		super(r,s,b,a);
 	}
 	
 	DeinHamster(int r, int s, int b, int a, int f) {
 		super(r,s,b,a,f);
 	}
 	
 	//special feature
 	boolean rechtsFrei() {
 		this.rechtsUm();
 		boolean ret = this.vornFrei();
 		this.linksUm();
 		return ret;
 	}
}
