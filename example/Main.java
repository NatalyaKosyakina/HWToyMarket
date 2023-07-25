package org.example;


public class Main {

    public static void main(String[] args) {
        Connector run = new Connector(new ConsoleView(), new Model());
        for (int i = 0; i < 3; i++) {
            run.put();
        }
        run.get();
//        run.save();




//        ArrayList<Toy> toys = new ArrayList<>();
//        for (int i = 0; i < 6; i++) {
//            toys.add(ToyBuilder.generateToy());
//        }
//        System.out.println(toys);
    }
}