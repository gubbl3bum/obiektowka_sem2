import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class lab04 {
    public static void main(String[] args) {
        sum();
        writeArr();
        stringArr();
        str5words();
        sortNum();
        strong();
        arrComp();
    }
    public static int inputInt(){
        Scanner input  = new Scanner(System.in);
        return input.nextInt();
    }
    public static String inputString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    /*Napisz program obliczający sumę i średnią elementów tablicy z użyciem pętli for oraz for each.
Elementy do tablicy mają zostać wylosowane z dowolnego przedziały. Należy zaproponować
oddzielną metodę do losowania liczb.*/
    public static Random randFun(){
        Random rand = new Random();
        return rand;
    }
    public static void sum(){
        System.out.println("---------- EXERCISE 1 ----------\n");
        System.out.print("input list lenght: ");
        int n = inputInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            //zakresem sa liczby (0, n)
            arr[i] = randFun().nextInt(n);
        }
        int sum = 0;
        for(int i : arr){
            sum = sum + arr[i];
        }
        int ar_sum = sum/n;
        System.out.println("sum: " + sum + "\narithmetic sum: " + ar_sum);
        System.out.println("\narray: ");
        for(int i : arr){
            System.out.println(arr[i]);
        }

    }
/*2. Napisz program, który wypisze co drugi element zdefiniowanych przez Ciebie tablic. Pierwsza
tablica powinna mieć parzystą liczbę elementów, a druga nieparzystą.*/
    public static void writeArr(){
        System.out.println("\n---------- EXERCISE 2 ----------");
        int[] arrEv = new int[20];
        int[] arrOdd = new int[17];
        for(int i = 0; i < arrEv.length; i++){
            arrEv[i] = randFun().nextInt(100)+5;
        }
        System.out.println("Even numbers array: ");
        for(int i = 0; i < arrEv.length/2; i++){
            System.out.println((2*i) + " " + arrEv[2*i]);
        }
        for(int i = 0; i < arrOdd.length; i++){
            arrOdd[i] = randFun().nextInt(115)-15;
        }
        System.out.println("\nOdd numbers array: ");
        for(int i = 0; i < arrOdd.length/2 + 1; i++){
            System.out.println((2*i) + " " + arrOdd[2*i]);
        }
    }
/*3. Napisz program, w którym zdefiniujesz tablicę wartości typu String i zainicjalizujesz ją
przykładowymi wartościami. Skorzystaj z pętli for-each, aby wypisać wszystkie wartości
tablicy ze wszystkimi literami zamienionymi na wielkie. Skorzystaj z funkcjonalności
toUpperCase wartości typu String..*/
    public static void stringArr(){
        System.out.println("\n---------- EXERCISE 3 ---------");
        String[] strArr = new String[]{"example","text","to","upper","case"};
        int j = 0;
        for(String i : strArr){
            System.out.println(strArr[j].toUpperCase());
            j++;
        }
    }
/*4. Napisz program, który pobierze od użytkownika pięć słów i zapisze je w tablicy. Następnie,
program powinien wypisać wszystkie słowa, od ostatniego do pierwszego, z literami
zapisanymi od końca do początku. Dla przykładu, dla podanych słów "Ala", "ma", "kota", "i",
"psa" program powinien wypisać: "asp", "i", "atok", "am", "alA".*/
    public static void str5words(){
        System.out.println("\n---------- EXERCISE 4 ----------");
        String[] strArr = new String[5];
        for(int i = 0; i < strArr.length; i++){
            System.out.print("give " + (i+1) + " word: ");
            strArr[i] = inputString();
        }
        for(int i = (strArr.length - 1); i >= 0; i--){
            char[] charArr = strArr[i].toCharArray();
            for(int j = (charArr.length - 1); j >= 0; j--){
                System.out.print(charArr[j]);
            }
            System.out.print(" ");
        }
    }
/*5. Napisz program, który pobierze od użytkownika osiem liczb, zapisze je w tablicy, a następnie
posortuje tą tablicę rosnąco i wypisze wynik sortowania na ekran. Dla przykładu, dla liczb 10,
-2, 1, 100, 20, -15, 0, 10, program wypisze -15, -2, 0, 1, 10, 10, 20, 100. Zastanów się, jak można
posortować ciąg liczb i spróbuj zaimplementować swoje rozwiązanie. Przetestuj je na różnych
zestawach danych. Możesz też skorzystać z jednego z popularnych algorytmów sortowania, np.
sortowania przez wstawianie. Działanie algorytmu omówiono szczegółowo na zajęciach
algorytmy i struktury danych.*/
    public static void sortNum(){
        System.out.println("\n\n---------- EXERCISE 5 ----------\n");
        final int arrLen = 8;
        int[] arr = new int[arrLen];
        for(int i = 0; i < arrLen; i++){
            System.out.print("give " + (1+i) + " number: ");
            arr[i] = inputInt();
        }
        //sortowanie bąbelkowe -> parami
        System.out.println("correct order: \n");
        for(int i = 0; i < arrLen - 1; i++){
            for(int j = 0; j < arrLen - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //Arrays.sort(arr); // -> sortowanie funkcją - najprosciej bez petli, funkcja wbudowana;
        for(int i = 0; i < arrLen; i++) System.out.println(arr[i]);
    }
/*6. Napisz program, który pobierze od użytkownika pięć liczb, zapisze je w tablicy, a następnie
policzy i wypisze silnię każdej z pobranych liczb.*/
    public static void strong(){
        System.out.println("\n---------- EXERCISE 6 ----------\n");
        int arrLen = 5;
        float[] arr = new float[arrLen];
        for(int i = 0; i < arrLen; i++){
            System.out.print("give " + (i+1) + " number: ");
            arr[i] = lab02.inputFloat();
        }
        System.out.println();
        float res;
        for(int i = 0; i < arrLen; i++){
            res = strFun(arr[i]);
            System.out.print("result: " + res + " \n");
        }
    }
    public static float strFun(float f) { // deklaracja metody do znajdowania silni rekurencyjnie w Javie
        if (f <= 1) { return 1;}
        else { return f * strFun(f - 1);  }
    }
/*7. Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
który porówna obie tablice i odpowie na pytanie, czy są one takie same*/
    public static void arrComp(){
        System.out.println("\n----------- EXERCISE 7 ----------\n");
        String[] arr1 = new String[]{"1","2","3","4","5","15"};
        String[] arr2 = new String[]{"1","2","3","4","5","15"};
        //uzycie klasy Arrays z .equals -> zwraca true/false! compare zwraca wartosc 1/0
        //System.out.println("is arr1 equals to arr2: " + Arrays.equals(arr1,arr2));
        boolean res = false;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i]) res = true;
        }
        System.out.println("is arr1 equals to arr2: " + res);
    }
}