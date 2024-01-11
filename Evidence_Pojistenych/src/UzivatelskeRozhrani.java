import java.util.ArrayList;
import java.util.Scanner;

public class UzivatelskeRozhrani {

    Scanner sc = new Scanner(System.in, "UTF-8");
    /**
     * Instance pojištěné osoby
     */
    PojistenaOsoba pojistenaOsoba;
    /**
     * Kolekce pro ukládání pojištěných
     */
    ArrayList<PojistenaOsoba> pojisteneOsobyList = new ArrayList<>();

    /**
     * Metoda pro přidání pojištěného do kolekce
     * @param jmeno - jméno pojištěného
     * @param prijmeni - příjmení pojištěného
     * @param telefon - telefon pojištěného
     * @param vek - věk pojištěného
     */
    public void pridejPojisteneho(String jmeno, String prijmeni, String telefon, int vek) {
        pojisteneOsobyList.add(pojistenaOsoba = new PojistenaOsoba(jmeno, prijmeni, telefon, vek));
    }

    /**
     * Metoda pro vypsání všech pojištěných osob
     */
    public void vypisPojisteneho() {
        for (PojistenaOsoba osoba : pojisteneOsobyList) {
            System.out.println(osoba);
        }
    }

    /**
     * Metoda pro vyhledání pojištěných osob na základě jména a příjmení
     * @param jmeno - jméno pojištěného
     * @param prijmeni - přijmení pojištěného
     */
    public void vyhledejPojisteneho(String jmeno, String prijmeni) {
        for (PojistenaOsoba osoba : pojisteneOsobyList) {
            if (osoba.getJmeno().equals(jmeno) && osoba.getPrijmeni().equals(prijmeni)) {
                System.out.println(osoba);
            }
        }
    }

    /**
     * Metoda pro zadání jména pojištěného
     * @return - vrací zadané jméno pojištěného jako String
     */
    public String zadejJmeno() {
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = sc.nextLine().trim();
        while(jmeno.isEmpty()){
            System.out.println("Nebylo zadáno žádné jméno. Zadejte jméno pojištěného:");
            jmeno = sc.nextLine().trim();
        }
        return jmeno;
    }

    /**
     * Metoda pro zadání příjmení pojištěného
     * @return - vrací zadané příjmení pojištěného jako String
     */
    public String zadejPrijmeni() {
        System.out.println("Zadejte příjmení:");
        String prijmeni = sc.nextLine().trim();
        while (prijmeni.isEmpty()) {
            System.out.println("Nebylo zadáno žádné příjmení. Zadejte příjmení pojištěného:");
            prijmeni = sc.nextLine().trim();
        }
        return prijmeni;
    }

    /**
     * Metoda pro zadání telefonního čísla pojištěného
     * @return - vrací zadané telefonní číslo pojištěného jako String
     */
    public String zadejTelefon() {
        System.out.println("Zadejte telefonní číslo:");
        String telefon = sc.nextLine();
        while (telefon.isEmpty()) {
            System.out.println("Nebylo zadáno žádné telefonní číslo. Zadejte telefonní číslo:");
            telefon = sc.nextLine().trim();
        }
        return telefon;
    }

    /**
     * Metoda pro zadání věku pojištěného
     * Kontroluje zda bylo zadáno číslo v rozmezí 1-150
     * @return - vrací věk pojištěného jako int
     */
    public int zadejVek() {
        System.out.println("Zadejte váš věk: ");

            // Zkontroluje, zda je vstup platné celé číslo
            while (!sc.hasNextInt()) {
                System.out.println("Neplatný věk. Zadejte prosím číslo.");
                sc.next(); // Zahodí neplatný vstup
            }

            int vek = sc.nextInt();
            sc.nextLine(); // Zpracujte zbytek řádku

            while(vek <= 0 || vek > 150){
                System.out.println("Neplatný věk. Zadejte věk v rozmezí 1 až 150 let.");
                vek = sc.nextInt();
                sc.nextLine(); // Zpracujte zbytek řádku
            }
        return vek;
        }
    }