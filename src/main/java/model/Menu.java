package model;

public class Menu {

    public void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("""
                0 - to quit
                1 - go to next city
                2 - go to previous city
                3 - print menu options""");
    }
}
