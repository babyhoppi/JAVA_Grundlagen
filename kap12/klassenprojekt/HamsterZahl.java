import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class HamsterZahl implements de.hamster.model.HamsterProgram {public void main() {

	int maxZahl = (Territorium.getAnzahlSpalten()-1)/4;
	int n=9;
	for(;maxZahl-->0;){
		n=n*10+9;
	}
	Hamster Paul = Hamster.getStandardHamster();
	if(Territorium.getAnzahlKoerner() > 0){
	for(int i = 0; i<Territorium.getAnzahlSpalten(); i++){
    	if(!Territorium.mauerDa(0,i)){
    		Hamster Clean = new CleanHamster(i);
    	}
    }
}
	int zahl = Paul.liesZahl("Gib eine Zahl zwischen 0 und " + n);
	int z = 0; 
	int s = Territorium.getAnzahlSpalten()-1;
	while(zahl>0){
			z = zahl % 10;
			zahl/=10;
			ZahlHamster tmp = ZahlHamster.erzeuge(z,s);
			tmp.zeichne();			
			s-=4;
		}		
}}