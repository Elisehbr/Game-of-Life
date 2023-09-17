class Celle {
    public Celle [] naboer;
    public Boolean levende = false;
    public int antNaboer = 0;
    public int antLevendeNaboer = 0;

    public Celle(){
        naboer = new Celle[8];
        
    }


    public void settDoed(){
        levende = false;
    }
    public void settLevende(){
        levende = true;
    }

   
    public boolean erLevende(){
        if (levende == true){
            return true;
        } 
        
        else {
            return false;
        }
    }

    public char hentStatusTegn(){
        if (levende == true){
            return '*';
        } 
        else {
            return ' ';
        }
    }

    public void leggTilNabo(Celle nabo){
        naboer[antNaboer] = nabo;
        antNaboer ++;
        
    }
    public void tellLevendeNaboer(){
        antLevendeNaboer = 0;
        for(int i = 0; i < antNaboer; i ++){
            if(naboer[i] != null){
                if (naboer[i].erLevende()){
                    antLevendeNaboer ++;
                }
            }
         
        }
    }


    public void oppdaterStatus(){
        if (levende){
            if (antLevendeNaboer < 2 || antLevendeNaboer > 3){
                settDoed();
            }
        } 
        else{
            if (antLevendeNaboer == 3){
                settLevende();
            }
        }
    }
}