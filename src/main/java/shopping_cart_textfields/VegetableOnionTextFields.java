package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetableOnionTextFields {

    public static TextField onionAmount = new TextField();
    public static TextField onionPrice = new TextField();
    public static TextField onionTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setOnionAmountTextFieldProperties() {
        onionAmount.setLayoutX(980);
        onionAmount.setLayoutY(80);
        onionAmount.setEditable(false);
        onionAmount.setAlignment(Pos.CENTER);
        onionAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        onionAmount.setPrefSize(50,50);
        onionAmount.setText(vegetableOptionScene.getFirst().getText());
    }

    public void setOnionPriceTextFieldProperties() {
        onionPrice.setLayoutX(1050);
        onionPrice.setLayoutY(80);
        onionPrice.setText("2.50");
        onionPrice.setEditable(false);
        onionPrice.setAlignment(Pos.CENTER);
        onionPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        onionPrice.setPrefSize(50,50);
    }

    public  void setOnionTotalSumTextFieldProperties() {
        onionTotalSum.setLayoutX(1120);
        onionTotalSum.setLayoutY(80);
        onionTotalSum.setEditable(false);
        onionTotalSum.setAlignment(Pos.CENTER);
        onionTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        onionTotalSum.setPrefSize(80,50);
    }

    public  TextField getOnionAmount() {
        setOnionAmountTextFieldProperties();
        return onionAmount;
    }

    public  TextField getOnionPrice() {
        setOnionPriceTextFieldProperties();
        return onionPrice;
    }

    public  TextField getOnionTotalSum() {
        setOnionTotalSumTextFieldProperties();
        return onionTotalSum;
    }
}
