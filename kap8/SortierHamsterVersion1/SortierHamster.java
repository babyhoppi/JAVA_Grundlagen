import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;class SortierHamster extends AllroundHamster {

	SortierHamster(int r, int s, int b, int k, int f) {
        super(r, s, b, k, f);
    }
    
    int anzahl = 0;
    int anzahlA = 0;
	int anzahlB = 0;
    
    
    //Vorhandene Sortierung pruefen
    int [] pruefeReihen(){
    //int [] x = {1, 3, 4};
    
    int koerner = 0;
    int arrayLaenge = Territorium.getAnzahlSpalten();
    
    int [] myArray = new int[arrayLaenge];
    
    		for(int i = 0; i < myArray.length; i++){
    		
    		koerner = 0;
    			
    			for(int j = 0; j < Territorium.getAnzahlReihen() + 1; j++){
    			
    			koerner += Territorium.getAnzahlKoerner(j, i);
    			
    			
    			}
    	
    	myArray[i] = koerner;
    	
    		}
    
    
    return myArray;
    }
	
void tauscheSpalte(){
	int x = this.getSpalte();
	int y = this.getReihe();
		
		
		anzahlA = this.sammelKachel();
		this.kehrt();
	
		while(this.vornFrei()){
		this.vor();
		}
		
		//in die naechste Spalte wechseln
		this.linksUm();
		if(this.vornFrei()){
		this.vor();
		}
		
		this.linksUm();
		
		
		anzahlB = this.sammelKachel();

		this.kehrt();
	
		while(this.vornFrei()){
		this.vor();
		}
		
	this.laufeZuKachel(y, x);
	
//	this.schreib("Anzahl A: " + anzahlA + " / Anzahl B: " + anzahlB);
	
	
	//in die erste Spalte wechseln und auslegen
	this.rechtsUm();
	
	while(this.vornFrei()){
	  if(anzahlB > 0){
		this.gib();
		anzahlB--;
		}
		this.vor();
		}
		
		if(anzahlB > 0){
		gib();
		anzahlB--;
		}
	
	//in die zweite Spalte wechseln und auslegen
	
	this.kehrt();
	while(this.vornFrei()){
		this.vor();
	}

	
	this.linksUm();
	if(this.vornFrei()){
		this.vor();
	}
	
	this.linksUm();
	
		while(this.vornFrei()){
		if(anzahlA > 0){
		this.gib();
		anzahlA--;
		}
		this.vor();
		}
		if(anzahlA > 0){
		gib();
		anzahlA--;
		}

	
	//zur Ausgangsposition laufen
	this.kehrt();
	while(this.vornFrei()){
	this.vor();
	}
	while(this.getBlickrichtung() != Hamster.NORD){
	this.linksUm();
	}
	
	
	
	
	
	
	
//Ende tauscheSpalte
}

  
int sammelKachel(){
anzahl = 0;
	 while(this.kornDa() && this.vornFrei()){
	 	this.nimm();
	 	anzahl++;
	 	this.vor();
	}
	
	if(this.kornDa()){
	this.nimm();
	anzahl++;
	}
	
	return anzahl;
}

//Ende Class
}




