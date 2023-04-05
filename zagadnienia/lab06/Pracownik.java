package zagadnienia.lab06;
public class Pracownik {
    String imie, nazwisko;
    int wyplata;
    public Pracownik(){
        this.imie =" ";
        this.nazwisko =" ";
        this.wyplata = 0;
    }
    public Pracownik(String imie, String nazwisko, int wyplata){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return "Pracownink{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
    public void test(){
        System.out.println("12");
    }
}
