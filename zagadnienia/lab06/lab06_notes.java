package zagadnienia.lab06;
public class lab06_notes {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("jan", "nowak", 1234);
        pracownik.test();

        Szef szef = new Szef("janina", "nowak", 1234, 12345);
        System.out.println(pracownik.toString());
        System.out.println(szef.toString());

    }
}