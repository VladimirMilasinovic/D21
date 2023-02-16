package DomaciOOP4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Zadatak 2.
//Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i boolean vrednost bezLaktoze.
// Klase Corba, Torta i Sarma nasledjuju klasu Jelo. Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu na false, u suprotnom na true.
// U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).
        ArrayList<String> listaSastojaka = new ArrayList<>();
        listaSastojaka.add("kupus");
        listaSastojaka.add("mleveno meso");
        listaSastojaka.add("so");
        listaSastojaka.add("biber");

        Sarma s1 = new Sarma("sarma", imaLaktoze(listaSastojaka),listaSastojaka);
        s1.stampanje();


        ArrayList<String> listaSastojakaTorta = new ArrayList<>();

        listaSastojakaTorta.add("secer");
        listaSastojakaTorta.add("bela cokolada");
        listaSastojakaTorta.add("mleko");

        Torta t1 = new Torta("Bela torta",imaLaktoze(listaSastojakaTorta),listaSastojakaTorta);
        t1.stampanje();


        ArrayList<String> listaSastojakaCorba = new ArrayList<>();

        listaSastojakaCorba.add("paradajz");
        listaSastojakaCorba.add("so");
        listaSastojakaCorba.add("riba");
        listaSastojakaCorba.add("voda");
        listaSastojakaTorta.add("biber");

        Corba c1 = new Corba("Riblja corba",imaLaktoze(listaSastojakaCorba), listaSastojakaCorba);
        c1.stampanje();

    }

    public static boolean imaLaktoze (ArrayList<String> listaSastojaka){
        for (int i =0; i<listaSastojaka.size(); i++){
            if(listaSastojaka.get(i).equals("mleko")){
                return false;
            }
        }return true;
    }
}


