package zagadnienia.lab06;

public class Szef extends Pracownik {
    int premia;

    public Szef(String imie, String nazwisko, int wyplata, int premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }
    @Override
    public String toString() {
        return "Szef{" +
                "premia=" + premia +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wyplata=" + wyplata +
                '}';
    }
    public void test(){
        super.test();
        System.out.println("wartosc w szefie wynosi: 11111");
    }
}
