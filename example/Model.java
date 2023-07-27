package org.example;

import java.util.HashMap;

public class Model {
    HashMap<Toy, Integer> toys;

    Model(){
        this.toys = new HashMap<>();
    }

    public void putInStorage(String userinput){
        String[] parts = userinput.split(" ");
        Toy toy = new Toy(parts[0], parts[1], parts[3]);
        toys.put(toy, Integer.parseInt(parts[2]));
    }

    public Toy getRandom(){
        Lottery round = new Lottery();
        Toy prize = round.get(toys);
        int count = toys.get(prize);
        if (count > 1){
            toys.put(prize, count - 1);
        }
        else {
            toys.remove(prize);
        }
        return prize;
    }

    public HashMap<Toy, Integer> getToys(){
        return toys;
    }

    public int allcount(){
        return toys.size();
    }
}
