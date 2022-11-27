package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddAcc implements Initializable {
    public Button addUrlShortcut = new Button();
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView iv5 = new ImageView();
        Image img5 = new Image("file:Resources/plus.png");
        iv5.setImage(img5);
        iv5.setFitHeight(50);
        iv5.setFitWidth(50);
        addUrlShortcut.setGraphic(iv5);
    }

    public void onAdd(ActionEvent event) throws IOException {
        
        root = FXMLLoader.load(getClass().getResource("../fxml/login.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Login");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
