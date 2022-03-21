package Home;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Fxml/menu.fxml"));
        primaryStage.setTitle("Main Menu");
        primaryStage.setScene(new Scene(root, 882, 584));
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        MyLogger mylogger = MyLogger.getInstance();
        mylogger.initLogger();
        launch(args);

    }

}
