package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitKiwiTextFields {

    public static TextField kiwiAmount = new TextField();
    public static TextField kiwiPrice = new TextField();
    public static TextField kiwiTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setKiwiAmountTextFieldProperties() {
        kiwiAmount.setLayoutX(680);
        kiwiAmount.setLayoutY(320);
        kiwiAmount.setEditable(false);
        kiwiAmount.setAlignment(Pos.CENTER);
        kiwiAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        kiwiAmount.setPrefSize(50,50);
        kiwiAmount.setText(fruitOptionScene.getSeventh().getText());
    }

    public void setKiwiPriceTextFieldProperties() {
        kiwiPrice.setLayoutX(750);
        kiwiPrice.setLayoutY(320);
        kiwiPrice.setText("2.50");
        kiwiPrice.setEditable(false);
        kiwiPrice.setAlignment(Pos.CENTER);
        kiwiPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        kiwiPrice.setPrefSize(50,50);
    }

    public  void setKiwiTotalSumTextFieldProperties() {
        kiwiTotalSum.setLayoutX(820);
        kiwiTotalSum.setLayoutY(320);
        kiwiTotalSum.setEditable(false);
        kiwiTotalSum.setAlignment(Pos.CENTER);
        kiwiTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        kiwiTotalSum.setPrefSize(80,50);
    }

    public  TextField getKiwiAmount() {
        setKiwiAmountTextFieldProperties();
        return kiwiAmount;
    }

    public  TextField getKiwiPrice() {
        setKiwiPriceTextFieldProperties();
        return kiwiPrice;
    }

    public  TextField getKiwiTotalSum() {
        setKiwiTotalSumTextFieldProperties();
        return kiwiTotalSum;
    }
}
