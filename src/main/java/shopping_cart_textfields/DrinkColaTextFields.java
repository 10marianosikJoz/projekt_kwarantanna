package shopping_cart_textfields;

import get_final_price_from_items.*;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import scenes_init.DrinkOptionScene;
import textfields_formatters.InputAmountFieldsFormatter;

public class DrinkColaTextFields {
    public static TextField colaAmount = new TextField();
    public static TextField colaPrice = new TextField();
    public static TextField colaTotalSum = new TextField();
    public static Button finalResult = new Button("SUMMARY");
    private static TextField totalSumOfAllItems = new TextField();
    private InputAmountFieldsFormatter amountFieldsFormatter = new InputAmountFieldsFormatter();
    private static ShoppingCartColaOperations shoppingCartColaOperations = new ShoppingCartColaOperations();
    private static ShoppingCartTeaOperations shoppingCartTeaOperations = new ShoppingCartTeaOperations();
    private static ShoppingCartCoffeeOperations shoppingCartCoffeeOperations = new ShoppingCartCoffeeOperations();
    private static ShoppingCartFinalPrice shoppingCartFinalPrice = new ShoppingCartFinalPrice();
    private static ShoppingCartBeerOperations shoppingCartBeerOperations = new ShoppingCartBeerOperations();
    private static ShoppingCartJuiceOperations shoppingCartJuiceOperations = new ShoppingCartJuiceOperations();
    private static ShoppingCartWaterOperations shoppingCartWaterOperations = new ShoppingCartWaterOperations();
    private static ShoppingCartBaguetteOperations shoppingCartBaguetteOperations = new ShoppingCartBaguetteOperations();
    private static ShoppingCartBreadOperations breadOperations = new ShoppingCartBreadOperations();
    private static ShoppingCartCroissantOperations shoppingCartCroissantOperations = new ShoppingCartCroissantOperations();
    private static ShoppingCartRollBreadOperations shoppingCartRollBreadOperations = new ShoppingCartRollBreadOperations();
    private static ShoppingCartPlumOperations shoppingCartPlumOperations = new ShoppingCartPlumOperations();
    private static ShoppingCartRollOperations rollOperations = new ShoppingCartRollOperations();
    private static ShoppingCartToastOperations shoppingCartToastOperations = new ShoppingCartToastOperations();
    private static ShoppingCartPearOperations shoppingCartPearOperations = new ShoppingCartPearOperations();
    private static ShoppingCartAppleOperations shoppingCartAppleOperations = new ShoppingCartAppleOperations();
    private static ShoppingCartKiwiOperations shoppingCartKiwiOperations = new ShoppingCartKiwiOperations();
    private static ShoppingCartStrawberryOperations shoppingCartStrawberryOperations = new ShoppingCartStrawberryOperations();
    private static ShoppingCartBananaOperations shoppingCartBananaOperations = new ShoppingCartBananaOperations();
    private static ShoppingCartOnionOperations shoppingCartOnionOperations = new ShoppingCartOnionOperations();
    private static ShoppingCartSaladOperations shoppingCartSaladOperations = new ShoppingCartSaladOperations();
    private static ShoppingCartCarrotOperations shoppingCartCarrotOperations = new ShoppingCartCarrotOperations();
    private static ShoppingCartPotatoOperations shoppingCartPotatoOperations = new ShoppingCartPotatoOperations();
    private static ShoppingCartPaprikaOperations shoppingCartPaprikaOperations = new ShoppingCartPaprikaOperations();
    private static ShoppingCartTomatoOperations shoppingCartTomatoOperations = new ShoppingCartTomatoOperations();
    private static DrinkTeaTextFields drinkTeaTextFields = new DrinkTeaTextFields();
    private static DrinkCoffeeTextFields drinkCoffeeTextFields = new DrinkCoffeeTextFields();
    private static DrinkBeerTextFields drinkBeerTextFields = new DrinkBeerTextFields();
    private static DrinkJuiceTextFields drinkJuiceTextFields = new DrinkJuiceTextFields();
    private static DrinkWaterTextFields drinkWaterTextFields = new DrinkWaterTextFields();
    private static BreadBaguetteTextFields breadBaguetteTextFields = new BreadBaguetteTextFields();
    private static BreadTextFields breadTextFields = new BreadTextFields();
    private static BreadCroissantTextFields breadCroissantTextFields = new BreadCroissantTextFields();
    private static BreadRollBreadTextFields breadRollBreadTextFields = new BreadRollBreadTextFields();
    private static BreadRollTextFields breadRollTextFields = new BreadRollTextFields();
    private static BreadToastTextFields breadToastTextFields = new BreadToastTextFields();
    private static FruitPlumTextFields fruitPlumTextFields = new FruitPlumTextFields();
    private static FruitPearTextFields fruitPearTextFields = new FruitPearTextFields();
    private static FruitAppleTextFields fruitAppleTextFields = new FruitAppleTextFields();
    private static FruitKiwiTextFields fruitKiwiTextFields = new FruitKiwiTextFields();
    private static FruitStrawberryTextFields fruitStrawberryTextFields = new FruitStrawberryTextFields();
    private static FruitBananaTextFields fruitBananaTextFields = new FruitBananaTextFields();
    private static VegetableOnionTextFields vegetableOnionTextFields = new VegetableOnionTextFields();
    private static VegetableSaladTextFields vegetableSaladTextFields = new VegetableSaladTextFields();
    private static VegetableCarrotTextFields vegetableCarrotTextFields = new VegetableCarrotTextFields();
    private static VegetableCucumberTextFields vegetableCucumberTextFields = new VegetableCucumberTextFields();
    private static VegetablePaprikaTextFields vegetablePaprikaTextFields = new VegetablePaprikaTextFields();
    private static VegetableTomatoTextFields vegetableTomatoTextFields = new VegetableTomatoTextFields();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();



