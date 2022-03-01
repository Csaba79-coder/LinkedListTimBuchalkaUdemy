package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlacesToVisit {

    private LinkedList<String> placesToVisit = new LinkedList<>();

    public PlacesToVisit() {
    }

    public PlacesToVisit(LinkedList<String> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }

    public void addElementToLinkedList(String places, LinkedList<String> linkedList) {
        linkedList.add(places);
    }

    public void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting: " + i.next()); // i.next() operates actually as i++
        }
        System.out.println("=====================");
    }

    // alphabetic order, no duplication!!
    public boolean addInOrderUnDuplicatedElements(String newCity, LinkedList<String> linkedList) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // that means equal, so do not add!
                System.out.println(newCity + " is already included as a destination");
                return false; // it means was no successfully added!
            } else if (comparison > 0) {
                // new City should appear before this one!
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on the next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public LinkedList<String> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(LinkedList<String> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }
}
