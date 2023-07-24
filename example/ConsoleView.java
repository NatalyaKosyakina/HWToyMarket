package org.example;

import java.util.Scanner;

public class ConsoleView implements View{
    private Scanner in;
    @Override
    public String put() {
        in = new Scanner(System.in);
        System.out.println("Укажите id игрушки, её название и возможность её выпадения в розыгрыше(%)");
        return in.nextLine();
    }

    @Override
    public void get() {

    }
}