    public void setFinalResultButtonListener() {
        finalResult.setOnAction(e -> {
            getColaTotalSum().setText(shoppingCartColaOperations.getColaFinalPrice().toString());
            drinkTeaTextFields.getTeaTotalSum().setText(shoppingCartTeaOperations.getTeaFinalPrice().toString());
            drinkCoffeeTextFields.getCoffeeTotalSum().setText(shoppingCartCoffeeOperations.getCoffeeFinalPrice().toString());
            drinkBeerTextFields.getBeerTotalSum().setText(shoppingCartBeerOperations.getBeerFinalPrice().toString());
            drinkJuiceTextFields.getJuiceTotalSum().setText(shoppingCartJuiceOperations.getJuiceFinalPrice().toString());
            drinkWaterTextFields.getWaterTotalSum().setText(shoppingCartWaterOperations.getWaterFinalPrice().toString());
            breadBaguetteTextFields.getBaguetteTotalSum().setText(shoppingCartBaguetteOperations.getBaguetteFinalPrice().toString());
            breadTextFields.getBreadTotalSum().setText(breadOperations.getBreadFinalPrice().toString());
            breadCroissantTextFields.getCroissantTotalSum().setText(shoppingCartCroissantOperations.getBaguetteFinalPrice().toString());
            breadRollBreadTextFields.getRollBreadTotalSum().setText(shoppingCartRollBreadOperations.getRollBreadFinalPrice().toString());
            breadRollTextFields.getRollTotalSum().setText(rollOperations.getRollFinalPrice().toString());
            breadToastTextFields.getToastTotalSum().setText(shoppingCartToastOperations.getBaguetteFinalPrice().toString());
            fruitPlumTextFields.getPlumTotalSum().setText(shoppingCartPlumOperations.getPlumFinalPrice().toString());
            fruitPearTextFields.getPearTotalSum().setText(shoppingCartPearOperations.getPearFinalPrice().toString());
            fruitAppleTextFields.getAppleTotalSum().setText(shoppingCartAppleOperations.getAppleFinalPrice().toString());
            fruitKiwiTextFields.getKiwiTotalSum().setText(shoppingCartKiwiOperations.getKiwiFinalPrice().toString());
            fruitStrawberryTextFields.getStrawberryTotalSum().setText(shoppingCartStrawberryOperations.getStrawberryFinalPrice().toString());
            fruitBananaTextFields.getBananaTotalSum().setText(shoppingCartBananaOperations.getBananaFinalPrice().toString());
            vegetableOnionTextFields.getOnionTotalSum().setText(shoppingCartOnionOperations.getOnionFinalPrice().toString());
            vegetableSaladTextFields.getSaladTotalSum().setText(shoppingCartSaladOperations.getSaladFinalPrice().toString());
            vegetableCarrotTextFields.getCarrotTotalSum().setText(shoppingCartCarrotOperations.getCarrotFinalPrice().toString());
            vegetableCucumberTextFields.getCucumberTotalSum().setText(shoppingCartPotatoOperations.getPotatoFinalPrice().toString());
            vegetablePaprikaTextFields.getPaprikaTotalSum().setText(shoppingCartPaprikaOperations.getPaprikaFinalPrice().toString());
            vegetableTomatoTextFields.getTomatoTotalSum().setText(shoppingCartTomatoOperations.getTomatoFinalPrice().toString());
            getTotalSumOfAllItems().setText(shoppingCartFinalPrice.getTotalPrice().toString());


        });
    }

