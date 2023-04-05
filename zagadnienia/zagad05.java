package zagadnienia;
public class zagad05 {
    public static void main(String[] args) {
//        person obj = new person();
//        obj.imie = "jan";
//        obj.nazwisko = "kowalski";
//        obj.wiek= 12;
        Person person = new Person("jan", "kowalsko", 12);
        //nazwisko null - nie podano
        // wiek 0 - tez nie podano wartosci
//        obj.wypisz();
        person.imie = "janina";
        person.setImie("janina");

        person.wypisz();
        System.out.println(person.toString());
    }
}
