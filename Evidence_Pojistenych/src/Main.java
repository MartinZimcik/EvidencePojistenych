import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"UTF-8");
        UzivatelskeRozhrani uzivatelskeRozhrani = new UzivatelskeRozhrani();
        int volba = 0;

        // Uživatel si volí akci. Cyklus se opakuje stále dokola pokud nezvolí 4 - Konec. Po každé volbě je "Menu" opětovně vypsáno.
        while(volba != 4) {
            System.out.println("------------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("------------------------------");
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = 0;

            while(volba < 1 || volba > 4){
                try {
                    volba = Integer.parseInt(sc.nextLine());
                    if (volba < 1 || volba > 4){
                        System.out.println("Neplatná volba. Zvolte prosím číslo 1 - 4");
                    }
                } catch (Exception e) {
                    System.out.println("Neplatná volba. Zvolte prosím číslo 1 - 4");
                }
            }

            if(volba == 1){
                System.out.println();
                uzivatelskeRozhrani.pridejPojisteneho(uzivatelskeRozhrani.zadejJmeno(), uzivatelskeRozhrani.zadejPrijmeni(), uzivatelskeRozhrani.zadejTelefon(), uzivatelskeRozhrani.zadejVek());
                System.out.println();
            }
            else if (volba == 2) {
                System.out.println();
                uzivatelskeRozhrani.vypisPojisteneho();
                System.out.println();
            }
            else if (volba == 3){
                System.out.println();
                uzivatelskeRozhrani.vyhledejPojisteneho(uzivatelskeRozhrani.zadejJmeno(), uzivatelskeRozhrani.zadejPrijmeni());
                System.out.println();
            }
       }

    }
}
