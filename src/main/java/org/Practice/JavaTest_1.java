package org.Practice;

import java.util.ArrayList;

public class JavaTest_1 {
    public static void main(String[] args) {

        //1. zadatak
        int[] niz = {1, 6, 12, 18, 102, 7, 54, 22, 11, 47, 100};
        deljiviBrojevi(niz);

        //2. zadatak
        ArrayList<String> listaReci = new ArrayList<>();
        String rec = "mis";
        listaReci.add("pas");
        listaReci.add("macka");
        listaReci.add("mis");
        nalaziSeUNizu(listaReci, rec);

        //3. zadatak
        System.out.println(sumaBrojevaNiza(niz));

        //4. zadatak
        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(2);
        listaBrojeva.add(7);
        listaBrojeva.add(10);
        listaBrojeva.add(11);
        listaBrojeva.add(16);
        listaBrojeva.add(20);
        System.out.println(izbaciParne(listaBrojeva));

        //5. zadatak
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 4, 3, 5};
        int[] niz3 = {5, 4, 3, 2, 1};
        int[] niz4 = {5, 4, 2, 3, 1};
        int[] niz5 = {1, 1, 1, 1, 2};


        System.out.println(monotonNiz(niz5));

        //6. zadatak
        ArrayList<String> listaReci1 = new ArrayList<>();
        listaReci1.add("lopta");
        listaReci1.add("banana");
        listaReci1.add("casa");
        listaReci1.add("sto");
        listaReci1.add("banana");
        listaReci1.add("lopta");
        listaReci1.add("banana");
        String trazenaRec = "Banana";

        brojPojavljivanja(listaReci1, trazenaRec);
    }
    //1. zadatak: Napraviti metodu koja prihvata niz brojeva kao argument.
    // Stampati sve brojeve deljive sa 2 i 3

    public static void deljiviBrojevi(int[] nizBrojeva) {
        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 == 0 && nizBrojeva[i] % 3 == 0) {
                System.out.println("Broj je deljiv i sa 2 i sa 3: " + nizBrojeva[i]);
            }
        }
    }


    //2.zadatak:  Napraviti metodu koja prihvata listu String-ova i jos jedan String.
    // Ispisati poruku ukoliko se taj jedan String nalazi u listi.

    public static void nalaziSeUNizu(ArrayList<String> listaReci, String rec) {
        boolean pojavljujeSe = true;
        for (int i = 0; i < listaReci.size(); i++) {
            if (listaReci.get(i).equalsIgnoreCase(rec)) {
                pojavljujeSe = true;
            } else {
                pojavljujeSe = false;
            }
        }
        if (pojavljujeSe) {
            System.out.println("Rec " + rec + " se nalazi u listi");
        } else {
            System.out.println("Rec " + rec + " se ne pojavljuje u listi");
        }
    }


    //3. Napraviti metodu koja prihvata niz brojeva i vraca sumu svih brojeva.

    public static int sumaBrojevaNiza(int[] nizBrojeva) {
        int zbirBrojeva = 0;
        for (int i = 0; i < nizBrojeva.length; i++) {
            zbirBrojeva += nizBrojeva[i];
        }
        return zbirBrojeva;
    }


    //4. Popraviti kod:

    public static ArrayList<Integer> izbaciParne(ArrayList<Integer> lista) {
        ArrayList<Integer> rezultat = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                lista.remove(i);
                i--;
            }
            rezultat = lista; //ovde kopiramo listu "lista" u "rezultat",
            // odnosno kopiramo referencu - plitko kopiranje. Mogli smo samo da vratimo "Lista"
            // ali je u zadatku data i lista "rezultat" koju sam kopirala i vratila

            //Moguce je resenje ako broj nije deljiv sa 2, ubaciti ga u listu "rezultat"
            // i vratiti tu listu


        }
        return rezultat;
    }


    //5. Napraviti metodu koja prihvata niz brojeva. Proveriti da li je niz monoton.
    //*Niz je monoton kada je ili rastuci ili opadajuci
    //{1, 2, 3, 4, 5}; -> true
    //{9, 7, 4, 1}; -> true
    //{3, 5, 2, 8}; -> false


    public static boolean monotonNiz(int[] nizBrojeva) {

        boolean nizOpada = true;
        boolean nizRaste = true;
        for (int i = 0; i < nizBrojeva.length - 1; i++) {
            if (nizBrojeva[i] <= nizBrojeva[i + 1]) {
                nizOpada = false;
            } else if (nizBrojeva[i] >= nizBrojeva[i + 1]) {
                nizRaste = false;
            }
        }
        if (nizOpada == true) {
            return true;
        } else if (nizRaste == true) {
            return true;
        } else {
            return false;
        }


    }


    //6. Napraviti metodu koja prihvata listu String-ova i jos jedan String.
    // Ona prolazi kroz listu
    //String-ova i broji koliko se puta pojavljuje taj String u listi.
    //Lista: ["java", "python", "java", "c++", "java"]
    //Tražena rec: "java"
    //Rec "java" se pojavljuje 3 puta u listi.


    public static void brojPojavljivanja(ArrayList<String> listaReci, String rec) {
        int pojavljivanja = 0;
        for (int i = 0; i < listaReci.size(); i++) {
            if (rec.equalsIgnoreCase(listaReci.get(i))) {
                pojavljivanja++;
            }
        }
        System.out.println("Rec " + rec + " se pojavljuje u listi " + pojavljivanja + " puta.");
    }
}
