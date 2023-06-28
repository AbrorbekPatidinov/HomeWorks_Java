import java.util.ArrayList;
import java.util.List;

public class only_practice_List_interface {
    static void show_items_of_List(List<Integer> integerList, boolean show_index) {
        int index = 0;
        for (int item : integerList)
            if (show_index) { System.out.println(index + ": " + item); index++;}
            else System.out.println(item);
    }
    public static void main(String[] args) {
        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerListClone = new ArrayList<>();

        integerList.add(0, 0);
        integerList.add(1, 11);
        integerList.add(2, 22);
        integerList.add(3, 33);

        integerListClone.add(0,44);
        integerListClone.add(1,55);
        integerListClone.add(2,66);
        integerListClone.add(3,77);

        System.out.println("Integer List: ");
        show_items_of_List(integerList, true);
        System.out.println();
        System.out.println("Integer List Clone: ");
        show_items_of_List(integerListClone, true);
        System.out.println();
        System.out.println("Used 'addAll' method to fusion two lists - 'integerList' and 'integerListClone': ");
        integerList.addAll(integerListClone);
        show_items_of_List(integerList, true);
        System.out.println();
        System.out.println("Used 'contains' method to check if in 'integerList' has specific object: ");
        if (integerList.contains(5)) System.out.println(true);
        System.out.println();
        System.out.println("Used 'get' method to get the given object by index or by name: ");
        System.out.println(integerList.get(4));
        System.out.println();
        System.out.println("Used 'indexOf' method to know the index of given object: ");
        System.out.println(integerList.indexOf(22));

        System.out.println();
    }
}
