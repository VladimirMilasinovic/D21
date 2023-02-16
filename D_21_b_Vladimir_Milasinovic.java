package DomaciOOP4;

import java.util.ArrayList;

public class Jelo {
    String naziv ;
    boolean bezLaktoze;
    ArrayList<String> listaSastojaka;

    public Jelo(String naziv, boolean bezLaktoze, ArrayList<String> listaSastojaka) {

        this.naziv = naziv;
        this.bezLaktoze = bezLaktoze;
        this.listaSastojaka = listaSastojaka;
    }

    public void stampanje (){
        System.out.println("Ime jela je " + this.naziv + "." );
        System.out.println("Sastojci su " + this.listaSastojaka+ ".");
        if (bezLaktoze){
            System.out.println("Jelo je bez laktoze");
        }else {
            System.out.println("Jelo nije bez laktoze");
        }
    }

}

