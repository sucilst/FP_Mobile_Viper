Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran VA Semua Bank (Permata)

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    And keterangan pelanggan yang akan bayar tagihan PLN dengan Virtual Account Semua Bank ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan VA Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan Virtual Account Semua Bank
    And user membayar lunas tagihan PLN Pascabayar melalui Virtual Account Semua Bank
    Then transaksi pemesanan PLN Pascabayar dengan metode bayar VA Semua Bank pada halaman History muncul di daftar Transaksi Sukses


  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    And keterangan pelanggan yang akan bayar tagihan PLN dengan Virtual Account Semua Bank ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan VA Semua Bank
    And user memilih metode pembayaran Virtual Account Semua Bank untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan Virtual Account Semua Bank
    And user belum membayar tagihan PLN Pascabayar dengan VA Semua Bank hingga lebih dari batas waktu pembayaran
    Then transaksi PLN Pascabayar dengan metode bayar VA Semua Bank pada halaman History tidak ditemukan di daftar Transaksi Sukses

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan yang akan bayar tagihan PLN dengan Virtual Account Semua Bank ditampilkan
    And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa bayar PLN Pascabayar dengan VA Semua Bank

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (VA Semua Bank)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan yang akan bayar tagihan PLN dengan Virtual Account Semua Bank ditampilkan
    And muncul notifikasi "General Error" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan VA Semua Bank

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan VA Semua Bank
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar VA Semua Bank tidak muncul

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan VA Semua Bank
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan VA Semua Bank
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan VA Semua Bank
    And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan VA Semua Bank
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar VA Semua Bank tidak muncul

  @PLNPostpaidSemuaBank
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom input Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
    And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan VA Semua Bank
    And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan VA Semua Bank
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar VA Semua Bank tidak muncul