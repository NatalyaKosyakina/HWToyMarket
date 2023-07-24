package org.example;

public class Toy {
    private String id;
    private String name;
    private int count;
    private int weightfactor = 50;

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
