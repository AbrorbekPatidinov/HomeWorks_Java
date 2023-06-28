import java.util.Comparator;
import java.util.PriorityQueue;

public class only_practice_PriorityQueue_collection {
    public static void main(String[] args)
    {
        System.out.println();

        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String str_1, String str_2) {
                return Integer.compare(str_1.length(), str_2.length());
            }
        });

        queue.add("art");
        queue.add("cat");
        queue.add("bastard");

        System.out.println(queue);


        System.out.println();
    }
}
