import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;abstract class ZahlHamster extends Hamster {
	
	ZahlHamster(int s, int r, int b, int k){
			super(s,r,b,k);

	}
      
  static ZahlHamster erzeuge(int zahl, int s){
    	switch (zahl){
			default:
			case 1 :
			return new EinsHamster(5,s);
			case 2 :
			return new ZweiHamster(5,s);
			case 3 :
			return new DreiHamster(5,s);
			case 4 :
			return new VierHamster(5,s);
			case 5 :
			return new FuenfHamster(5,s);
			case 6 :
			return new SechsHamster(5,s);
			case 7 :
			return new SiebenHamster(5,s);
			case 8 :
			return new AchtHamster(5,s);
			case 9 :
			return new NeunHamster(5,s);
			case 0 :
			return new NullHamster(5,s);
			}
    }
    
    void rechtsUm(){
    	this.linksUm();    	
    	this.linksUm();
    	this.linksUm();
    }
    void kehrt(){
    	this.linksUm();    	
    	this.linksUm();
    }
    void linskUm(){
    	linksUm();
    }
    
    void gib(int x){
    	for(;x>0;x--){
    		super.gib();
    	}
    }
    void vor(int x){
    	for(;x>0;x--){
    		if(this.vornFrei()){
    			super.vor();
    		}
    	}
    }
	public void vor(){
    	if(this.vornFrei())
    	super.vor();
    }
    
    abstract void zeichne();
}
