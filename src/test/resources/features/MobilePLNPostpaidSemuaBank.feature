Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran VA Semua Bank (Permata)

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    And keterangan pelanggan ditampilkan untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan VA Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user masuk ke halaman Informasi Pembayaran dengan Virtual Account Semua Bank
    And user membayar lunas tagihan PLN Pascabayar melalui Virtual Account Semua Bank
    Then status pemesanan PLN Pascabayar dengan VA Semua Bank pada halaman History berubah menjadi "INVOICED"
    And bukti pembayaran PLN Pascabayar dengan VA Semua Bank diterima di email pelanggan

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    And keterangan pelanggan ditampilkan untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan VA Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user masuk ke halaman Informasi Pembayaran dengan Virtual Account Semua Bank
    And user belum membayar tagihan PLN Pascabayar dengan VA Semua Bank hingga lebih dari batas waktu pembayaran
    Then email transaksi PLN Pascabayar dengan VA Semua Bank dibatalkan karena kadaluarsa akan masuk ke email pelanggan
    And transaksi terhapus PLN Pascabayar dengan VA Semua Bank dari History Transaksi di aplikasi mobile Sepulsa

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan pascabayar yang akan bayar dengan VA Semua Bank ditampilkan
    And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa bayar dengan VA Semua Bank

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (VA Semua Bank)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan pascabayar yang akan bayar dengan VA Semua Bank ditampilkan
    And muncul notifikasi "General Error" karena tagihan sudah dibayar sehingga tidak bisa bayar dengan VA Semua Bank