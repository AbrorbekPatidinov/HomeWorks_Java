import java.util.ArrayList;
import java.util.List;

public class sixth_seminar_HashSetImitation {
    private final List<Integer> set;
    public sixth_seminar_HashSetImitation() {
        set = new ArrayList<>();
    }
    public void add(Integer element) {
        if (!set.contains(element)) set.add(element);
    }
    public String toString() {
        return set.toString();
    }
    public Integer getElementByIndex(int index) {
        if (index >= 0 && index < set.size()) return set.get(index);
        else throw new IndexOutOfBoundsException("Invalid Index");
    }
    public static void main(String[] args) {
        sixth_seminar_HashSetImitation hashSetImitation = new sixth_seminar_HashSetImitation();
        hashSetImitation.add(1);
        hashSetImitation.add(2);
        hashSetImitation.add(3);
        hashSetImitation.add(1);

        System.out.println(hashSetImitation.toString());
        System.out.println("Element at index 0: " + hashSetImitation.getElementByIndex(0));
    }
}
