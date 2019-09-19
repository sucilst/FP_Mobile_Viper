Feature: isi pulsa dengan pembayaran Credit Card

    @pulsaCC_input
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa CC)
    And user berada di halaman beranda Sepulsa (pulsa CC)
    When user tap tombol Isi Pulsa (pulsa CC)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa CC)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa CC)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa CC)
    And user memilih metode pembayaran Credit Card (pulsa CC)
    And user tap pada tombol Bayar (pulsa CC)
    And user masuk ke halaman Informasi Pembayaran (pulsa CC)
    And user membayar lunas tagihan melalui Credit Card (pulsa CC)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa CC)

    Examples:
      |pulsa|
      |50   |

  @pulsaCC_phonebook
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa dengan input nomor telepon dari Phone Book)
    Given user telah login di aplikasi mobile Sepulsa (pulsa CC)
    And user berada di halaman beranda Sepulsa (pulsa CC)
    When user tap tombol Isi Pulsa (pulsa CC)
    And user tap tombol Ambil No Handphone dari Phone Book (pulsa CC)
    And user memilih kontak yang akan diisi pulsanya (pulsa CC)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa CC)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa CC)
    And user memilih metode pembayaran Credit Card (pulsa CC)
    And user tap pada tombol Bayar (pulsa CC)
    And user masuk ke halaman Informasi Pembayaran (pulsa CC)
    And user membayar lunas tagihan melalui Credit Card (pulsa CC)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa CC)

    Examples:
      |pulsa|
      |50   |

  @pulsaCC_noHPInvalid
  Scenario: Transaksi Tidak Dapat Dilanjutkan (input nomor handphone kurang dari 8 digit)
    Given user telah login di aplikasi mobile Sepulsa (pulsa CC)
    And user berada di halaman beranda Sepulsa (pulsa CC)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user memasukkan nomor telepon "081234" dengan jumlah kurang dari delapan digit (pulsa CC)
    And user memilih nominal pulsa (pulsa CC)
    Then akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' (pulsa CC)

  @pulsaCC_salahInputCC
  Scenario Outline:  Transaksi Tidak Dapat Dilakukan (field CC ada yang invalid)
    Given user telah login di aplikasi mobile Sepulsa (pulsa CC)
    And user berada di halaman beranda Sepulsa (pulsa CC)
    When user tap tombol Isi Pulsa (pulsa CC)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa CC)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa CC)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa CC)
    And user memilih metode pembayaran Credit Card (pulsa CC)
    And mengisi "<field>" invalid (pulsa CC)
    Then user tidak dapat melanjutkan ke halaman selanjutnya (pulsa CC)

    Examples:
      |pulsa|field|
      |50   |3    |
      |100  |4    |
      |200  |5    |
      |1000 |1    |
      |50   |2    |