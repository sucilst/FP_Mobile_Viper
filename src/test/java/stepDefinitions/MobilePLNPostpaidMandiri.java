package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.InputSepulsa;
import utils.ThreadLocalDriver;

public class MobilePLNPostpaidMandiri extends BaseStep {

    AndroidDriver driver;
    @Before
    public void initiate(){
        driver = ThreadLocalDriver.getTLDriver();
    }

    @When("^user tap tombol Listrik PLN untuk bayar tagihan pascabayar$")
    public void user_tap_tombol_Listrik_PLN_untuk_bayar_tagihan_pascabayar() throws Throwable {
        beranda.menuPLN();
    }

    @When("^user tap pada pilihan Pascabayar$")
    public void user_tap_pada_pilihan_Pascabayar() throws Throwable {
        plnPostpaid.pilihPascabayar();
    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idOKFirst);
    }

    @When("^user mengetik nomor handphone yang akan dibayar tagihan listriknya$")
    public void user_mengetik_nomor_handphone_yang_akan_dibayar_tagihan_listriknya() throws Throwable {
        plnPostpaid.isiNoHP(InputSepulsa.registerPhone);
    }

    @When("^keterangan pelanggan pascabayar ditampilkan$")
    public void keterangan_pelanggan_pascabayar_ditampilkan() throws Throwable {
        plnPostpaid.statusPelangganTampil();
    }

    @When("^tagihan PLN Pascabayar ditampilkan$")
    public void tagihan_PLN_Pascabayar_ditampilkan() throws Throwable {
        plnPostpaid.totalTagihanAwalMuncul();
    }

    @When("^user tap tombol Bayar Tagihan Sekarang$")
    public void user_tap_tombol_Bayar_Tagihan_Sekarang() throws Throwable {
        plnPostpaid.keHalamanPembayaran();
    }

    @When("^user memilih untuk membayar tagihan PLN Pascabayar dengan Mandiri Virtual Account$")
    public void user_memilih_untuk_membayar_tagihan_PLN_Pascabayar_dengan_Mandiri_Virtual_Account() throws Throwable {
        plnPostpaid.diHalamanPembayaran();
        plnPostpaid.pilihanMetodeBayar();
        plnPostpaid.pilihBayarMandiri();
    }

    @When("^user masuk ke halaman Informasi Pembayaran PLN Pascabayar dengan Mandiri Virtual Account$")
    public void user_masuk_ke_halaman_Informasi_Pembayaran_PLN_Pascabayar_dengan_Mandiri_Virtual_Account() throws Throwable {
        popUpPage.disablePopUp();
        plnPostpaid.diHalamanTagihanMandiri();
    }

    @When("^user membayar lunas tagihan melalui Mandiri Virtual Account$")
    public void user_membayar_lunas_tagihan_melalui_Mandiri_Virtual_Account() throws Throwable {

    }

    @Then("^bukti pembayaran PLN Pascabayar diterima di email pelanggan$")
    public void bukti_pembayaran_PLN_Pascabayar_diterima_di_email_pelanggan() throws Throwable {

    }

    @When("^user belum membayar tagihan hingga lebih dari batas waktu pembayaran$")
    public void user_belum_membayar_tagihan_hingga_lebih_dari_batas_waktu_pembayaran() throws Throwable {

    }

    @Then("^email transaksi dibatalkan karena kadaluarsa akan masuk ke email pelanggan$")
    public void email_transaksi_dibatalkan_karena_kadaluarsa_akan_masuk_ke_email_pelanggan() throws Throwable {

    }

    @Then("^transaksi terhapus dari History Transaksi di aplikasi mobile Sepulsa$")
    public void transaksi_terhapus_dari_History_Transaksi_di_aplikasi_mobile_Sepulsa() throws Throwable {

    }

    @When("^user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid$")
    public void user_mengetik_nomor_meter_PLN_ID_Pelanggan_Pascabayar_yang_tidak_valid() throws Throwable {
        plnPostpaid.isiIDPel(InputSepulsa.idError);
    }

    @Then("^muncul notifikasi \"([^\"]*)\" karena tagihan sudah dibayar$")
    public void muncul_notifikasi_karena_tagihan_sudah_dibayar(String arg1) throws Throwable {
        plnPostpaid.statusGagalTampil();
    }


}
