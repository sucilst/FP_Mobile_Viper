package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import screens.*;
import utils.ThreadLocalDriver;

public class BaseStep {
    AndroidDriver driver;
    BayarBPJS bayarBPJS;
    Beranda beranda;
    IsiPulsa isiPulsa;
    PLNPrepaid plnPrepaid;
    PLNPostpaid plnPostpaid;
    MainPage mainPage;
    PopUpPage popUpPage;
    SepulsaCredit sepulsaCredit;
    CreateScreenshots createScreenshots;
    History history;

    public BaseStep(){
        driver = ThreadLocalDriver.getTLDriver();
        bayarBPJS = new BayarBPJS(driver);
        beranda = new Beranda(driver);
        isiPulsa = new IsiPulsa(driver);
        plnPrepaid = new PLNPrepaid(driver);
        plnPostpaid = new PLNPostpaid(driver);
        mainPage = new MainPage(driver);
        popUpPage = new PopUpPage(driver);
        sepulsaCredit = new SepulsaCredit(driver);
        createScreenshots = new CreateScreenshots(driver);
        history = new History(driver);
    }
}
