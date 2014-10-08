import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class SuperSchnellHamster extends SchnellHamster {
    SuperSchnellHamster() {
 		super();
 	}
 	
 	SuperSchnellHamster(int r, int s, int b, int a) {
 		super(r,s,b,a);
 	}
 	
 	SuperSchnellHamster(int r, int s, int b, int a, int f) {
 		super(r,s,b,a,f);
 	}
 	
 	public void vor(){
 		super.vor();
		if(this.vornFrei()){
			super.vor();
			if(this.vornFrei()){
				super.vor();
			}
		}
	}     
}
