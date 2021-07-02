package Controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller extends Application {

    public Controller(){

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Catalyst");

        Parent root = FXMLLoader.load(getClass().getResource("/FxmlFiles/Home.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }


}
