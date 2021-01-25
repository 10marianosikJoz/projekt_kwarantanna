package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetableTomatoTextFields {

    public static TextField tomatoAmount = new TextField();
    public static TextField tomatoPrice = new TextField();
    public static TextField tomatoTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setTomatoAmountTextFieldProperties() {
        tomatoAmount.setLayoutX(980);
        tomatoAmount.setLayoutY(400);
        tomatoAmount.setEditable(false);
        tomatoAmount.setAlignment(Pos.CENTER);
        tomatoAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        tomatoAmount.setPrefSize(50,50);
        tomatoAmount.setText(vegetableOptionScene.getNinth().getText());
    }

    public void setTomatoPriceTextFieldProperties() {
        tomatoPrice.setLayoutX(1050);
        tomatoPrice.setLayoutY(400);
        tomatoPrice.setText("2.50");
        tomatoPrice.setEditable(false);
        tomatoPrice.setAlignment(Pos.CENTER);
        tomatoPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        tomatoPrice.setPrefSize(50,50);
    }

    public  void setTomatoTotalSumTextFieldProperties() {
        tomatoTotalSum.setLayoutX(1120);
        tomatoTotalSum.setLayoutY(400);
        tomatoTotalSum.setEditable(false);
        tomatoTotalSum.setAlignment(Pos.CENTER);
        tomatoTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        tomatoTotalSum.setPrefSize(80,50);
    }

    public  TextField getTomatoAmount() {
        setTomatoAmountTextFieldProperties();
        return tomatoAmount;
    }

    public  TextField getTomatoPrice() {
        setTomatoPriceTextFieldProperties();
        return tomatoPrice;
    }

    public  TextField getTomatoTotalSum() {
        setTomatoTotalSumTextFieldProperties();
        return tomatoTotalSum;
    }
}
