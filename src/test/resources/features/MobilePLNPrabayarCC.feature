Feature: Listrik PLN Prabayar dengan Metode Pembayaran CC

@plnPrabayar_cc_success
  Scenario Outline: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
  Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
  When user tap tombol Listrik PLN untuk beli token listrik (pln prepaid cc)
  And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik (pln prepaid cc)
  And user mengetik nomor handphone penerima token listrik yang akan dibayar (pln prepaid cc)
  And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli (pln prepaid cc)
  And user memilih metode pembayaran Credit Card untuk membayar token listrik (pln prepaid cc)
  And user memasukkan detail kartu kredit (pln prepaid cc)
  And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik (pln prepaid cc)
  And user masuk ke halaman Informasi Pembayaran PLN Prabayar (pln prepaid cc)
  And user membayar lunas tagihan PLN Prabayar melalui (pln prepaid cc)
  Then transaksi pemesanan token listrik dengan metode bayar Credit Card pada halaman History muncul di daftar Transaksi Sukses (pln prepaid cc)

  Examples:
  |nominal|
  |50     |
  |100    |

  @plnPrabayar_cc_id_error
    Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    When user tap tombol Listrik PLN untuk beli token listrik (pln prepaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid untuk beli token listrik (pln prepaid cc)
    And user mengetik nomor handphone penerima token listrik yang akan dibayar (pln prepaid cc)
    And keterangan pelanggan yang akan membeli token listrik dengan metode bayar (pln prepaid cc)
    Then muncul notifikasi ID Pelanggan salah sehingga tidak bisa melanjutkan pemesanan (pln prepaid cc)

  @plnPrabayar_cc_id_kosong
  Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    When user tap tombol Listrik PLN untuk beli token listrik (pln prepaid cc)
    And user mengosongkan kolom PLN / ID Pelanggan untuk beli token listrik (pln prepaid cc)
    Then keterangan pelanggan yang akan membeli token listrik tidak muncul (pln prepaid cc)

  @plnPrabayar_cc_invalid
  Scenario Outline: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk beli token listrik (pln prepaid cc)
    When user tap tombol Listrik PLN untuk beli token listrik (pln prepaid cc)
    And user mengetik nomor meter PLN / ID Pelanggan untuk beli token listrik (pln prepaid cc)
    And user mengetik nomor handphone penerima token listrik yang akan dibayar (pln prepaid cc)
    And user memilih nominal token listrik sebesar "<nominal>" untuk dibeli (pln prepaid cc)
    And user memilih metode pembayaran Credit Card untuk membayar token listrik (pln prepaid cc)
    And user memasukkan "<detail>" salah pada kartu kredit (pln prepaid cc)
    And user tap pada tombol Bayar untuk melanjutkan pembayaran token listrik (pln prepaid cc)
    Then transaksi tidak bisa dilanjutkan karena error (pln prepaid cc)

    Examples:
      |nominal|detail|
      |50     |1     |
      |100    |2     |
      |50     |3     |
      |100    |4     |
      |50     |5     |
