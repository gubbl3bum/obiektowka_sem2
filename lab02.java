import java.util.Scanner;
public class lab02 {
    public static void main(String[] args) {
        Delta();
        kalkulator();
        tablice();
        alg();
        wylaczenie();
        calkowite();
    }
    public static float inputFloat() {
        Scanner input = new Scanner(System.in);
        return input.nextFloat();
    }
    public static void Delta() {
        System.out.println("---------- ZADANIE 1 ----------");
        System.out.print("podaj liczbe a : ");
        float a = inputFloat();
        System.out.print("podaj liczbe b : ");
        float b = inputFloat();
        System.out.print("podaj liczbe c : ");
        float c = inputFloat();
        if(a!=0){
            double wyroznik = (b*b)-4*(a*c);
            if(wyroznik!=0 && wyroznik>0){
                System.out.print("wyroznik delta wynosi ");
                System.out.println(wyroznik);
                double x1 = ((-1*b+Math.sqrt(wyroznik))/2*a);
                double x2 = ((-1*b-Math.sqrt(wyroznik))/2*a);
                System.out.print("pierwiastki trojmianu to x1 = ");
                System.out.print(x1);
                System.out.print(" x2 = ");
                System.out.println(x2);
            }else if(wyroznik == 0){
                double x3 = (-1*b)/2*a;
                System.out.print("pierwiastek trojmianu to x1 = ");
                System.out.println(x3);
            }else{
                System.out.println("podany trojmian kwadratowy nie ma pierwiastkow");
            }
        }else{
            System.out.println("podane dane nie spelniaja warunku trojmianu kwadratowego (a musi byc rozne od 0!!)");
        }
    }
    public static void kalkulator() {
        System.out.println("--------- ZADANIE 2 ----------");
        menu();
    }
    public static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("1. suma");
        System.out.println("2. roznica");
        System.out.println("3. iloczyn");
        System.out.println("4. iloraz");
        System.out.println("5. potega");
        System.out.println("6. pierwiastek");
        System.out.println("7. wartosci funkcji trygonometrycznych");
        System.out.print("podaj wartosc kata (miara lukowa): ");
        float k = inputFloat();
        double rad = Math.toRadians(k);
        do{
            System.out.print("wybierz opcje (1-7): ");
            int o = (int) inputFloat();
            switch (o) {
                case 1 -> Suma(rad);
                case 2 -> Roznica(rad);
                case 3 -> Iloczyn(rad);
                case 4 -> Iloraz(rad);
                case 5 -> Potega(rad);
                case 6 -> Pierwiastek(rad);
                case 7 -> Wartosci(rad);
                default -> System.out.println("wybrano zla opcje :(");
            }
        }while(Run());
    }
    public static double f_sin(double rad){
        double sinus = Math.sin(rad);
        return sinus;
    }
    public static double f_cos(double rad){
        double  cosinus = Math.cos(rad);
        return cosinus;
    }
    public static double f_tan(double rad){
        double k = Math.toDegrees(rad);
        double tangens = Math.tan(rad);

        if(k==90){ return 0; }
        else return tangens;
    }
    public static double f_cot(double rad){
        if(rad == 0) {
            return 0;
        }else{
        double cotangens= 1/Math.tan(rad);
        return cotangens;}
    }
    public static boolean Run(){
        System.out.println();
        System.out.print("czy chcesz kontynuowac dzialanie programu? (1 - TAK 0 - NIE) : ");
        float odp = inputFloat();
        return odp != 0;
    }
    public static int Functions(){
        System.out.println("dla jakich funkcji maja byc wykonane dzialania? : (prosze podac dwie)");
        System.out.println("1 - sinus");
        System.out.println("2 - cosinus");
        System.out.println("3 - tangens");
        System.out.println("4 - cotangens");
        int e = lab03.inputInt();
        return e;
    }
    public static int Functions1(){
        System.out.println("dla jakich funkcji maja byc wykonane dzialania? : (prosze podac jedna)");
        System.out.println("1 - sinus");
        System.out.println("2 - cosinus");
        System.out.println("3 - tangens");
        System.out.println("4 - cotangens");
        int e = lab03.inputInt();
        return e;
    }
    public static void Suma(double rad){
        double suma;
        switch(Functions()) {
            case 12, 21:
                suma = f_sin(rad) + f_cos(rad);
                break;
            case 13, 31:
                suma = f_sin(rad) + f_tan(rad);
                break;
            case 14, 41:
                suma = f_sin(rad) + f_cot(rad);
                break;
            case 23, 32:
                suma = f_cos(rad) + f_tan(rad);
                break;
            case 34, 43:
                suma = f_tan(rad) + f_cot(rad);
                break;
            case 24, 42:
                suma = f_cos(rad) + f_cot(rad);
                break;
            default: suma = 0;
        }
        System.out.print("suma funkcji trygonometrycznych wynosi: "+ suma);
        System.out.println(" ");
    }
    public static void Roznica(double rad){
        double roznica;
        switch(Functions()) {
            case 12, 21:
                roznica = f_sin(rad) - f_cos(rad);
                break;
            case 13, 31:
                roznica = f_sin(rad) - f_tan(rad);
                break;
            case 14, 41:
                roznica = f_sin(rad) - f_cot(rad);
                break;
            case 23, 32:
                roznica = f_cos(rad) - f_tan(rad);
                break;
            case 34, 43:
                roznica = f_tan(rad) - f_cot(rad);
                break;
            case 24, 42:
                roznica = f_cos(rad) - f_cot(rad);
                break;
            default: roznica = 0;
        }
        System.out.print("roznica funkcji trygonometrycznych wynosi: " +  roznica);
        System.out.println(" ");
    }
    public static void Iloczyn(double rad){
        double ilocz;
        switch(Functions()) {
            case 12, 21:
                ilocz = f_sin(rad) + f_cos(rad); break;
            case 13, 31:
                ilocz = f_sin(rad) + f_tan(rad); break;
            case 14, 41:
                ilocz = f_sin(rad) + f_cot(rad); break;
            case 23, 32:
                ilocz = f_cos(rad) + f_tan(rad); break;
            case 34, 43:
                ilocz = f_tan(rad) + f_cot(rad); break;
            case 24, 42:
                ilocz = f_cos(rad) + f_cot(rad); break;
            default: ilocz = 0;
        }
        System.out.print("iloczyn funkcji trygonometrycznych wynosi: " + ilocz);
        System.out.println(" ");
    }
    public static void Iloraz(double rad){
        double ilor = 0;
        switch(Functions()) {
            case 12: ilor = f_sin(rad) / (f_cos(rad));
                    break;
            case 13: if(f_tan(rad) != 0) ilor = f_sin(rad) / (f_tan(rad));
                    break;
            case 14: if(f_cot(rad) != 0) ilor = f_sin(rad) / (f_cot(rad));
                    break;
            case 21: ilor = f_cos(rad) / (f_sin(rad));
                    break;
            case 23: if(f_tan(rad)!=0) ilor = f_cos(rad) / (f_tan(rad));
                    break;
            case 24: if(f_cot(rad)!=0) ilor = f_cos(rad) / (f_cot(rad));
                    break;
            case 31: ilor = f_tan(rad) / (f_sin(rad));
                    break;
            case 32: ilor = f_tan(rad) / (f_cos(rad));
                    break;
            case 34: if(f_cot(rad)!=0)ilor = f_tan(rad) / (f_cos(rad));
                    break;
            case 41: ilor = f_cot(rad) / (f_sin(rad));
                    break;
            case 42: ilor = f_cot(rad) / (f_cos(rad));
                    break;
            case 43: if(f_tan(rad)!=0)ilor = f_cot(rad) / (f_tan(rad));
                    break;
            default: //ilor = 0;
        }
        System.out.print("iloraz funkcji trygonometrycznych wynosi: "+ ilor);
        System.out.println(" ");
    }
    public static void Potega(double rad){
        double pow, function;
        switch(Functions1()) {
            case 1: function = f_sin(rad);
                    pow = Math.pow(2, function);
                    break;
            case 2: function = f_cos(rad);
                    pow = Math.pow(2, function);
                    break;
            case 3: function = f_tan(rad);
                    pow = Math.pow(2, function);
                    break;
            case 4: function = f_cot(rad);
                    pow = Math.pow(2, function);
                    break;
            default: pow = 0;
        }
        System.out.print("potegowanie funkcji trygonometrycznej wynosi: " + pow);
        System.out.println(" ");
    }
    public static void Pierwiastek(double rad){
        double pierw = 0;
        switch(Functions1()){
            case 1: pierw = Math.sqrt(f_sin(rad));
                    break;
            case 2: pierw = Math.sqrt(f_cos(rad));
                    break;
            case 3: pierw = Math.sqrt(f_tan(rad));
                    break;
            case 4: pierw = Math.sqrt(f_cot(rad));
                    break;
            default: ;
        }
        System.out.print("pierwiastek funkcji trygonometrycznej wynosi: " + pierw);
        System.out.println(" ");
    }
    public static void Wartosci(double rad){
        System.out.format("wartosci funkcji to: sin -> %.2f  cosin -> %.2f tang ->  %.2f cotang -> %.2f", f_sin(rad), f_cos(rad), f_tan(rad), f_cot(rad));
    }
    /* Napisz program umożliwiający wprowadzanie 10-ciu liczb rzeczywistych do tablicy. Następnie
utwórz następujące funkcjonalności używając pętli for:
• Wyświetlanie tablicy od pierwszego do ostatniego indeksu.
• Wyświetlanie tablicy od ostatniego do pierwszego indeksu.
• Wyświetlanie elementów o nieparzystych indeksach.
• Wyświetlanie elementów o parzystych indeksach.
Wyniki działania algorytmów wyświetlaj na konsoli. Dla wyboru powyższych funkcjonalności
programu utwórz odpowiednie menu. Do obsługi menu użyć rozbudowanej konstrukcji else-if oraz pętli
do-while*/
    public static void tablice(){
        System.out.println("---------- ZADANIE 3 ----------");
        menu1();
    }
    public static float[] array_input(){
        int arrLeng = 10;
        float[] array_1 = new float[arrLeng];
        for(int i = 0; i < arrLeng; i++){
            System.out.print("podaj " + (i+1) + " element tablicy: ");
            array_1[i] = inputFloat();
        }
        return array_1;
    }
    public static void menu1(){
        float[] arr = array_input();
        float choice = 0;
        do{
            System.out.println("---------- MENU ----------");
            System.out.println("\n\n1. wyswietlanie tablicy od pierwszego do ostatniego indeksu");
            System.out.println("2. wyswietlanie tablicy od ostatniego do pierwszego indeksu");
            System.out.println("3. wyswietlanie elementow o nieparzystych indeksach");
            System.out.println("4. wyswietlanie elementow o parzystych elementach");
            System.out.println("5. wyjscie z programu");
            System.out.println("wybrana opcja: ");
            choice = inputFloat();
            if(choice == 1){
                viev_arr_corr_ord(arr);}
            else if(choice == 2) {
                viev_arr_incorr_ord(arr);}
            else if(choice == 3){
                view_uneven(arr);}
            else if(choice == 4){
                view_even(arr);}
            else if(choice == 5){
                System.out.println("wybrano wyjscie z programu");}
            else {
                System.out.println("nieprawidlowy choice, sprobuj ponownie\n");
            }
        }while(choice !=5);
    }
    public static void viev_arr_corr_ord(float[] array_1){
        System.out.println("wynik: ");
        for(int i = 0; i < array_1.length; i++){
            System.out.println( i + " element tablicy: " + array_1[i] );
        }
    }
    public static void viev_arr_incorr_ord(float[] array_1){
        System.out.println("wynik: ");
        for( int i = array_1.length-1; i >=0 ; i--){
            System.out.println( i + " element tablicy: " + array_1[i]);
        }
    }
    public static void view_even(float[] array_1){
        System.out.println("wynik: ");
        for(int i = 0; i< array_1.length; i++){
            if(i%2 == 0){
                System.out.println( i + " element tablicy: " + array_1[i]);
            }
        }
    }
    public static void view_uneven(float[] array_1){
        System.out.println("wynik: ");
        for(int i = 0; i< array_1.length; i++){
            if(i%2 == 1){
                System.out.println( i + " element tablicy: " + array_1[i]);
            }
        }
    }
    /*. Napisz program umożliwiający wprowadzanie 10-ciu liczb. Dla wprowadzonych liczb wykonaj
odpowiednie algorytmy:
• oblicz sumę elementów tablicy,
• oblicz iloczyn elementów tablicy,
• wyznacz wartość średnią,
• wyznacz wartość minimalną,
• wyznacz wartość maksymalną.
Wyniki działania algorytmów wyświetlaj na konsoli. Utwórz odpowiednie menu.*/
    public static void alg(){
        System.out.println("---------- ZADANIE 4 ---------");
        float[] tab = array_input();
        menu_4(tab);
    }
    public static void menu_4(float[] tab){
        float choice = 0;
        do{
            System.out.println("---------- MENU ----------");
            System.out.println("\n\n1. suma elementow tablicy");
            System.out.println("2. iloczyn elementow tablicy");
            System.out.println("3. wyznaczenie wartosci sredniej");
            System.out.println("4. wyznaczenie wartosci minimalnej");
            System.out.println("5. wyznaczenie wartosci maksymalnej");
            System.out.println("6. wyjscie z programu");
            System.out.println("wybrana opcja: ");
            choice = inputFloat();
            if(choice == 1){
               sum(tab);}
            else if(choice == 2) {
               product(tab);}
            else if(choice == 3){
              av_value(tab);}
            else if(choice == 4){
              min_value(tab);}
            else if(choice == 5){
              max_value(tab);}
            else if(choice == 6){
                System.out.println("wybrano wyjscie z programu");}
            else {
                System.out.println("nieprawidlowy wybor, sprobuj ponownie\n");
            }
        }while(choice !=6);
    }
    public static void sum(float[] tab){
        float sum_arr=0;
        for(int i = 0; i< tab.length; i++){
            sum_arr=sum_arr+tab[i];
        }
        System.out.print("suma elementow tablicy wynosi: " + sum_arr +"\n");
    }
    public static void product(float[] tab){
        float product_arr=1;
        for(int i = 0; i < tab.length; i++){
            product_arr=product_arr*tab[i];
        }
        System.out.print("iloczyn elementow tablicy wynosi: " + product_arr +"\n");
    }
    public static void av_value(float[] tab){
        float aver_val = 0;
        for(int i = 0; i < tab.length; i++){
            aver_val = aver_val + tab[i];
        }
        aver_val = aver_val/tab.length;
        System.out.println("srednia wartosc elementow tablicy wynosi: " + aver_val + "\n");
    }
    public static void min_value(float[] tab){
        float minim_val = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(minim_val > tab[i]){
                minim_val = tab[i];
            }
        }
        System.out.print("minimlna wartosc tablicy wynosi: " + minim_val + "\n");
    }
    public static void max_value(float[] tab){
        float maxi_value = tab[0];
        for(int i = 0; i < tab.length; i++){
            if(maxi_value < tab[i]){
                maxi_value = tab[i];
            }
        }
        System.out.print("maksymalna wartosc tablicy wynosi: " + maxi_value + "\n");
    }
    public static void wylaczenie(){
        System.out.println("---------- ZADANIE 5 ----------");
        for(int i = 20; i>=0; i--){
            if (i==2 || i==6 || i==9 || i==15 || i==19){
                continue;
            }
            System.out.println(i);
        }
    }
    public static void calkowite(){
        System.out.println("---------- ZADANIE 6 ----------");
        while(true){
            System.out.print("podaj liczbe calkowita: ");
            float c  = inputFloat();
            if(c<0) break;
        }
    }
}