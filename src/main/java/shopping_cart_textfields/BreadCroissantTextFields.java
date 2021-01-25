package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.BreadOptionScene;

public class BreadCroissantTextFields {

    public static TextField croissantAmount = new TextField();
    public static TextField croissantPrice = new TextField();
    public static TextField croissantTotalSum = new TextField();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();

    public void setCroissantAmountTextFieldProperties() {
        croissantAmount.setLayoutX(380);
        croissantAmount.setLayoutY(240);
        croissantAmount.setEditable(false);
        croissantAmount.setAlignment(Pos.CENTER);
        croissantAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        croissantAmount.setPrefSize(50,50);
        croissantAmount.setText(breadOptionScene.getFifth().getText());

    }

    public void setCroissantPriceTextFieldProperties() {
        croissantPrice.setLayoutX(450);
        croissantPrice.setLayoutY(240);
        croissantPrice.setText("2.50");
        croissantPrice.setEditable(false);
        croissantPrice.setAlignment(Pos.CENTER);
        croissantPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        croissantPrice.setPrefSize(50,50);

    }

    public  void setCroissantTotalSumTextFieldProperties() {
        croissantTotalSum.setLayoutX(520);
        croissantTotalSum.setLayoutY(240);
        croissantTotalSum.setEditable(false);
        croissantTotalSum.setAlignment(Pos.CENTER);
        croissantTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        croissantTotalSum.setPrefSize(80,50);
    }

    public  TextField getCroissantAmount() {
        setCroissantAmountTextFieldProperties();
        return croissantAmount;
    }

    public  TextField getCroissantPrice() {
        setCroissantPriceTextFieldProperties();
        return croissantPrice;
    }

    public  TextField getCroissantTotalSum() {
        setCroissantTotalSumTextFieldProperties();
        return croissantTotalSum;
    }
}
