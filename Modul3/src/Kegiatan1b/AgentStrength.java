package Kegiatan1b;

public class AgentStrength extends ParentAgent {

    public int armor;

    public AgentStrength(String nama, int armor) {
        super(nama);
        this.armor = armor;
    }

    public AgentStrength(String nama, String skill, int armor) {
        super(nama, skill);
        this.armor = armor;
    }

    public AgentStrength(String nama, String skill, String passive, int armor) {
        super(nama, skill, passive);
        this.armor = armor;
    }

    public AgentStrength(String nama, String skill, String passive, String ultimate, int armor) {
        super(nama, skill, passive, ultimate);
        this.armor = armor;
    }

    public AgentStrength(String nama, String skill, String passive, String ultimate, String weakness, int armor) {
        super(nama, skill, passive, ultimate, weakness);
        this.armor = armor;
    }

    public void print() {
        super.print();
        System.out.println("Armor    : " + armor);
    }
}