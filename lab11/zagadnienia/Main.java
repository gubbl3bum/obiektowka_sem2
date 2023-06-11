package lab11.zagadnienia;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        /*TextFile textFile = new TextFile();

        textFile.ReadFile();
        textFile.SaveFile();
        textFile.ReadFile();
        textFile.SaveFileWriter();
        */

        int number = 123123;
        String pathName1 = "textBinary.bin";
        BinaryFile binaryFile = new BinaryFile();
        binaryFile.writeBinaryFile(pathName1, number);
        System.out.println();

    }

}
