package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadTextFields {

    public static TextField breadAmount = new TextField();
    public static TextField breadPrice = new TextField();
    public static TextField breadTotalSum = new TextField();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setBreadAmountTextFieldProperties() {
        breadAmount.setLayoutX(380);
        breadAmount.setLayoutY(160);
        breadAmount.setEditable(false);
        breadAmount.setAlignment(Pos.CENTER);
        breadAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        breadAmount.setPrefSize(50,50);
        breadAmount.setText(breadOptionScene.getThird().getText());

    }

    public void setBreadPriceTextFieldProperties() {
        breadPrice.setLayoutX(450);
        breadPrice.setLayoutY(160);
        breadPrice.setText("2.50");
        breadPrice.setEditable(false);
        breadPrice.setAlignment(Pos.CENTER);
        breadPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        breadPrice.setPrefSize(50,50);

    }

    public  void setBreadTotalSumTextFieldProperties() {
        breadTotalSum.setLayoutX(520);
        breadTotalSum.setLayoutY(160);
        breadTotalSum.setEditable(false);
        breadTotalSum.setAlignment(Pos.CENTER);
        breadTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        breadTotalSum.setPrefSize(80,50);

    }

    public  TextField getBreadAmount() {
        setBreadAmountTextFieldProperties();
        return breadAmount;
    }

    public  TextField getBreadPrice() {
        setBreadPriceTextFieldProperties();
        return breadPrice;
    }

    public  TextField getBreadTotalSum() {
        setBreadTotalSumTextFieldProperties();
        return breadTotalSum;
    }
}
