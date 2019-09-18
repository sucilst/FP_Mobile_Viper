Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran VA Semua Bank (Permata)

  @PLNPrabayarSemuaBank
  Scenario Outline: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank ditampilkan
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan Virtual Account Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk membayar token listrik
    And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik dengan Virtual Account Semua Bank
    And user masuk ke halaman Informasi Pembayaran PLN Prabayar dengan Virtual Account Semua Bank
    And user membayar lunas tagihan PLN Prabayar melalui Virtual Account Semua Bank
    Then transaksi pemesanan token listrik dengan metode bayar Virtual Account Semua Bank pada halaman History muncul di daftar Transaksi Sukses

    Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|

  @PLNPrabayarSemuaBank
  Scenario Outline: Pembelian PLN Prabayar Gagal (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank ditampilkan
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli dengan Virtual Account Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk membayar token listrik
    And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik dengan Virtual Account Semua Bank
    And user masuk ke halaman Informasi Pembayaran PLN Prabayar dengan Virtual Account Semua Bank
    And user belum membayar tagihan PLN Prabayar melalui Virtual Account Semua Bank hingga lebih dari batas waktu pembayaran
    Then transaksi pemesanan token listrik dengan metode bayar Virtual Account Semua Bank pada halaman History tidak ditemukan di daftar Transaksi Sukses

    Examples:
      |nominal   |
      |Rp 50.000 |
      |Rp 100.000|

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank ditampilkan
    And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa melanjutkan pemesanan (PLN Prabayar, VA Semua Bank)

  @PLNPrabayarSemuaBankmidnight
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (transaksi antara pukul 23.00-00.30)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank tengah malam
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank tengah malam
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank ditampilkan
    Then muncul notifikasi "Transaksi tidak dapat dilakukan" karena dilakukan tengah malam (PLN Prabayar, VA Semua Bank)

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank tidak muncul

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank tidak muncul

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom input Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik dengan Virtual Account Semua Bank
    When user tap tombol Listrik PLN untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik dengan Virtual Account Semua Bank
    And user mengosongkan kolom handphone penerima token listrik yang akan dibayar dengan Virtual Account Semua Bank
    Then keterangan pelanggan yang akan membeli token listrik dengan metode bayar Virtual Account Semua Bank tidak muncul
