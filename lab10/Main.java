package lab10;

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
/*1. Utwórz nową klasę Kangur ze składową int nrKangura, inicjalizowaną z poziomu konstruktora.
Wyposaż klasę w metodę skok(), wypisującą wartość tej składowej i sygnalizującej wykonywanie
podskoków. Utwórz kontener ArrayList i wstaw do niego obiekty Kangur (minimum 10). Teraz
skorzystaj z metody get() kontenera w celu przejrzenia jego zawartości i wywołania metody skok()
dla każdego umieszczonego w nim kangura.
2. Zmodyfikuj uzyskany kod tak, aby przeglądało listę (i wywoływało metodę skok()) za pomocą
iteratora.
3. Weź klasę Kangur z podpunktu 1 i umieść jej elementy w kontenerze HashMap, kojarząc każdy
egzemplarz Kangur (wartość) z nazwą ("Jacek", "Marta" itd.) w postaci obiektu String (klucz).
Pozyskaj iterator zbioru zwracanego przez keySet() i wykorzystaj go do przejrzenia kontenera
HashMap. Wypisz w konsoli imiona kangurów oraz odpowiadające im numery, zwracane poprzez
metodę skok(). 4. Wyodrębnij z kontenera HashMap (utworzonego w poprzednim podpunkcie) pary, posortuj je
według kluczy i umieść całość w kontenerze LinkedHashMap*/
    public static void zad1(){
        System.out.println("---------- ZADANIE 1 ----------");
        /*arraylist i wywołanie metody skok*/
        final int dlugosc = 10;
        ArrayList<Kangur> listaKangurow = new ArrayList<>();
        for(int i = 0; i <= dlugosc; i++){
            Kangur kangur = new Kangur(i);
            listaKangurow.add(kangur);
        }
        for(int i = 0; i < listaKangurow.size(); i++){
            Kangur kangur = listaKangurow.get(i);
            kangur.skok();
        }
        System.out.println();

        /* iterator i wywołanie metody skok */
        Iterator<Kangur> iterator = listaKangurow.iterator();
        while(iterator.hasNext()){
            Kangur kangur = iterator.next();
            kangur.skok();
        }
        System.out.println();

        /*hash map i wykorzystanie iteratora z keySet()*/
        HashMap<String, Kangur> mapaKangurow = new HashMap<>();
        mapaKangurow.put("Jacek", new Kangur(1));
        mapaKangurow.put("Anetka", new Kangur(2));
        mapaKangurow.put("Juliuszek", new Kangur(3));

        Iterator<String> iteratorKluczy = mapaKangurow.keySet().iterator();
        while(iteratorKluczy.hasNext()){
            String imie = iteratorKluczy.next();
            Kangur kangur = mapaKangurow.get(imie);
            System.out.println("imie: " + imie + ", numer kangura: " + kangur.getNrKangura());
        }

        System.out.println();

        /* linkedHashMap i sortowanie po kluczach */
        LinkedHashMap<String, Kangur> posortowanaMapa = new LinkedHashMap<>();
        mapaKangurow.entrySet()
                .stream()
                .sorted(HashMap.Entry.comparingByKey())
                .forEach(entry -> posortowanaMapa.put(entry.getKey(), entry.getValue()));

        for (String imie : posortowanaMapa.keySet()){
            Kangur kangur = posortowanaMapa.get(imie);
            System.out.println("imie: " + imie + ", nr kangura: " + kangur.getNrKangura());
            kangur.skok();
        }

    }
/*Napisz klasę o nazwie Command, która zawiera ciąg znaków String i metodę operation(), która go
wypisuje. Napisz drugą klasę, z metodą wypełniającą kolejkę Queue obiektami klasy Command i
zwracającą wypełniony kontener. Przekaż kontener do metody z trzeciej klasy: metoda ma konsumować
obiekty z kolejki Queue, wywołując dla każdego z nich metodę operation(*/
        public static void zad2(){
            System.out.println("---------- ZADANIE 2 ----------");
            ContainerFiller filler = new ContainerFiller();
            Queue<Commad> container = filler.fillContainer();

            ContainerConsumer consumer = new ContainerConsumer();
            consumer.consumeContainer(container);
        }
/*W poniższym zadaniu napiszemy własną klasę odnośnie stosu, czyli co zostanie włożone na stos jako
ostatnie jest pierwszym elementem, który można z niego zdjąć (LIFO).
1. Utwórz klasę Stos<T> zawierającą:
• zainicjowane prywatne pole LinkedList<T> stos,
• publiczne metody:
• void push(T v) - wkłada element na stos,
• T peek() - zwraca pierwszy element stosu, ale go nie usuwa,
• T pop() - zwraca pierwszy element stosu i usuwa go,
• boolean empty() - sprawdza, czy stos jest pusty,
• String toString() - wypisuje elementy naszego stosu.
2. Stosy są często używane do obliczania wyrażeń w językach programowania. Za pomocą
utworzonej klasy Stos oblicz poniższe wyrażenie, w którym '+' oznacza "umieszczenie następnej
litery na stosie", a '-' "zdjęcie szczytowego elementu stosu i wypisanie go na wyjściu".
Wyrażenie do wyliczenia: " +B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---"*/
    public static void zad3(){
        System.out.println("---------- ZADANIE 3 ----------");
        String wyrazenie = "B+a+ł---+a+g+a+n-+w-+l+i+t---+e-r+k--+a+c+h--";

        Stos<Character> stos = new Stos<>();
        StringBuilder wynik = new StringBuilder();

        for(char znak : wyrazenie.toCharArray()){
            if(znak == '+'){
                continue;
            }else if(znak == '-'){
                if (!stos.empty()){
                    wynik.append(stos.pop());}
                }else {
                stos.push(znak);
            }   }
            System.out.println("wynik: " + wynik.toString());
    }
