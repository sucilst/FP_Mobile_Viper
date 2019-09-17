package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarMandiri extends BaseStep {

    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @When("^user memilih metode pembayaran Mandiri Virtual Account$")
    public void user_memilih_metode_pembayaran_Mandiri_Virtual_Account() throws Throwable {
        plnPrepaid.totalTagihanAwalMuncul();
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.pilihBayarMandiri();
    }

    @When("^user masuk ke halaman Informasi Pembayaran dengan Mandiri Virtual Account$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_dengan_Mandiri_Virtual_Account() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanTagihanMandiri();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }


}
