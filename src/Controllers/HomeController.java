package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private HBox homeButton;

    @FXML
    private Text block1Descript;

    @FXML
    private VBox block2;

    @FXML
    void returnHome(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FxmlFiles/CurrentTasks.fxml"));
        Stage stage = (Stage) homeButton.getScene().getWindow();

        stage.setScene(new Scene(root));
    }

    @FXML
    void changeName(MouseEvent e) throws IOException {
        block1Descript.setText("Task number 1");
        block2.setVisible(false);

    }



}
