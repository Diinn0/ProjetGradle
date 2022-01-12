package projetgradle;

import projetgradle.controller.Controller;
import projetgradle.model.Model;
import projetgradle.view.View;

public class ProjetGradle {

    public static void main(String[] args) {
        Controller c=new Controller(new View(), new Model());
        c.run();
    }
}
