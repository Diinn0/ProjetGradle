package projetgradle.model;

import com.sun.istack.internal.NotNull;

import java.io.InputStream;
import java.util.Scanner;

public class Model implements IModel {

    @Override
    public String getMessage() {
        InputStream test = Model.class.getResourceAsStream("message.txt");
        if (test != null) {
            Scanner s = new Scanner(test).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        }
        
        return "Error";
    }
}
