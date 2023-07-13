public class VordtOfTheBorealValley extends BossCharacter implements BossAbilities{
    public VordtOfTheBorealValley(String name, String weaponName, int health, int mana, int stamina, int intelligence,
                                  int faith, int x, int y) {
        super(name, weaponName, health, mana, stamina, intelligence, faith, x, y);
    }

    @Override
    public String firstStage() {
        return "Uses weapon named 'Mace of Cold' to attack !";
    }
    @Override
    public String secondStage() {
        return "Aggressive stage, uses Mace of Cold to give a high damage and hurt by cold effect !";
    }
    @Override
    public String thirdStage() {
        return "None !";
    }
}
