Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran Mandiri VA

  @PLNPostpaidMandiri
  Scenario: Transaksi PLN Pascabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN untuk bayar tagihan pascabayar
    And user tap pada pilihan Pascabayar
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar
    And user mengetik nomor handphone yang akan dibayar tagihan listriknya
    And keterangan pelanggan pascabayar ditampilkan
    And tagihan PLN Pascabayar ditampilkan
    And user tap tombol Bayar Tagihan Sekarang
    And user memilih untuk membayar tagihan PLN Pascabayar dengan Mandiri Virtual Account
    And user tap pada tombol Bayar
    And user masuk ke halaman Informasi Pembayaran PLN Pascabayar dengan Mandiri Virtual Account
    And user membayar lunas tagihan melalui Mandiri Virtual Account
    Then status pemesanan pulsa pada halaman History berubah menjadi "INVOICED"
    And bukti pembayaran PLN Pascabayar diterima di email pelanggan

  @PLNPostpaidMandiri
  Scenario: Transaksi PLN Pascabayar Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN untuk bayar tagihan pascabayar
    And user tap pada pilihan Pascabayar
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar
    And user mengetik nomor handphone yang akan dibayar tagihan listriknya
    And keterangan pelanggan pascabayar ditampilkan
    And tagihan PLN Pascabayar ditampilkan
    And user tap tombol Bayar Tagihan Sekarang
    And user memilih untuk membayar tagihan PLN Pascabayar dengan Mandiri Virtual Account
    And user tap pada tombol Bayar
    And user masuk ke halaman Informasi Pembayaran PLN Pascabayar dengan Mandiri Virtual Account
    And user belum membayar tagihan hingga lebih dari batas waktu pembayaran
    Then email transaksi dibatalkan karena kadaluarsa akan masuk ke email pelanggan
    And transaksi terhapus dari History Transaksi di aplikasi mobile Sepulsa

  @PLNPostpaidMandiri
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN untuk bayar tagihan pascabayar
    And user tap pada pilihan Pascabayar
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid
    And user mengetik nomor handphone yang akan dibayar tagihan listriknya
    Then keterangan pelanggan pascabayar ditampilkan
    And muncul notifikasi "ID Pelanggan salah"

  @PLNPostpaidMandiri
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN untuk bayar tagihan pascabayar
    And user tap pada pilihan Pascabayar
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid
    And user mengetik nomor handphone yang akan dibayar tagihan listriknya
    Then keterangan pelanggan pascabayar ditampilkan
    And muncul notifikasi "General Error" karena tagihan sudah dibayar