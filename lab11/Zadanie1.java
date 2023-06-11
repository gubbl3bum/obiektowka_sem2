//package lab11;
//import java.io.*;
//import java.sql.SQLOutput;
//import java.util.Scanner;
//public class Zadanie1 {
//    public static void main(String[] args) throws IOException {
//
//    }
//    /*Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz kilka linijek tekstu
//(dopóki użytkownik nie wprowadzi „-” jako linijki) i zapisze je do pliku tekstowego. Do wykonania
//tego zadania może Ci się przydać metoda System.lineSeparator() zwracająca znak nowej linii (jeśli
//chciałbyś oddzielić linie wprowadzone przez użytkownika). */
//    public static void task1() throws IOException {
//        Scanner input = new Scanner(System.in);
//        FileWriter output = null;
//        String line;
//        System.out.println("podaj ścieżkę dostępu: ");
//        try {
//            output = new FileWriter(input.nextLine());
//            System.out.println("podaj zawartość pliku - koniec nastąpi po wprowadzeniu znaku '-'");
//            while (true) {
//                line = input.nextLine();
//                if (line.equals("-")) break;
//                output.write(line);
//                output.write(System.lineSeparator());
//            }
//        } finally {
//            if (output != null)
//                output.close();
//        }
//    }
//    /*Napisz program, który pobierze od użytkownika ścieżkę do pliku i wyświetli zawartość pliku na ekranie
//wraz z informacją ile linii znajduje się w pliku.*/
//    public static void task2() throws IOException {
//        Scanner input = new Scanner(System.in);
//        BufferedReader inputFile = null;
//        int numberLine = 0;
//        String line;
//        System.out.println("podaj sciezke do pliku: ");
//        try {
//            inputFile = new BufferedReader(new FileReader(input.next()));
//            System.out.println("zawartosc pliku: \n");
//            while (true) {
//                line = inputFile.readLine();
//                if (line == null) break;
//                numberLine++;
//                System.out.println(line);
//            }
//        } finally {
//            if (inputFile != null)
//                inputFile.close();
//        }
//        System.out.println("\nplik zawiera " + numberLine + " lini");
//    }
//    /*Napisz program, który poprosi od użytkownika o nazwę pliku wyjściowego oraz o podanie swojej daty
//urodzenia (osobno dzień, miesiąc i rok), a następnie zapisze te dane jako trzy osobne liczby binarnie.*/
//    public static void task3() throws IOException {
//        Scanner input = new Scanner(System.in);
//        BufferedReader inputFile = null;
//        String line;
//        System.out.println("podaj nazwe pliky wyjsciowego: ");
//        try {
//            //output = new FileWriter(input.nextLine());
//            DataOutputStream outputStream = null;
//                outputStream = new DataOutputStream(new FileOutputStream(filePath));
//                outputStream.writeInt(number);
//            } finally {
//                if (outputStream != null)
//                    outputStream.close();
//            }
//        }
    /*Napisz program, który pobierze od użytkownika ścieżkę do pliku binarnego z datą urodzenia, a
następnie wyświetli ją na ekranie. */
    //}
// "C:\Users\gubbl\IdeaProjects\labki\tekst.txt"
// "C:\Users\gubbl\IdeaProjects\labki\kupa.txt"