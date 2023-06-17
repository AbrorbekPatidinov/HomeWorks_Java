import java.util.ArrayList;

public class third_seminar {
   public static void main(String[] args)
   {
       System.out.println();

       ArrayList<Integer> integerArrayList = new ArrayList<>();
       integerArrayList.add(0, 5);
       integerArrayList.add(1, 10);
       integerArrayList.add(2, 15);
       integerArrayList.add(3, 20);
       integerArrayList.add(4, 25);

       // First
       integerArrayList.removeIf(item -> item % 2 == 0);
       for (Integer item : integerArrayList) {
           System.out.println(item);
       }

       // Second
       int minValue = integerArrayList.get(0);
       for (int current : integerArrayList) {
           if (current < minValue) {
               minValue = current;
           }
       }
       System.out.println("Минимальное значение: " + minValue);

       // Third
       int maxValue = integerArrayList.get(0);
       for (int current : integerArrayList) {
           if (current > maxValue) {
               maxValue = current;
           }
       }
       System.out.println("Максимальное значение: " + maxValue);

       // Fourth
       int sum = 0;
       for (int item : integerArrayList) {
           sum += item;
       }

       int average = (int) sum / integerArrayList.size();
       double average_in_double = (double) sum / integerArrayList.size(); // если хотите узнать точную
       System.out.println("Среднее значение: " + average);
       System.out.println("Среднее значение, без округление: " + average_in_double); // если хотите узнать точную

       System.out.println();
   }
}
