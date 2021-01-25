package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;

public class DrinkCoffeeTextFields {

    public static TextField coffeeAmount = new TextField();
    public static TextField coffeePrice = new TextField();
    public static TextField coffeeTotalSum = new TextField();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();

    public void setCoffeeAmountTextFieldProperties() {
        coffeeAmount.setLayoutX(80);
        coffeeAmount.setLayoutY(240);
        coffeeAmount.setEditable(false);
        coffeeAmount.setAlignment(Pos.CENTER);
        coffeeAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        coffeeAmount.setPrefSize(50,50);
        coffeeAmount.setText(drinkOptionScene.getFifth().getText());
    }

    public void setCoffeePriceTextFieldProperties() {
        coffeePrice.setLayoutX(150);
        coffeePrice.setLayoutY(240);
        coffeePrice.setText("2.50");
        coffeePrice.setEditable(false);
        coffeePrice.setAlignment(Pos.CENTER);
        coffeePrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        coffeePrice.setPrefSize(50,50);
    }

    public  void setCoffeeTotalSumTextFieldProperties() {
        coffeeTotalSum.setLayoutX(220);
        coffeeTotalSum.setLayoutY(240);
        coffeeTotalSum.setEditable(false);
        coffeeTotalSum.setAlignment(Pos.CENTER);
        coffeeTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        coffeeTotalSum.setPrefSize(80,50);
    }

    public  TextField getCoffeeAmount() {
        setCoffeeAmountTextFieldProperties();
        return coffeeAmount;
    }

    public  TextField getCoffeePrice() {
        setCoffeePriceTextFieldProperties();
        return coffeePrice;
    }

    public  TextField getCoffeeTotalSum() {
        setCoffeeTotalSumTextFieldProperties();
        return coffeeTotalSum;
    }
}
