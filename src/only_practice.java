public class only_practice {
   public static void main(String[] args)
   {
      System.out.println();

      String str = "";
      StringBuilder stringBuilder = new StringBuilder();

      long start = System.currentTimeMillis();
      for (int i = 0; i < 1000; i++) {
         str += Character.getName(i);
      }

      System.out.println("String result: " + (System.currentTimeMillis() - start));

      for (int i = 0; i < 1000; i++) {
         stringBuilder.append(Character.getName(i));
      }

      System.out.println();
   }
}
