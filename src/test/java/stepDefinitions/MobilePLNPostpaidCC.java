package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidCC extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    //--------------------------------------------------SCENARIO 1------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa \\(pln poastpaid cc\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_pln_poastpaid_cc() throws Throwable {
        driver.resetApp();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.noTara1);
        mainPage.isiPasswordSignIn(InputSepulsa.passTara1);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa \\(pln poastpaid cc\\)$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_pln_poastpaid_cc() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN \\(pln poastpaid cc\\)$")
    public void user_tap_tombol_Listrik_PLN_pln_poastpaid_cc() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user tap pada pilihan Pascabayar \\(pln poastpaid cc\\)$")
    public void user_tap_pada_pilihan_Pascabayar_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.pilihPascabayar();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKSecond);
    }

    @When("^user mengetik nomor handphone penerima token listrik \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_pln_poastpaid_cc() throws Throwable {

    }

    @When("^keterangan pelanggan ditampilkan \\(pln poastpaid cc\\)$")
    public void keterangan_pelanggan_ditampilkan_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.statusPelangganTampil();
    }

    @When("^user tap tombol Bayar Tagihan \\(pln poastpaid cc\\)$")
    public void user_tap_tombol_Bayar_Tagihan_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
    }

    @When("^user memilih metode pembayaran Credit Card \\(pln poastpaid cc\\)$")
    public void user_memilih_metode_pembayaran_Credit_Card_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.pilihBayarCC();
    }

    @When("^user memasukkan detail kartu kredit \\(pln poastpaid cc\\)$")
    public void user_memasukkan_detail_kartu_kredit_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.isiCreditCard();
    }

    @When("^user tap pada tombol Bayar \\(pln poastpaid cc\\)$")
    public void user_tap_pada_tombol_Bayar_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.klikBayar();
    }

    @When("^user masuk ke halaman pihak ketiga pembayaran \\(pln poastpaid cc\\)$")
    public void user_masuk_ke_halaman_pihak_ketiga_pembayaran_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.isiMidtrans();
    }

    @When("^user memasukkan password pembayaran \\(pln poastpaid cc\\)$")
    public void user_memasukkan_password_pembayaran_pln_poastpaid_cc() throws Throwable {
        //diisi manual
    }

    @Then("^user diarahkan ke halaman Informasi Pembayaran \\(pln poastpaid cc\\)$")
    public void user_diarahkan_ke_halaman_Informasi_Pembayaran_pln_poastpaid_cc() throws Throwable {
        popUpPage.munculKamuSukaSepulsa();
        popUpPage.munculAutoPay();
        plnPostpaid.diHalamanTagihanCC();
    }

    @Then("^status pemesanan pulsa pada halaman History berubah menjadi INVOICED \\(pln poastpaid cc\\)$")
    public void status_pemesanan_pulsa_pada_halaman_History_berubah_menjadi_INVOICED_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.klikDoneButton();
        beranda.sudahDiBeranda();
    }

    @Then("^bukti pembayaran PLN Pascabayar diterima di email pelanggan \\(pln poastpaid cc\\)$")
    public void bukti_pembayaran_PLN_Pascabayar_diterima_di_email_pelanggan_pln_poastpaid_cc() throws Throwable {

    }

    //--------------------------------------------------SCENARIO 2------------------------------------------------------

    @Given("^user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN \\(pln poastpaid cc\\)$")
    public void user_telah_login_di_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_pln_poastpaid_cc() throws Throwable {
        driver.resetApp();
        mainPage.klikMulai();
        mainPage.isiIdSignIn(InputSepulsa.noTara1);
        mainPage.isiPasswordSignIn(InputSepulsa.passTara1);
        mainPage.submitSignIn();
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN \\(pln poastpaid cc\\)$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_bayar_tagihan_PLN_pln_poastpaid_cc() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan PLN \\(pln poastpaid cc\\)$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_PLN_pln_poastpaid_cc() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user tap pada pilihan Pascabayar untuk bayar tagihan \\(pln poastpaid cc\\)$")
    public void user_tap_pada_pilihan_Pascabayar_untuk_bayar_tagihan_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.pilihPascabayar();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid_untuk_dibayar_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
    }

    @When("^user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_handphone_pemilik_tagihan_listrik_yang_akan_dibayar_pln_poastpaid_cc() throws Throwable {

    }

    @Then("^muncul notifikasi ID Pelanggan salah sehingga tidak bisa bayar PLN Pascabayar \\(pln poastpaid cc\\)$")
    public void muncul_notifikasi_ID_Pelanggan_salah_sehingga_tidak_bisa_bayar_PLN_Pascabayar_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.statusGagalTampil();
    }

    //--------------------------------------------------SCENARIO 3------------------------------------------------------

    @When("^user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik \\(pln poastpaid cc\\)$")
    public void user_mengosongkan_kolom_PLN_ID_Pelanggan_untuk_bayar_tagihan_listrik_pln_poastpaid_cc() throws Throwable {

    }

    @When("^user mengetik nomor handphone penerima token listrik yang akan dibayar \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_yang_akan_dibayar_pln_poastpaid_cc() throws Throwable {

    }

    @Then("^keterangan pelanggan yang akan membayar tagihan listrik tidak muncul \\(pln poastpaid cc\\)$")
    public void keterangan_pelanggan_yang_akan_membayar_tagihan_listrik_tidak_muncul_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.statusTagihanTidakTampil();
    }

    //--------------------------------------------------SCENARIO 4------------------------------------------------------

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas \\(pln poastpaid cc\\)$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_sudah_lunas_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idPaid);
    }

    @Then("^muncul notifikasi General Error karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar \\(pln poastpaid cc\\)$")
    public void muncul_notifikasi_General_Error_karena_tagihan_sudah_dibayar_sehingga_tidak_bisa_bayar_PLN_Pascabayar_pln_poastpaid_cc() throws Throwable {
        plnPostpaid.statusSudahBayarTampil();
    }

    //--------------------------------------------------SCENARIO 5------------------------------------------------------

    @When("^user memasukkan \"([^\"]*)\" salah pada kartu kredit \\(pln poastpaid cc\\)$")
    public void user_memasukkan_salah_pada_kartu_kredit_pln_poastpaid_cc(String detail) throws Throwable {
        plnPostpaid.isiCreditCardInvalid(detail);
    }

    @Then("^muncul user tidak dapat melanjutkan transaksi$")
    public void muncul_user_tidak_dapat_melanjutkan_transaksi() throws Throwable {

    }

}
