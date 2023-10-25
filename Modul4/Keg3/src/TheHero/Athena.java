package TheHero;

import RoleHero.Mage;
import java.util.Random;

public class Athena extends Mage{

    @Override
    public void spawnIntro(){
        Random randomTaunt = new Random();
        String[] taunt = {"Demons! I shall be your eternal nightmare"};

        int rand = randomTaunt.nextInt(taunt.length);
        System.out.println("Athena : " + taunt[rand]);
    }
}