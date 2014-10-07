import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;import de.hamster.debugger.model.Hamster;public class uebung01 implements de.hamster.model.HamsterProgram {public void main() {

    Hamster paul = Hamster.getStandardHamster();
    SortierHamster marco = new SortierHamster(paul.getReihe(), paul.getSpalte(), paul.getBlickrichtung(), 0,Hamster.GRUEN);
    marco.laufNachUntenLinks();
    int spalten = marco.zaehleSpalten();
    int[] koerner = new int[spalten];
    marco.zaehleUndSammleKoerner(koerner);
   	marco.sortiereKoernerBubblesort(koerner);
    marco.legeAlleKoernerAb(koerner);
}}