package FirstThread;

import javafx.application.Platform;
import operations.SmartphonePaymentOperation;
import scenes_init.PaymentScene;

public class FirstThread {
    private PaymentScene paymentScene = new PaymentScene();
    private SmartphonePaymentOperation smartphonePaymentOperation = new SmartphonePaymentOperation();


    public void createThread() {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                double progressValue = 0.01 * i;
                Platform.runLater(() -> paymentScene.getProgressBar().setProgress(progressValue));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Platform.runLater(() -> paymentScene.getFinishedLabel().setVisible(true));

        });

        paymentScene.getStartButton().setOnAction(actionEvent -> {
            //paymentScene.getStartButton().setDisable(true);
            smartphonePaymentOperation.Operations();
            thread.start();
        });

    }
}
