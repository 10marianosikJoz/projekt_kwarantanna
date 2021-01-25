package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadRollTextFields {

    public static TextField rollAmount = new TextField();
    public static TextField rollPrice = new TextField();
    public static TextField rollTotalSum = new TextField();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setRollAmountTextFieldProperties() {
        rollAmount.setLayoutX(380);
        rollAmount.setLayoutY(400);
        rollAmount.setEditable(false);
        rollAmount.setAlignment(Pos.CENTER);
        rollAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollAmount.setPrefSize(50,50);
        rollAmount.setText(breadOptionScene.getNinth().getText());

    }

    public void setRollPriceTextFieldProperties() {
        rollPrice.setLayoutX(450);
        rollPrice.setLayoutY(400);
        rollPrice.setText("2.50");
        rollPrice.setEditable(false);
        rollPrice.setAlignment(Pos.CENTER);
        rollPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollPrice.setPrefSize(50,50);

    }

    public  void setRollTotalSumTextFieldProperties() {
        rollTotalSum.setLayoutX(520);
        rollTotalSum.setLayoutY(400);
        rollTotalSum.setEditable(false);
        rollTotalSum.setAlignment(Pos.CENTER);
        rollTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        rollTotalSum.setPrefSize(80,50);

    }

    public  TextField getRollAmount() {
        setRollAmountTextFieldProperties();
        return rollAmount;
    }

    public  TextField getRollPrice() {
        setRollPriceTextFieldProperties();
        return rollPrice;
    }

    public  TextField getRollTotalSum() {
        setRollTotalSumTextFieldProperties();
        return rollTotalSum;
    }
}
