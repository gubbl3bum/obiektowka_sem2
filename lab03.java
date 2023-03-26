import java.util.Scanner;
public class lab03{
    public static void main(String[] args) {
        //punkty();
        //sumaUj();
        //ciag();
    }
    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    /*Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik). Wprowadzamy
    liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w
    grupie z wykorzystaniem pętli while*/
    public static void punkty() {
        System.out.println("\n---------- ZADANIE 1 ----------");
        System.out.print("podaj liczbe studentow: ");
        int l = inputInt();
        float wynik=0;
        for(int i=1; i<=l; i++){
            System.out.format("podaj liczbe punktow dla %d studenta: ", i);
            int k = inputInt();
            wynik = wynik + k;
        }
        wynik /= l;
        System.out.println(" ");
        System.out.format("srednia liczba punktow w grupie wynosi: %.2f ",wynik);
    }
    /*. Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości oraz sumy liczb
    ujemnych i dodatnich podanych przez użytkownika*/
    public static void sumaUj(){
        System.out.println("\n---------- ZADANIE 2 ----------");
        int sumamin = 0, sumapl=0, iloscmin = 0, iloscpl=0;
        for(int i=0; i<10; i++){
            System.out.format("podaj %d liczbe: ", i+1);
            int k = inputInt();
            if(k<0){
                sumamin = sumamin + k ;
                iloscmin++;
            }else{
                sumapl = sumapl + k;
                iloscpl++;
            }
        }
        System.out.format("liczby ujemne: suma -> %d ilosc -> %d liczby dodatnie: suma -> %d ilosc -> %d",sumamin,iloscmin,sumapl,iloscpl);
    }
    /*  Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb
    parzystych w danym ciągu */
    public static void ciag(){
        System.out.println("\n---------- ZADANIE 3 ----------");
        System.out.println("podaj ilosc liczb w ciagu: ");
        int k = inputInt();
        float suma = 0;
        for(int i=0;i<k;i++){
            System.out.format("podaj %d liczbe ciagu: ", i+1);
            int l = inputInt();
            if(l%2==0) suma = suma + l;
        }
        System.out.format("suma liczb parzystych tego ciagu wynosi %.2f",suma);
    }
    /*  Wykorzystując algorytm z zadania 5, napisz program który pozwoli użytkownikowi na
    wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym
    ciągu. */

    /* Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest
    palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np.
    kajak.*/
}