import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class EinsHamster extends ZahlHamster
{
   	EinsHamster(int r,int s)
    {
    	super(r,s,0,1000);
    }   
    public void zeichne()
    {
    	this.vor();
    	this.gib(12);
    	this.vor();
    	this.gib(12);
    	this.vor();
    	this.gib(12);
    	this.vor();
    	this.gib(12);
    	this.vor();
    	this.gib(12);
    	this.linksUm();
    	this.vor();
     	this.linksUm();
    	this.vor();
    	this.rechtsUm();
    	this.gib(12);
    	this.vor();
    	this.linksUm();
    	this.vor(4);
    }     
}