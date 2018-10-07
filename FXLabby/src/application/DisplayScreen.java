package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DisplayScreen {
    private Stage s;
    private String title;
    private FXMLLoader fxmlLoader;

    public DisplayScreen(Stage s) {
        this.s = s;
        this.title = "Display Screen";
        this.fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("Display.fxml"));
    }

    public void start() {
        s.setTitle(title);
        fxmlLoader.setController(new DisplayController(s));
        try {
            Parent root = fxmlLoader.load();
            Scene sc = new Scene(root, 500, 300);
            s.setScene(sc);
            s.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}