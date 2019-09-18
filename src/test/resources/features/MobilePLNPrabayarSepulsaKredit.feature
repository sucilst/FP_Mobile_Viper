Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran Sepulsa Credit

  @PLNPrabayarSepulsaKredit
  Scenario Outline: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (deposit cukup)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk beli token listrik cukup
    And user memilih metode pembayaran Sepulsa Kredit untuk beli token listrik
    Then user diarahkan ke halaman Informasi Pembayaran PLN Prabayar dengan Sepulsa Kredit
    And transaksi pemesanan token listrik dengan metode bayar Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses

    Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|


  @PLNPrabayarSepulsaKredit
  Scenario Outline: Pembelian PLN Prabayar dengan deposit Sepulsa Kredit kurang
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk beli token listrik kurang
    Then tombol Bayar Tagihan untuk Pembayaran PLN Prabayar dengan Sepulsa Kredit tidak akan muncul
    Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|

  @PLNPrabayarSepulsaKreditKosong
  Scenario Outline: Pembelian PLN Prabayar dengan Sepulsa Kredit tidak dapat dilakukan (saldo Sepulsa Credit nol)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tidak punya saldo Sepulsa Credit untuk beli token listrik
    And user mencoba membeli token listrik sebesar "<nominal>"  untuk dibayar dengan Sepulsa Kredit
    Then fitur pembayaran token listrik dengan Sepulsa Credit tidak akan muncul
    Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan beli token listrik dengan Sepulsa Kredit ditampilkan
    And muncul notifikasi "ID Pelanggan salah" dan user tidak dapat membeli token listrik dengan Sepulsa Kredit

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Sepulsa Kredit tidak muncul

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Sepulsa Kredit tidak muncul

  @PLNPrabayarSepulsaKredit
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom input Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk beli token listrik dengan Sepulsa Kredit
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Sepulsa Kredit
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Sepulsa Kredit tidak muncul
