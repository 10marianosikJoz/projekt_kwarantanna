package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitAppleTextFields {

    public static TextField appleAmount = new TextField();
    public static TextField applePrice = new TextField();
    public static TextField appleTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setAppleAmountTextFieldProperties() {
        appleAmount.setLayoutX(680);
        appleAmount.setLayoutY(240);
        appleAmount.setEditable(false);
        appleAmount.setAlignment(Pos.CENTER);
        appleAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        appleAmount.setPrefSize(50,50);
        appleAmount.setText(fruitOptionScene.getFifth().getText());
    }

    public void setApplePriceTextFieldProperties() {
        applePrice.setLayoutX(750);
        applePrice.setLayoutY(240);
        applePrice.setText("2.50");
        applePrice.setEditable(false);
        applePrice.setAlignment(Pos.CENTER);
        applePrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        applePrice.setPrefSize(50,50);
    }

    public  void setAppleTotalSumTextFieldProperties() {
        appleTotalSum.setLayoutX(820);
        appleTotalSum.setLayoutY(240);
        appleTotalSum.setEditable(false);
        appleTotalSum.setAlignment(Pos.CENTER);
        appleTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        appleTotalSum.setPrefSize(80,50);
    }

    public  TextField getAppleAmount() {
        setAppleAmountTextFieldProperties();
        return appleAmount;
    }

    public  TextField getApplePrice() {
        setApplePriceTextFieldProperties();
        return applePrice;
    }

    public  TextField getAppleTotalSum() {
        setAppleTotalSumTextFieldProperties();
        return appleTotalSum;
    }
}
