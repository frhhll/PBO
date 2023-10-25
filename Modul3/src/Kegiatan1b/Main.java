package Kegiatan1b;

public class Main {

    public static void main(String[] args) {

        ParentAgent agent1 = new ParentAgent("Athena", "Infinity Flame", "Fighting Spirit", "Undying Fury", "Movement");
        AgentAgility agent2 = new AgentAgility("Rhea", "Shadow Strike", "Primal Force", "Primal Spirit", "Armor", 50);
        AgentStrength agent3 = new AgentStrength("Gaia", "Quicksand Guard", "Sand Walk", "Raging Sandstorm", "Mana", 75);
        AgentIntelligence agent4 = new AgentIntelligence("Artemis", "Wind Surprise", "Iceland Companions", "Angry Icewind", "Dodge", 45);

        System.out.println();
        System.out.println("===== Daftar Agent BabaLorant =====");
        System.out.println();
        agent1.print();
        System.out.println();
        agent2.print();
        System.out.println();
        agent3.print();
        System.out.println();
        agent4.print();
        System.out.println();
    }
}