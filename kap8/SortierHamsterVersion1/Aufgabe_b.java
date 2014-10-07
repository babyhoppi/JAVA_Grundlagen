import java.util.Arrays;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class Aufgabe_b implements de.hamster.model.HamsterProgram {public void main() {

int anzahlSpalten = Territorium.getAnzahlSpalten();
int anzahlReihen = Territorium.getAnzahlReihen();
int maxReihe = anzahlReihen - 1;

SortierHamster paul = new SortierHamster(maxReihe, 0, Hamster.NORD, 0, Hamster.ROT);

//paul.schreib("Bla: " + Arrays.toString(paul.pruefeReihen()));


int [] x = paul.pruefeReihen();

	for(int i = x.length; i > 1; i--){
	
	
	
		for(int j = 0; j < i - 1; j++){
		
	
			
			if(x[j] > x[j+1]){
			paul.tauscheSpalte();
			
			int temp = x[j];
			x[j] = x[j + 1];
			x[j + 1] = temp;
			}else{
			if(paul.vornFrei()){
			paul.vor();
			}
			}
		
		}
		
		//Spalte ermitteln
		if(paul.getSpalte() == Territorium.getAnzahlSpalten() - 1){ 
		paul.laufeZuKachel(Territorium.getAnzahlReihen() - 1, 0);
		paul.rechtsUm();
		}else{
		
		paul.laufeZuKachel(Territorium.getAnzahlReihen() - 1, 0);
		}
		
	}
	//Ende bubbleSort
	}
}