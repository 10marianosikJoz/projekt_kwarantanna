package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;

public class DrinkTeaTextFields {
    public static TextField teaAmount = new TextField();
    public static TextField teaPrice = new TextField();
    public static TextField teaTotalSum = new TextField();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();

    public void setTeaAmountTextFieldProperties() {
        teaAmount.setLayoutX(80);
        teaAmount.setLayoutY(160);
        teaAmount.setEditable(false);
        teaAmount.setAlignment(Pos.CENTER);
        teaAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        teaAmount.setPrefSize(50,50);
        teaAmount.setText(drinkOptionScene.getSecond().getText());
    }

    public void setTeaPriceTextFieldProperties() {
        teaPrice.setLayoutX(150);
        teaPrice.setLayoutY(160);
        teaPrice.setText("2.50");
        teaPrice.setEditable(false);
        teaPrice.setAlignment(Pos.CENTER);
        teaPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        teaPrice.setPrefSize(50,50);
    }

    public  void setTeaTotalSumTextFieldProperties() {
        teaTotalSum.setLayoutX(220);
        teaTotalSum.setLayoutY(160);
        teaTotalSum.setEditable(false);
        teaTotalSum.setAlignment(Pos.CENTER);
        teaTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        teaTotalSum.setPrefSize(80,50);
    }


    public  TextField getTeaAmount() {
        setTeaAmountTextFieldProperties();
        return teaAmount;
    }

    public  TextField getTeaPrice() {
        setTeaPriceTextFieldProperties();
        return teaPrice;
    }

    public TextField getTeaTotalSum() {
        setTeaTotalSumTextFieldProperties();
        return teaTotalSum;
    }
}
