Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran Sepulsa Credit

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (deposit cukup)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And user memilih nominal token listrik yang akan dibayar dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk beli token listrik cukup
    And user memilih metode pembayaran Sepulsa Kredit untuk beli token listrik
    Then user diarahkan ke halaman Informasi Pembayaran dengan Sepulsa Kredit
    And status pemesanan token listrik dengan Sepulsa Kredit pada halaman History berubah menjadi "INVOICED"
    And kode token yang dibayar dengan Sepulsa Kredit diterima di nomor handphone yang telah didaftarkan

  @PLNPrabayarSepulsaKreditKurang
  Scenario: Pembelian PLN Prabayar dengan deposit Sepulsa Kredit kurang
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And user memilih nominal token listrik yang akan dibayar dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk beli token listrik kurang
    Then tombol Bayar Tagihan untuk Pembayaran PLN Prabayar dengan Sepulsa Kredit tidak akan muncul
    And akan keluar metode lain untuk melunasi Pembayaran PLN Prabayar dengan Sepulsa Credit

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar dengan Sepulsa Kredit tidak dapat dilanjutkan (saldo Sepulsa Credit nol)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tidak punya saldo Sepulsa Credit untuk beli token listrik
    And user mencoba membeli token listrik untuk dibayar dengan Sepulsa Credit
    Then fitur pembayaran token listrik dengan Sepulsa Credit tidak akan muncul

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And muncul notifikasi "ID Pelanggan salah" dan user tidak dapat membeli token listrik

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (transaksi antara pukul 23.00-00.30)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik tengah malam dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And muncul notifikasi "Transaksi tidak dapat dilakukan" karena beli token saat tengah malam