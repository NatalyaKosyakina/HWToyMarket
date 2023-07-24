package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Toy generateToy(){
        Random random = new Random();
        String[] names = new String[] { "Lego", "Pikachu", "D&D", "Кубик Рубика", "Дракон Евлампий", "Конь", "Рогатка", "Медвежонок Тедди", "Буратино" };
        String[] collections = new String[] {""};
        String[] dallnames = new String[] {"Маша", "Таня", "Вика", "Лилу", "Уитни", "Чжоу", "Кен"};
        int weightfactor = random.nextInt(1, 100);
        if (random.nextInt(1, 10) < 7){
            return new Toy(names[random.nextInt(names.length)], random.nextInt(1, 100));
        }
        else {
            return new Dall(dallnames[random.nextInt(dallnames.length)], random.nextInt(1, 100), collections[random.nextInt(collections.length)]);
        }
    }
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            toys.add(generateToy());
        }
        System.out.println(toys);
    }
}