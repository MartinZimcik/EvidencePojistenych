/**
 * Třída reprezentuje pojištěné osoby
 */
public class PojistenaOsoba {
    /**
     * Jméno pojištěného
     */
    private String jmeno;
    /**
     * Příjmení pojištěného
     */
    private String prijmeni;
    /**
     * Věk pojištěného
     */
    private int vek;
    /**
     * Telefon pojištěného
     */
    private String telefon;

    /**
     * Metoda pro vytvoření pojištěné osoby
     * @param jmeno - jméno pojištěného
     * @param prijmeni - příjmení pojištěného
     * @param telefon - telefon pojištěného
     * @param vek - věk pojištěného
     */
    public PojistenaOsoba(String jmeno, String prijmeni, String telefon, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * getter pro získání jména pojištěného
     * @return
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * getter pro získání příjmení pojištěného
     * @return
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Metoda pro vypsání pojištěného
     * @return - vrací atributy jméno, příjmení, věk a telefon pojištěného v jednom řádku rozdělené mezerou
     */
    @Override
    public String toString(){
        return String.format(jmeno + " " + prijmeni + " " + vek + " " + telefon);
    }

}
