import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class SortierHamster extends AllroundHamster {
    
    void bubbleSort(int [] x) {

		//mit jedem Durchlauf ein Element weniger vergleichen
		for (int i=x.length; i>1; i--){
	
			// ein Durchlauf (pass)
   			for (int j=0; j<i-1; j++){
   			
   				// ggf. die benachbarten Elemente vertauschen
     			if (x[j] > x[j+1]){
     		
       				int tmp = x[j];
    	   			x[j] = x[j+1];
	       			x[j+1] = tmp;
				} 
			} 
		} 
	}
}
