package org.example;

public class Toy {
    private static int id;
    private String name;
    private int count;
    private int weightfactor = 50;

    Toy(String name, int weightfactor){
        this.id = ++id;
        this.name = name;
        setWeightfactor(weightfactor);
    }

    public void setWeightfactor(int weightfactor) {
        if (weightfactor > 0 && weightfactor < 100){
            this.weightfactor = weightfactor;
        }
    }

    public int getId() {
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
        return "{" +
                " id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", weightfactor=" + weightfactor +
                '}';
    }
}
