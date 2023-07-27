package org.example;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Random;

public class Lottery {
    PriorityQueue<Toy> toys;

    public void shake(){
        Random random = new Random();
        for (Toy toy: toys) {
            toy.setChance(toy.getWeightfactor() * random.nextInt());
        }
    }

    public Toy get(HashMap<Toy, Integer> alltoys){
        this.toys = new PriorityQueue<>(alltoys.keySet());
        shake();
        Toy toy = toys.poll();
        return toy;
    }
}
