import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class SchnellHamster extends Hamster {
     	SchnellHamster() {
 		super();
 	}
 	
 	SchnellHamster(int r, int s, int b, int a) {
 		super(r,s,b,a);
 	}
 	
 	SchnellHamster(int r, int s, int b, int a, int f) {
 		super(r,s,b,a,f);
 	}
 	
 	public void vor(){
 		super.vor();
		rennDoppeltSoSchnellWieHamster();
	} 
	
	void rennDoppeltSoSchnellWieHamster(){
		if(this.vornFrei()){
			super.vor();
		}
	} 
}
