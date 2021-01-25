package scenes_init;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import operations.PaymentForOrderedItems;
import shopping_cart_labels.*;
import shopping_cart_textfields.*;

import java.beans.beancontext.BeanContext;

public class ShoppingCart {
    private Group group;
    private Scene scene;
    private Button backToMenu = new Button("BACK TO MENU");
    private Button payButton = new Button("PAY");
    private static DrinkColaTextFields drinkColaTextFields = new DrinkColaTextFields();
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
    private static VegetableCarrotTextFields vegetableCarrotTextFields = new VegetableCarrotTextFields();
    private static VegetableOnionTextFields vegetableOnionTextFields = new VegetableOnionTextFields();
    private static VegetableSaladTextFields vegetableSaladTextFields = new VegetableSaladTextFields();
    private static VegetablePaprikaTextFields vegetablePaprikaTextFields = new VegetablePaprikaTextFields();
    private static VegetableTomatoTextFields vegetableTomatoTextFields = new VegetableTomatoTextFields();
    private static VegetableCucumberTextFields vegetableCucumberTextFields = new VegetableCucumberTextFields();
    private ShoppingCartDrinkLabels shoppingCartDrinkLabels = new ShoppingCartDrinkLabels();
    private ShoppingCartBreadLabels shoppingCartBreadLabels = new ShoppingCartBreadLabels();
    private ShoppingCartFruitLabels shoppingCartFruitLabels = new ShoppingCartFruitLabels();
    private ShoppingCartVegetablesLabels shoppingCartVegetablesLabels = new ShoppingCartVegetablesLabels();
    private AccountInfoScene accountInfoScene = new AccountInfoScene();
    private PaymentForOrderedItems paymentForOrderedItems = new PaymentForOrderedItems();
    private ShoppingCartInformationLabels shoppingCartInformationLabels = new ShoppingCartInformationLabels();
    private static DrinkOptionScene drinkOptionScene = new DrinkOptionScene();
    private static BreadOptionScene breadOptionScene = new BreadOptionScene();
    private static FruitOptionScene fruitOptionScene = new FruitOptionScene();
    private static VegetableOptionScene vegetableOptionScene = new VegetableOptionScene();




    private void setBackToMenuButtonProparties() {
        backToMenu.setLayoutX(545);
        backToMenu.setLayoutY(700);
        backToMenu.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        backToMenu.setPrefSize(150, 35);
        backToMenu.setTextFill(Color.WHITE);
        backToMenu.setDisable(false);

    }

    public Button getBackToMenuButton() {
        setBackToMenuButtonProparties();
        return backToMenu;
    }

