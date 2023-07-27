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
    public void save(){

    }
    public void get(){
        String res = model.getRandom().toString();
        view.show(res);
    }
    public void showAll(){
        view.show(model.toys.toString());
    }
}
