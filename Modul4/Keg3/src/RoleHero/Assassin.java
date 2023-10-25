package RoleHero;

import HardGame.Hero;

interface CriticalDamage {
    double bonusDamage = 0.4;
}

public abstract class Assassin extends Hero implements CriticalDamage {

    public double healthPoint = 3000, defense = 300, attackDamage = ( 800 * bonusDamage );

    @Override
    public void summonHero(int upLevel){

        setHealthPoint(healthPoint);
        setDefense(defense);
        setAttackDamage(attackDamage);

        final double upHealthPoint = 90, upDefense = 15, upAttackDamage = 30;
        for (int tempLevel = 1; tempLevel < upLevel; tempLevel++) {
            setHealthPoint(getHealthPoint() + upHealthPoint);
            setDefense(getDefense() + upDefense);
            setAttackDamage(getAttackDamage() + upAttackDamage);
        } setLevel(upLevel);

    }
}