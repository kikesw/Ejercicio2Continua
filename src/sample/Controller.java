package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    Button boton1;
    @FXML
    Button boton2;
    @FXML
    Button boton3;
    @FXML
    Label texto1;
    @FXML
    Label texto2;
    @FXML
    Label texto3;

    public void hover(MouseEvent mouseEvent) {
        texto1.setTextFill(Color.RED);
    }

    public void hover2(MouseEvent mouseEvent) {
        texto2.setTextFill(Color.YELLOW);
    }

    public void hover3(MouseEvent mouseEvent) {
        texto3.setTextFill(Color.BLUE);
    }

    public void clic(MouseEvent mouseEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
