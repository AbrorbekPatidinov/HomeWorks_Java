import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class fourth_seminar {
    public static void main(String[] args) {
        System.out.println();

        ArrayList<String[]> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО, возраст и пол через запятую (для выхода введите 'exit'): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) break;
            String[] user = input.split(",");
            users.add(user);
            System.out.println("Данные успешно сохранены.");
        }

        while (true) {
            System.out.println("Хотите просмотреть список пользователей или отсортировать его по возрасту и полу? (s/sort/exit): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) break;
            if (input.equals("s")) {
                for (String[] user : users) {
                    System.out.printf("%s %s. %s. %s %s\n", user[0], user[1].charAt(0), user[2].charAt(0), user[3], user[4]);
                }
            }
            if (input.equals("sort")) {
                System.out.println("Введите параметр сортировки ('age' или 'age+gender'): ");
                input = scanner.nextLine();
                if (input.equals("age")) {
                    users.sort(Comparator.comparingInt(user -> Integer.parseInt(user[3])));
                } else if (input.equals("age+gender")) {
                    users.sort(Comparator.comparing((String[] user) -> user[4]).thenComparingInt(user -> Integer.parseInt(user[3])));
                } else {
                    System.out.println("Неправильный параметр сортировки.");
                    continue;
                }
                for (String[] user : users) {
                    System.out.printf("%s %s. %s. %s %s\n", user[0], user[1].charAt(0), user[2].charAt(0), user[3], user[4]);
                }
            }
        }

        System.out.println();
    }
}
