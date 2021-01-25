package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.FruitOptionScene;

public class FruitBananaTextFields {

    public static TextField bananaAmount = new TextField();
    public static TextField bananaPrice = new TextField();
    public static TextField bananaTotalSum = new TextField();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();

    public void setBananaAmountTextFieldProperties() {
        bananaAmount.setLayoutX(680);
        bananaAmount.setLayoutY(480);
        bananaAmount.setEditable(false);
        bananaAmount.setAlignment(Pos.CENTER);
        bananaAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        bananaAmount.setPrefSize(50,50);
        bananaAmount.setText(fruitOptionScene.getEleventh().getText());
    }

    public void setBananaPriceTextFieldProperties() {
        bananaPrice.setLayoutX(750);
        bananaPrice.setLayoutY(480);
        bananaPrice.setText("2.50");
        bananaPrice.setEditable(false);
        bananaPrice.setAlignment(Pos.CENTER);
        bananaPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        bananaPrice.setPrefSize(50,50);
    }

    public  void setBananaTotalSumTextFieldProperties() {
        bananaTotalSum.setLayoutX(820);
        bananaTotalSum.setLayoutY(480);
        bananaTotalSum.setEditable(false);
        bananaTotalSum.setAlignment(Pos.CENTER);
        bananaTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        bananaTotalSum.setPrefSize(80,50);
    }

    public  TextField getBananaAmount() {
        setBananaAmountTextFieldProperties();
        return bananaAmount;
    }

    public  TextField getBananaPrice() {
        setBananaPriceTextFieldProperties();
        return bananaPrice;
    }

    public  TextField getBananaTotalSum() {
        setBananaTotalSumTextFieldProperties();
        return bananaTotalSum;
    }
}
