package org.example;

import java.util.List;

public class ToyStorage {
    private List<Toy> toys;

    
    public boolean add(Toy toy) {
        boolean flag = false;
        if (!toys.contains(toy)) {
            toys.add(toy);
            flag = true;
        }
        return flag;
    }

    // read
    public Toy getNote(int index) {
        return contains(index) ? toys.get(index) : null;
    }

    // delete
    public boolean remove(Toy toy) {
        boolean flag = false;
        if (toys.indexOf(toy) != -1) {
            toys.remove(toy);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return toys != null
                && toys.size() > index;
    }

    public List<Toy> getContacts() {
        // if ???...
        return toys;
    }


    public int count() {
        return toys.size();
    }
}
