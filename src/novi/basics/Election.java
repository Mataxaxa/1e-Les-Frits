package novi.basics;

import java.util.ArrayList;

public class Election {

    public void preparePersons() {
        Person person1 = new Person();
        Person person2 = new Voter();
        Person person3 = new Candidate();

        person1.breath();
        person2.breath();
        person3.breath();


        ArrayList<Person> persons = new ArrayList<Person>();

        Voter voter1 = new Voter();
        Candidate candidate1 = new Candidate();


    }

    public void prepareCancidates() {
        Party vvd = new Party();
        vvd.name = "VVD";

        Candidate rutte = new Candidate();
        rutte.firstName = "Mark ";
        rutte.lastName = "Rutte";
        rutte.currentParty = vvd;
        rutte.listPuller = true;


        System.out.println("Candidate " + rutte.getFullName());
    }

    public void prepareVoters() {
        Candidate rutte = new Candidate();
        rutte.firstName = "Mark ";
        rutte.lastName = "Rutte";

        Voter frits = new Voter();
        frits.firstName = "Frits ";
        frits.lastName = "Bosschert";

        System.out.println("Added voter " + frits.getFullName());
    }
}
