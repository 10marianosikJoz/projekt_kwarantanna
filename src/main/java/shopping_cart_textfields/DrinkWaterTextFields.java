package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;

public class DrinkWaterTextFields {

    public static TextField waterAmount = new TextField();
    public static TextField waterPrice = new TextField();
    public static TextField waterTotalSum = new TextField();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();

    public void setWaterAmountTextFieldProperties() {
        waterAmount.setLayoutX(80);
        waterAmount.setLayoutY(480);
        waterAmount.setEditable(false);
        waterAmount.setAlignment(Pos.CENTER);
        waterAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        waterAmount.setPrefSize(50,50);
        waterAmount.setText(drinkOptionScene.getEleventh().getText());
    }

    public void setWaterPriceTextFieldProperties() {
        waterPrice.setLayoutX(150);
        waterPrice.setLayoutY(480);
        waterPrice.setText("2.50");
        waterPrice.setEditable(false);
        waterPrice.setAlignment(Pos.CENTER);
        waterPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        waterPrice.setPrefSize(50,50);
    }

    public  void setWaterTotalSumTextFieldProperties() {
        waterTotalSum.setLayoutX(220);
        waterTotalSum.setLayoutY(480);
        waterTotalSum.setEditable(false);
        waterTotalSum.setAlignment(Pos.CENTER);
        waterTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        waterTotalSum.setPrefSize(80,50);
    }

    public  TextField getWaterAmount() {
        setWaterAmountTextFieldProperties();
        return waterAmount;
    }

    public  TextField getWaterPrice() {
        setWaterPriceTextFieldProperties();
        return waterPrice;
    }

    public  TextField getWaterTotalSum() {
        setWaterTotalSumTextFieldProperties();
        return waterTotalSum;
    }
}
