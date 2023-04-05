package zagadnienia;
public class Person {
    // definicja pól
    // pole prywatne klasy - dostęp tylko i wyłącznie w tej klasie
    String imie, nazwisko;
    int wiek;
    //metody
    public void wypisz(){
        System.out.println("imie: " + imie + " nazwisko: " + nazwisko + " wiek: " + wiek);
    }
    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
    //konstruktor - zawsze metoda publiczna, nazwa klasy
    public Person(){ //konstruktor bezparametrowy
    //    ciało konstruktora
    //    moze przypisywać wartości
    }
    //public person(String imie){ //przeciazenie metod/konstruktora
        //this -> wskazuje na obiekt/pole klasy
        // wskaz na pole klasy imie (zdefiniowane na początku) wstaw imie ktore przekazane jest do metody
    //    this.imie = imie;
    //}
    //alt + insert -> generuj konstruktor
    // trzymajac shift zaznaczanie wielu pol
//get -> zwraca rzeczy
    public String getImie() {
        return imie;
    }
//set -> ustawia rzeczy; nie tworzy nowego obiektu
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public Person(String imie, String nazwisko, int wiek){

    }
}
