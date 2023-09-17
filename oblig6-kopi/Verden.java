public class Verden {
    Rutenett rutenett;
    int genNr = 0;
    int antRader;
    int antKolonner;


    public Verden( int antRader, int antKolonner){
        rutenett = new Rutenett(antRader, antKolonner);
        rutenett.fyllMedTilfeldigeCeller();
        rutenett.kobleAlleCeller();
    }

    

    public void tegn(){
        rutenett.tegnRutenett();
        System.out.println("Generasjonsnummer: " + genNr);
        System.out.println("Antall levende: " + rutenett.antallLevende());
    }
    
    public void oppdatering(){
        for (int rad = 0; rad < antRader; rad++){
            for (int kol = 0; kol < antKolonner; kol++){
                rutenett.hentCelle(rad, kol).tellLevendeNaboer();
            }    
        }
        for (int rad = 0; rad < antRader; rad++){
            for (int kol = 0; kol < antKolonner; kol++){
                rutenett.hentCelle(rad, kol).oppdaterStatus();
            }    
        }
        genNr ++;
    }
}
