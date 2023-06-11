package lab10;
import java.util.Queue;
public class ContainerConsumer {
    public void consumeContainer(Queue<Commad> container){
        while(!container.isEmpty()){
            Commad command = container.poll();
            command.operation();
        }
    }
}
