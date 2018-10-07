package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class DisplayController {

    // backButton is unused.
    @FXML
    private Button backButton;
    
    @FXML
    private ListView displayList;
    private Stage currStage;

    public DisplayController(Stage s) {
        currStage = s;
    }

    @FXML
    public void initialize() {
    	displayList = new ListView<String>();
    	ObservableList<String> items =FXCollections.observableArrayList (
    	    "Single", "Double", "Suite", "Family App");
    	displayList.setItems(items);
    }
    @FXML
    public void handleList() {
    	
    }
    @FXML
    public void handleBackButton() {

        StartScreen sc = new StartScreen(currStage);
        sc.start();
    }

}