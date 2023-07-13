import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class OOP_third_seminar {
    public static void main(String[] args)
    {
        System.out.println();

        Cleric cleric =
                new Cleric("Hade", "sacred bell", 12, 12, 12, 12, 12, 12, 12);

        ArrayList<BossCharacter> bossCharacters = new ArrayList<>();
        bossCharacters.add(
                new LudexGundyr("Gundyr", "Great Halberd", 20, 20, 20, 20, 20,
                        20, 20));
        bossCharacters.add(
                new VordtOfTheBorealValley("Vordt", "Mace of Cold", 25, 25, 25, 25, 25,
                        25, 25));

        // здесь ИДЕТ ПРОВЕРКА !
        for (BossCharacter bossCharacter : bossCharacters) {
            if (cleric.coordinates.x <= bossCharacter.coordinates.x && cleric.coordinates.y <= bossCharacter.coordinates.y)
                System.out.println("yes");
            else System.out.println("no");
        }

        System.out.println();
    }
}
