Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran VA Semua Bank (Permata)

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN
    And user mengetik nomor meter PLN / ID Pelanggan
    And user mengetik nomor handphone penerima token listrik
    And keterangan pelanggan ditampilkan
    And user memilih nominal token listrik
    And user memilih metode pembayaran Virtual Account Semua Bank
    And user tap pada tombol Bayar
    And user masuk ke halaman Informasi Pembayaran Virtual Account Semua Bank
    And user membayar lunas tagihan melalui Virtual Account Semua Bank
    Then status pemesanan pulsa pada halaman History berubah menjadi "INVOICED"
    And kode token diterima di nomor handphone yang telah didaftarkan

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar Gagal (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN
    And user mengetik nomor meter PLN / ID Pelanggan
    And user mengetik nomor handphone penerima token listrik
    And keterangan pelanggan ditampilkan
    And user memilih nominal token listrik
    And user memilih metode pembayaran Virtual Account Semua Bank
    And user tap pada tombol Bayar
    And user masuk ke halaman Informasi Pembayaran Virtual Account Semua Bank
    And user user belum membayar tagihan VA Semua Bank hingga lebih dari batas waktu pembayaran
    Then email transaksi dibatalkan karena kadaluarsa akan masuk ke email pelanggan
    And transaksi terhapus dari History Transaksi di aplikasi mobile Sepulsa

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid
    And user mengetik nomor handphone penerima token listrik
    Then keterangan pelanggan ditampilkan
    And muncul notifikasi "ID Pelanggan salah"

  @PLNPrabayarSemuaBank
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (transaksi antara pukul 23.00-00.30)
    Given user telah login di aplikasi mobile Sepulsa
    And user berada di halaman beranda aplikasi mobile Sepulsa
    When user tap tombol Listrik PLN
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid
    And user mengetik nomor handphone penerima token listrik
    Then keterangan pelanggan ditampilkan
    And muncul notifikasi "Transaksi tidak dapat dilakukan"