    public void setPayButtonListener(){
        payButton.setOnAction(e ->
        {
            accountInfoScene.getTotalAmount().setText(paymentForOrderedItems.subtractMoneyFromAccount().toString());
            drinkOptionScene.getFirst().setText("0");
            drinkOptionScene.getSecond().setText("0");
            drinkOptionScene.getFifth().setText("0");
            drinkOptionScene.getSeventh().setText("0");
            drinkOptionScene.getNinth().setText("0");
            drinkOptionScene.getEleventh().setText("0");

            breadOptionScene.getFirst().setText("0");
            breadOptionScene.getThird().setText("0");
            breadOptionScene.getFifth().setText("0");
            breadOptionScene.getSeventh().setText("0");
            breadOptionScene.getNinth().setText("0");
            breadOptionScene.getEleventh().setText("0");

            fruitOptionScene.getFirst().setText("0");
            fruitOptionScene.getThird().setText("0");
            fruitOptionScene.getFifth().setText("0");
            fruitOptionScene.getSeventh().setText("0");
            fruitOptionScene.getNinth().setText("0");
            fruitOptionScene.getEleventh().setText("0");

            vegetableOptionScene.getFirst().setText("0");
            vegetableOptionScene.getThird().setText("0");
            vegetableOptionScene.getFifth().setText("0");
            vegetableOptionScene.getSeventh().setText("0");
            vegetableOptionScene.getNinth().setText("0");
            vegetableOptionScene.getEleventh().setText("0");

        drinkCoffeeTextFields.getCoffeeAmount().setText("0");
        drinkCoffeeTextFields.getCoffeeTotalSum().setText("0.00");

        drinkTeaTextFields.getTeaAmount().setText("0");
        drinkTeaTextFields.getTeaTotalSum().setText("0.00");

        drinkWaterTextFields.getWaterAmount().setText("0");
        drinkWaterTextFields.getWaterTotalSum().setText("0.00");

        drinkBeerTextFields.getBeerAmount().setText("0");
        drinkBeerTextFields.getBeerTotalSum().setText("0.00");

        drinkColaTextFields.getColaAmount().setText("0");
        drinkColaTextFields.getColaTotalSum().setText("0.00");

        drinkJuiceTextFields.getJuiceAmount().setText("0");
        drinkJuiceTextFields.getJuiceTotalSum().setText("0.00");

        fruitAppleTextFields.getAppleAmount().setText("0");
        fruitAppleTextFields.getAppleTotalSum().setText("0.00");

        fruitBananaTextFields.getBananaAmount().setText("0");
        fruitBananaTextFields.getBananaTotalSum().setText("0.00");

        fruitKiwiTextFields.getKiwiAmount().setText("0");
        fruitKiwiTextFields.getKiwiTotalSum().setText("0.00");

        fruitPearTextFields.getPearAmount().setText("0");
        fruitPearTextFields.getPearTotalSum().setText("0.00");

        fruitPlumTextFields.getPlumAmount().setText("0");
        fruitPlumTextFields.getPlumTotalSum().setText("0.00");

        fruitStrawberryTextFields.getStrawberryAmount().setText("0");
        fruitStrawberryTextFields.getStrawberryTotalSum().setText("0.00");

        breadBaguetteTextFields.getBaguetteAmount().setText("0");
        breadBaguetteTextFields.getBaguetteTotalSum().setText("0.00");
        breadCroissantTextFields.getCroissantAmount().setText("0");
        breadCroissantTextFields.getCroissantTotalSum().setText("0.00");
        breadRollBreadTextFields.getRollBreadAmount().setText("0");
        breadRollBreadTextFields.getRollBreadTotalSum().setText("0.00");
        breadRollTextFields.getRollAmount().setText("0");
        breadRollTextFields.getRollTotalSum().setText("0.00");
        breadToastTextFields.getToastAmount().setText("0");
        breadToastTextFields.getToastTotalSum().setText("0.00");
        breadTextFields.getBreadAmount().setText("0");
        breadTextFields.getBreadTotalSum().setText("0.00");


        vegetableCarrotTextFields.getCarrotAmount().setText("0");
        vegetableCarrotTextFields.getCarrotTotalSum().setText("0.00");
        vegetableCucumberTextFields.getCucumberAmount().setText("0");
        vegetableCucumberTextFields.getCucumberTotalSum().setText("0.00");
        vegetableOnionTextFields.getOnionAmount().setText("0");
        vegetableOnionTextFields.getOnionTotalSum().setText("0.00");
        vegetablePaprikaTextFields.getPaprikaAmount().setText("0");
        vegetablePaprikaTextFields.getPaprikaTotalSum().setText("0.00");
        vegetableTomatoTextFields.getTomatoAmount().setText("0");
        vegetableTomatoTextFields.getTomatoTotalSum().setText("0.00");
        vegetableSaladTextFields.getSaladAmount().setText("0");
        vegetableSaladTextFields.getSaladTotalSum().setText("0.00");



        });
    }

    private void setPaymentButtonProperties() {
        payButton.setLayoutX(545);
        payButton.setLayoutY(650);
        payButton.setStyle("-fx-background-color: #4e524e; -fx-background-radius: 22  ");
        payButton.setPrefSize(150, 35);
        payButton.setTextFill(Color.WHITE);
        payButton.setDisable(false);

    }

    public Button getPaymentButton() {
        setPayButtonListener();
        setPaymentButtonProperties();
        return payButton;
    }

    public Group getGroup() {
        return group = new Group();
    }

    public Scene getScene() {
        if(scene == null){
            return scene = new Scene(group, 1230, 780, Color.web("#ffc46b"));
        }else
            return scene;


    }

