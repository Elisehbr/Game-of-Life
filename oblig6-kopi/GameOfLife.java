public class GameOfLife {
    public static void main(String[] args){
        Verden verden = new Verden(8, 12);
        int teller = 0;
        while (teller < 5){
            verden.tegn();
            verden.oppdatering();
            teller ++;
        }
        
        
        
    }
}
