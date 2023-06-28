import java.util.Iterator;
import java.util.LinkedList;

public class only_practice_LinkedList_collection {
    static void show_items_of_LinkedList_integer(LinkedList<Integer> linkedList, boolean show_index) {
        int index = 0;
        for (int element : linkedList)
            if (show_index) { System.out.println(index + ": " + element); index++; }
            else System.out.println(element);
    }
    public static void main(String[] args) {
        System.out.println();

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(0, 11);
        integerLinkedList.add(1, 22);
        integerLinkedList.add(2, 33);
        integerLinkedList.add(3, 44);


        show_items_of_LinkedList_integer(integerLinkedList, true);
        System.out.println();
        System.out.println("Used 'get' method to get the element from 'integerLinkedList': ");
        System.out.println(integerLinkedList.get(2));
        System.out.println();
        System.out.println("Used 'peek' method to get the first element from 'integerLinkedList': ");
        System.out.println(integerLinkedList.peek());
        System.out.println();
        System.out.println("Used 'element' method to get the first element from 'integerLinkedList'," +
                " if list is empty, returns 'NoSuchElementException' exception: ");
        System.out.println(integerLinkedList.element());
        System.out.println();
        System.out.println("Used 'iterator()' method to work with element within 'integerLinkedList': ");
        Iterator<Integer> iterator = integerLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        System.out.println("Used 'descendingIterator()' method to work with element within 'integerLinkedList': ");
        Iterator<Integer> iterator1 = integerLinkedList.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();
        System.out.println("Used 'listIterator()' method to work with element within 'integerLinkedList': ");
        Iterator<Integer> iterator2 = integerLinkedList.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }


        System.out.println();
    }
}
