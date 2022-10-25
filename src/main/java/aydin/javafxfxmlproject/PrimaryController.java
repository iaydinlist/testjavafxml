package aydin.javafxfxmlproject;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private Label msgLabel;
    @FXML
    private Button msgButton;
    @FXML
    private Button exitButton;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void msgButtonClicked(ActionEvent event) {
        String newMsg = "Hello " 
                + firstNameField.getText() 
                + " " + lastNameField.getText();
        msgLabel.setText(newMsg);   
        firstNameField.setText(" ");
        lastNameField.setText(" ");
    }

    @FXML
    private void exitButtonClicked(ActionEvent event) {
        System.exit(0);
    }
}
