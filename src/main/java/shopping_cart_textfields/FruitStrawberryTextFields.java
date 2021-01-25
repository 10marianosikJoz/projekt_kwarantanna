package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitStrawberryTextFields {

    public static TextField strawberryAmount = new TextField();
    public static TextField strawberryPrice = new TextField();
    public static TextField strawberryTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setStrawberryAmountTextFieldProperties() {
        strawberryAmount.setLayoutX(680);
        strawberryAmount.setLayoutY(400);
        strawberryAmount.setEditable(false);
        strawberryAmount.setAlignment(Pos.CENTER);
        strawberryAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        strawberryAmount.setPrefSize(50,50);
        strawberryAmount.setText(fruitOptionScene.getNinth().getText());
    }

    public void setStrawberryPriceTextFieldProperties() {
        strawberryPrice.setLayoutX(750);
        strawberryPrice.setLayoutY(400);
        strawberryPrice.setText("2.50");
        strawberryPrice.setEditable(false);
        strawberryPrice.setAlignment(Pos.CENTER);
        strawberryPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        strawberryPrice.setPrefSize(50,50);
    }

    public  void setStrawberryTotalSumTextFieldProperties() {
        strawberryTotalSum.setLayoutX(820);
        strawberryTotalSum.setLayoutY(400);
        strawberryTotalSum.setEditable(false);
        strawberryTotalSum.setAlignment(Pos.CENTER);
        strawberryTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        strawberryTotalSum.setPrefSize(80,50);
    }

    public  TextField getStrawberryAmount() {
        setStrawberryAmountTextFieldProperties();
        return strawberryAmount;
    }

    public  TextField getStrawberryPrice() {
        setStrawberryPriceTextFieldProperties();
        return strawberryPrice;
    }

    public  TextField getStrawberryTotalSum() {
        setStrawberryTotalSumTextFieldProperties();
        return strawberryTotalSum;
    }
}
