package TheHero;

import RoleHero.Assassin;
import java.util.Random;

public class Hera extends Assassin {

    @Override
    public void spawnIntro() {
        Random randomTaunt = new Random();
        String[] taunt = {"Killing is always better than giving mercy"};

        int rand = randomTaunt.nextInt(taunt.length);
        System.out.println("Hera : " + taunt[rand]);
    }
}