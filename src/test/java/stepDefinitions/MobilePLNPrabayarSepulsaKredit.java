package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPrabayarSepulsaKredit extends BaseStep {
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.signinPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.signinPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_tap_tombol_Listrik_PLN_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.menuPLN();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan$")
    public void keterangan_pelanggan_yang_akan_beli_token_listrik_dengan_Sepulsa_Kredit_ditampilkan() throws Throwable {
        plnPrepaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih nominal token listrik sebesar \"([^\"]*)\" untuk dibeli dengan Sepulsa Kredit$")
    public void user_memilih_nominal_token_listrik_sebesar_untuk_dibeli_dengan_Sepulsa_Kredit(String nominalToken) throws Throwable {
        plnPrepaid.idPelangganMuncul();
        plnPrepaid.beliToken(nominalToken);
        createScreenshots.captureScreenShots();
    }

    @When("^deposit Sepulsa Kredit untuk beli token listrik cukup$")
    public void deposit_Sepulsa_Kredit_untuk_beli_token_listrik_cukup() throws Throwable {
        plnPrepaid.saldoSepulsaCreditCukup();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Sepulsa Kredit untuk beli token listrik$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_untuk_beli_token_listrik() throws Throwable {
        plnPrepaid.pilihBayarSepulsaCredit();
        plnPrepaid.klikBayar();
        createScreenshots.captureScreenShots();
    }

    @Then("^user diarahkan ke halaman Informasi Pembayaran PLN Prabayar dengan Sepulsa Kredit$")
    public void user_diarahkan_ke_halaman_Informasi_Pembayaran_PLN_Prabayar_dengan_Sepulsa_Kredit() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanSepulsaCredit();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pemesanan token listrik dengan metode bayar Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_pemesanan_token_listrik_dengan_metode_bayar_Sepulsa_Kredit_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPrepaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^deposit Sepulsa Kredit untuk beli token listrik kurang$")
    public void deposit_Sepulsa_Kredit_untuk_beli_token_listrik_kurang() throws Throwable {
       plnPrepaid.saldoSepulsaCreditKurang();
       createScreenshots.captureScreenShots();
    }

    @Then("^tombol Bayar Tagihan untuk Pembayaran PLN Prabayar dengan Sepulsa Kredit tidak akan muncul$")
    public void tombol_Bayar_Tagihan_untuk_Pembayaran_PLN_Prabayar_dengan_Sepulsa_Credit_tidak_akan_muncul() throws Throwable {
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.bayarSepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_yang_tidak_valid_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenFail);
        createScreenshots.captureScreenShots();
    }

    @When("^muncul notifikasi \"([^\"]*)\" dan user tidak dapat membeli token listrik dengan Sepulsa Kredit$")
    public void muncul_notifikasi_dan_user_tidak_dapat_membeli_token_listrik(String arg1) throws Throwable {
        plnPrepaid.statusGagalTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user tidak punya saldo Sepulsa Credit untuk beli token listrik$")
    public void user_tidak_punya_saldo_Sepulsa_Credit_untuk_beli_token_listrik() throws Throwable {
        beranda.menuSepulsaCredit();
        sepulsaCredit.saldoKreditKosong();
        createScreenshots.captureScreenShots();
    }

    @When("^user mencoba membeli token listrik sebesar \"([^\"]*)\"  untuk dibayar dengan Sepulsa Kredit$")
    public void user_mencoba_membeli_token_listrik_sebesar_untuk_dibayar_dengan_Sepulsa_Kredit(String nominalToken) throws Throwable {
        sepulsaCredit.kembaliKeMenu();
        beranda.menuPLN();
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
        plnPrepaid.idPelangganMuncul();
        plnPrepaid.beliToken(nominalToken);
        createScreenshots.captureScreenShots();
    }

    @Then("^fitur pembayaran token listrik dengan Sepulsa Credit tidak akan muncul$")
    public void fitur_pembayaran_token_listrik_dengan_Sepulsa_Credit_tidak_akan_muncul() throws Throwable {
        plnPrepaid.pilihanMetodeBayar();
        plnPrepaid.sepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.kolomIDKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan membeli token listrik dengan metode bayar Sepulsa Kredit tidak muncul$")
    public void keterangan_pelanggan_yang_akan_membeli_token_listrik_dengan_metode_bayar_Sepulsa_Kredit_tidak_muncul() throws Throwable {
        plnPrepaid.statusPelangganTidakTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_mengosongkan_kolom_handphone_penerima_token_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.kolomHandphoneKosong();
        createScreenshots.captureScreenShots();
    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
