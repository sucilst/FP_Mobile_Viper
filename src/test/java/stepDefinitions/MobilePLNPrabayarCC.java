package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarCC extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    //--------------------------------------------------SCENARIO 1------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.noTara1);
        mainPage.isiPasswordSignIn(InputSepulsa.passTara1);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Listrik PLN untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_tap_tombol_Listrik_PLN_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        beranda.menuPLN();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
        plnPrepaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone penerima token listrik yang akan dibayar \\(pln prepaid cc\\)$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_yang_akan_dibayar_pln_prepaid_cc() throws Throwable {
        plnPrepaid.kolomHandphoneKosong();
        plnPrepaid.isiNoHP(InputSepulsa.noRaka);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih nominal token listrik sebesar \"([^\"]*)\" untuk dibeli \\(pln prepaid cc\\)$")
    public void user_memilih_nominal_token_listrik_sebesar_untuk_dibeli_pln_prepaid_cc(String nominal) throws Throwable {
        plnPrepaid.beliToken(nominal);
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Credit Card untuk membayar token listrik \\(pln prepaid cc\\)$")
    public void user_memilih_metode_pembayaran_Credit_Card_untuk_membayar_token_listrik_pln_prepaid_cc() throws Throwable {
        plnPrepaid.pilihCC();
        createScreenshots.captureScreenShots();
    }

    @When("^user memasukkan detail kartu kredit \\(pln prepaid cc\\)$")
    public void user_memasukkan_detail_kartu_kredit_pln_prepaid_cc() throws Throwable {
        plnPrepaid.isiCreditCard();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik \\(pln prepaid cc\\)$")
    public void user_tap_pada_tombol_Bayar_untuk_melanjutkan_pembayaran_token_listrik_pln_prepaid_cc() throws Throwable {
        plnPrepaid.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user masuk ke halaman Informasi Pembayaran PLN Prabayar \\(pln prepaid cc\\)$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_PLN_Prabayar_pln_prepaid_cc() throws Throwable {
        plnPrepaid.isiMidtrans();
        createScreenshots.captureScreenShots();
    }

    @When("^user membayar lunas tagihan PLN Prabayar melalui \\(pln prepaid cc\\)$")
    public void user_membayar_lunas_tagihan_PLN_Prabayar_melalui_pln_prepaid_cc() throws Throwable {
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        plnPrepaid.diHalamanTagihanCC();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pemesanan token listrik dengan metode bayar Credit Card pada halaman History muncul di daftar Transaksi Sukses \\(pln prepaid cc\\)$")
    public void transaksi_pemesanan_token_listrik_dengan_metode_bayar_Credit_Card_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses_pln_prepaid_cc() throws Throwable {
        plnPrepaid.klikDoneButton();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 2------------------------------------------------------

    @When("^user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_yang_tidak_valid_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenFail);
        createScreenshots.captureScreenShots();
    }

    @When("^keterangan pelanggan yang akan membeli token listrik dengan metode bayar \\(pln prepaid cc\\)$")
    public void keterangan_pelanggan_yang_akan_membeli_token_listrik_dengan_metode_bayar_pln_prepaid_cc() throws Throwable {
        plnPrepaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @Then("^muncul notifikasi ID Pelanggan salah sehingga tidak bisa melanjutkan pemesanan \\(pln prepaid cc\\)$")
    public void muncul_notifikasi_ID_Pelanggan_salah_sehingga_tidak_bisa_melanjutkan_pemesanan_pln_prepaid_cc() throws Throwable {
        plnPrepaid.statusGagalTampil();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 3------------------------------------------------------

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik \\(pln prepaid cc\\)$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_beli_token_listrik_pln_prepaid_cc() throws Throwable {
        plnPrepaid.kolomIDKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan membeli token listrik tidak muncul \\(pln prepaid cc\\)$")
    public void keterangan_pelanggan_yang_akan_membeli_token_listrik_tidak_muncul_pln_prepaid_cc() throws Throwable {
        plnPrepaid.statusPelangganTidakTampil();
        createScreenshots.captureScreenShots();
    }

    //--------------------------------------------------SCENARIO 4------------------------------------------------------

    @When("^user memasukkan \"([^\"]*)\" salah pada kartu kredit \\(pln prepaid cc\\)$")
    public void user_memasukkan_salah_pada_kartu_kredit_pln_prepaid_cc(String detail) throws Throwable {
        plnPrepaid.isiCreditCardInvalid(detail);
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi tidak bisa dilanjutkan karena error \\(pln prepaid cc\\)$")
    public void transaksi_tidak_bisa_dilanjutkan_karena_error_pln_prepaid_cc() throws Throwable {

    }

}
