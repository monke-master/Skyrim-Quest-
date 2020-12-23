public class Situation implements Cloneable{

    Situation[] direction;
    String subject, text;
    public double healthBonus;
    public double damageBonus;
    public double manaBonus;
    public int dCheese;
    public double attackHealth;
    public double attackDamage;
    public Situation(String subject, String text, int variants, double hb, double db, double mb, int dc, double aH, double aD) {
        this.damageBonus = db;
        this.manaBonus = mb;
        this.healthBonus = hb;
        this.subject = subject;
        this.text = text;
        this.dCheese = dc;
        this.attackDamage = aD;
        this.attackHealth = aH;
        this.direction = new Situation[variants];
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
