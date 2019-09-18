Feature: membayar tagihan PLN Postpaid menggunakan CC
  @plnPostpaid_CC

  @plnPostpaid_CC_success
  Scenario: sukses membayar tagihan PLN Postpaid
    Given user telah login di aplikasi mobile Sepulsa (pln poastpaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa (pln poastpaid cc)
    When user tap tombol Listrik PLN (pln poastpaid cc)
    And user tap pada pilihan Pascabayar (pln poastpaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan (pln poastpaid cc)
    And user mengetik nomor handphone penerima token listrik (pln poastpaid cc)
    And keterangan pelanggan ditampilkan (pln poastpaid cc)
    And user tap tombol Bayar Tagihan (pln poastpaid cc)
    And user memilih metode pembayaran Credit Card (pln poastpaid cc)
    And user memasukkan detail kartu kredit (pln poastpaid cc)
    And user tap pada tombol Bayar (pln poastpaid cc)
    And user masuk ke halaman pihak ketiga pembayaran (pln poastpaid cc)
    And user memasukkan password pembayaran (pln poastpaid cc)
    Then user diarahkan ke halaman Informasi Pembayaran (pln poastpaid cc)
    And status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pln poastpaid cc)
    And bukti pembayaran PLN Pascabayar diterima di email pelanggan (pln poastpaid cc)

  @plnPostpaid_CC_ID_invalid
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    When user tap tombol Listrik PLN untuk bayar tagihan PLN (pln poastpaid cc)
    And user tap pada pilihan Pascabayar untuk bayar tagihan (pln poastpaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar (pln poastpaid cc)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar (pln poastpaid cc)
    Then muncul notifikasi ID Pelanggan salah sehingga tidak bisa bayar PLN Pascabayar (pln poastpaid cc)

  @plnPostpaid_CC_empty
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    When user tap tombol Listrik PLN untuk bayar tagihan PLN (pln poastpaid cc)
    And user tap pada pilihan Pascabayar untuk bayar tagihan (pln poastpaid cc)
    And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik (pln poastpaid cc)
    And user mengetik nomor handphone penerima token listrik yang akan dibayar (pln poastpaid cc)
    Then keterangan pelanggan yang akan membayar tagihan listrik tidak muncul (pln poastpaid cc)

  @plnPostpaid_CC_bill_paid
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN (pln poastpaid cc)
    When user tap tombol Listrik PLN untuk bayar tagihan PLN (pln poastpaid cc)
    And user tap pada pilihan Pascabayar untuk bayar tagihan (pln poastpaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (pln poastpaid cc)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar (pln poastpaid cc)
    Then muncul notifikasi General Error karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar (pln poastpaid cc)

  @plnPostpaid_CC_FAILED
  Scenario Outline: sukses membayar tagihan PLN Postpaid
    Given user telah login di aplikasi mobile Sepulsa (pln poastpaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa (pln poastpaid cc)
    When user tap tombol Listrik PLN (pln poastpaid cc)
    And user tap pada pilihan Pascabayar (pln poastpaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan (pln poastpaid cc)
    And user mengetik nomor handphone penerima token listrik (pln poastpaid cc)
    And keterangan pelanggan ditampilkan (pln poastpaid cc)
    And user tap tombol Bayar Tagihan (pln poastpaid cc)
    And user memilih metode pembayaran Credit Card (pln poastpaid cc)
    And user memasukkan "<detail>" salah pada kartu kredit (pln poastpaid cc)
    And user tap pada tombol Bayar (pln poastpaid cc)
    Then muncul user tidak dapat melanjutkan transaksi

    Examples:
    |detail|
    |1     |
    |2     |
    |3     |
    |4     |
    |5     |