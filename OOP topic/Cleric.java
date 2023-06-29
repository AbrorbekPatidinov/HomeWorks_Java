public class Cleric extends Monk {
    public Cleric(String name, String catalyst, Integer age, Integer health,
                  Integer stamina, Integer mana, Integer intelligence, Integer faith) {
        super(name, catalyst, age, health, stamina, mana, intelligence, faith);
    }

    /**
     * Heal is the miracle, that heals a middle amount of your health (only yours), to use this miracle you need:
     * 1) Sacred Bell, 2) Intelligence - 10, 3) Faith - 12. Consumes about 150 point of mana.
    * */
    public void heal(String catalyst, Integer mana, Integer intelligence, Integer faith) {
        if (catalyst.equals("sacred bell") && mana >= 150 && intelligence >= 10 && faith >= 12) {
            try {
                Thread.sleep(600);
                System.out.println("Miracle used: Heal !");
            } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }
        } else System.out.println("Not enough mana, intelligence or faith !");
    }
    /**
     * Soothing Sunlight, Heals caster and nearby allies for 1000 HP (health).
     * To use this miracle, you need: 1) Sacred Bell, 2) Intelligence - 20, 3) Faith - 25. Consumes about 700 point of mana.
    * */
    public void soothingSunlight(String catalyst, Integer mana, Integer intelligence, Integer faith) {
        if (catalyst.equals("sacred bell") && mana >= 700 && intelligence >= 20 && faith >= 25) {
            try {
                Thread.sleep(5000);
                System.out.println("Miracle used: Soothing Sunlight, Praise the SUN !");
            } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }
        } else System.out.println("Not enough mana, intelligence or faith !");
    }
}
