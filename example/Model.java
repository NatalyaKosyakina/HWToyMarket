package org.example;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Toy> toys;
    /*
    Здесь должна быть функция:
     принимающая строку,
     разбивающая её на детали,
     создающая из этих деталей экземпляр класса Toy,
     и добавляющая этот экземпляр в класс ToyStorage
     */

    Model(){
        this.toys = new ArrayList<>();
    }
    public Toy writeAToy(String userinput){
        String[] parts = userinput.split(" ");
        return new Toy(parts[0], parts[1], parts[2]);
    }


    public void putInStorage(Toy toy){
        toys.add(toy);
        System.out.println(toys);
    }
}