    public void setTotalSumOfAllItemsTextFieldProperties() {
        totalSumOfAllItems.setLayoutX(700);
        totalSumOfAllItems.setLayoutY(600);
        totalSumOfAllItems.setAlignment(Pos.CENTER);
        totalSumOfAllItems.setPrefSize(80, 35);
        totalSumOfAllItems.setStyle("-fx-background-radius: 22");
        totalSumOfAllItems.setEditable(false);
        totalSumOfAllItems.setFont(Font.font("Verdana", FontWeight.BOLD,12));
       totalSumOfAllItems.setTextFormatter(amountFieldsFormatter.getTotalSumNumberFormatter());
    }

    public TextField getTotalSumOfAllItems() {
        setTotalSumOfAllItemsTextFieldProperties();
        return totalSumOfAllItems;
    }

    public void setFinalResultButtonProperties() {
        setFinalResultButtonListener();
        finalResult.setLayoutX(545);
        finalResult.setLayoutY(600);
        finalResult.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        finalResult.setPrefSize(150, 35);
        finalResult.setTextFill(Color.WHITE);

    }

    public Button getFinalResultButton() {
        setFinalResultButtonProperties();
        return finalResult;
    }

    public void setColaAmountTextFieldProperties() {
        colaAmount.setLayoutX(80);
        colaAmount.setLayoutY(80);
        colaAmount.setEditable(false);
        colaAmount.setAlignment(Pos.CENTER);
        colaAmount.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        colaAmount.setPrefSize(50, 50);
        colaAmount.setText(drinkOptionScene.getFirst().getText());
    }

    public void setColaPriceTextFieldProperties() {
        colaPrice.setLayoutX(150);
        colaPrice.setLayoutY(80);
        colaPrice.setText("2.50");
        colaPrice.setEditable(false);
        colaPrice.setAlignment(Pos.CENTER);
        colaPrice.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        colaPrice.setPrefSize(50, 50);
    }

    public void setColaTotalSumTextFieldProperties() {
        colaTotalSum.setLayoutX(220);
        colaTotalSum.setLayoutY(80);
        colaTotalSum.setEditable(false);
        colaTotalSum.setAlignment(Pos.CENTER);
        colaTotalSum.setFont(Font.font("Verdana", FontWeight.BOLD,12));
        colaTotalSum.setPrefSize(80, 50);
    }

    public TextField getColaAmount() {
        setColaAmountTextFieldProperties();
        return colaAmount;
    }

    public TextField getColaPrice() {
        setColaPriceTextFieldProperties();
        return colaPrice;
    }

    public TextField getColaTotalSum() {
        setColaTotalSumTextFieldProperties();
        return colaTotalSum;
    }


}
