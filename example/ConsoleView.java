package org.example;

import java.util.Scanner;

public class ConsoleView implements View{
    private Scanner in;
    @Override
    public String put() {
        in = new Scanner(System.in);
        System.out.println("Укажите через пробел: id игрушки, её название, количество и вес(в %)");
        return in.nextLine();
    }

    @Override
    public void show(String toy) {
        System.out.println(toy);
    }

}
