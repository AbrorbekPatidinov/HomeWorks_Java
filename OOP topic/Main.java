public class Main {
    public static void main(String[] args) {
        DarkWizard darkWizard = new DarkWizard("Felkin", "staff" ,231,
                1100, 900, 1200, 18, 12);

        darkWizard.darkOrb("staff", 100, 12, 10);
        Cleric cleric =
                new Cleric("Hade", "sacred bell", 312,
                        1500, 1000, 1300, 20, 30);
        cleric.heal("sacred bell", 150, 10, 12);
    }
}

