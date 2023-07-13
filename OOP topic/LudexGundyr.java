public class LudexGundyr extends BossCharacter implements BossAbilities {
    public LudexGundyr(String name, String weaponName, int health, int mana, int stamina, int intelligence,
                       int faith, int x, int y) {
        super(name, weaponName, health, mana, stamina, intelligence, faith, x, y);
    }
    @Override
    public String firstStage() {
        return "Uses weapon named 'halberd' to attack !";
    }
    @Override
    public String secondStage() {
        return "Uses cursed magic, to transform himself to a monster !";
    }
    @Override
    public String thirdStage() {
        return "None !";
    }
}
