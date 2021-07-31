package de.termitehuegel.erweitertereuklidischeralgorithmus;

import de.termitehuegel.erweitertereuklidischeralgorithmus.logic.AdvancedEuclideanAlgorithm;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    private Label ggTOutputLabel;
    @FXML
    private Label equationOutputLabel;
    @FXML
    private Label aOutputLabel;
    @FXML
    private Label bOutputLabel;
    @FXML
    private Label sOutputLabel;
    @FXML
    private Label tOutputLabel;
    @FXML
    private TextField aInput;
    @FXML
    private TextField bInput;


    @FXML
    public void onCalculate(ActionEvent actionEvent) {
        try {
            int a = Integer.parseInt(aInput.getText());
            int b = Integer.parseInt(bInput.getText());
            AdvancedEuclideanAlgorithm advancedEuclideanAlgorithm = new AdvancedEuclideanAlgorithm(a, b);
            equationOutputLabel.setText(String.valueOf(advancedEuclideanAlgorithm.getEquation()));
            ggTOutputLabel.setText("ggT = " + String.valueOf(advancedEuclideanAlgorithm.getGGT()));
            aOutputLabel.setText("a = " + String.valueOf(advancedEuclideanAlgorithm.getA()));
            bOutputLabel.setText("b = " + String.valueOf(advancedEuclideanAlgorithm.getB()));
            sOutputLabel.setText("s = " + String.valueOf(advancedEuclideanAlgorithm.getS()));
            tOutputLabel.setText("t = " + String.valueOf(advancedEuclideanAlgorithm.getT()));

        } catch (Exception e) {
            e.printStackTrace();
        }
        aInput.setText("");
        bInput.setText("");
    }

    @FXML
    public void onInputBType(KeyEvent keyEvent) {
        if (!bInput.getText().matches("\\d*")) {
            bInput.setText(bInput.getText().replaceAll("[^\\d]", ""));
        }
    }

    @FXML
    protected void onInputAType(KeyEvent keyEvent) {
        if (!aInput.getText().matches("\\d*")) {
            aInput.setText(aInput.getText().replaceAll("[^\\d]", ""));
        }
    }
}