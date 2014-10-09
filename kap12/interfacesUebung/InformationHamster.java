import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;interface InformationHamster {
	// liefert die Anzahl an Kacheln im Territorium
	public abstract int kachelnImTerritorium ();
	// liefert die Anzahl an Kacheln mit Mauern im Territorium
	public abstract int mauernImTerritorium ();
	// liefert die Anzahl an Koernern im Territorium
	public abstract int koernerImTerritorium ();
}