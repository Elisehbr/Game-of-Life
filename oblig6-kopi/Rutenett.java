public class Rutenett {
    int antRader;
    int antKolonner;
    Celle[][] rutene;

    public Rutenett(int antRader, int antKolonner){
        this.antRader = antRader;
        this.antKolonner = antKolonner;
        rutene = new Celle[antRader][antKolonner];
    }


    public void lagCelle(int rad, int kol){
        Celle celle = new Celle();
        if (Math.random()<=0.3333){
            celle.settLevende();
            rutene[rad][kol] = celle;
        } else{
            celle.settDoed();
            rutene[rad][kol] = celle;
        }
    }
    
    public void fyllMedTilfeldigeCeller(){
        for (int i = 0; i < antRader; i++){
            for (int j = 0; j < antKolonner; j++){
                lagCelle(i, j);
            }

        }
    }
    public Celle hentCelle(int rad, int kol){
        if (rad < antRader && rad >= 0){
            if (kol < antKolonner && kol >= 0){
                return rutene[rad][kol];
            }else{
                return null;
            }
        }else{
            return null;
        }
    }

    public void tegnRutenett(){
        for (int i = 0; i < antRader; i++){
            for (int j = 0; j < antKolonner; j++){
                System.out.print(rutene[i][j].hentStatusTegn());
            }
            System.out.println();
        }
    }
    public void settNaboer(int rad, int kol){
        Celle celle = hentCelle(rad,kol);
        for (int vertikal = rad -1; vertikal <= rad + 1; vertikal++){
            for (int horisontal = kol -1; horisontal <= kol + 1; horisontal++){
                Celle nabo = hentCelle(vertikal, horisontal);
                if (vertikal == rad && horisontal == kol){
                    
                } else if (nabo != null){
                    celle.leggTilNabo(nabo);
                }
            }
        }
    }

    public void kobleAlleCeller(){
        for (int rad = 0; rad < antRader; rad++){
            for (int kol = 0; kol < antKolonner; kol++){
                    settNaboer(rad, kol);
            }
        }
    }
    public int antallLevende(){
        int teller = 0;
        for (int rad = 0; rad < antRader; rad++){
            for (int kol = 0; kol < antKolonner; kol++){
                if (rutene[rad][kol].erLevende()){
                    teller ++;
                }    
            }
        }
        return teller;
    }
    }