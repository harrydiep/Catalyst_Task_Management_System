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
        //Create function to populate the eight boxes with whatever is in the DB.
        fillBox();
    }

    @FXML
    private HBox homeButton;

    @FXML
    private Text block1Title, block1Descript, block1Start, block1End;

    @FXML
    private Text block2Title, block2Descript, block2Start, block2End;

    @FXML
    private Text block3Title, block3Descript, block3Start, block3End;

    @FXML
    private Text block4Title, block4Descript, block4Start, block4End;

    @FXML
    private Text block5Title, block5Descript, block5Start, block5End;

    @FXML
    private Text block6Title, block6Descript, block6Start, block6End;

    @FXML
    private Text block7Title, block7Descript, block7Start, block7End;

    @FXML
    private Text block8Title, block8Descript, block8Start, block8End;

    @FXML
    private VBox block2;

    @FXML
    void fillBox(){
        block1Title.setText("HELLO!!!!");
        block1Descript.setText("How are you");

        for (int i=0;i<8;i++){
            System.out.println(i);
        }

        

    }
    @FXML
    void returnHome(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FxmlFiles/CurrentTasks.fxml"));
        Stage stage = (Stage) homeButton.getScene().getWindow();

        stage.setScene(new Scene(root));
    }

    @FXML
    void changeName(MouseEvent e) throws IOException {
        //Currently activates upon pressing settings button
        block1Descript.setText("Database.Task number 1");
        block2.setVisible(false);

    }



}
