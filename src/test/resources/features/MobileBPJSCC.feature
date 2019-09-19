Feature: [MOBILE] Pembayaran BPJS menggunakan Metode Pembayaran Credit Card

@BPJS_cc_success
  Scenario: Transaksi BPJS Kesehatan Berhasil (tagihan dibayar sebelum batas waktu habis)
  Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
  When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
  And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
  And user memasukkan no BPJS Kesehatan yang akan dibayar (BPJS CC)
  And informasi tagihan BPJS yang akan dibayar muncul di layar (BPJS CC)
  And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS (BPJS CC)
  And user memilih metode pembayaran Credit Card untuk membayar tagihan BPJS (BPJS CC)
  And user tap pada tombol Bayar untuk membayar tagihan BPJS (BPJS CC)
  And user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar (BPJS CC)
  Then transaksi bayar tagihan BPJS Kesehatan dengan metode CC pada halaman History muncul di daftar Transaksi Sukses (BPJS CC)

  @BPJS_cc_failed_kosong
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom no BPJS Kesehatan kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
    And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
    And user mengosongkan kolom BPJS Kesehatan yang akan dibayar (BPJS CC)
    Then informasi tagihan BPJS Kesehatan yang harus dibayar tidak akan muncul (BPJS CC)
    And tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS tidak muncul (BPJS CC)

  @BPJS_cc_invalid
  Scenario Outline: Transaksi BPJS Kesehatan Gagal (input CC invalid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
    And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
    And user memasukkan no BPJS Kesehatan yang akan dibayar (BPJS CC)
    And informasi tagihan BPJS yang akan dibayar muncul di layar (BPJS CC)
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS (BPJS CC)
    And user memilih metode pembayaran Credit Card untuk membayar tagihan BPJS (BPJS CC)
    And memasukan "<detail>" yang salah saat memasukan credit card (BPJS CC)
    Then transaksi tidak bisa dilanjutkan karena error (BPJS CC)

    Examples:
    |detail|
    |1     |
    |2     |
    |3     |
    |4     |
    |5     |

  @BPJS_cc_id_invalid
  Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS invalid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
    And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
    And user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar (BPJS CC)
    Then layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar (BPJS CC)

  @BPJS_cc_terbayar
  Scenario: Transaksi BPJS Kesehatan Gagal (tagihan BPJS sudah dibayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
    And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
    And user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar (BPJS CC)
    And informasi tagihan BPJS yang akan dibayar muncul di layar (BPJS CC)
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS (BPJS CC)
    Then layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar (BPJS CC)

  @BPJS_cc_idkurang
  Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS digitnya kurang)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS (BPJS CC)
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS (BPJS CC)
    And user memasukkan nomor handphone untuk syarat bayar BPJS (BPJS CC)
    And user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar (BPJS CC)
    Then layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar (BPJS CC)
