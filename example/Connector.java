package org.example;

public class Connector {
    private View view;
    private Model model;

    Connector(View view, Model model){
        this.view = view;
        this.model = model;
    }
    public void put(){
        model.putInStorage(model.writeAToy(view.put()));
    }

    public void get(){
        view.show(model.getRandom().toString());
    }
    public void showAll(){
        view.show(String.format("В розыгрыше участвуют: ", model.toys.toString()));
    }
}
