package second_scene;

import javafx.scene.control.Tooltip;

public class ButtonsEffects {
    private Tooltip accountInfoButton = new Tooltip();
    private Tooltip fruitButton = new Tooltip();
    private Tooltip vegetableButton = new Tooltip();
    private Tooltip breadButton = new Tooltip();
    private Tooltip exchangeMoneyButton = new Tooltip();
    private Tooltip drinksButton = new Tooltip();
    private Tooltip paymentPhoneButton = new Tooltip();
    private Tooltip shoppingCartButton = new Tooltip();


    private void setShoppingCartButtonEffects() {
        shoppingCartButton.setText("Shopping Cart");
        shoppingCartButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getShoppingCartButton() {
        setShoppingCartButtonEffects();
        return shoppingCartButton;
    }




    private void setDrinkButtonEffects() {
        drinksButton.setText("Drinks");
        drinksButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getDrinksButton() {
        setDrinkButtonEffects();
        return drinksButton;
    }

    public Tooltip getAccountInfoButton() {
        setAccountInfoButtonEffects();
        return accountInfoButton;
    }

    private void setAccountInfoButtonEffects() {
        accountInfoButton.setText("Account Information");
        accountInfoButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getVegetableButton() {
        setVegetableButtonEffects();
        return vegetableButton;
    }

    private void setVegetableButtonEffects() {
        vegetableButton.setText("Vegetables");
        vegetableButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getFruitButton() {
        setFruitButtonEffects();
        return fruitButton;
    }

    private void setFruitButtonEffects() {
        fruitButton.setText("Fruits");
        fruitButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getBreadButton() {
        setBreadButtonEffects();
        return breadButton;
    }


    private void setBreadButtonEffects() {
        breadButton.setText("Bread");
        breadButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    private void setExchangeMoneyButtonEffects() {
        exchangeMoneyButton.setText("Exchange Money");
        exchangeMoneyButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getExchangeMoneyButton() {
        setExchangeMoneyButtonEffects();
        return exchangeMoneyButton;
    }
    private void setPaymentPhoneButtonEffects() {
        paymentPhoneButton.setText("Phone Payment");
        paymentPhoneButton.setStyle("-fx-font: normal bold 12 Langdon; "
                + "-fx-text-fill: orange;");
    }

    public Tooltip getPaymentPhoneButton() {
        setPaymentPhoneButtonEffects();
        return paymentPhoneButton;
    }


}
