package RoleHero;

import HardGame.Hero;

public abstract class Tank extends Hero {

    public double healthPoint = 7000, defense = 500, attackDamage = 500;

    @Override
    public void summonHero(int upLevel){

        setHealthPoint(healthPoint);
        setDefense(defense);
        setAttackDamage(attackDamage);

        final double upHealthPoint = 200, upDefense = 15, upAttackDamage = 20;
        for (int tempLevel = 1; tempLevel < upLevel; tempLevel++) {
            setHealthPoint(getHealthPoint() + upHealthPoint);
            setDefense(getDefense() + upDefense);
            setAttackDamage(getAttackDamage() + upAttackDamage);
        } setLevel(upLevel);

    }
}