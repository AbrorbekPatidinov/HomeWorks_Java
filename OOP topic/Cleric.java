public class Cleric extends BaseCharacter {
    public Cleric(String name, String catalyst, int health, int mana, int stamina, int intelligence,
                  int faith, int x, int y) {
        super(name, catalyst, health, mana, stamina, intelligence, faith, x, y);
    }

    @Override
    public void step() {
        //TODO
    }

    @Override
    public String getCharacterTypeInfo() {
        return "Cleric !";
    }
}
