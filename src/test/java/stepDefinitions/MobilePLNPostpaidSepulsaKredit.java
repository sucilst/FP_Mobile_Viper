package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidSepulsaKredit extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        driver.resetApp();
        popUpPage.disableGPS();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.registerPhone);
        mainPage.isiPasswordSignIn(InputSepulsa.registerPassword);
        mainPage.submitSignIn();
        createScreenshots.captureScreenShots();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.sudahDiBeranda();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.menuPLN();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.isiNoHP(InputSepulsa.registerPhone);
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
        createScreenshots.captureScreenShots();
    }

    @When("^user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_tap_tombol_Bayar_Tagihan_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
        createScreenshots.captureScreenShots();
    }
    @When("^deposit Sepulsa Kredit untuk bayar tagihan listrik cukup$")
    public void deposit_Sepulsa_Kredit_untuk_bayar_tagihan_listrik_cukup() throws Throwable {
        plnPostpaid.saldoSepulsaCreditCukup();
        createScreenshots.captureScreenShots();
    }

    @When("^user memilih metode pembayaran Sepulsa Kredit untuk bayar tagihan PLN$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_untuk_bayar_tagihan_PLN() throws Throwable {
       plnPostpaid.pilihBayarSepulsaCredit();
       plnPostpaid.klikBayar();
       createScreenshots.captureScreenShots();
    }

    @Then("^user diarahkan ke halaman Informasi Pembayaran Tagihan PLN dengan Sepulsa Kredit$")
    public void user_diarahkan_ke_halaman_Informasi_Pembayaran_Tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        popUpPage.disablePopUp();
        plnPostpaid.diHalamanSepulsaCredit();
        createScreenshots.captureScreenShots();
    }

    @Then("^transaksi pembayaran PLN Pascabayar dengan metode bayar Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses$")
    public void transaksi_pembayaran_PLN_Pascabayar_dengan_metode_bayar_Sepulsa_Kredit_pada_halaman_History_muncul_di_daftar_Transaksi_Sukses() throws Throwable {
        plnPostpaid.keHalamanBeranda();
        beranda.sudahDiBeranda();
        beranda.klikMenuHistory();
        history.sudahDiHistory();
        history.cekTransaksiSukses();
        createScreenshots.captureScreenShots();
    }

    @When("^deposit Sepulsa Kredit untuk bayar tagihan listrik kurang$")
    public void deposit_Sepulsa_Kredit_untuk_bayar_tagihan_listrik_kurang() throws Throwable {
        plnPostpaid.saldoSepulsaCreditKurang();
        createScreenshots.captureScreenShots();
    }

    @Then("^tombol Bayar Tagihan untuk Pembayaran PLN Postpaid dengan Sepulsa Kredit tidak akan muncul$")
    public void tombol_Bayar_Tagihan_untuk_Pembayaran_PLN_Postpaid_dengan_Sepulsa_Kredit_tidak_akan_muncul() throws Throwable {
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.bayarSepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user tidak punya saldo Sepulsa Credit untuk bayar tagihan listrik$")
    public void user_tidak_punya_saldo_Sepulsa_Credit_untuk_bayar_tagihan_listrik() throws Throwable {
        beranda.menuSepulsaCredit();
        sepulsaCredit.saldoKreditKosong();
        createScreenshots.captureScreenShots();
    }

    @When("^user mencoba membayar tagihan listrik dengan Sepulsa Kredit$")
    public void user_mencoba_membayar_tagihan_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        sepulsaCredit.kembaliKeMenu();
        beranda.sudahDiBeranda();
        beranda.menuPLN();
        plnPostpaid.pilihPascabayar();
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
        plnPostpaid.statusPelangganTampil();
        plnPostpaid.keHalamanPembayaran();
        createScreenshots.captureScreenShots();
    }

    @Then("^fitur pembayaran tagihan listrik dengan Sepulsa Credit tidak akan muncul$")
    public void fitur_pembayaran_tagihan_listrik_dengan_Sepulsa_Credit_tidak_akan_muncul() throws Throwable {
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.sepulsaCreditTidakTersedia();
        createScreenshots.captureScreenShots();
    }

    @When("^user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit$")
    public void user_tap_pada_pilihan_Pascabayar_untuk_bayar_tagihan_PLN_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.pilihPascabayar();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid_untuk_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan bayar tagihan PLN Pascabayar dengan Sepulsa Kredit ditampilkan$")
    public void keterangan_pelanggan_yang_akan_bayar_tagihan_PLN_Pascabayar_dengan_Sepulsa_Kredit_ditampilkan() throws Throwable {
        plnPostpaid.statusPelangganTampil();
        createScreenshots.captureScreenShots();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" sehingga tidak bisa bayar PLN Pascabayar dengan Sepulsa Kredit$")
    public void muncul_notifikasi_sehingga_tidak_bisa_bayar_PLN_Pascabayar_dengan_Sepulsa_Kredit(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas \\(Sepulsa Kredit\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_sudah_lunas_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idPaid);
        createScreenshots.captureScreenShots();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan Sepulsa Kredit$")
    public void muncul_notifikasi_karena_tagihan_sudah_dibayar_sehingga_tidak_bisa_bayar_PLN_Pascabayar_dengan_Sepulsa_Kredit(String arg1) throws Throwable {
        plnPostpaid.statusSudahBayarTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan Sepulsa Kredit$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_bayar_tagihan_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.kolomIDKosong();
        createScreenshots.captureScreenShots();
    }

    @Then("^keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Sepulsa Kredit tidak muncul$")
    public void keterangan_pelanggan_yang_akan_membayar_tagihan_listrik_dengan_metode_bayar_Sepulsa_Kredit_tidak_muncul() throws Throwable {
        plnPostpaid.statusTagihanTidakTampil();
        createScreenshots.captureScreenShots();
    }

    @When("^user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_mengosongkan_kolom_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPostpaid.kolomHandphoneKosong();
        createScreenshots.captureScreenShots();
    }


}
