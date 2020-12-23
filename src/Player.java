public class Player {

    public double health = 100;
    public double healthBonus = 0;
    public double damage = 10;
    public double damageBonus = 0;
    public double mana = 10;
    public double manaBonus = 0;
    public int cheese = 0;
    public String name;
    public String race;

    public Player(String name, String race) {
        this.name = name;
        this.race = race;
        switch(race) {
            case "Норд":
                this.healthBonus = 13;
                this.damageBonus = 3;
                this.manaBonus = -4;
                break;
            case "Аргонианин":
                this.healthBonus = 14;
                this.manaBonus = 2;
                break;
            case "Эльф":
                this. healthBonus = -10;
                this.damageBonus = -3;
                this.manaBonus = 7;
                break;
            case "Каджит":
                this.healthBonus = 12;
                this.damageBonus = 2;
                this.manaBonus = 2;
                this.cheese += 2;
        }
        this.health+=this.healthBonus;
        this.damage+=this.damageBonus;
        this. mana+=this.manaBonus;
    }
    public boolean isDead() {
        if (health == 0) {
            if (cheese > 0) {
                cheese -= 1;
                health = 100 + healthBonus;
            }

            else return true;
        }
        return false;
    }
    public void battle(double ah, double ad) {
        if ((ah != 0) && (ad != 0)) {
            if ((health / ad < ah / damage) && (health / ad < ah / mana))
                health = 0;
        }
    }

}
