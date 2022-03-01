package module;

import linkedlist.PlacesToVisit;

import java.util.LinkedList;

public class Processor {

    public void run() {

        LinkedList<String> citiesToVisit = new LinkedList<>();

        citiesToVisit.add("Budapest");
        citiesToVisit.add("Melbourne");
        citiesToVisit.add("Madrid");
        citiesToVisit.add("Rome");

        new PlacesToVisit().visitCities(citiesToVisit);
    }
}
