package zagadnienia;
import java.util.*;

public class lab09 {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<String>();
        listStrings.add("one");
        listStrings.add("two");
        listStrings.add("three");
        listStrings.add("four");
        List<Number> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(new Integer(123));
        linkedNumbers.add(new Float(125.5));
        linkedNumbers.add(new Double(299.998));
        linkedNumbers.add(new Long(67000));
        /* get(<indeks>) -> pobranie elementu z listy przez podanie indeksu, na ktorym znajduje sie element (numerowane od zera!)*/
        String element = listStrings.get(1);
        Number number = linkedNumbers.get(3);
        System.out.println(element);
        System.out.println(number);
        /*set(<indeks>,<obiekt>) -> aktualizuje element w danej pozycji listy, zastępuje ten element*/
        listStrings.set(3, "hello java :D");
        element = listStrings.get(3);
        System.out.println(element);
        /*remove(<indeks>) -> usuwa element w danej pozycji listy*/

        /*przeglądanie zawartości listy - iterator przegląda listę dopóki po danym elemencie występuje kolejny element*/
        System.out.println("wyswietlenie zawartosci listy iteratorem");
        Iterator<Number> someNumbersIterator = linkedNumbers.iterator();
        while(someNumbersIterator.hasNext()){
            System.out.println(someNumbersIterator.next());
        }
        System.out.println("\nwyswietlenie zawartosci listy foreachem");
        for(Number number1 : linkedNumbers){
            System.out.println(number1);
        }
/* SETY -> zbiory, bez duplikatow elementow, nie odwolujesz sie po pozycji, moga by sortowalne lub nie*/
/* mozna latwo odfiltrować duplikaty */
        Set<Object> listAnything = new HashSet<Object>();
        Set<Integer> listNumbers = new HashSet<Integer>();
        Set<String> linkedWords = new LinkedHashSet<String>();
        Set<String> sortedWords = new TreeSet<String>();

        Set<String> strings = new HashSet<String>();
        strings.add("One");
        strings.add("two");
        strings.add("three");

        Set<Number> linkedNumber = new LinkedHashSet<>();
        linkedNumber.add(new Integer(123));
        linkedNumber.add(new Float(3.1415));
        linkedNumber.add(new Double(123456));
        linkedNumber.add(new Long(6700));
/*LinkedHashSet zapewnia kolejność -> podczas przeglądania zbioru otrzymamy elementy zgodnine z kolejnością ich dodawania*/
        strings.remove("one");

        System.out.println("\nprzegladanie zawartosci seta while");
        Iterator<Number> setIterator = linkedNumber.iterator();
        while(setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println("\nprzegladanie zawartosci seta foreach");
        for(Number number2 : linkedNumber){
            System.out.println(number2);
        }
    }
}
