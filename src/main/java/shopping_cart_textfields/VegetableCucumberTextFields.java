package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetableCucumberTextFields {

    public static TextField cucumberAmount = new TextField();
    public static TextField cucumberPrice = new TextField();
    public static TextField cucumberTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setCucumberAmountTextFieldProperties() {
        cucumberAmount.setLayoutX(980);
        cucumberAmount.setLayoutY(480);
        cucumberAmount.setEditable(false);
        cucumberAmount.setAlignment(Pos.CENTER);
        cucumberAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        cucumberAmount.setPrefSize(50,50);
        cucumberAmount.setText(vegetableOptionScene.getEleventh().getText());
    }

    public void setCucumberPriceTextFieldProperties() {
        cucumberPrice.setLayoutX(1050);
        cucumberPrice.setLayoutY(480);
        cucumberPrice.setText("2.50");
        cucumberPrice.setEditable(false);
        cucumberPrice.setAlignment(Pos.CENTER);
        cucumberPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        cucumberPrice.setPrefSize(50,50);
    }

    public  void setCucumberTotalSumTextFieldProperties() {
        cucumberTotalSum.setLayoutX(1120);
        cucumberTotalSum.setLayoutY(480);
        cucumberTotalSum.setEditable(false);
        cucumberTotalSum.setAlignment(Pos.CENTER);
        cucumberTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        cucumberTotalSum.setPrefSize(80,50);
    }

    public  TextField getCucumberAmount() {
        setCucumberAmountTextFieldProperties();
        return cucumberAmount;
    }

    public  TextField getCucumberPrice() {
        setCucumberPriceTextFieldProperties();
        return cucumberPrice;
    }

    public  TextField getCucumberTotalSum() {
        setCucumberTotalSumTextFieldProperties();
        return cucumberTotalSum;
    }
}
