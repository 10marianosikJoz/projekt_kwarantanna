package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadBaguetteTextFields {

    public static TextField baguetteAmount = new TextField();
    public static TextField baguettePrice = new TextField();
    public static TextField baguetteTotalSum = new TextField();
    public static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setBaguetteAmountTextFieldProperties() {
        baguetteAmount.setLayoutX(380);
        baguetteAmount.setLayoutY(80);
        baguetteAmount.setEditable(false);
        baguetteAmount.setAlignment(Pos.CENTER);
        baguetteAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        baguetteAmount.setPrefSize(50,50);
        baguetteAmount.setText(breadOptionScene.getFirst().getText());


    }

    public void setBaguettePriceTextFieldProperties() {
        baguettePrice.setLayoutX(450);
        baguettePrice.setLayoutY(80);
        baguettePrice.setText("2.50");
        baguettePrice.setAlignment(Pos.CENTER);
        baguettePrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        baguettePrice.setEditable(false);
        baguettePrice.setPrefSize(50,50);
    }

    public  void setBaguetteTotalSumTextFieldProperties() {
        baguetteTotalSum.setLayoutX(520);
        baguetteTotalSum.setLayoutY(80);
        baguetteTotalSum.setEditable(false);
        baguetteTotalSum.setAlignment(Pos.CENTER);
        baguetteTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        baguetteTotalSum.setPrefSize(80,50);

    }

    public  TextField getBaguetteAmount() {
        setBaguetteAmountTextFieldProperties();
        return baguetteAmount;
    }

    public  TextField getBaguettePrice() {
        setBaguettePriceTextFieldProperties();
        return baguettePrice;
    }

    public  TextField getBaguetteTotalSum() {
        setBaguetteTotalSumTextFieldProperties();
        return baguetteTotalSum;
    }
}
