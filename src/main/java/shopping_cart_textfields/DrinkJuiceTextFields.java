package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;

public class DrinkJuiceTextFields {

    public static TextField juiceAmount = new TextField();
    public static TextField juicePrice = new TextField();
    public static TextField juiceTotalSum = new TextField();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();

    public void setJuiceAmountTextFieldProperties() {
        juiceAmount.setLayoutX(80);
        juiceAmount.setLayoutY(400);
        juiceAmount.setEditable(false);
        juiceAmount.setAlignment(Pos.CENTER);
        juiceAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        juiceAmount.setPrefSize(50,50);
        juiceAmount.setText(drinkOptionScene.getNinth().getText());
    }

    public void setJuicePriceTextFieldProperties() {
        juicePrice.setLayoutX(150);
        juicePrice.setLayoutY(400);
        juicePrice.setText("2.50");
        juicePrice.setEditable(false);
        juicePrice.setAlignment(Pos.CENTER);
        juicePrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        juicePrice.setPrefSize(50,50);
    }

    public  void setJuiceTotalSumTextFieldProperties() {
        juiceTotalSum.setLayoutX(220);
        juiceTotalSum.setLayoutY(400);
        juiceTotalSum.setEditable(false);
        juiceTotalSum.setAlignment(Pos.CENTER);
        juiceTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        juiceTotalSum.setPrefSize(80,50);
    }

    public  TextField getJuiceAmount() {
        setJuiceAmountTextFieldProperties();
        return juiceAmount;
    }

    public  TextField getJuicePrice() {
        setJuicePriceTextFieldProperties();
        return juicePrice;
    }

    public  TextField getJuiceTotalSum() {
        setJuiceTotalSumTextFieldProperties();
        return juiceTotalSum;
    }
}
