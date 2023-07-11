public abstract class BaseCharacter implements Character {
    String name, catalyst;
    int health, mana, stamina;
    int intelligence, faith;

    public BaseCharacter(String name, String catalyst, int health, int mana, int stamina, int intelligence, int faith) {
        this.name = name;
        this.catalyst = catalyst;
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.intelligence = intelligence;
        this.faith = faith;
    }
}
