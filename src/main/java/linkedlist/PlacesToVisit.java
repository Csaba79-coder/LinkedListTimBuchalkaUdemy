package linkedlist;

import bootstrap.DataLoader;
import model.Menu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

    public void visitCities(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        /*
        this gives an error correct way to check!!! if list is empty as follows donw!
        if (cities.getFirst() == "") {
            System.out.println("No cities in the itinerary"); // itinerary -> route plan
        }
        */

        if (cities.isEmpty()) {
            return;
        } else {
            System.out.println("Now visiting: " + listIterator.next());
            new Menu().printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // clears the line after scan!
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    new DataLoader().loadData();
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("Reach the end of the list!");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    new Menu().printMenu();
                    break;
            }
        }
    }

    public LinkedList<String> getPlacesToVisit() {
        return placesToVisit;
    }

    public void setPlacesToVisit(LinkedList<String> placesToVisit) {
        this.placesToVisit = placesToVisit;
    }
}
