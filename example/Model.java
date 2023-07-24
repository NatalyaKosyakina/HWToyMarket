package org.example;

public class Model {
    /*
    Здесь должна быть функция:
     принимающая строку,
     разбивающая её на детали,
     создающая из этих деталей экземпляр класса Toy,
     и добавляющая этот экземпляр в класс ToyStorage
     */
    public Toy writeAToy(String userinput){
        String[] parts = userinput.split(" ");
        return new Toy(parts[0], parts[1], parts[2]);
    }
}
