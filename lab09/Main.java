package lab09;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        zad1();
//        zad2();
//        zad3();
//        zad4();
        zad5();
    }
    public static String inputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    /*Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić
użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie
wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion*/
    public static List<String> zad1(){
        System.out.println("---------- ZADANIE 1 ----------");
        String line;
        List<String> imiona = new ArrayList<String>();
        System.out.println("podaj imiona (oddzielone enterem) - koniec wpisywania nastapi po wprowadzeniu znaku '-' ");
        while(true){
            line = inputString();
            if(line.equals("-")) break;
            imiona.add(line);
        }
        System.out.println("wypisanie listy z wprowadzonymi imionami: ");
        for(String string : imiona){
            System.out.println(string);
        }
        return imiona;
    }
/*Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”,
następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię
odpowiadającego mu partnera*/
    public static void zad2(){
        System.out.println("--------- ZADANIE 2 ---------\n");
        System.out.print("podaj imiona par - koniec wpisywania po wprowadzeniu znaku '-'");
        List<List<String>> pary = new ArrayList<>(); /*podwójna lista do przechowywania par imion*/
        String line1 = " ", line2 = " ";
        while(true){
            System.out.print("wprowadz imie pierwszej osoby: ");
            line1 = inputString();
            if(line1.equals("-")){
                break;
            }
            System.out.print("wprowadz imie drugiej osoby: ");
            line2 = inputString();
            List<String> para = new ArrayList<>();
            para.add(line1);
            para.add(line2);
            pary.add(para);
            System.out.println(" ");
        }
        System.out.println("podaj imie osoby dla ktorej chcesz wyszukać pare: ");
        String name = inputString();
        String partner = findPartner(name, pary);
        if(partner != null){
            System.out.println("partner do osoby " + name + ": " + partner);
        } else {
            System.out.println("nie znaleziono partnera dla " + name + " :(");
        }
    }
    public static String findPartner(String name, List<List<String>> pary){
        for(List<String> string : pary){
            if(string.contains(name)){
                string.remove(name);
                return string.get(0);
            }
        }
        return null;
    }
/*Napisz klasę przechowującą informacje o uczestnikach wydarzenia (ID, imię oraz jego wiek).
Zaimplementować metodę toString(), aby wyświetlać informację o uczestniku oraz metody equals()
oraz hashCode() (metody do porównywania obiektów). Do przechowywania uczestników należy użyć
listy. Ponadto zaproponować metodę pozwalającą na filtrowanie osób niepełnoletnich. Zaproponować
rozwiązanie z użyciem LinkedList oraz ArrayList*/
    public static void zad3(){
        System.out.println("---------- ZADANIE 3 -----------");
        List<Uczestnik> lista_uczestnikow_LinkedList = new LinkedList<>();
        List<Uczestnik> lista_uczestnikow_ArrayList = new ArrayList<>();

        lista_uczestnikow_LinkedList.add(new Uczestnik(1,"Adam", 15));
        lista_uczestnikow_LinkedList.add(new Uczestnik(2,"Katarzyna", 59));
        lista_uczestnikow_LinkedList.add(new Uczestnik(3,"Ada", 29));
        lista_uczestnikow_LinkedList.add(new Uczestnik(4,"Michał", 18));
        lista_uczestnikow_LinkedList.add(new Uczestnik(5,"Karol",13));

        lista_uczestnikow_ArrayList.add(new Uczestnik(1,"Adam", 15));
        lista_uczestnikow_ArrayList.add(new Uczestnik(2,"Katarzyna", 59));
        lista_uczestnikow_ArrayList.add(new Uczestnik(3,"Ada", 29));
        lista_uczestnikow_ArrayList.add(new Uczestnik(4,"Michał", 18));
        lista_uczestnikow_ArrayList.add(new Uczestnik(5,"Karol",13));

        /*wyswietlanie list*/
        System.out.print("\nlista uczestników (LinkedList): \n");
        for(Uczestnik uczestnik : lista_uczestnikow_LinkedList){
            System.out.println(uczestnik.toString());
        }
        System.out.print("\nlista uczestników (ArrayList): \n");
        for(Uczestnik uczestnik : lista_uczestnikow_ArrayList){
            System.out.println(uczestnik.toString());
        }

        /*filtrowanie osob nieletnich*/
        List<Uczestnik> minorList_LinkedList = filtrMinors(lista_uczestnikow_LinkedList);
        List<Uczestnik> minorList_ArrayList = filtrMinors(lista_uczestnikow_ArrayList);
        System.out.println("\nlista nieletnich uczestnikow (LinkedList): ");
        for(Uczestnik uczestnik : minorList_LinkedList){
            System.out.println(uczestnik.toString());
        }
        System.out.println("\nlista nieletnich uczestnikow (ArrayList)");
        for(Uczestnik uczestnik : minorList_ArrayList){
            System.out.println(uczestnik.toString());
        }
    }
    public static List<Uczestnik> filtrMinors(List<Uczestnik> listaUczestnikow){
        List<Uczestnik> minorList = new ArrayList<>();
        for(Uczestnik uczestnik : listaUczestnikow){
            if(uczestnik.getWiek() < 18){
                minorList.add(uczestnik);
            }
        }
        return minorList;
    }
/*Utwórz dowolną klasę, a potem zainicjalizowaną tablicę obiektów tej klasy. Zawartością tablicy
wypełnij listę List. Wyłuskaj z niej fragment listy metodą subList(), a następnie usuń tę podlistę
z oryginalnej listy. */
    public static void zad4(){
        System.out.println("---------- ZADANIE 4 ----------");
        final int lenght = 5;
        Klasa[] tablica = new Klasa[lenght];
        /*inicjalizowanie tablicy obiektów*/
        for(int i = 0; i < lenght; i++){
            tablica[i] =  new Klasa(i);
        }
        /*kopiowanie zawartosci tablicy do listy*/
        List<Klasa> listaObiektow = new ArrayList<>(Arrays.asList(tablica));

        /*wyodrebnianie fragmentu listy*/
        List<Klasa> podlista = listaObiektow.subList(1,3);
        System.out.println("podlista: " + podlista);

        /*usuwanie podlisty z oryginalnej listy*/
        listaObiektow.removeAll(podlista);
        System.out.println("lista po usunieciu podlisy: " + listaObiektow);
    }
/*Utwórz i zapełnij listę List<Integer>. Utwórz drugą listę List<Integer>. Użyj ListIterator do przejrzenia
elementów pierwszej listy i wstawienia ich do listy drugiej, ale w odwrotnej kolejności.*/
    public static void zad5(){
        System.out.println("---------- ZADANIE 5 ----------");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            list1.add(rand.nextInt());
        }
    }
}