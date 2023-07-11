public class Cleric extends BaseCharacter {
    public Cleric(String name, String catalyst, int health, int mana, int stamina, int intelligence, int faith) {
        super(name, catalyst, health, mana, stamina, intelligence, faith);
    }

    @Override
    public void step() {

    }

    @Override
    public String getCharacterTypeInfo() {
        return "Cleric !";
    }
}
