package Kegiatan1b;

public class AgentIntelligence extends ParentAgent {

    public int mana;

    public AgentIntelligence(String nama, int mana) {
        super(nama);
        this.mana = mana;
    }

    public AgentIntelligence(String nama, String skill, int mana) {
        super(nama, skill);
        this.mana = mana;
    }

    public AgentIntelligence(String nama, String skill, String passive, int mana) {
        super(nama, skill, passive);
        this.mana = mana;
    }

    public AgentIntelligence(String nama, String skill, String passive, String ultimate, int mana) {
        super(nama, skill, passive, ultimate);
        this.mana = mana;
    }

    public AgentIntelligence(String nama, String skill, String passive, String ultimate, String weakness, int mana) {
        super(nama, skill, passive, ultimate, weakness);
        this.mana = mana;
    }

    public void print() {
        super.print();
        System.out.println("Mana     : " + mana);
    }
}