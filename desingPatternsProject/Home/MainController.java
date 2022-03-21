package Home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {
    @FXML
    public Button carBtn;
    @FXML
    public Button ViewBtn;
    @FXML
    public Button HealthBtn;
    @FXML
    public Button LifeBtn;
    @FXML
    public Button ApartmentBtn;
    @FXML
    public Label VersionID;


    public void handleCarBtn(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader();
  //  ((Node) event.getSource()).getScene().getWindow().hide();
    Stage primaryStage = new Stage();
    Pane root = loader.load(getClass().getResource("Fxml/Car.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setTitle("Car Insurance");
    primaryStage.setScene(scene);
    primaryStage.show();
}
    public void handleHealthBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage primaryStage = new Stage();
        Pane root = loader.load(getClass().getResource("Fxml/Health.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Health Insurance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handleLifeBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage primaryStage = new Stage();
        Pane root = loader.load(getClass().getResource("Fxml/Life.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Life Insurance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handleApartmentBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage primaryStage = new Stage();
        Pane root = loader.load(getClass().getResource("Fxml/Apartment.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Apartment Insurance");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handleViewBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage primaryStage = new Stage();
        Pane root = loader.load(getClass().getResource("Fxml/Purchases.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("View All Insurances");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}