import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class only_practice_Queue_interface {
    public static void main(String[] args) {
        System.out.println();


        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Java");
        stringQueue.add("C/C++");
        stringQueue.add("PHP");


        System.out.println("Queue: " + stringQueue);

        stringQueue.offer("JavaScript");

        System.out.println("Queue updated: " + stringQueue);

        stringQueue.remove("JavaScript");

        System.out.println("Queue updated: " + stringQueue);

        stringQueue.poll();

        System.out.println("Queue updated: " + stringQueue);


        System.out.println("Queue updated: " + stringQueue.element());

        System.out.println("Queue updated: " + stringQueue.peek());


        System.out.println();
    }
}
