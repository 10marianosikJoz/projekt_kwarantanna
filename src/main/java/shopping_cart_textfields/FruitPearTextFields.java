package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitPearTextFields {

    public static TextField pearAmount = new TextField();
    public static TextField pearPrice = new TextField();
    public static TextField pearTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setPearAmountTextFieldProperties() {
        pearAmount.setLayoutX(680);
        pearAmount.setLayoutY(160);
        pearAmount.setEditable(false);
        pearAmount.setAlignment(Pos.CENTER);
        pearAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        pearAmount.setPrefSize(50,50);
        pearAmount.setText(fruitOptionScene.getThird().getText());
    }

    public void setPearPriceTextFieldProperties() {
        pearPrice.setLayoutX(750);
        pearPrice.setLayoutY(160);
        pearPrice.setText("2.50");
        pearPrice.setEditable(false);
        pearPrice.setAlignment(Pos.CENTER);
        pearPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        pearPrice.setPrefSize(50,50);
    }

    public  void setPearTotalSumTextFieldProperties() {
        pearTotalSum.setLayoutX(820);
        pearTotalSum.setLayoutY(160);
        pearTotalSum.setEditable(false);
        pearTotalSum.setAlignment(Pos.CENTER);
        pearTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        pearTotalSum.setPrefSize(80,50);
    }

    public  TextField getPearAmount() {
        setPearAmountTextFieldProperties();
        return pearAmount;
    }

    public  TextField getPearPrice() {
        setPearPriceTextFieldProperties();
        return pearPrice;
    }

    public  TextField getPearTotalSum() {
        setPearTotalSumTextFieldProperties();
        return pearTotalSum;
    }
}
