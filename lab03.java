import java.util.Random;
import java.util.Scanner;
public class lab03{
    public static void main(String[] args) {
        points();
        sumNeg();
        sequence();
        palin();
        randSum();
    }
    public static int inputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    /*Grupa laboratoryjna składa się z n studentów (wartość n podaje użytkownik). Wprowadzamy
    liczbę punktów dla każdego studenta. Napisz program, który obliczy średnią liczbę punktów w
    grupie z wykorzystaniem pętli while*/
    public static void points() {
        System.out.println("\n---------- EXERCISE 1 ----------\n");
        System.out.print("input number of students: ");
        int l = inputInt();
        float wynik=0;
        for(int i=1; i<=l; i++){
            System.out.format("input number of points for %d student: ", i);
            int k = inputInt();
            wynik = wynik + k;
        }
        wynik /= l;
        System.out.println(" ");
        System.out.format("average number of points in the group is: %.2f ",wynik);
    }
    /*. Napisz program, który pozwoli na wczytanie 10 liczb i wyznaczeniu ilości oraz sumy liczb
    ujemnych i dodatnich podanych przez użytkownika*/
    public static void sumNeg(){
        System.out.println("\n---------- EXERCISE 2 ----------\n");
        int sum_min = 0, sum_pl=0, amount_min = 0, amount_pl=0;
        for(int i=0; i<10; i++){
            System.out.format("podaj %d liczbe: ", i+1);
            int k = inputInt();
            if(k<0){
                sum_min = sum_min + k ;
                amount_min++;
            }else{
                sum_pl = sum_pl + k;
                amount_pl++;
            }
        }
        System.out.format("negative numbers: sum -> %d quantity -> %d \npositic=ve numbers: sum -> %d quantity -> %d", sum_min,amount_min,sum_pl,amount_pl);
    }
    /*  Dany jest ciąg n liczb (n>0), napisz program pozwalający na obliczenie sumy wszystkich liczb
    parzystych w danym ciągu */
    public static void sequence(){
        System.out.println("\n---------- EXERCISE 3 ----------\n");
        System.out.println("enter the number of numbers in the string: ");
        int k = inputInt();
        float suma = 0;
        for(int i=0;i<k;i++){
            System.out.format("enter %d string number: ", i+1);
            int l = inputInt();
            if(l%2==0) suma = suma + l;
        }
        System.out.format("the sum of the even numbers in this sequence is: %.2f",suma);
    }
    /*  Wykorzystując algorytm z zadania 5, napisz program który pozwoli użytkownikowi na
    wylosowanie n liczb z przedziału (-10,45) i obliczy sumę wszystkich liczb parzystych w danym
    ciągu. */
    public static void randSum(){
        System.out.println("\n---------- EXERCISE 4 ----------\n");
        System.out.print("give numer of elements: ");
        int n = inputInt();
        Random rand = new Random();
        float[] arr = new float[n];
        float sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextFloat(56)-10;
            sum = sum + arr[i];
        }
        System.out.println("sum of the numbers in the sequence :" + sum);

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    /* Napisz program, który odpowie na pytanie, czy podane przez użytkownika słowo jest
    palindromem. Palindrom to słowo, które jest takie samo czytane od początku i od końca, np.
    kajak.*/
    public static void palin(){
        System.out.println("\n---------- EXERCISE 5 ----------\n");
        System.out.print("give word to analyze: ");
        String text = inputString();
        char[] charArr = text.toCharArray();
        int lengh = charArr.length;
        boolean cond = false;
        for(int i = 0; i < lengh/2; i++){
            if(charArr[i] == charArr[lengh - i - 1] ) cond = true;
        }
        System.out.println("is the given word a palindrome: " + cond);
    }
}