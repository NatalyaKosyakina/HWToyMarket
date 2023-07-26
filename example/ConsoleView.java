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
    public void get() {

    }

    @Override
    public void show(String toy) {
        System.out.println(toy);
    }

//    @Override
//    public void selectDoing() {
//        System.out.println("Выберите действие: \n 1 Ввод данных игрушек по одной и их выбор из коробки наугад \n 2 Ввод данных игрушек ");
//    }
}
