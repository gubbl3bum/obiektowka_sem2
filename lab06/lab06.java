package lab06;
public class lab06 {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1(){
        System.out.println("---------- EXERCISE 1 ----------");
        /*Zadanie 1
Utwórz projekt zawierający funkcje Main.
Utwórz klasę Punkt, która zawiera publiczne pola (współrzędne): x oraz y.
Dla klasy Punkt zdefiniuj konstruktor bezparametrowy, który zainicjuje początkowe wartości
atrybutów.
Zdefiniuj drugi konstruktor, który przekazane parametry zapamięta, jako wartości atrybutów: x i y.
Zdefiniuj następujące metody dla klasy punkt: gettery i settery, void zeruj(), void opis(); void przesun(int x, int y);
W metodzie main() utwórz trzy obiekty typu Punkt.
Pokaż, w jaki sposób można wykorzystać każdą ze zdefiniowanych metod.
Do pakietu pliki Figury, Prostokąt i Trojkat (udostępnione przez prowadzącego).
Utworzyć obiekty typu Figura, Prostokat i Trojkat. Sprawdzić działanie wybranych metod dla
utworzonych obiektów.
Zaprojektować klasę Okrag zawierającą pola: środek klasy Punkt – środek okręgu, promień typu double
oraz metody: getPowierzchnia() zwracająca pole powierzchni, getSrednica() zwracająca średnice, setPromien(double p)
ustawiająca nowy promień, getPromien() zwracająca promień, wSrodku(Punkt) sprawdzająca czy dany punkt znajduje się wewnątrz okręgu.
Konstruktory: -> Pusty – inicjujący pola wartościami domyślnymi punkt (0,0), promień 0,
-> Określający punkt oraz promień
Zmodyfikować klasę Prostokat i Trojkat, tak, aby dziedziczyły z klasy Figura.
Dodać konstruktor przeciążony dla klasy Prostokat postaci: Prostokat(float wys,float szer, String kolor). Wewnątrz
konstruktora powinien być wywołany konstruktor z klasy bazowej.
Dodać konstruktor przeciążony dla klasy Trojkat postaci Trojkat(float wys,float podst,String kolor).
Dodać metodę przesuwającą prostokąt o dane współrzędne void przesun(float x, float y).
Dla obiektu typu Prostokat wywołać metodę przesun(3,5).
Zdefiniować nową klasę Kwadrat dziedziczącą z klasy Prostokat. Umieścić w niej gettery i setery.
Utworzyć dowolny obiekt typu Kwadrat i nadać mu dowolną wartość początkową.
Przysłonić metody opis() we wszystkich klasach.
Dla utworzonych obiektów wywołać metodę opis(), w taki sposób, aby opis o danym obiekcie został
wyświetlony na konsolę.
Zmodyfikować klasę Okrag zawierającą, tak, aby dziedziczyła po klasie Figura. Sprawdzić działanie zdefiniowanych metod
dla przykładowych obiektów.*/
        Point punkt1 = new Point(1.5, 29.0);
        Point punkt2 = new Point(25.1, 69.1);
        Point punkt3 = new Point(25.01, 29.07);
        /*użycie metod z Pointu*/
        punkt1.opis();
        punkt1.przesun(2.5,16);
        punkt1.opis();
        punkt2.zeruj();
        punkt2.opis();
        punkt3.przesun(15.1, 69);
        punkt3.opis();

        Figura figura = new Figura();
        System.out.println(figura.opis());
        Prostokat prostokat = new Prostokat();
        Trojkat trojkat = new Trojkat();
    }
/*Napisz program, w którym będą dwie klasy: Samochod i SamochodOsobowy. W klasach tych powinny
znajdować się następujące pola:
Samochod: Marka, Model, Nadwozie, Kolor, Rok produkcji, Przebieg (nie może być ujemny)
SamochodOsobowy: Waga (powinna być z przedziału 2 t – 4,5 t), Pojemność silnika (powinna być z
przedziału 0,8-3,0), Ilość osób
Klasa SamochodOsobowy dziedziczy po klasie Samochod. W obydwu klasach utwórz konstruktor,
który pobierze dane od użytkownika. Dodatkowo w klasie Samochod przeciąż konstruktor w taki
sposób, by wartości pól były parametrami metody. W klasie Samochod utwórz także metodę, która
wyświetli informacje o samochodzie. Przesłoń ją w klasie SamochodOsobowy. W metodzie Main()
utwórz obiekt klasy SamochodOsobowy oraz dwa obiekty klasy Samochod (wykorzystując różne
konstruktory). Wyświetl informacje o samochodach. */


    /*Należy zaimplementować aplikację wykorzystującą: kompozycję i dziedziczenie, rzutowanie oraz
operator this i metodę super dla następujących klas Księgarnia, Podręcznik, Powieść, Klient, Książk*/


}