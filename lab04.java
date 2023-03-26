import java.util.Arrays;
public class lab04 {
    public static void main(String[] args) {
//zagadnienia();
    }
    public static void zagadnienia () {
        System.out.println("---------- LAB 04 ----------");
//int[] array; //->zadeklarowanie tablicy o nazwie array int
//trzeba zaalokowac pamiec dla tablicy
//arrayInt = new int[10];
        int[] array = new int[10];
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 3}; //nie trzeba wpisywac wartosci rozmiaru, program przy kompilowaniu czyta jako tablica 6 elementowa
//tablica stringow
//String arrayString = new String[]{"ala"," ma"," kota"};
//---------------------------------------inicjalizacja elementow tablicy----------------------------------------
// array[0]=1;
// array[1]=12;
// array[2]=123;
// array[3]=array[2]*array[1]; toporna deklaracja tablicy
        final int arrLen = 10; //-> zmienna juz nie do ruszenia
        int[] array2 = new int[arrLen];
// for(int i=0; i
// System.out.print(array1[i]+" ");
// }
//------------------------------sprawdzenie dlugosci tablicy -> nazwa_tab.lenght--------------------------------
//---------------------definicja iteratora ktory bierze kazdy element tablicy/struktury-------------------------
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        char[] arrayChar = new char[]{'j', 'a', 'v', 'a'}; //tablica znakow
        String tablicaString = new String(arrayChar);//przeksztalcenie tablicy znakow na string!
        System.out.println(tablicaString);
        String[] arrayString = new String[]{"jeden ", "dwa plus jeden", "trzy"};
        System.out.println("dlugosc tablicy: " + arrayString.length); //dlugosc tablicy/pojemnika
        System.out.println("dlugosc slowa: " + tablicaString.length()); //dlugosc pojemnika/sprawdzenie ile elementow ma napis
//-----------------------------------------tablice wielowymiarowe-----------------------------------------------
        int[][] matrixB = new int[3][4];
        int[][][] data = new int[2][3][1];
        int[][] matrixA = {
                {1, 2, 3}, //wartosci 0 indeksu
                {2, 3}, //wartosci 1 indeksu
                {2, 3, 4, 5, 6, 7, 8, 5, 3},
                {1},
        }; //inicjalizacja tablicy wielowymiarowej z wartosciami
//tablice moga miec rozne dlugosci!!!
        for(int i = 0; i< matrixA.length; i++){
            for (int j = 0; j< matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        } System.out.println();
        for(int[] innerArray : matrixA){
            for(int data1 : innerArray){
                System.out.print(data1+" ");
            }
            System.out.println();
        }
        System.out.println();
//drukowanie tablicy 3-wymiarowej
        for(int[][] inner2DrArray : data){
            for(int[] data1 : inner2DrArray){
                for(int item: data1){
                    System.out.println(item+" ");
                }
            }
            System.out.println();
        }
//-------------------------------------------- KLASA ARRAYS ------------------------------------------------
        int[] data1 = {1,2,3,45};
        System.out.println(Arrays.toString(data1)); //tablica przekonwertowana na stringa -> bierze każdy poszczególny element i przerzuca na stringa
        System.out.println();
//ppm -> go to -> declaration or usages //ctrl + b
        int[] data2 = new int[10];
        Arrays.fill(data2,2); //automatyczne wypelnienie jedna wartoscia
        System.out.println(Arrays.toString(data2));
        int[] data3 = {1,2,3};
        int[] data4 = {1,3,3};
        System.out.println("wynik equals: "+Arrays.equals(data3,data4)); //zwraca true/false -> czy tablice są rowne
        System.out.println("wynik compare: "+Arrays.compare(data3,data4)); //definiuje czy data3 jest rowny data4: rozne -> zwraca -1 te same -> zwraca 0
        System.out.println();
//----------------------------------------------------------------------------------------------------------
        String tekst = "to jest tekst do podzialu na tablice";
        String[] tekst_array= tekst.split(" "); //dzieli na pojemnik po regex(regular expression) -> tu po spacji
// wyjdzie 7 elementow w tablicy
        String tekscior = "to jest";
        String[] tekst_arr= tekscior.split(" ");
        String[] copyTekst_Array = new String[2];
        System.arraycopy(tekst_arr,0,copyTekst_Array,0,tekst_arr.length);
        String[] tab1 = Arrays.copyOfRange(tekst_arr,0,tekst_arr.length);
        char[] charArr = tekst.toCharArray();
        System.out.println(charArr);
    }

}