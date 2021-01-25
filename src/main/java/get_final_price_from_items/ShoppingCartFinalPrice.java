package get_final_price_from_items;

import shopping_cart_textfields.*;

import java.math.BigDecimal;

public class ShoppingCartFinalPrice {

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
    private static VegetableOnionTextFields vegetableOnionTextFields = new VegetableOnionTextFields();
    private static VegetableSaladTextFields vegetableSaladTextFields = new VegetableSaladTextFields();
    private static VegetableCarrotTextFields vegetableCarrotTextFields = new VegetableCarrotTextFields();
    private static VegetableCucumberTextFields vegetableCucumberTextFields = new VegetableCucumberTextFields();
    private static VegetablePaprikaTextFields vegetablePaprikaTextFields = new VegetablePaprikaTextFields();
    private static VegetableTomatoTextFields vegetableTomatoTextFields = new VegetableTomatoTextFields();
    private BigDecimal colaTotalAmount;
    private BigDecimal coffeeTotalAmount;
    private BigDecimal teaTotalPrice;
    private BigDecimal juiceTotalPrice;
    private BigDecimal waterTotalPrice;
    private BigDecimal beerTotalPrice;
    private BigDecimal baguetteTotalPrice;
    private BigDecimal breadTotalPrice;
    private BigDecimal croissantTotalPrice;
    private BigDecimal rollBreadTotalPrice;
    private BigDecimal rollTotalPrice;
    private BigDecimal toastTotalPrice;
    private BigDecimal plumTotalPrice;
    private BigDecimal pearTotalPrice;
    private BigDecimal appleTotalPrice;
    private BigDecimal kiwiTotalPrice;
    private BigDecimal strawberryTotalPrice;
    private BigDecimal bananaTotalPrice;
    private BigDecimal onionTotalPrice;
    private BigDecimal saladTotalPrice;
    private BigDecimal carrotTotalPrice;
    private BigDecimal potatoTotalPrice;
    private BigDecimal paprikaTotalPrice;
    private BigDecimal tomatoTotalPrice;


    public BigDecimal getOnionTotalPrice() {
        onionTotalPrice = new BigDecimal(vegetableOnionTextFields.getOnionTotalSum().getText());
        return onionTotalPrice;
    }

    public BigDecimal getColaTotalPrice(){
        colaTotalAmount = new BigDecimal(drinkColaTextFields.getColaTotalSum().getText());
        return colaTotalAmount;
    }

    public BigDecimal getTeaTotalPrice(){
        teaTotalPrice = new BigDecimal(drinkTeaTextFields.getTeaTotalSum().getText());
        return teaTotalPrice;
    }

    public BigDecimal getCoffeeTotalPrice(){
        coffeeTotalAmount = new BigDecimal(drinkCoffeeTextFields.getCoffeeTotalSum().getText());
        return coffeeTotalAmount;
    }

    public BigDecimal getBeerTotalPrice(){
        beerTotalPrice = new BigDecimal(drinkBeerTextFields.getBeerTotalSum().getText());
        return beerTotalPrice;
    }

    public BigDecimal getJuiceTotalPrice(){
        juiceTotalPrice = new BigDecimal(drinkJuiceTextFields.getJuiceTotalSum().getText());
        return juiceTotalPrice;
    }

    public BigDecimal getWaterTotalPrice() {
        waterTotalPrice = new BigDecimal(drinkWaterTextFields.getWaterTotalSum().getText());
        return waterTotalPrice;
    }

    public BigDecimal getBaguetteTotalPrice() {
        baguetteTotalPrice = new BigDecimal(breadBaguetteTextFields.getBaguetteTotalSum().getText());
        return baguetteTotalPrice;
    }

    public BigDecimal getBreadTotalPrice() {
        breadTotalPrice = new BigDecimal(breadTextFields.getBreadTotalSum().getText());
        return breadTotalPrice;
    }

    public BigDecimal getCroissantTotalPrice() {
        croissantTotalPrice = new BigDecimal(breadCroissantTextFields.getCroissantTotalSum().getText());
        return croissantTotalPrice;
    }

