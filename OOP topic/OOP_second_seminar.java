import java.util.ArrayList;
import java.util.List;

public class OOP_second_seminar {
    public static void main(String[] args)
    {
        System.out.println();

        List<Character> first_list = new ArrayList<>();
        List<Character> second_list = new ArrayList<>();

        for (int i = 0; i < 10; i++) first_list.add(
                new DarkWizard("Felkin", "staff", 12, 12,1,12, 12, 0, 0));

        for (int i = 0; i < 10; i++) second_list.add(
                new Cleric("Hade", "sacred bell", 12, 12, 12, 12, 12, 0, 0));

        for (Character character : first_list) System.out.println(character.getCharacterTypeInfo());
        for (Character character : second_list) System.out.println(character.getCharacterTypeInfo());


        System.out.println();
    }
}
