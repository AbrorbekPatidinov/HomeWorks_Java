import java.util.*;

public class first_seminar {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001); // генерация случайного числа от 0 до 2000
        int n = findMSB(i); // поиск номера старшего значащего бита
        int[] m1 = findMultiples(i, n); // поиск кратных n чисел в диапазоне от i до Short.MAX_VALUE
        int[] m2 = findNotMultiples(n, i); // поиск некратных n чисел в диапазоне от Short.MIN_VALUE до i
        System.out.println("Выпало число i = " + i);
        System.out.println("Номер старшего значащего бита числа i = " + n);
        System.out.println("Кратные " + n + " числа от " + i + " до " + Short.MAX_VALUE + ": " + Arrays.toString(m1));
        System.out.println("Некратные " + n + " числа от " + Short.MIN_VALUE + " до " + i + ": " + Arrays.toString(m2));
    }

    // метод для нахождения номера старшего значащего бита в двоичном представлении числа
    public static int findMSB(int num) {
        int msb = 0;
        while (num > 0) {
            msb++;
            num >>= 1;
        }
        return msb;
    }

    // метод для поиска кратных n чисел в диапазоне от start до Short.MAX_VALUE
    public static int[] findMultiples(int start, int n) {
        int[] multiples = new int[Short.MAX_VALUE / n - start / n + 1];
        int index = 0;
        for (int i = start; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                multiples[index++] = i;
            }
        }
        return multiples;
    }

    // метод для поиска некратных n чисел в диапазоне от Short.MIN_VALUE до stop
    public static int[] findNotMultiples(int n, int stop) {
        int[] notMultiples = new int[stop / n - Short.MIN_VALUE / n + 1];
        int index = 0;
        for (int i = Short.MIN_VALUE; i <= stop; i++) {
            if (i % n != 0) {
                notMultiples[index++] = i;
            }
        }
        return notMultiples;
    }
}


