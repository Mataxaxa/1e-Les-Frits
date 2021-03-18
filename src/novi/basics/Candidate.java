package novi.basics;

public class Candidate extends Person {
    public Party currentParty;
    public boolean listPuller = false;


    public void talk() {
        System.out.println("Kandidaat van partij" + currentParty.name);

    }

}
