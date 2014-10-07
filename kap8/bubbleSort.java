import java.util.Arrays;

import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class bubbleSort implements de.hamster.model.HamsterProgram {public void main() {
 // das Feld aus ganzen Zahlen wird durch eine Wertliste definiert
 int [] feld = {8,3,5,6,2,1,7};
 
 ausgeben (feld);
 bubbleSort(feld);
 ausgeben (feld);
}

void ausgeben (int [] x){
	Hamster paul = Hamster.getStandardHamster();
	paul.schreib("Feld: " + Arrays.toString(x));
	
}

void bubbleSort(int [] x) {
	for (int i=x.length; i>1; i--){
   		for (int j=0; j<i-1; j++){
     		if (x[j] > x[j+1]){
       			int tmp = x[j];
       			x[j] = x[j+1];
       			x[j+1] = tmp;
			} // ende if
		} // ende innere for-Schleife
	} // ende ‰uﬂere for-Schleife
}}