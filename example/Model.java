package org.example;

import java.util.PriorityQueue;
import java.util.Random;

public class Model {
    PriorityQueue<Toy> toys;
    /*
    Здесь должна быть функция:
     принимающая строку,
     разбивающая её на детали,
     создающая из этих деталей экземпляр класса Toy,
     и добавляющая этот экземпляр в класс ToyStorage
     */

    Model(){
        this.toys = new PriorityQueue<>();
    }
    public Toy writeAToy(String userinput){
        String[] parts = userinput.split(" ");
        return new Toy(parts[0], parts[1], parts[2], parts[3]);
    }


    public void putInStorage(Toy toy){
        toys.add(toy);
    }


    public String[] allID(){
        String[] ids = new String[toys.size()];
        int i = 0;
        for (Toy toy: toys) {
            ids[i] = toy.getId();
            i++;
        }
        return ids;
    }

    public String[] allNames(){
        String[] names = new String[toys.size()];
        int i = 0;
        for (Toy toy: toys) {
            names[i] = toy.getId();
            i++;
        }
        return names;
    }

    public String[] allWeightfactors(){
        String[] weightfactors = new String[toys.size()];
        int i = 0;
        for (Toy toy: toys) {
            weightfactors[i] = toy.getId();
            i++;
        }
        return weightfactors;
    }

    public Toy getRandom(){
        Random random = new Random();
        for (Toy toy: toys) {
            toy.setChance(toy.getWeightfactor() * random.nextInt());
        }
        Toy result = toys.peek();
        if (result.getCount() < 1){
            toys.poll();
        }
        result.setCount(result.getCount() - 1);
        return result;
    }

    public void setCount(Toy toy, int count) {
        toy.setCount(count);
    }
}
