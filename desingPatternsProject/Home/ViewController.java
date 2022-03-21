package Home;

import Home.connectivity.ConnectionClass;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    public Button BackBtn;
    @FXML
    private TableView<Customers> IdTable;

    @FXML
    private TableColumn<Customers, String> nameC;

    @FXML
    private TableColumn<Customers, String> lastNameC;

    @FXML
    private TableColumn<Customers, String> dateC;

    @FXML
    private TableColumn<Customers, String> remarksC;

    @FXML
    private TableColumn<Customers, String> InsC;

    ObservableList<Customers> listM = FXCollections.observableArrayList();	;

    int index = -1;

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameC.setCellValueFactory(new PropertyValueFactory<Customers, String>("Name"));
        lastNameC.setCellValueFactory(new PropertyValueFactory<Customers, String>("lastName"));
        dateC.setCellValueFactory(new PropertyValueFactory<Customers, String>("Date"));
        remarksC.setCellValueFactory(new PropertyValueFactory<Customers, String>("Remarks"));
        InsC.setCellValueFactory(new PropertyValueFactory<Customers, String>("Type"));

        try {
            /////Data Access Object pattern/////
            listM = ConnectionClass.getData();
            ////////////////////////////////////
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        IdTable.setItems(listM);
    }

    public void BackBtnHandler(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }
}
