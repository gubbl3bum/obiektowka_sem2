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
    public static void punkty() {
        System.out.println("---------- ZADANIE 1 ----------");
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
    public static void sumaUj() {
        System.out.println(" ");
        System.out.println("---------- ZADANIE 2 ----------");
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
    public static void ciag(){
        System.out.println("---------- ZADANIE 3 ----------");
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
}