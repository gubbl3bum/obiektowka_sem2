package lab05;
import java.util.Scanner;
public class lab05 {
    public static void main(String[] args) {
        recFun();
        cirFun();
        squFun();
        cubeFun();
        cubiodFun();
        sphFun();
        coneFun();
    }
    //scanner for double
    public static double inputDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
/*W nowym pakiecie utwórz klasy opisujące następujące figury geometryczne: Koło, Kwadrat,
Prostokąt, Sześcian, Prostopadłościan, Kula, Stożek. Dla każdej klasy dobierz odpowiednie pola.
Utwórz także metody obliczające pola figur, obwody (dla figur płaskich), oraz objętości (dla figur
przestrzennych). Dla każdej klasy utwórz metodę wyświetlającą dane dotyczące figury tj. nazwa,
parametry, wartość pola i obwodu lub objętości. Utwórz obiekty tych figur i pokaż wyniki obliczeń
przy użyciu funkcji wyświetlającej dane. Utwórz kalkulator dla figur geometrycznych tj.
odpowiednie menu pozwalające na: wybór figury geometrycznej oraz wprowadzanie parametrów
dla tej figury z konsoli. Następnie wyświetl wyniki przy użyciu metody wyświetlającej dane*/
    public static void recFun(){
        System.out.println("----------RECTANGLE----------");
        Rectangle rec = new Rectangle();
        System.out.print("give a: ");
        double a = inputDouble();
        rec.setA_rec(a);
        System.out.print("give b: ");
        double b = inputDouble();
        rec.setB_rec(b);
        rec.Area_rec();
        rec.Circut_rec();
        rec.WriteOut_rec();
    }
    public static void cirFun(){
        System.out.println("----------CIRCLE----------");
        Circle cir = new Circle();
        System.out.print("give r: ");
        double r = inputDouble();
        cir.setR(r);
        cir.Area_circ();
        cir.WriteOutC();
    }
    public static void squFun(){
        System.out.println("----------SQUARE----------");
        Square sq = new Square();
        System.out.print("give a: ");
        double a = inputDouble();
        sq.setA(a);
        sq.Area_squ();
        sq.Circut_squ();
        sq.WriteOut_squ();
    }
    public static void cubeFun(){
        System.out.println("----------CUBE----------");
        Cube cub = new Cube();
        System.out.print("give a: ");
        double a = inputDouble();
        cub.setA(a);
        cub.Area_cube();
        cub.Volume_cube();
        cub.WriteOutCu();
    }
    //prostopadloscian
    public static void cubiodFun(){
        System.out.println("----------CUBOID----------");
        Cuboid cubd = new Cuboid();
        System.out.print("give a: ");
        double a = inputDouble();
        cubd.setA(a);
        System.out.print("give b: ");
        double b = inputDouble();
        cubd.setB(b);
        System.out.print("give h: ");
        double h = inputDouble();
        cubd.setH(h);
        cubd.AreaCub();
        cubd.VolumeCuboid();
        cubd.WriteOutCubd();
    }
    public static void sphFun(){
        System.out.println("----------SPHERE----------");
        Sphere sph = new Sphere();
        System.out.print("give r: ");
        double r = inputDouble();
        sph.setR(r);
        sph.AreaSph();
        sph.VolSph();
        sph.WriteOutSph();
    }
    public static void coneFun(){
        System.out.println("----------CONE----------");
        Cone con = new Cone();
        System.out.print("give r: ");
        double r = inputDouble();
        con.setR(r);
        System.out.print("give l: ");
        double l = inputDouble();
        con.setL(l);
        System.out.print("give h: ");
        double h  = inputDouble();
        con.setH(h);
        con.AreaCone();
        con.VolCone();
        con.WriteOutCone();
    }
/* Stwórz klasę przechowującą informacje o Budynku (nazwa, rok budowy, liczba pięter). Przygotuj
metodę wyświetlającą wszystkie informacje o budynku, oraz metodę obliczającą ile lat ma budynek
(rok obecny możesz ustawić na sztywno). Stwórz kilka obiektów (budynków), ustaw im wartości i
wywołaj dla nich metody. Do obliczenia daty należy użyć klasy LocalData.*/

/* Stwórz program w którym będzie utworzonych kilka obiektów typu Gatunek. Klasa Gatunek
powinna zawierać następujące pola: nazwę rodzaju, nazwę gatunkową, liczbę chromosomów 2n,
podstawową liczbę chromosomów x, opis oraz metody: podającą pełną nazwę (Rodzaj + gatunek),
podającą haploidalną liczbę chromosomów n, wypisującą wszystkie dane, klonującą obiekt –
metoda powinna zwracać odnośnik do nowego obiektu typu Gatunek o wartościach pól takich
samych jak w obiekcie, w którym została wywołana. W programie powinny być użyte wszystkie
metody.*/
    }