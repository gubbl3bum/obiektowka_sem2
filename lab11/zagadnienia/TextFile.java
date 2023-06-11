package lab11.zagadnienia;
//importy
import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;
public class TextFile {
    //odczyt z pliku txt
    public void ReadFile() throws IOException {
        //trzeba wychwycić wyjątki!!
        File file = new File("test.txt"); //utworzyć plik w katalogu projektu albo dać pełną ścieżkę dostępu!!
        Scanner in = new Scanner(file);
        String text = in.nextLine();
        System.out.println(text);
    }
    public void SaveFile() throws IOException{
        PrintWriter zapis = new PrintWriter("test.txt");
        zapis.println("Ala ma kota.");
        zapis.close(); //zawsze zamknięcie zapisanego danego elementu!!
    }
    public void SaveFileWriter() throws IOException{
        String filePath = "test.txt"; //przechowanie nazwy/ścieżki dostępu
        int numer = 123;
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(filePath);
            fileWriter.write(Integer.toString(numer));
        }finally{
            if((filePath!=null))
                fileWriter.close(); //zabezpieczenie zeby byl plik otwarty
        }
    }
    public int ReadBuffFile() throws  IOException{
        String filePath = "test.txt";
        int number = 0;
        BufferedReader fileReader = null; //klasa pozwalająca na odczytanie danych
        try{
            fileReader = new BufferedReader(new FileReader(filePath));
            String numberAsString = fileReader.readLine();
            number = Integer.parseInt(numberAsString);
        }finally{
            if((filePath!=null))
                fileReader.close();
        }
        return number;
    }
}