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
    }

    @Given("^user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_berada_di_halaman_beranda_aplikasi_mobile_Sepulsa_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.sudahDiBeranda();
    }

    @When("^user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_tap_tombol_Listrik_PLN_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
    }

    @When("^user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_handphone_penerima_token_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan$")
    public void keterangan_pelanggan_yang_akan_beli_token_listrik_dengan_Sepulsa_Kredit_ditampilkan() throws Throwable {
        plnPrepaid.statusPelangganTampil();
    }

    @When("^user memilih nominal token listrik yang akan dibayar dengan Sepulsa Kredit$")
    public void user_memilih_nominal_token_listrik_yang_akan_dibayar_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.beliToken100k();
    }

    @When("^deposit Sepulsa Kredit untuk beli token listrik cukup$")
    public void deposit_Sepulsa_Kredit_untuk_beli_token_listrik_cukup() throws Throwable {
        plnPrepaid.saldoSepulsaCreditCukup();
    }

    @When("^user memilih metode pembayaran Sepulsa Kredit untuk beli token listrik$")
    public void user_memilih_metode_pembayaran_Sepulsa_Kredit_untuk_beli_token_listrik() throws Throwable {
        plnPrepaid.pilihBayarSepulsaCredit();
        plnPrepaid.klikBayar();
    }

    @Then("^user diarahkan ke halaman Informasi Pembayaran dengan Sepulsa Kredit$")
    public void user_diarahkan_ke_halaman_Informasi_Pembayaran_dengan_Sepulsa_Kredit() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanSepulsaCredit();
    }

    @Then("^status pemesanan token listrik dengan Sepulsa Kredit pada halaman History berubah menjadi \"([^\"]*)\"$")
    public void status_pemesanan_token_listrik_dengan_Sepulsa_Kredit_pada_halaman_History_berubah_menjadi(String arg1) throws Throwable {

    }

    @Then("^kode token yang dibayar dengan Sepulsa Kredit diterima di nomor handphone yang telah didaftarkan$")
    public void kode_token_yang_dibayar_dengan_Sepulsa_Kredit_diterima_di_nomor_handphone_yang_telah_didaftarkan() throws Throwable {

    }

    @When("^deposit Sepulsa Kredit untuk beli token listrik kurang$")
    public void deposit_Sepulsa_Kredit_untuk_beli_token_listrik_kurang() throws Throwable {
       plnPrepaid.saldoSepulsaCreditKurang();
    }

    @When("^user tetap ingin memilih metode pembayaran Sepulsa Kredit untuk beli token listrik$")
    public void user_tetap_ingin_memilih_metode_pembayaran_Sepulsa_Kredit_untuk_beli_token_listrik() throws Throwable {
        plnPrepaid.pilihBayarSepulsaCredit();
    }

    @When("^user memilih metode pembayaran lain untuk melunasi sisa tagihan PLN Prabayar$")
    public void user_memilih_metode_pembayaran_lain_untuk_melunasi_sisa_tagihan_PLN_Prabayar() throws Throwable {
       plnPrepaid.pilihBayarBCA();
       plnPrepaid.klikBayar();
    }

    @When("^user melunasi sisa tagihan PLN Prabayar sebelum batas waktu pembayaran tagihan$")
    public void user_melunasi_sisa_tagihan_PLN_Prabayar_sebelum_batas_waktu_pembayaran_tagihan() throws Throwable {

    }

    @Then("^user diarahkan ke halaman Informasi Pembayaran PLN Prabayar dengan Sepulsa Credit$")
    public void user_diarahkan_ke_halaman_Informasi_Pembayaran_PLN_Prabayar_dengan_Sepulsa_Credit() throws Throwable {
        popUpPage.disablePopUp();
        plnPrepaid.diHalamanSepulsaCredit();
    }

    @When("^user belum melunasi tagihan token listrikhingga melewati batas waktu pembayaran tagihan$")
    public void user_belum_melunasi_tagihan_token_listrikhingga_melewati_batas_waktu_pembayaran_tagihan() throws Throwable {

    }

    @Then("^status pembelian token listrik menjadi Expired di aplikasi mobile Sepulsa$")
    public void status_pembelian_token_listrik_menjadi_Expired_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @Then("^deposit Sepulsa Kredit terpakai untuk beli token listrik akan kembali ke dompet Sepulsa Kredit$")
    public void deposit_Sepulsa_Kredit_terpakai_untuk_beli_token_listrik_akan_kembali_ke_dompet_Sepulsa_Kredit() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_yang_tidak_valid_untuk_beli_token_listrik_dengan_Sepulsa_Kredit() throws Throwable {
        plnPrepaid.isiIDPel(InputSepulsa.tokenFail);
    }

    @When("^muncul notifikasi \"([^\"]*)\" dan user tidak dapat membeli token listrik$")
    public void muncul_notifikasi_dan_user_tidak_dapat_membeli_token_listrik(String arg1) throws Throwable {
        plnPrepaid.statusGagalTampil();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik tengah malam dengan Sepulsa Kredit$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_untuk_beli_token_listrik_tengah_malam_dengan_Sepulsa_Kredit() throws Throwable {

    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena beli token di antara pukul (\\d+)\\.(\\d+) - (\\d+)\\.(\\d+)$")
    public void muncul_notifikasi_karena_beli_token_di_antara_pukul(String arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {

    }

    @When("^user tidak punya saldo Sepulsa Credit untuk beli token listrik$")
    public void user_tidak_punya_saldo_Sepulsa_Credit_untuk_beli_token_listrik() throws Throwable {
        beranda.menuSepulsaCredit();
        sepulsaCredit.saldoKreditKosong();
    }

    @When("^user mencoba membeli token listrik untuk dibayar dengan Sepulsa Credit$")
    public void user_mencoba_membeli_token_listrik_untuk_dibayar_dengan_Sepulsa_Credit() throws Throwable {
        sepulsaCredit.kembaliKeMenu();
        beranda.menuPLN();
        plnPrepaid.isiIDPel(InputSepulsa.tokenOKFirst);
        plnPrepaid.isiNoHP(InputSepulsa.registerPhone);
        plnPrepaid.beliToken50k();
    }

    @Then("^fitur pembayaran token listrik dengan Sepulsa Credit tidak akan muncul$")
    public void fitur_pembayaran_token_listrik_dengan_Sepulsa_Credit_tidak_akan_muncul() throws Throwable {
        plnPrepaid.sepulsaCreditTidakTersedia();
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena beli token saat tengah malam$")
    public void muncul_notifikasi_karena_beli_token_saat_tengah_malam(String arg1) throws Throwable {

    }

    @After
    public void closeApp(){
        driver.closeApp();
    }
}
