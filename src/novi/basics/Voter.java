package novi.basics;

public class Voter extends Person {
    private Candidate votesFor;

    public void vote(Candidate newCandidate) {
        this.votesFor = newCandidate;

        System.out.println("Stem is uitgebracht door:" + super.lastName + this.votesFor.getFullName());
    }

}
