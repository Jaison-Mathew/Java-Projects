package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
//import java.awt.*;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;

    public void initialize() {
        clickMeButton.setOnAction(event -> System.out.println("You clicked me!"));
    }
}