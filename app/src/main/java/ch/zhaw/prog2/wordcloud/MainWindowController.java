package ch.zhaw.prog2.wordcloud;

        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextArea;
        import javafx.scene.control.TextField;

        import java.net.URL;
        import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private Label labelTitel;

    @FXML
    private TextField textEingabe;


    @FXML
    private TextArea textHistory;

    @FXML
    void hinzufuegenText(ActionEvent event) {
        labelTitel.setText(textEingabe.getText());
        String oldText = textHistory.getText();
        textHistory.setText(oldText+System.lineSeparator()+textEingabe.getText());


    }

    @FXML
    void leerenTextEingabe(ActionEvent event) {
        textHistory.clear();


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelTitel.textProperty().bind(textEingabe.textProperty());
    }
}
