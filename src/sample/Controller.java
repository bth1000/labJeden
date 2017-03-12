package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML CheckBox cb1, cb2, cb3; // button variable declaration
    @FXML TextField oldPc;

    public void asss(ActionEvent event) {
        if (cb1.isSelected()){
            System.out.println("Yeah!");
        }
    }

    public void tits(ActionEvent event) {
        String userInput=oldPc.getText();
    }
}