    public void addNodesToLayout() {
        getGroup().getChildren().addAll(getPaymentButton(),getBackToMenuButton(), shoppingCartDrinkLabels.getColaLabel(), shoppingCartDrinkLabels.getTeaLabel(),
                shoppingCartDrinkLabels.getCoffeeLabel(), shoppingCartDrinkLabels.getBeerLabel(), shoppingCartDrinkLabels.getJuiceLabel(), shoppingCartDrinkLabels.getWaterLabel()
                , drinkColaTextFields.getColaPrice(), drinkColaTextFields.getColaAmount(), drinkColaTextFields.getColaTotalSum(),
                drinkTeaTextFields.getTeaAmount(),drinkTeaTextFields.getTeaPrice(),drinkTeaTextFields.getTeaTotalSum(),
                drinkColaTextFields.getFinalResultButton(), drinkColaTextFields.getTotalSumOfAllItems(),drinkCoffeeTextFields.getCoffeeAmount(),
                drinkCoffeeTextFields.getCoffeePrice(), drinkCoffeeTextFields.getCoffeeTotalSum(),drinkBeerTextFields.getBeerAmount(),
                drinkBeerTextFields.getBeerPrice(),drinkBeerTextFields.getBeerTotalSum(),drinkJuiceTextFields.getJuiceAmount(),drinkJuiceTextFields.getJuicePrice(),
                drinkJuiceTextFields.getJuiceTotalSum(),drinkWaterTextFields.getWaterAmount(),drinkWaterTextFields.getWaterPrice(),drinkWaterTextFields.getWaterTotalSum(),
                shoppingCartBreadLabels.getBaguetteLabel(),shoppingCartBreadLabels.getBreadLabel(),shoppingCartBreadLabels.getCroissantLabel(),shoppingCartBreadLabels.getRollBreadLabel(),
                shoppingCartBreadLabels.getRollLabel(),shoppingCartBreadLabels.getToastLabel(),breadBaguetteTextFields.getBaguetteAmount(),breadBaguetteTextFields.getBaguettePrice(),
                breadBaguetteTextFields.getBaguetteTotalSum(),breadTextFields.getBreadAmount(),breadTextFields.getBreadPrice(),breadTextFields.getBreadTotalSum(),
                breadCroissantTextFields.getCroissantAmount(),breadCroissantTextFields.getCroissantPrice(),breadCroissantTextFields.getCroissantTotalSum(),
                breadRollBreadTextFields.getRollBreadAmount(),breadRollBreadTextFields.getRollBreadPrice(),breadRollBreadTextFields.getRollBreadTotalSum(),breadRollTextFields.getRollAmount(),
                breadRollTextFields.getRollPrice(),breadRollTextFields.getRollTotalSum(),breadToastTextFields.getToastAmount(),breadToastTextFields.getToastPrice(),
                breadToastTextFields.getToastTotalSum(), shoppingCartFruitLabels.getPlumLabel(), shoppingCartFruitLabels.getPearLabel(), shoppingCartFruitLabels.getAppleLabel(), shoppingCartFruitLabels.getKiwiLabel(),
                shoppingCartFruitLabels.getStrawberryLabel(), shoppingCartFruitLabels.getBananaLabel(),fruitPlumTextFields.getPlumAmount(),fruitPlumTextFields.getPlumPrice(),fruitPlumTextFields.getPlumTotalSum(),
                fruitPearTextFields.getPearAmount(),fruitPearTextFields.getPearPrice(),fruitPearTextFields.getPearTotalSum(),fruitAppleTextFields.getAppleAmount(),fruitAppleTextFields.getApplePrice(),
                fruitAppleTextFields.getAppleTotalSum(),fruitKiwiTextFields.getKiwiAmount(),fruitKiwiTextFields.getKiwiPrice(),fruitKiwiTextFields.getKiwiTotalSum(),
                fruitStrawberryTextFields.getStrawberryAmount(),fruitStrawberryTextFields.getStrawberryPrice(),fruitStrawberryTextFields.getStrawberryTotalSum(),
                fruitBananaTextFields.getBananaAmount(),fruitBananaTextFields.getBananaPrice(),fruitBananaTextFields.getBananaTotalSum(),shoppingCartVegetablesLabels.getOnionLabel(),shoppingCartVegetablesLabels.getSaladLabel(),
                shoppingCartVegetablesLabels.getCarrotLabel(),shoppingCartVegetablesLabels.getPaprikaLabel(),shoppingCartVegetablesLabels.getTomatoLabel(),shoppingCartVegetablesLabels.getCucumberLabel(),
                vegetableOnionTextFields.getOnionAmount(),vegetableOnionTextFields.getOnionPrice(),vegetableOnionTextFields.getOnionTotalSum(),vegetableCarrotTextFields.getCarrotAmount(),
                vegetableCarrotTextFields.getCarrotPrice(),vegetableCarrotTextFields.getCarrotTotalSum(),vegetableSaladTextFields.getSaladAmount(),vegetableSaladTextFields.getSaladPrice(),vegetableSaladTextFields.getSaladTotalSum(),
                vegetablePaprikaTextFields.getPaprikaAmount(),vegetablePaprikaTextFields.getPaprikaPrice(),vegetablePaprikaTextFields.getPaprikaTotalSum(),vegetableTomatoTextFields.getTomatoAmount(),
                vegetableTomatoTextFields.getTomatoPrice(),vegetableTomatoTextFields.getTomatoTotalSum(), vegetableCucumberTextFields.getCucumberAmount(), vegetableCucumberTextFields.getCucumberPrice(), vegetableCucumberTextFields.getCucumberTotalSum(),
                shoppingCartInformationLabels.getAmountDrinkItems(),shoppingCartInformationLabels.getPriceDrinkItems(),shoppingCartInformationLabels.getTotalDrinkItems(),shoppingCartInformationLabels.getAmountBreadItems(),shoppingCartInformationLabels.getPriceBreadItems(),
                shoppingCartInformationLabels.getTotalBreadItems(),shoppingCartInformationLabels.getAmountFruitItems(),shoppingCartInformationLabels.getPriceFruitItems(),
                shoppingCartInformationLabels.getTotalFruitItems(),shoppingCartInformationLabels.getAmountVegetableItems(),shoppingCartInformationLabels.getPriceVegetableItems(),
                shoppingCartInformationLabels.getTotalVegetableItems()
                );
    }
}