/*Napisz prostą symulację pójścia na zakupy:
• utwórz tablicę String zawierającą 10 nazw produktów dostępnych w sklepie,
• po wejściu do sklepu zapełnij kosz (będący stosem - użyj klasy z poprzedniego zadania) losową
ilością losowych towarów (koszyk pomieści maksymalnie 15 przedmiotów),
• umieść siebie w kolejce (Queue) na losową pozycję (maksymalna ilość osób w kolejce wynosi
10),
• gdy dojdziesz do kasy wypisz produkty znajdujące się w koszyku*/
    public static void zad4(){
        System.out.println("---------- ZADANIE 4- ----------");
        String[] produkty = {"chleb","mleko","jajka","ser","masło","kawa","lody","herbata","kukurydza","pączki"};
        Stos<String> koszyk = new Stos<>();
        Random random = new Random();

        //Wypełnianie koszyka
        int iloscProduktow = random.nextInt(15) + 1; //losowa ilosc produktow od 1 do 15
        for (int i = 0; i < iloscProduktow; i++){
            int indeksProduktu = random.nextInt(produkty.length);
            koszyk.push(produkty[indeksProduktu]);
        }

        //Tworzenie kolejki
        Queue<String> kolejka = new LinkedList<>();
        int iloscOsobWKolejce = random.nextInt(10) + 1; //losowa ilosc osob od 1 do 10
        for(int i = 0; i < iloscOsobWKolejce; i++){
            kolejka.offer("Osoba " + (i+1));
        }

        //Przechodzenie do kasy
        String osobaWKolejce = kolejka.poll();
        System.out.println("Osoba " + osobaWKolejce + " podchodzi do kasy");

        //Wypisanie produktów z koszyka
        System.out.println("produkty w koszyku: ");
        while (!koszyk.empty()){
            System.out.println(koszyk.pop());
        }
    }
/*1. Napisz klasę Film zawierającą prywatne pole czasTrwania, tytul oraz czyObejrzany (wartość true
gdy film został obejrzany). Dodaj konstruktor i odpowiednie metody obsługujące pola.
2. Stwórz dwie klasy dziedziczące z klasy Film, np. Horror i Komedia. Każda z nich ma zawierać
pole finalne pole typ (wskazujące na typ filmu). Dodaj konstruktory i odpowiednie metody
obsługujące pola. Dodaj metody wypisujące wszystkie dane odnośnie filmu.
3. W głównej klasie stwórz mapę prywatnaKolekcja, gdzie kluczem będzie numer egzemplarza, a
wartością obiekt Film. Dodaj kilka elementów do utworzonej mapy.
4. Za pomocą iteratora wypisz posiadane filmy w kolekcji.
Przykład:
"Nr (nr w kolekcji), Tytul: (tytul filmu), Czas trwania: (czas), Obejrzany: (tak/nie), Typ: (gatunek
filmu*/
    public static void zad5(){
        System.out.println("---------- ZADANIE 5 ----------");
        Map<Integer,Film> prywatnaKolekcja = new HashMap<>();
        Film film1 =  new Horror(120,"Zew krwi", true);
        Film film2 =  new Komedia(90,"Nie ma mocnych", false);
        Film film3 =  new Komedia(120,"Killer", true);

        prywatnaKolekcja.put(1,film1);
        prywatnaKolekcja.put(2,film2);
        prywatnaKolekcja.put(3,film3);

        Iterator<Map.Entry<Integer,Film>> iterator = prywatnaKolekcja.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,Film> entry = iterator.next();
            int nr = entry.getKey();
            Film film = entry.getValue();
            String tytul = film.getTytul();
            int czasTrwania = film.getCzasTrwania();
            boolean czyObejrzany = film.isCzyObejrzany();

            String typ;
            if(film instanceof Horror){
                typ = ((Horror) film).getTyp();
            }else if(film instanceof Komedia){
                typ =((Komedia) film).getTyp();
            }else{
                typ = "nieznany";
            }
            System.out.println("nr (" + nr + "), tytuł: " + tytul + ", czas trwania: " + czasTrwania + " min, obejrzany: "
            + (czyObejrzany ? "tak" : "nie") + ", typ: " + typ);
        }
    }
}