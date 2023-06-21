import java.util.*;

public class only_practice {
    static void show_items_of_arrayList(ArrayList<Integer> arrayList) {
        for (Integer item : arrayList) {
            System.out.println(item);
        }
    }
   public static void main(String[] args)
   {
      System.out.println();

      ArrayList<Integer> integerArrayList = new ArrayList<>();
      integerArrayList.add(0, 101);
      integerArrayList.add(1, 303);
      integerArrayList.add(2, 505);

      show_items_of_arrayList(integerArrayList);

      integerArrayList.remove(2);

      show_items_of_arrayList(integerArrayList); 

      System.out.println();
   }
}
