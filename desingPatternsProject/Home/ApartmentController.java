package Home;

import Home.connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.SQLException;

public class ApartmentController {

    private MyLogger ins;
    public Button SaveBtn;
    public Button CancelBtn;

    public TextField NameLabel;
    public TextField LastNameLabel;
    public TextField RemarksLabel;
    @FXML
    private DatePicker DateLabel;

    public static boolean checkIfNum(String s){
        if(s.matches("[a-zA-Z]+"))
            return true;
        else return false;
    }

    public void SaveBtnHandler(ActionEvent actionEvent) throws SQLException, ClassNotFoundException, IOException {
        if (NameLabel.getText().equals("") || LastNameLabel.getText().equals("") || RemarksLabel.getText().equals("") || DateLabel.getEditor().getText().equals("")) {
            Window owner = SaveBtn.getScene().getWindow();
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "You must fill all the fields");
            return;
        }
        String tmp = NameLabel.getText();
        if (!checkIfNum(tmp)){
            Window owner = SaveBtn.getScene().getWindow();
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "the name should be just chars");
            return;
        }
        tmp =LastNameLabel.getText();
        if (!checkIfNum(tmp)){
            Window owner = SaveBtn.getScene().getWindow();
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "the last name should be just chars");
            return;
        }

        String data = new String("('" + NameLabel.getText() + "','" + LastNameLabel.getText() + "','" + DateLabel.getEditor().getText() + "','" + RemarksLabel.getText() +"','"+"Apartment"+ "')");

        ins = MyLogger.getInstance();
        ins.insertAction(NameLabel.getText(),LastNameLabel.getText(),DateLabel.getEditor().getText(),RemarksLabel.getText(),"Apartment");

        /////Data Access Object pattern/////
        ConnectionClass.InsertData(data);
        ////////////////////////////////////
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }

    public void cancelBtnHandler(ActionEvent event) throws IOException {
        ((Node) event.getSource()).getScene().getWindow().hide();
    }




}
