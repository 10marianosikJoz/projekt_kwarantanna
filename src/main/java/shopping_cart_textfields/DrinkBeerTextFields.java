package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;

public class DrinkBeerTextFields {

    public static TextField beerAmount = new TextField();
    public static TextField beerPrice = new TextField();
    public static TextField beerTotalSum = new TextField();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();

    public void setBeerAmountTextFieldProperties() {
        beerAmount.setLayoutX(80);
        beerAmount.setLayoutY(320);
        beerAmount.setEditable(false);
        beerAmount.setAlignment(Pos.CENTER);
        beerAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        beerAmount.setPrefSize(50,50);
        beerAmount.setText(drinkOptionScene.getSeventh().getText());
    }

    public void setBeerPriceTextFieldProperties() {
        beerPrice.setLayoutX(150);
        beerPrice.setLayoutY(320);
        beerPrice.setText("2.50");
        beerPrice.setEditable(false);
        beerPrice.setAlignment(Pos.CENTER);
        beerPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        beerPrice.setPrefSize(50,50);
    }

    public  void setBeerTotalSumTextFieldProperties() {
        beerTotalSum.setLayoutX(220);
        beerTotalSum.setLayoutY(320);
        beerTotalSum.setEditable(false);
        beerTotalSum.setAlignment(Pos.CENTER);
        beerTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        beerTotalSum.setPrefSize(80,50);
    }

    public  TextField getBeerAmount() {
        setBeerAmountTextFieldProperties();
        return beerAmount;
    }

    public  TextField getBeerPrice() {
        setBeerPriceTextFieldProperties();
        return beerPrice;
    }

    public  TextField getBeerTotalSum() {
        setBeerTotalSumTextFieldProperties();
        return beerTotalSum;
    }
}
