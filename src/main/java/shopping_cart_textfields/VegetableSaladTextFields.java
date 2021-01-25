package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetableSaladTextFields {

    public static TextField saladAmount = new TextField();
    public static TextField saladPrice = new TextField();
    public static TextField saladTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setSaladAmountTextFieldProperties() {
        saladAmount.setLayoutX(980);
        saladAmount.setLayoutY(160);
        saladAmount.setEditable(false);
        saladAmount.setAlignment(Pos.CENTER);
        saladAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        saladAmount.setPrefSize(50,50);
        saladAmount.setText(vegetableOptionScene.getThird().getText());
    }

    public void setSaladPriceTextFieldProperties() {
        saladPrice.setLayoutX(1050);
        saladPrice.setLayoutY(160);
        saladPrice.setText("2.50");
        saladPrice.setEditable(false);
        saladPrice.setAlignment(Pos.CENTER);
        saladPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        saladPrice.setPrefSize(50,50);
    }

    public  void setSaladTotalSumTextFieldProperties() {
        saladTotalSum.setLayoutX(1120);
        saladTotalSum.setLayoutY(160);
        saladTotalSum.setEditable(false);
        saladTotalSum.setAlignment(Pos.CENTER);
        saladTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        saladTotalSum.setPrefSize(80,50);
    }

    public  TextField getSaladAmount() {
        setSaladAmountTextFieldProperties();
        return saladAmount;
    }

    public  TextField getSaladPrice() {
        setSaladPriceTextFieldProperties();
        return saladPrice;
    }

    public  TextField getSaladTotalSum() {
        setSaladTotalSumTextFieldProperties();
        return saladTotalSum;
    }
}
