package switchingscenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SwitchingScenesController {
    
    @FXML
    private Button Scene2Button;

    @FXML
    private Label label;

    @FXML
    void Scene2ButtonPressed(ActionEvent event) throws IOException {
        Parent loadScene2 = FXMLLoader.load(getClass().getResource("SceneTwo.fxml"));
        Scene SceneTwo = new Scene(loadScene2);
        //This line gets the stage information.
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(SceneTwo);
        window.show();
    }

}
