package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitPlumTextFields {

    public static TextField plumAmount = new TextField();
    public static TextField plumPrice = new TextField();
    public static TextField plumTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setPlumAmountTextFieldProperties() {
        plumAmount.setLayoutX(680);
        plumAmount.setLayoutY(80);
        plumAmount.setEditable(false);
        plumAmount.setAlignment(Pos.CENTER);
        plumAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        plumAmount.setPrefSize(50,50);
        plumAmount.setText(fruitOptionScene.getFirst().getText());
    }

    public void setPlumPriceTextFieldProperties() {
        plumPrice.setLayoutX(750);
        plumPrice.setLayoutY(80);
        plumPrice.setText("2.50");
        plumPrice.setEditable(false);
        plumPrice.setAlignment(Pos.CENTER);
        plumPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        plumPrice.setPrefSize(50,50);
    }

    public  void setPlumTotalSumTextFieldProperties() {
        plumTotalSum.setLayoutX(820);
        plumTotalSum.setLayoutY(80);
        plumTotalSum.setEditable(false);
        plumTotalSum.setAlignment(Pos.CENTER);
        plumTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        plumTotalSum.setPrefSize(80,50);
    }

    public  TextField getPlumAmount() {
        setPlumAmountTextFieldProperties();
        return plumAmount;
    }

    public  TextField getPlumPrice() {
        setPlumPriceTextFieldProperties();
        return plumPrice;
    }

    public  TextField getPlumTotalSum() {
        setPlumTotalSumTextFieldProperties();
        return plumTotalSum;
    }
}
