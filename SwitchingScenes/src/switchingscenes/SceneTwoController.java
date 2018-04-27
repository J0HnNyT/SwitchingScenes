package switchingscenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SceneTwoController {

    @FXML
    private Button SceneOneButton;

    @FXML
    void SceneOneButtonPressed(ActionEvent event) throws IOException {
        Parent loadScene2 = FXMLLoader.load(getClass().getResource("SwitchingScenes.fxml"));
        Scene SceneTwo = new Scene(loadScene2);
        //This line gets the stage information.
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(SceneTwo);
        window.show();
    }

}
