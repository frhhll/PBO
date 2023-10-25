package Kegiatan1b;

public class ParentAgent {

    public String nama;
    public String skill;
    public String passive;
    public String ultimate;
    public String weakness;

    public ParentAgent(String nama) {
        this.nama = nama;
    }

    public ParentAgent(String nama, String skill) {
        this.nama = nama;
        this.skill = skill;
    }

    public ParentAgent(String nama, String skill, String passive) {
        this.nama = nama;
        this.skill = skill;
        this.passive = passive;
    }

    public ParentAgent(String nama, String skill, String passive, String ultimate) {
        this.nama = nama;
        this.skill = skill;
        this.passive = passive;
        this.ultimate = ultimate;
    }

    public ParentAgent(String nama, String skill, String passive, String ultimate, String weakness) {
        this.nama = nama;
        this.skill = skill;
        this.passive = passive;
        this.ultimate = ultimate;
        this.weakness = weakness;
    }

    public void print() {
        System.out.println("Nama     : " + nama);
        System.out.println("Skill    : " + skill);
        System.out.println("Passive  : " + passive);
        System.out.println("Ultimate : " + ultimate);
        System.out.println("Weakness : " + weakness);
    }
}