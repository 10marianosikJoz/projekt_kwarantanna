package shopping_cart_labels;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class ShoppingCartInformationLabels {
    private Label amountDrinkItems = new Label("AMOUNT");
    private Label priceDrinkItems = new Label("PRICE");
    private Label totalDrinkItems = new Label("TOTAL");
    private Label amountBreadItems = new Label("AMOUNT");
    private Label priceBreadItems = new Label("PRICE");
    private Label totalBreadItems = new Label("TOTAL");
    private Label amountFruitItems = new Label("AMOUNT");
    private Label priceFruitItems = new Label("PRICE");
    private Label totalFruitItems = new Label("TOTAL");
    private Label amountVegetableItems = new Label("AMOUNT");
    private Label priceVegetableItems = new Label("PRICE");
    private Label totalVegetableItems = new Label("TOTAL");

    private void setDrinkAmountProperties() {
        amountDrinkItems.setLayoutX(80);
        amountDrinkItems.setLayoutY(40);
        amountDrinkItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    private void setDrinkPriceProperties() {
        priceDrinkItems.setLayoutX(158);
        priceDrinkItems.setLayoutY(40);
        priceDrinkItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    private void setDrinkTotalProperties() {
        totalDrinkItems.setLayoutX(237);
        totalDrinkItems.setLayoutY(40);
        totalDrinkItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    public Label getAmountDrinkItems() {
        setDrinkAmountProperties();
        return amountDrinkItems;
    }

    public Label getPriceDrinkItems() {
        setDrinkPriceProperties();
        return priceDrinkItems;
    }

    public Label getTotalDrinkItems() {
        setDrinkTotalProperties();
        return totalDrinkItems;
    }

    private void setBreadAmountProperties() {
        amountBreadItems.setLayoutX(380);
        amountBreadItems.setLayoutY(40);
        amountBreadItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    private void setBreadPriceProperties() {
        priceBreadItems.setLayoutX(456);
        priceBreadItems.setLayoutY(40);
        priceBreadItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    private void setBreadTotalProperties() {
        totalBreadItems.setLayoutX(537);
        totalBreadItems.setLayoutY(40);
        totalBreadItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }


    public Label getAmountBreadItems() {
        setBreadAmountProperties();
        return amountBreadItems;
    }


    public Label getPriceBreadItems() {
        setBreadPriceProperties();
        return priceBreadItems;
    }

    public Label getTotalBreadItems() {
        setBreadTotalProperties();
        return totalBreadItems;
    }

    private void setFruitAmountProperties() {
        amountFruitItems.setLayoutX(680);
        amountFruitItems.setLayoutY(40);
        amountFruitItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    private void setFruitPriceProperties() {
        priceFruitItems.setLayoutX(756);
        priceFruitItems.setLayoutY(40);
        priceFruitItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    private void setFruitTotalProperties() {
        totalFruitItems.setLayoutX(837);
        totalFruitItems.setLayoutY(40);
        totalFruitItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    public Label getAmountFruitItems() {
        setFruitAmountProperties();
        return amountFruitItems;
    }

    public Label getPriceFruitItems() {
        setFruitPriceProperties();
        return priceFruitItems;
    }

    public Label getTotalFruitItems() {
        setFruitTotalProperties();
        return totalFruitItems;
    }

    private void setVegetableAmountProperties() {
        amountVegetableItems.setLayoutX(980);
        amountVegetableItems.setLayoutY(40);
        amountVegetableItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));

    }

    private void setVegetablePriceProperties() {
        priceVegetableItems.setLayoutX(1056);
        priceVegetableItems.setLayoutY(40);
        priceVegetableItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    private void setVegetableTotalProperties() {
        totalVegetableItems.setLayoutX(1137);
        totalVegetableItems.setLayoutY(40);
        totalVegetableItems.setFont(Font.font("Verdana", FontWeight.BOLD,11));
    }

    public Label getAmountVegetableItems() {
        setVegetableAmountProperties();
        return amountVegetableItems;
    }

    public Label getTotalVegetableItems() {
        setVegetableTotalProperties();
        return totalVegetableItems;
    }

    public Label getPriceVegetableItems() {
        setVegetablePriceProperties();
        return priceVegetableItems;
    }
}
