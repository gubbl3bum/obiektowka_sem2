package lab10;
import java.util.LinkedList;
import java.util.Queue;
public class ContainerFiller {
    public Queue<Commad> fillContainer(){
        Queue<Commad> container = new LinkedList<>();

        container.add(new Commad("command 1"));
        container.add(new Commad("command 2"));
        container.add(new Commad("command 3"));
        container.add(new Commad("command 4"));
        container.add(new Commad("command 5"));

        return container;
    }
}
