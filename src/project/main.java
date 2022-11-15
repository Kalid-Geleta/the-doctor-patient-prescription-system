package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    public void start(Stage o) throws IOException {
        FXMLLoader n=new FXMLLoader(main.class.getResource("start.fxml"));
        Parent l;
        l=n.load();

        Scene r=new Scene(l,760,500);
        o.setScene(r);
        o.show();
    }
    public static void main(String[] args) {
        launch(args);

    }
}
