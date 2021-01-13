package second_scene;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonsIcons {
    private Image imageMoney = new Image("money_icon2.png", 150, 100, true, true);
    private ImageView imageViewMoney = new ImageView(imageMoney);
    private Image imageExchangeMoney = new Image("owoce.png", 150, 100, true, true);
    private ImageView imageViewExchange = new ImageView(imageExchangeMoney);
    private Image imageTransferMoney = new Image("warzywa.png", 150, 100, true, true);
    private ImageView imageViewTransfer = new ImageView(imageTransferMoney);
    private Image imageTransportTickets = new Image("pieczywo.png", 150, 100, true, true);
    private ImageView imageViewTransportTickets = new ImageView(imageTransportTickets);
    private Image imageSmartphonePay = new Image("exchange_money.png", 150, 100, true, true);
    private ImageView imageViewSmartphonePay = new ImageView(imageSmartphonePay);
    private Image phoneAccountMoney = new Image("napoje.png", 150, 100, true, true);
    private ImageView imageViewPhoneAccountMoney = new ImageView(phoneAccountMoney);

    public ImageView getImageViewMoney() {
        return imageViewMoney;
    }

    public ImageView getImageViewExchange() {
        return imageViewExchange;
    }

    public ImageView getImageViewTransfer() {
        return imageViewTransfer;
    }

    public ImageView getImageViewTransportTickets() {
        return imageViewTransportTickets;
    }

    public ImageView getImageViewSmartphonePay() {
        return imageViewSmartphonePay;
    }

    public ImageView getImageViewPhoneAccountMoney() {
        return imageViewPhoneAccountMoney;
    }

}
