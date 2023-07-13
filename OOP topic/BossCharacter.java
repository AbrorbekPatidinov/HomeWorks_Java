public abstract class BossCharacter {
    String name;
    String weaponName;
    int health, mana, stamina;
    int intelligence, faith;
    Coordinates coordinates;
    public BossCharacter(String name, String weaponName, int health, int mana, int stamina, int intelligence,
                         int faith, int x, int y) {
        this.name = name;
        this.weaponName = weaponName;
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.faith = faith;
        coordinates = new Coordinates(x, y);
    }
}
