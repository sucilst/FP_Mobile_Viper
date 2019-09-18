Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran Sepulsa Credit

  @PLNPostpaidSepulsaKredit
  Scenario: Pembayaran PLN Postpaid Berhasil dengan aplikasi mobile Sepulsa (deposit cukup)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan bayar tagihan PLN Pascabayar dengan Sepulsa Kredit ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk bayar tagihan listrik cukup
    And user memilih metode pembayaran Sepulsa Kredit untuk bayar tagihan PLN
    Then user diarahkan ke halaman Informasi Pembayaran Tagihan PLN dengan Sepulsa Kredit
    And transaksi pembayaran PLN Pascabayar dengan metode bayar Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses

  @PLNPostpaidSepulsaKredit
  Scenario: Pembelian PLN Postpaid dengan deposit Sepulsa Kredit kurang
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    And keterangan pelanggan yang akan bayar tagihan PLN Pascabayar dengan Sepulsa Kredit ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Sepulsa Kredit
    And deposit Sepulsa Kredit untuk bayar tagihan listrik kurang
    Then tombol Bayar Tagihan untuk Pembayaran PLN Postpaid dengan Sepulsa Kredit tidak akan muncul

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Pembelian PLN Prabayar dengan Sepulsa Kredit tidak dapat dilakukan (saldo Sepulsa Credit nol)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tidak punya saldo Sepulsa Credit untuk bayar tagihan listrik
    And user mencoba membayar tagihan listrik dengan Sepulsa Kredit
    Then fitur pembayaran tagihan listrik dengan Sepulsa Credit tidak akan muncul

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan Sepulsa Kredit
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan bayar tagihan PLN Pascabayar dengan Sepulsa Kredit ditampilkan
    And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa bayar PLN Pascabayar dengan Sepulsa Kredit

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (Sepulsa Kredit)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan bayar tagihan PLN Pascabayar dengan Sepulsa Kredit ditampilkan
    And muncul notifikasi "General Error" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan Sepulsa Kredit

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan Sepulsa Kredit
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Sepulsa Kredit tidak muncul

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Sepulsa Kredit tidak muncul

  @PLNPostpaidSepulsaKreditKosong
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom input Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Sepulsa Kredit
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Sepulsa Kredit
    And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan Sepulsa Kredit
    And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan Sepulsa Kredit
    Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Sepulsa Kredit tidak muncul