package projetgradle.controller;

import projetgradle.model.IModel;
import projetgradle.view.IView;

public class Controller {

    private IView view;
    private IModel model;

    public Controller(IView view, IModel model) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        this.view.display(this.model.getMessage());
    }
}
