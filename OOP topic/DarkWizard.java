public class DarkWizard extends Wizard {
    public DarkWizard(String name, String catalyst, Integer age, Integer health,
                      Integer stamina, Integer mana, Integer intelligence, Integer faith) {
        super(name, catalyst, age, health, stamina, mana, intelligence, faith);
    }

    /**
    * Dark Orb is the dark magic, that damages your target's health and stamina.
     * To use this spell, you need:
     * 1) Staff of the Abyss, 2) Intelligence - 12, 3) Faith - 10. Consumes about 100 point of mana.
    */
    public void darkOrb(String catalyst, Integer mana, Integer intelligence, Integer faith) {
        if (catalyst.equals("staff") && mana >= 100 && intelligence == 12 && faith == 10) {
            try {
                Thread.sleep(1000);
                System.out.println("Spell used: Dark Orb !");
            } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }
        } else System.out.println("Not enough mana, intelligence or faith !");
    }
    /**
    * Dark Fog is the dark magic, creates a fog, that not big, that damages your target's health.
     * To use this spell, you need: 1) Staff of the Abyss, 2) Intelligence - 15, 3) Faith - 12.
     * Consumes about 200 point of mana.
     * Warning: Dark Fog can't get too far !
    * */
    public void darkFog(String catalyst, Integer mana, Integer intelligence, Integer faith) {
        if (catalyst.equals("staff") && mana >= 200 && intelligence >= 15 && faith >= 12) {
            try {
                Thread.sleep(500);
                System.out.println("Spell used: Spell used: Dark Fog !");
            } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }
        } else System.out.println("Not enough mana !");
    }
    /** Dark Hail is the dark magic, creates 6 orbs of darkness, that damages your target's health and stamina.
     * To use this spell, you need: 1) Staff of the Abyss 2) Intelligence - 18, 3) Faith - 14.
     * Consumes about 400 point of mana
    Warning: cannot hit only one target, they will fly in 6 different directions !
    * */
    public void darkHail(String catalyst, Integer mana, Integer intelligence, Integer faith) {
        if (catalyst.equals("staff") && mana >= 400 && intelligence >= 18 && faith >= 14) {
            try {
                Thread.sleep(2000);
                System.out.println("Spell used: Dark Hail !");
            } catch (InterruptedException interruptedException) { interruptedException.printStackTrace(); }
        } else System.out.println("Not enough mana !");
    }
}
