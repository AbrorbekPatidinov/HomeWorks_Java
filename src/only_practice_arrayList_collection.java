import java.util.*;

public class only_practice_arrayList_collection {
    static void show_items_of_arrayList_integer(ArrayList<Integer> arrayList, boolean show_index) {
        int index = 0;
        for (int item : arrayList)
           if (show_index) { System.out.println(index + ": " + item); index++; }
           else System.out.println(item);
    }
    static void show_items_of_arrayList_character(ArrayList<Character> arrayList, boolean show_index) {
       int index = 0;
       for (char item : arrayList)
          if (show_index) { System.out.println(index + ": " + item); index++; }
          else System.out.println(item);
    }
    static void show_items_of_arrayList_float(ArrayList<Float> arrayList, boolean show_index) {
       int index = 0;
       for (float item : arrayList)
          if (show_index) {System.out.println(index + ": " + item); index++; }
          else System.out.println(item);
    }
   public static void main(String[] args) {
      System.out.println();

      ArrayList<Integer> integerArrayList = new ArrayList<>();
      ArrayList<Integer> integerArrayListClone = new ArrayList<>();

      ArrayList<Character> characterArrayList = new ArrayList<>();
      characterArrayList.add(0, '$');
      characterArrayList.add(1, '#');
      characterArrayList.add(2, '&');
      characterArrayList.add(3, '%');

      ArrayList<Character> characterArrayListClone = (ArrayList<Character>) characterArrayList.clone();

      ArrayList<Float> floatArrayList = new ArrayList<>();

      integerArrayList.add(101);
      integerArrayList.add(202);
      integerArrayList.add(303);
      integerArrayList.add(404);

      integerArrayListClone.add(0, 505);
      integerArrayListClone.add(1, 606);
      integerArrayListClone.add(2, 707);
      integerArrayListClone.add(3, 808);

      floatArrayList.add(0, 3.12f);
      floatArrayList.add(1, 2.12f);
      floatArrayList.add(2, 1.12f);
      floatArrayList.add(3, 0.12f);

      integerArrayList.addAll(integerArrayListClone);
      System.out.println("Integer: ");
      show_items_of_arrayList_integer(integerArrayList, false);
      System.out.println();
      System.out.println("Replace all elements in 'integerArrayList': ");
      integerArrayList.replaceAll(element -> 0);
      System.out.println("Character: ");
      show_items_of_arrayList_character(characterArrayList, true);
      System.out.println();
      System.out.println("Character (clone): ");
      show_items_of_arrayList_character(characterArrayListClone, true);
      System.out.println();
      System.out.println("Character (show, if contains '$'): ");
      System.out.println(characterArrayList.contains('$'));
      System.out.println();
      System.out.println("Static Capacity of 'characterArrayList': ");
      System.out.println(characterArrayList.size());
      characterArrayList.ensureCapacity(10);
      System.out.println("Ensured Capacity of 'characterArrayList': ");
      System.out.println(characterArrayList.size());
      System.out.println();
      System.out.println("Get element from characterArrayList by index: ");
      System.out.println(characterArrayList.get(0));
      System.out.println();
      System.out.println("Find out index of element by object: ");
      System.out.println(characterArrayList.indexOf('%'));
      System.out.println();
      System.out.println("Find out last index of element by object: ");
      System.out.println(characterArrayList.lastIndexOf('#'));
      System.out.println();
      System.out.println("Remove the object from 'characterArrayList': ");
      System.out.println(characterArrayList.remove(0));
      System.out.println();
      System.out.println("Remove if the object from 'characterArrayList': ");
      System.out.println(characterArrayList.removeIf(object -> object.equals('&')));
      System.out.println(characterArrayList.size());
      System.out.println();
      System.out.println("Change the element of specific position 'characterArrayList': ");
      System.out.println(characterArrayList.set(1, '*'));
      show_items_of_arrayList_character(characterArrayList, true);
      System.out.println();
      System.out.println("Sorted elements of 'characterArrayList': ");
      Collections.sort(characterArrayList);
      show_items_of_arrayList_character(characterArrayList, true);
      System.out.println();
      System.out.println("Float: ");
      show_items_of_arrayList_float(floatArrayList, true);
      Collections.sort(floatArrayList);
      System.out.println();
      System.out.println("Sorted 'floatArrayList': ");
      show_items_of_arrayList_float(floatArrayList, true);
      System.out.println();

      System.out.println("Tasks: ");


      // task first practice
//      ArrayList<String> wordList = new ArrayList<>();
//      Scanner scanner = new Scanner(System.in);
//      System.out.println("Enter exit, when you want to stop: ");
//      String word;
//      while (true) {
//         word = scanner.nextLine();
//         if (word.equals("exit")) break;
//         if (!wordList.contains(word)) wordList.add(word);
//         else System.out.println("Only unique words !");
//      }
//      for (String element : wordList) System.out.println(element);

      // Task second practice
//      ArrayList<Integer> positiveNumbers = new ArrayList<>();
//      Scanner scanner1 = new Scanner(System.in);
//      System.out.println("Enter numbers dividing them by space: ");
//      String input = scanner1.nextLine();
//      String[] numbers = input.split(" ");
//      for (String number : numbers) {
//         int num = Integer.parseInt(number);
//         if (num > 0) positiveNumbers.add(num);
//      }
//      show_items_of_arrayList_integer(positiveNumbers, true);

      // Task third practice
      ArrayList<Integer> randomNumbers = new ArrayList<>();
      

   }
}


