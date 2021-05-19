package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    // initializes buttons as disabled
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if (e.getSource().equals(helloButton)){
            System.out.println("Hello, " + nameField.getText());
        }else if (e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }

        try{
            Thread.sleep(10000);
        } catch (InterruptedException event){
            // we don't care about this
        }
        if (ourCheckBox.isSelected()){
            // clears text box value when checked.
            nameField.clear();
            helloButton.setDisable(true);
            helloButton.setDisable(true);
        }
    }


    // Disables buttons if text is empty
    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);

    }

    // Displays message when the checkbox is checked or not.
    public void handleChange(){
        System.out.println("The checkbox is " + (ourCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
