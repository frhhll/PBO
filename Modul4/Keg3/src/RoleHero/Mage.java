package RoleHero;

import HardGame.Hero;

interface MagicalDamage {
    double bonusDamage = 0.8;
}
public abstract class Mage extends Hero implements MagicalDamage {

    public double healthPoint = 2500, defense = 200, attackDamage = ( 700 * bonusDamage ) ;

    @Override
    public void summonHero(int upLevel){

        setHealthPoint(healthPoint);
        setDefense(defense);
        setAttackDamage(attackDamage);

        final double upHealthPoint = 85, upDefense = 10, upAttackDamage = 35;
        for (int tempLevel = 1; tempLevel < upLevel; tempLevel++) {
            setHealthPoint(getHealthPoint() + upHealthPoint);
            setDefense(getDefense() + upDefense);
            setAttackDamage(getAttackDamage() + upAttackDamage);
        } setLevel(upLevel);

    }
}