Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran BCA VA

@PLNPrabayarBCA
Scenario Outline: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account
And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
And keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account ditampilkan
And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan BCA Virtual Account
And user memilih metode pembayaran BCA Virtual Account untuk membayar token listrik
And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik dengan BCA Virtual Account
And user masuk ke halaman Informasi Pembayaran PLN Prabayar dengan BCA Virtual Account
And user membayar lunas tagihan PLN Prabayar melalui BCA Virtual Account
Then transaksi pemesanan token listrik dengan metode bayar BCA Virtual Account pada halaman History muncul di daftar Transaksi Sukses

  Examples:
  |nominal   |
  |Rp 50.000 |
  |Rp 100.000|

  @PLNPrabayarBCA
  Scenario Outline: Pembelian PLN Prabayar Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account ditampilkan
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan BCA Virtual Account
    And user memilih metode pembayaran BCA Virtual Account untuk membayar token listrik
    And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik dengan BCA Virtual Account
    And user masuk ke halaman Informasi Pembayaran PLN Prabayar dengan BCA Virtual Account
    And user belum membayar tagihan PLN Prabayar melalui BCA Virtual Account hingga lebih dari batas waktu pembayaran
    Then transaksi pemesanan token listrik dengan metode bayar BCA Virtual Account pada halaman History tidak ditemukan di daftar Transaksi Sukses

      Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|

  @PLNPrabayarBCAmidnight
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (transaksi antara pukul 23.00-00.30)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account tengah malam
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account ditampilkan
    Then muncul notifikasi "Transaksi tidak dapat dilakukan" karena dilakukan tengah malam (PLN Prabayar, BCA VA)

  @PLNPrabayarBCA
Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
  Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
  When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
  And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan BCA Virtual Account
  And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
  And keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account ditampilkan
  Then muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa melanjutkan pemesanan (PLN Prabayar, BCA VA)

  @PLNPrabayarBCA
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account tidak muncul

  @PLNPrabayarBCA
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account tidak muncul

  @PLNPrabayarBCA
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan BCA Virtual Account
    When user tap tombol Listrik PLN untuk beli token listrik dengan BCA Virtual Account
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan BCA Virtual Account
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan BCA Virtual Account
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar BCA Virtual Account tidak muncul