    public BigDecimal getRollBreadTotalPrice() {
        rollBreadTotalPrice = new BigDecimal(breadRollBreadTextFields.getRollBreadTotalSum().getText());
        return rollBreadTotalPrice;
    }

    public BigDecimal getRollTotalPrice() {
        rollTotalPrice = new BigDecimal(breadRollTextFields.getRollTotalSum().getText());
        return rollTotalPrice;
    }

    public  BigDecimal getToastTotalPrice() {
        toastTotalPrice = new BigDecimal(breadToastTextFields.getToastTotalSum().getText());
        return toastTotalPrice;
    }

    public BigDecimal getPlumTotalPrice() {
        plumTotalPrice = new BigDecimal(fruitPlumTextFields.getPlumTotalSum().getText());
        return plumTotalPrice;
    }

    public BigDecimal getPearTotalPrice() {
        pearTotalPrice = new BigDecimal(fruitPearTextFields.getPearTotalSum().getText());
        return pearTotalPrice;
    }

    public BigDecimal getAppleTotalPrice() {
        appleTotalPrice = new BigDecimal(fruitAppleTextFields.getAppleTotalSum().getText());
        return appleTotalPrice;
    }

    public BigDecimal getKiwiTotalPrice() {
        kiwiTotalPrice = new BigDecimal(fruitKiwiTextFields.getKiwiTotalSum().getText());
        return kiwiTotalPrice;
    }

    public BigDecimal getStrawberryTotalPrice() {
        strawberryTotalPrice = new BigDecimal(fruitStrawberryTextFields.getStrawberryTotalSum().getText());
        return strawberryTotalPrice;
    }

    public BigDecimal getBananaTotalPrice() {
        bananaTotalPrice = new BigDecimal(fruitBananaTextFields.getBananaTotalSum().getText());
        return bananaTotalPrice;
    }

    public BigDecimal getSaladTotalPrice() {
        saladTotalPrice = new BigDecimal(vegetableSaladTextFields.getSaladTotalSum().getText());
        return saladTotalPrice;
    }

    public BigDecimal getCarrotTotalPrice() {
        carrotTotalPrice = new BigDecimal(vegetableCarrotTextFields.getCarrotTotalSum().getText());
        return carrotTotalPrice;
    }

    public BigDecimal getPotatoTotalPrice() {
        potatoTotalPrice = new BigDecimal(vegetableCucumberTextFields.getCucumberTotalSum().getText());
        return potatoTotalPrice;
    }

    public BigDecimal getPaprikaTotalPrice() {
        paprikaTotalPrice = new BigDecimal(vegetablePaprikaTextFields.getPaprikaTotalSum().getText());
        return paprikaTotalPrice;
    }


    public BigDecimal getTomatoTotalPrice() {
        tomatoTotalPrice = new BigDecimal(vegetableTomatoTextFields.getTomatoTotalSum().getText());
        return tomatoTotalPrice;
    }

    public BigDecimal getTotalPrice(){
        BigDecimal finalResult = getColaTotalPrice()
         .add(getTeaTotalPrice()
         .add(getCoffeeTotalPrice()
         .add(getBeerTotalPrice()
         .add(getJuiceTotalPrice()
         .add(getWaterTotalPrice())
         .add(getBaguetteTotalPrice()
         .add(getBreadTotalPrice()
         .add(getCroissantTotalPrice()
         .add(getRollBreadTotalPrice()
         .add(getRollTotalPrice()
         .add(getToastTotalPrice()
         .add(getPlumTotalPrice()
         .add(getPearTotalPrice()
         .add(getAppleTotalPrice()
         .add(getKiwiTotalPrice()
         .add(getStrawberryTotalPrice()
         .add(getBananaTotalPrice()
         .add(getOnionTotalPrice()
         .add(getSaladTotalPrice()
         .add(getCarrotTotalPrice()
         .add(getPotatoTotalPrice()
         .add(getPaprikaTotalPrice()
         .add(getTomatoTotalPrice()))))))))))))))))))))));
        return finalResult;
    }
}
