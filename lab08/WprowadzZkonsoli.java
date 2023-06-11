package lab08;
import java.util.Scanner;
import java.util.InputMismatchException;
public class WprowadzZkonsoli {
    private static Scanner scanner = new Scanner(System.in);
    public static int wprowadzInt(){
        int liczba = 0 ;
        boolean poprawnaLiczba = false;
        while(!poprawnaLiczba){
            try{
                System.out.print("wprowadz liczbe calkowita: ");
                liczba = scanner.nextInt();
                poprawnaLiczba = true;
            } catch (InputMismatchException e) {
                System.out.println("bledny format liczby. sprobuj ponownie");
                scanner.nextLine();
            }
        }
        return liczba;
    }
    public static float wprowadzFloat(){
        float liczba = 0;
        boolean poprawnaLiczba = false;
        while(!poprawnaLiczba){
            try{
                System.out.print("wprowadz liczbe rzeczywista: ");
                liczba = scanner.nextFloat();
                poprawnaLiczba = true;
            } catch (InputMismatchException e){
                System.out.println("bledny format liczby. sprobuj ponownie");
                scanner.nextLine();
            }
        }
        return liczba;
    }
    public static char wprowadzChar(){
        System.out.print("wprowadz znak: ");
        return scanner.next().charAt(0);
    }
    public static short wprowadzShort(){
        short liczba = 0;
        boolean poprawnaLiczba = false;
        while(!poprawnaLiczba){
            try{
                System.out.print("wprowadz liczbe calkowita (typu short): ");
                liczba = scanner.nextShort();
                poprawnaLiczba = true;
            } catch(IllegalArgumentException e){
                System.out.println("bledny format liczby. sprobuj ponownie");
                scanner.nextLine();
            }
        }
        return liczba;
    }
    public static long wprowadzLong(){
        long liczba = 0;
        boolean poprawnaLiczba = false;
        while(!poprawnaLiczba){
            try{
                System.out.print("wprowadz liczbe calkowita (typu long): ");
                liczba = scanner.nextLong();
                poprawnaLiczba = true;
            } catch(IllegalArgumentException e){
                System.out.println("bledny format liczby. sprobuj ponownie");
                scanner.nextLine();
            }
        }
        return liczba;
    }
    public static double wprowadzDouble(){
        double liczba = 0;
        boolean poprawnaLiczba = false;
        while(!poprawnaLiczba){
            try{
                System.out.print("wprowadz liczbe calkowita (typu double): ");
                liczba = scanner.nextDouble();
                poprawnaLiczba = true;
            } catch(IllegalArgumentException e){
                System.out.println("bledny format liczby. sprobuj ponownie");
                scanner.nextLine();
            }
        }
        return liczba;
    }
    public static String wprowadzString(){
        System.out.println("wprowadz tekst: ");
        return scanner.nextLine();
    }
}
