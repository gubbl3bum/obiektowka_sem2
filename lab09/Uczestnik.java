package lab09;
import java.util.Objects;

public class Uczestnik {
    private int ID, wiek;
    private String imie;
    public Uczestnik (int ID, String imie, int wiek){
        this.ID = ID;
        this.imie = imie;
        this.wiek = wiek;
    }
    @Override
    public String toString() {
        return "Uczestnik{" +
                "ID=" + ID +
                ", imie='" + imie + '\'' +
                ", wiek='" + wiek + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return ID == uczestnik.ID && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ID, wiek, imie);
    }
    /* GETTERY*/
    public int getID() {
        return ID;
    }
    public int getWiek() {
        return wiek;
    }
    public String getImie() {
        return imie;
    }
}