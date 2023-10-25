package Kegiatan1b;

public class AgentAgility extends ParentAgent {

    public int dogdePercent;

    public AgentAgility(String nama, int dogdePercent) {
        super(nama);
        this.dogdePercent = dogdePercent;
    }

    public AgentAgility(String nama, String skill, int dogdePercent) {
        super(nama, skill);
        this.dogdePercent = dogdePercent;
    }

    public AgentAgility(String nama, String skill, String passive, int dogdePercent) {
        super(nama, skill, passive);
        this.dogdePercent = dogdePercent;
    }

    public AgentAgility(String nama, String skill, String passive, String ultimate, int dogdePercent) {
        super(nama, skill, passive, ultimate);
        this.dogdePercent = dogdePercent;
    }

    public AgentAgility(String nama, String skill, String passive, String ultimate, String weakness, int dogdePercent) {
        super(nama, skill, passive, ultimate, weakness);
        this.dogdePercent = dogdePercent;
    }

    public void print() {
        super.print();
        System.out.println("Dogde    : " + dogdePercent);
    }
}