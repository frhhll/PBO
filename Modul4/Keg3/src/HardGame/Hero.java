package HardGame;

public abstract class Hero {

    private double healthPoint, attackDamage, realDamage, damageTaken, defense;
    private int level = 1;
    private boolean lifeStatus = true;

    public void attack (

            String p1_name, String p2_name,
            double p1_attackDamage, double p2_defense,
            double p2_health){

        System.out.printf("\n=== %s Turn ===\n", p1_name); spawnIntro();
        reviewDamage(p1_attackDamage, p2_defense);
        setDamageTaken(p2_health - getRealDamage());

        if (getDamageTaken() <= 0){
            setDamageTaken(0);
        }

        System.out.printf("%s Real Damage\t: %.1f ATK\n", p1_name, getRealDamage());
        System.out.printf("%s HP Remaining\t: %.1f HP\n", p2_name, getDamageTaken());

    }

    public abstract void summonHero(int upLevel);
    public void reviewDamage(double attackDamage, double defense){
        setRealDamage(attackDamage - defense);
    }

    public void checkStatus(String hero){
        System.out.println("\n=== " + hero + " ===");
        System.out.printf("Level : %d\n", getLevel());
        System.out.printf("Attack damage\t\t : %.1f\t\t Life status : %b\nHealth point\t\t : %.1f\t\t Defense : %.1f\n",
                getAttackDamage(), isLifeStatus(), getHealthPoint(), getDefense());
    }
    public abstract void spawnIntro();


    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public double getRealDamage() {
        return realDamage;
    }

    public void setRealDamage(double realDamage) {
        this.realDamage = realDamage;
    }

    public double getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(double damageTaken) {
        this.damageTaken = damageTaken;
    }
}