package org.example;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

public class Model {
    private PriorityQueue<Toy> toys;
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
        return new Toy(parts[0], parts[1], parts[2]);
    }


    public void putInStorage(Toy toy){
        toys.add(toy);
    }

    public int getChanse(){
        int chanses = 0;
        for (Toy toy: toys) {
            chanses += toy.getWeightfactor();
        }
        Random random = new Random();
        return random.nextInt(chanses);
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

    /*
    По хорошему надо переделать функции allNames, allID и allWeightfactors в одну,
    которая принимает номер элемента и возвращает результат в зависимости от него
     */

    public String getValues(int index){
        if (index == 1 || index == 4){
            String[] ids = new String[toys.size()];
        }
        if (index == 2 || index == 4){
            String[] names = new String[toys.size()];
        }
        if (index == 3 || index == 4){
            String[] weightfactors = new String[toys.size()];
        }
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
    public Toy get(String id){
        if (!toys.isEmpty()){

        }
    }
    public Toy getRandom(){
        ArrayList<String> chanses = new ArrayList<>();
        for (Toy toy: toys) {
            for (int i = 0; i < toy.getWeightfactor(); i++) {
                chanses.add(toy.getId());
            }
        }
        return
    }
}
