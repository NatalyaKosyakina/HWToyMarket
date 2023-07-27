package org.example;

import java.util.Iterator;

public class Toy implements Comparable<Toy> {
    private String id;
    private String name;
    private int weightfactor = 1;

    private int count = 0;
    private int chance;


    Toy(String id, String name, String count, String weightfactor){
        this.id = id;
        this.name = name;
        setCount(Integer.parseInt(count));
        setWeightfactor(Integer.parseInt(weightfactor));
    }

    public void setWeightfactor(int weightfactor) {
        if (weightfactor > 0 && weightfactor < 100){
            this.weightfactor = weightfactor;
        }
    }

    public void setCount(int count) {
        if (count > 0){
            this.count = count;
        }
    }

    public int getCount() {
        return count;
    }

    public void setChance(int chance) {
        this.chance = chance ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeightfactor() {
        return weightfactor;
    }

    @Override
    public String toString() {
        return "{" + id +
                " " + name +
                ", вес " + weightfactor +
                " " +  count +
                " шт}";
    }

    @Override
    public int compareTo(Toy o) {
        if (o.chance < chance){
            return -1;
        } else if (o.chance == chance) {
            return 0;
        }
        else {
            return 1;
        }
    }

}
