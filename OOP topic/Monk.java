public class Monk {
    public String name;

    public String catalyst;
    public Integer age;
    public Integer health;
    public Integer stamina;
    public Integer mana;
    public Integer intelligence;
    public Integer faith;

    public Monk(String name, String catalyst, Integer age, Integer health,
                Integer stamina, Integer mana, Integer intelligence, Integer faith) {
        this.name = name;
        this.catalyst = catalyst;
        this.age = age;
        this.health = health;
        this.stamina = stamina;
        this.mana = mana;
        this.intelligence = intelligence;
        this.faith = faith;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCatalyst(String catalyst) {
        this.catalyst = catalyst;
    }

    public String getCatalyst() {
        return catalyst;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getHealth() {
        return health;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Integer getMana() {
        return mana;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setFaith(Integer faith) {
        this.faith = faith;
    }

    public Integer getFaith() {
        return faith;
    }
}
