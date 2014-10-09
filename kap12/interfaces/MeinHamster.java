import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class MeinHamster extends Hamster implements Pruefbar {
    public boolean hintenFrei() {
    	return !Territorium.mauerDa( this.getReihe(), this.getSpalte()-1);
    }
    
    public boolean linksFrei() {
    	return !Territorium.mauerDa( this.getReihe()-1, this.getSpalte());
    }
    
   	public boolean vornFrei() {
    	return !Territorium.mauerDa( this.getReihe(), this.getSpalte()+1);
    }
    
    public boolean rechtsFrei() {
    	return !Territorium.mauerDa( this.getReihe()+1, this.getSpalte());
    }
}
