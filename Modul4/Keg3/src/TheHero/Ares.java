package TheHero;

import RoleHero.Tank;
import java.util.Random;

public class Ares extends Tank{

    @Override
    public void spawnIntro(){
        Random randomTaunt = new Random();
        String[] taunt = {"The man who can beat me has not been born yet!"};

        int rand = randomTaunt.nextInt(taunt.length);
        System.out.println("Ares : " + taunt[rand]);
    }
}