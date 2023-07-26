package org.example;

import java.util.Iterator;

public class Toy implements Comparable<Toy>, Iterator<String> {
    private String id;
    private String name;
    private int index;
    private int weightfactor = 1;

    Toy(String id, String name, String weightfactor){
        this.id = id;
        this.name = name;
        setWeightfactor(weightfactor);
    }

    public void setWeightfactor(String weightfactor) {
       int number = Integer.parseInt(weightfactor);
        if (number > 0 && number < 100){
            this.weightfactor = number;
        }
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
        return "{id=" + id +
                ", name='" + name + '\'' +
                ", weightfactor=" + weightfactor +
                '}';
    }

    @Override
    public int compareTo(Toy o) {
        if (o.weightfactor < weightfactor){
            return 1;
        } else if (o.weightfactor == weightfactor) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public boolean hasNext() {
        return index++ < 3;
    }

    @Override
    public String next() {
        switch (index){
            case 1:
                return id;
            case 2:
                return name;
            default:
                return "" + weightfactor;
        }
    }
}
