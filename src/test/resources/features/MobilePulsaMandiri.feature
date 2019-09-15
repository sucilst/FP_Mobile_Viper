Feature: isi pulsa dengan pembayaran Mandiri

  @pulsaMandiri_input
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Mandiri)
    And user berada di halaman beranda Sepulsa (pulsa Mandiri)
    When user tap tombol Isi Pulsa (pulsa Mandiri)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa Mandiri)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa Mandiri)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa Mandiri)
    And user memilih metode pembayaran Mandiri Virtual Account (pulsa Mandiri)
    And user tap pada tombol Bayar (pulsa Mandiri)
    And user masuk ke halaman Informasi Pembayaran (pulsa Mandiri)
    And user membayar lunas tagihan melalui Mandiri Virtual Account (pulsa Mandiri)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa Mandiri)

    Examples:
      |pulsa|
      |50   |
      |100  |
      |200  |
      |300  |
      |500  |

  @pulsaMandiri_phonebook
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa dengan input nomor telepon dari Phone Book)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Mandiri)
    And user berada di halaman beranda Sepulsa (pulsa Mandiri)
    When user tap tombol Isi Pulsa (pulsa Mandiri)
    And user tap tombol Ambil No Handphone dari Phone Book (pulsa Mandiri)
    And user memilih kontak yang akan diisi pulsanya (pulsa Mandiri)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa Mandiri)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa Mandiri)
    And user memilih metode pembayaran Mandiri Virtual Account (pulsa Mandiri)
    And user tap pada tombol Bayar (pulsa Mandiri)
    And user masuk ke halaman Informasi Pembayaran (pulsa Mandiri)
    And user membayar lunas tagihan melalui Mandiri Virtual Account (pulsa Mandiri)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa Mandiri)

    Examples:
      |pulsa|
      |50   |
      |100  |
      |200  |
      |300  |
      |500  |


  @pulsaMandiri_noHPInvalid
  Scenario: Transaksi Tidak Dapat Dilanjutkan (input nomor handphone kurang dari 8 digit)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Mandiri)
    And user berada di halaman beranda Sepulsa (pulsa Mandiri)
    When user tap tombol Isi Pulsa (pulsa Mandiri)
    And user memasukkan nomor telepon "081234" dengan jumlah kurang dari delapan digit (pulsa Mandiri)
    And user memilih nominal pulsa (pulsa Mandiri)
    Then akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' (pulsa Mandiri)
