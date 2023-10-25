package HardGame;

import java.util.Scanner;

import TheHero.*;

public class Play {

    private enum pvpCase {
        HERAVSARES, // or ARESVSHERA
        HERAVSATHENA, // or ATHENAVSHERA
        ARESVSATHENA, // or ARESVSATHENA
    }
    private static int h1_hero, h2_hero;
    private static int h1_hero_level, h2_hero_level;

    private static pvpCase pvp;

    private final static Hera hera = new Hera();
    private final static Ares ares = new Ares();
    private final static Athena athena = new Athena();

    private static void pickHero(){

        Scanner input = new Scanner(System.in);

        System.out.println("""
                 Pick a Hero\s
                 1. Hera
                 2. Ares
                 3. Athena
                ===========================""");

        System.out.print("Hero 1 : "); h1_hero = input.nextInt();
        System.out.print("Hero 1 Level : "); h1_hero_level = input.nextInt();

        System.out.print("Hero 2 : "); h2_hero = input.nextInt();
        System.out.print("Hero 2 Level : "); h2_hero_level = input.nextInt();

        input.close();

    }

    public static void initGameEngine() {

        int round = 0;

        System.out.println("\n============ FIGHT BEGIN ============");
        if (h1_hero == 1 && h2_hero == 2 ||
                h1_hero == 2 && h2_hero == 1 ) {

            pvp = pvpCase.HERAVSARES;

            hera.summonHero(h1_hero_level);
            hera.checkStatus("Hera");

            ares.summonHero(h2_hero_level);
            ares.checkStatus("Ares");

            do {
                round++;
                System.out.printf("\n========= Round %d =========", round);

                if (hera.isLifeStatus()) {
                    hera.attack("Hera", "Ares",
                            hera.getAttackDamage(), ares.getDefense(),
                            ares.getHealthPoint());
                    ares.setHealthPoint(hera.getDamageTaken());

                    if (ares.getHealthPoint() <= 0) {
                        ares.setLifeStatus(false);
                    }
                }
                if (ares.isLifeStatus()) {
                    ares.attack("Ares", "Hera",
                            ares.getAttackDamage(), hera.getDefense(),
                            hera.getHealthPoint());
                    hera.setHealthPoint(ares.getDamageTaken());

                    if (hera.getHealthPoint() <= 0) {
                        hera.setLifeStatus(false);
                    }
                }

            } while (hera.isLifeStatus() && ares.isLifeStatus());
            matchResult();
        } else if (h1_hero == 1 && h2_hero == 3 ||
                h1_hero == 3 && h2_hero == 1 ) {

            pvp = pvpCase.HERAVSATHENA;

            hera.summonHero(h1_hero_level);
            hera.checkStatus("Hera");

            athena.summonHero(h2_hero_level);
            athena.checkStatus("Athena");

            do {
                round++;
                System.out.printf("\n========= Round %d =========", round);

                if (hera.isLifeStatus()) {
                    hera.attack("Hera", "Athena",
                            hera.getAttackDamage(), ares.getDefense(),
                            athena.getHealthPoint());
                    athena.setHealthPoint(hera.getDamageTaken());

                    if (athena.getHealthPoint() <= 0) {
                        athena.setLifeStatus(false);
                    }
                }

                if (athena.isLifeStatus()) {
                    athena.attack("Athena", "Hera",
                            athena.getAttackDamage(), hera.getDefense(),
                            hera.getHealthPoint());
                    hera.setHealthPoint(athena.getDamageTaken());

                    if (hera.getHealthPoint() <= 0) {
                        hera.setLifeStatus(false);
                    }
                }
            } while (hera.isLifeStatus() && athena.isLifeStatus());
            matchResult();
        } else if (h1_hero == 2 && h2_hero == 3 ||
                h1_hero == 3 && h2_hero == 2 ) {

            pvp = pvpCase.ARESVSATHENA;

            ares.summonHero(h1_hero_level);
            ares.checkStatus("Ares");

            athena.summonHero(h2_hero_level);
            athena.checkStatus("Athena");

            do {
                round++;
                System.out.printf("\n========= Round %d =========", round);

                if (ares.isLifeStatus()) {
                    ares.attack("Ares", "Athena",
                            ares.getAttackDamage(), ares.getDefense(),
                            athena.getHealthPoint());
                    athena.setHealthPoint(ares.getDamageTaken());

                    if (athena.getHealthPoint() <= 0) {
                        athena.setLifeStatus(false);
                    }
                }

                if (athena.isLifeStatus()) {
                    athena.attack("Athena", "Ares",
                            athena.getAttackDamage(), ares.getDefense(),
                            ares.getHealthPoint());
                    ares.setHealthPoint(athena.getDamageTaken());

                    if (ares.getHealthPoint() <= 0) {
                        ares.setLifeStatus(false);
                    }
                }
            } while (ares.isLifeStatus() && athena.isLifeStatus());
            matchResult();
        } else if (h1_hero == h2_hero) {
            System.out.println(" You can't pick a same hero in this Game ");
        } else if (h1_hero > 3){
            System.out.println(" Hero 1 is cannot use ");
        } else if (h2_hero > 3) {
            System.out.println(" Hero 2 is cannot use ");
        }
    }

    public static void matchResult() {
        // Match Result
        System.out.println("\n====== Match  Result ======");
        if (pvp == pvpCase.HERAVSARES) {
            if (!ares.isLifeStatus() && hera.isLifeStatus()) {
                System.out.println("Ares is DEAD\nHera WIN the Game");
            } else {
                System.out.println("Hera is DEAD\nAres WIN the Game");
            }
        } else if (pvp == pvpCase.HERAVSATHENA) {
            if (!hera.isLifeStatus() && athena.isLifeStatus()) {
                System.out.println("Hera is DEAD\nAthena WIN the Game");
            } else {
                System.out.println("Athena is DEAD\nHera WIN the Game");
            }
        } else if (pvp == pvpCase.ARESVSATHENA) {
            if (!ares.isLifeStatus() && athena.isLifeStatus()) {
                System.out.println("Ares is DEAD\nAthena WIN the Game");
            } else {
                System.out.println("Athena is DEAD\nAres WIN the Game");
            }
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        System.out.println("""
                ===========================          \s
                Welcome to, Legenda Seluler
                ===========================""");
        pickHero();
        if (h1_hero_level > 30 || h2_hero_level > 30){
            System.out.println(" Max Hero Level is 30 ");
        } else {
            initGameEngine();
        }
    }
}