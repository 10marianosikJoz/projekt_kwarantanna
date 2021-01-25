package second_scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lombok.Getter;

@Getter
public class ButtonsIcons {
    private Image imageMoney = new Image("money_icon2.png", 150, 100, true, true);
    private ImageView imageViewMoney = new ImageView(imageMoney);
    private Image imageFruit = new Image("owoce.png", 150, 100, true, true);
    private ImageView imageViewFruit = new ImageView(imageFruit);
    private Image imageExchangeMoney = new Image("exchange_money.png", 150, 100, true, true);
    private ImageView imageViewExchange = new ImageView(imageExchangeMoney);
    private Image imageBread = new Image("pieczywo.png", 150, 100, true, true);
    private ImageView imageViewBread = new ImageView(imageBread);
    private Image imageSmartphonePay = new Image("smartphone-payment.png", 150, 100, true, true);
    private ImageView imageViewSmartphonePay = new ImageView(imageSmartphonePay);
    private Image imageDrink = new Image("napoje.png", 150, 100, true, true);
    private ImageView imageViewDrink = new ImageView(imageDrink);
    private Image imageVegetable = new Image("warzywa.png", 150, 100, true, true);
    private ImageView imageViewVegetable = new ImageView(imageVegetable);
    private Image imageShoppingCart = new Image("koszyk.png", 150, 100, true, true);
    private ImageView imageViewShoppingCart = new ImageView(imageShoppingCart);

}
