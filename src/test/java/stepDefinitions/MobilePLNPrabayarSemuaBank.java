package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarSemuaBank extends BaseStep {

    @Before
    public void initiate() {
        driver = ThreadLocalDriver.getTLDriver();
    }

    @When("^user memilih metode pembayaran Virtual Account Semua Bank$")
    public void user_memilih_metode_pembayaran_Virtual_Account_Semua_Bank() throws Throwable {
        plnPrepaid.totalTagihanAwalMuncul();
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.pilihBayarSemuaBank();

    }

    @When("^user masuk ke halaman Informasi Pembayaran Virtual Account Semua Bank$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_Virtual_Account_Semua_Bank() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanTagihanSemuaBank();

    }

    @When("^user membayar lunas tagihan melalui Virtual Account Semua Bank$")
    public void user_membayar_lunas_tagihan_melalui_Virtual_Account_Semua_Bank() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}