package lab08;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import static lab08.WprowadzZkonsoli.*;

class BlednaWartoscDlaSilniExeption extends Exception{
    public BlednaWartoscDlaSilniExeption(String message){
        super(message);}
}
public class Main{
    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        zad5();
        //zad6();
        //zad7();
    }
    public static double InputDouble(){
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static String InputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    /*Zadanie 1.
Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia
pierwiastka możesz użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną
rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg
znaków, który nie jest liczbą.*/
    public static void zad1(){
        System.out.print("--------- ZADANIE 1 ----------\n");
        try{
            System.out.println("podaj liczbę: ");
            double number = InputDouble();
            if(number < 0){
                throw new IllegalArgumentException("podana liczba musi być większa lub równa zeru!!");
            }
            double SquareRoot = Math.sqrt(number);
            System.out.println("pierwiastek z liczby "+number+" wynosi: " + SquareRoot);
        } catch (InputMismatchException e) {
            System.out.println("podany ciąg znaków nie jest liczbą! ");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    /*Zadanie 2.
Napisz metodę, która będzie zwracać silnię podanej jako argument liczby. Metoda powinna rzucać
wyjątek rodzaju Checked zdefiniowanego przez Ciebie typu BlednaWartoscDlaSilniException, gdy jej
argument będzie ujemny. Skorzystaj z tej metody w main, obsługując potencjalny wyjątek.*/
    public static void zad2(){
        System.out.println("--------- ZADANIE 2 ----------");
        try{
            System.out.println("podaj liczbe: ");
            int numer = (int) InputDouble();
            int silnia = obliczSilnie(numer);
            System.out.println("silnia z " + numer + " wynosi: " + silnia);
        }catch(BlednaWartoscDlaSilniExeption e){
            System.out.println(e.getMessage());
        }
    }
    public static int obliczSilnie(int numer) throws BlednaWartoscDlaSilniExeption{
        if (numer < 0){
            throw new BlednaWartoscDlaSilniExeption("liczba musi byc wieksza lub rowna zero!");
        }
        if (numer == 0){
            return 1;
        }
        int silnia = 1;
        for( int i = 1; i <=numer; i++){
            silnia *= i;
        }
        return silnia;
    }
///*Zadanie 3.
//Napisz program z klasą Adres, która będzie miała podane poniżej pola, które będą ustawiane w
//konstruktorze klasy Adres. Konstruktor powinien sprawdzić wszystkie podane wartości i rzucić wyjątek
//NieprawidlowyAdresException rodzaju Checked, jeżeli któraś z wartości będzie nieprawidłowa.
//Uwaga: komunikat rzucanego wyjątku powinien zawierać informację o wszystkich nieprawidłowych
//wartościach przekazanych do konstruktora – dla przykładu, jeżeli ulica i miasto będą miały wartość null,
//to komunikat wyjątku powinien być następujący: "Ulica nie może być nullem. Miasto nie może być
//nullem". Pola klasy: String ulica – wartość nieprawidłowa to null, int numerDomu – wartość
//nieprawidłowa to liczba <= 0, String kodPocztowy – wartość nieprawidłowa to null, String
//miasto – wartość nieprawidłowa to null*/
    public static void zad3(){
        System.out.println("--------- ZADANIE 3 ----------");
        try{
            Adres adres = new Adres();
            System.out.print("podaj ulice: ");
            adres.setUlica(InputString());
            System.out.print("podaj numer domu: ");
            adres.setNumerDomu(InputInt());
            System.out.print("podaj kod pocztowy: ");
            adres.setKodPocztowy(InputString());
            System.out.print("podaj miasto: ");
            adres.setMiasto(InputString());
            System.out.println("adres: " + adres.getUlica() + " " + adres.getNumerDomu() + ", " + adres.getKodPocztowy() + " " + adres.getMiasto());
        } catch (NieprawidlowyAdresException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("nieprawidlowy format danych!");
        }
    }
/*Utwórz klasę WprowadzZKonsoli. Utwórz metodę wprowadzInt wraz z obsługą wyjątków tak aby np.
nie można było wprowadzić błędnej postaci liczby tj. „1w2”. Utwórz metody wprowadzania innych
typów danych np. char, long, short, float, double, String wraz z odpowiednią obsługą wyjątków. Do
wprowadzania danych z konsoli użyj klasy Scanner.*/
    public static void zad4(){
        System.out.println("---------- ZADANIE ---------- ");
        int liczba = wprowadzInt();
        float liczbaFloat = wprowadzFloat();
        short liczbaShort = wprowadzShort();
        long liczbaLong = wprowadzLong();
        char znak = wprowadzChar();
        String tekst = wprowadzString();
    }
/*Napisz program wykorzystujący obsługę wyjątku ArrayIndexOutOfBoundsException.*/
    public static void zad5(){

    }
/*Utwórz klasę rzucającą wyjątek przy próbie wykonania dzielenia przez 0. Klasa ma dziedziczyć po
java.lang.Exception. Następnie utwórz klasę, która testuje czy wyjątki dzielenia przez zero są rzucane
przy pomocy utworzonej wcześniejszej klasy i wyłapywane*/
    public static void zad6(){

    }
/*Wykonaj program, który losuje dwie liczby całkowite z przedziału (-10 do 10). Następnie podziel
pierwszą liczbę przez drugą i wypisz wynik. Uwzględnij i zaprogramuj wyjątek dzielenia przez zero.
Wypisz informację o wystąpieniu tego wyjątku. Po trzecim wystąpieniu wyjątku zakończ wykonywanie
programu.*/
    public static void zad7(){

    }
}