package sample;
//fraction calculator by VP/JNK
//Main class only launches the programm
//sample.fxml contains the XML styles for the GUI
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//Default JAVA-Fx
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //load in of XML style sheet
        primaryStage.setTitle("fraction calculator"); //set window title
        primaryStage.setScene(new Scene(root, 600, 400)); //set window size
        primaryStage.show(); //Blend in of window
    }

    public static void main(String[] args) {
        launch(args);
    }
}
