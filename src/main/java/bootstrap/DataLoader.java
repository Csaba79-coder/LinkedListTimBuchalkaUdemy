package bootstrap;

import linkedlist.PlacesToVisit;
import model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;

public class DataLoader {

    public void loadData() {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(4);

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        integerArrayList.add(1, 2); // index position 1 store the value of 2!!!

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(i + ": " + integerArrayList.get(i));
        }

        System.out.println("----------------------------------");
        System.out.println("------------LinkedList------------");
        System.out.println("----------------------------------");

        PlacesToVisit placesToVisit = new PlacesToVisit();

        LinkedList<String> testList = new LinkedList<>();
        placesToVisit.addElementToLinkedList("Sydney", testList);
        placesToVisit.addElementToLinkedList("Melbourne", testList);
        placesToVisit.addElementToLinkedList("Brisbane", testList);
        placesToVisit.addElementToLinkedList("Perth", testList);
        placesToVisit.addElementToLinkedList("Canberra", testList);
        placesToVisit.addElementToLinkedList("Adelaide", testList);
        placesToVisit.addElementToLinkedList("Darwin", testList);
        System.out.println(testList.size());

        placesToVisit.printList(testList);

        testList.add(1, "Alice Springs");
        placesToVisit.printList(testList);
        testList.remove(4); // took away Perth on the index number 4 (the 5th element)

        placesToVisit.printList(testList);

        LinkedList<String> capitals = new LinkedList<>();

        placesToVisit.addInOrderUnDuplicatedElements("Washington", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Budapest", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("London", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Brussels", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Paris", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Amsterdam", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Monte Carlo", capitals);

        placesToVisit.printList(capitals);

        placesToVisit.addInOrderUnDuplicatedElements("Budapest", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Rome", capitals);
        placesToVisit.addInOrderUnDuplicatedElements("Madrid", capitals);
        placesToVisit.printList(capitals);
    }
}
