package org.example;


import java.io.IOException;

public class Connector {
    private View view;
    private Model model;
    private Filework filework;

    Connector(View view, Model model){
        this.view = view;
        this.model = model;
        this.filework = new Filework();
    }
    public void put(){
        model.putInStorage(view.put());
    }
    public String get(){
        String res = "Игрушки закончились";
        if (model.allcount() != 0){
            res = model.getRandom().toString();
        }
        view.show(res);
        return res;
    }
    public void showAll(){
        view.show(model.toys.toString());
    }

    public void save(String text) {
        try {
            filework.saveToFile("Example", text);
        } catch (IOException e) {}
    }
}
