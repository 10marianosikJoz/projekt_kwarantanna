package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetableCarrotTextFields {

    public static TextField carrotAmount = new TextField();
    public static TextField carrotPrice = new TextField();
    public static TextField carrotTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setCarrotAmountTextFieldProperties() {
        carrotAmount.setLayoutX(980);
        carrotAmount.setLayoutY(240);
        carrotAmount.setEditable(false);
        carrotAmount.setAlignment(Pos.CENTER);
        carrotAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        carrotAmount.setPrefSize(50,50);
        carrotAmount.setText(vegetableOptionScene.getFifth().getText());

    }

    public void setCarrotPriceTextFieldProperties() {
        carrotPrice.setLayoutX(1050);
        carrotPrice.setLayoutY(240);
        carrotPrice.setText("2.50");
        carrotPrice.setEditable(false);
        carrotPrice.setAlignment(Pos.CENTER);
        carrotPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        carrotPrice.setPrefSize(50,50);
    }

    public  void setCarrotTotalSumTextFieldProperties() {
        carrotTotalSum.setLayoutX(1120);
        carrotTotalSum.setLayoutY(240);
        carrotTotalSum.setEditable(false);
        carrotTotalSum.setAlignment(Pos.CENTER);
        carrotTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        carrotTotalSum.setPrefSize(80,50);
    }

    public  TextField getCarrotAmount() {
        setCarrotAmountTextFieldProperties();
        return carrotAmount;
    }

    public  TextField getCarrotPrice() {
        setCarrotPriceTextFieldProperties();
        return carrotPrice;
    }

    public  TextField getCarrotTotalSum() {
        setCarrotTotalSumTextFieldProperties();
        return carrotTotalSum;
    }
}
