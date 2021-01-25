package shopping_cart_textfields;

import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.VegetableOptionScene;

public class VegetablePaprikaTextFields {

    public static TextField paprikaAmount = new TextField();
    public static TextField paprikaPrice = new TextField();
    public static TextField paprikaTotalSum = new TextField();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();

    public void setPaprikaAmountTextFieldProperties() {
        paprikaAmount.setLayoutX(980);
        paprikaAmount.setLayoutY(320);
        paprikaAmount.setEditable(false);
        paprikaAmount.setAlignment(Pos.CENTER);
        paprikaAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        paprikaAmount.setPrefSize(50,50);
        paprikaAmount.setText(vegetableOptionScene.getSeventh().getText());
    }

    public void setPaprikaPriceTextFieldProperties() {
        paprikaPrice.setLayoutX(1050);
        paprikaPrice.setLayoutY(320);
        paprikaPrice.setText("2.50");
        paprikaPrice.setEditable(false);
        paprikaPrice.setAlignment(Pos.CENTER);
        paprikaPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        paprikaPrice.setPrefSize(50,50);
    }

    public  void setPaprikaTotalSumTextFieldProperties() {
        paprikaTotalSum.setLayoutX(1120);
        paprikaTotalSum.setLayoutY(320);
        paprikaTotalSum.setEditable(false);
        paprikaTotalSum.setAlignment(Pos.CENTER);
        paprikaTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        paprikaTotalSum.setPrefSize(80,50);
    }

    public  TextField getPaprikaAmount() {
        setPaprikaAmountTextFieldProperties();
        return paprikaAmount;
    }

    public  TextField getPaprikaPrice() {
        setPaprikaPriceTextFieldProperties();
        return paprikaPrice;
    }

    public  TextField getPaprikaTotalSum() {
        setPaprikaTotalSumTextFieldProperties();
        return paprikaTotalSum;
    }
}
