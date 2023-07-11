import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class only_practice_Map_interface {
    public static void main(String[] args) {
        System.out.println();

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 95);
        scores.put("Bob", 80);
        scores.put("Charlie", 75);
        scores.put("Dave", 90);

        int aliceScore = scores.get("Alice");
        System.out.println("Alice Score: " + aliceScore);
        boolean hasBob = scores.containsKey("Bob");
        System.out.println("Is Bob available in Map: " + hasBob);

        scores.remove("Charlie");

        Set<String> keys = scores.keySet();
        Collection<Integer> values = scores.values();

        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + " : " + score);
        }

        for (String key : keys) {
            int score = scores.get(key);
            System.out.println(score + " : " + key);
        }
        for (Integer value : values) System.out.println(value);



        System.out.println();
    }
}
