package org.example;


public class Main {

    public static void main(String[] args) {
        Connector run = new Connector(new ConsoleView(), new Model());
        for (int i = 0; i < 3; i++) {
            run.put();
        }
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            temp.append(run.get());
            temp.append("\n");
        }
        run.save(temp.toString());

        run.load();
    }
}