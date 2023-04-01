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
        buildingFun();
        species();
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
    public static void buildingFun(){
    Building buld1 = new Building();
    buld1.setBuld_floors(5);
    buld1.setBuld_name("Bulding of University");
    buld1.setBuld_year(2002);
    buld1.WriteOutBuld();
    buld1.YearCalc();

    Building buld2 = new Building();
    buld2.setBuld_floors(6);
    buld2.setBuld_name("Shopping Centre SZOP.PL");
    buld2.setBuld_year(2015);
    buld2.WriteOutBuld();
    buld2.YearCalc();

    Building buld3 = new Building();
    buld3.setBuld_floors(2);
    buld3.setBuld_name("Museum of Used Keyboards");
    buld3.setBuld_year(2018);
    buld3.WriteOutBuld();
    buld3.YearCalc();

    Building buld4 = new Building();
    buld4.setBuld_floors(3);
    buld4.setBuld_name("Sports Hall in Middle Town");
    buld4.setBuld_year(2022);
    buld4.WriteOutBuld();
    buld4.YearCalc();

    Building buld5 = new Building();
    buld5.setBuld_floors(6);
    buld5.setBuld_name("Garages for rent");
    buld5.setBuld_year(1988);
    buld5.WriteOutBuld();
    buld5.YearCalc();
    }
/* Stwórz program w którym będzie utworzonych kilka obiektów typu Gatunek. Klasa Gatunek
powinna zawierać następujące pola: nazwę rodzaju, nazwę gatunkową, liczbę chromosomów 2n,
podstawową liczbę chromosomów x, opis oraz metody: podającą pełną nazwę (Rodzaj + gatunek),
podającą haploidalną liczbę chromosomów n, wypisującą wszystkie dane, klonującą obiekt –
metoda powinna zwracać odnośnik do nowego obiektu typu Gatunek o wartościach pól takich
samych jak w obiekcie, w którym została wywołana. W programie powinny być użyte wszystkie
metody.*/
    public static void species(){
        Species spec1 = new Species();
        spec1.setName("Cat");
        spec1.setSpecies_name("Felis catus");
        spec1.setDescr("Only domesticated species in the family Felidae and is commonly reffered to as domestic cat or house cat to distinguish it from the wild members of the family");
        spec1.setChromosome_2n(19);
        spec1.setBasic_chrom_x(1);
        spec1.WriteOut_chrom();
        spec1.WriteOut_name();
        spec1.WriteOut_full();
        Species spec1_copy = spec1.copy();

        Species spec2 = new Species();
        spec2.setName("Dog");
        spec2.setSpecies_name("Canis familiaris");
        spec2.setDescr("Domesticated descendant of the wolf. Also called the domestic dog, it is derived from the extinct Pleistocene wolf, and the modern wolf is the dog's nearest living relative.");
        spec2.setChromosome_2n(39);
        spec2.setBasic_chrom_x(2);
        spec2.WriteOut_name();
        spec2.WriteOut_chrom();
        spec2.WriteOut_full();

        Species spec2_copy = spec2.copy();
        spec2_copy.WriteOut_name();
        spec2_copy.WriteOut_chrom();
        spec2_copy.WriteOut_full();


        Species spec3 = new Species();
        spec3.setName("Rabbit");
        spec3.setSpecies_name("Oryctolagus cuniculus");
        spec3.setDescr("Domesticated descendant of the wolf. Also called the domestic dog, it is derived from the extinct Pleistocene wolf, and the modern wolf is the dog's nearest living relative.");
        spec3.setChromosome_2n(22);
        spec3.setBasic_chrom_x(2);
        spec3.WriteOut_name();
        spec3.WriteOut_chrom();
        spec3.WriteOut_full();

        Species spec4 = new Species();
        spec4.setName("Canary");
        spec4.setSpecies_name("Serinus canaria");
        spec4.setDescr("Domesticated descendant of the wolf. Also called the domestic dog, it is derived from the extinct Pleistocene wolf, and the modern wolf is the dog's nearest living relative.");
        spec4.setChromosome_2n(20);
        spec4.setBasic_chrom_x(1);
        spec4.WriteOut_name();
        spec4.WriteOut_chrom();
        spec4.WriteOut_full();
    }
    }