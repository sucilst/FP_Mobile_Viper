Feature: isi pulsa dengan pembayaran Permata

  @pulsaPermata_input
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Permata)
    And user berada di halaman beranda Sepulsa (pulsa Permata)
    When user tap tombol Isi Pulsa (pulsa Permata)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa Permata)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa Permata)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa Permata)
    And user memilih metode pembayaran Permata Virtual Account (pulsa Permata)
    And user tap pada tombol Bayar (pulsa Permata)
    And user masuk ke halaman Informasi Pembayaran (pulsa Permata)
    And user membayar lunas tagihan melalui Permata Virtual Account (pulsa Permata)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa Permata)

    Examples:
      |pulsa|
      |50   |
      |100  |
      |200  |
      |300  |
      |500  |

  @pulsaPermata_phonebook
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa dengan input nomor telepon dari Phone Book)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Permata)
    And user berada di halaman beranda Sepulsa (pulsa Permata)
    When user tap tombol Isi Pulsa (pulsa Permata)
    And user tap tombol Ambil No Handphone dari Phone Book (pulsa Permata)
    And user memilih kontak yang akan diisi pulsanya (pulsa Permata)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa Permata)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa Permata)
    And user memilih metode pembayaran Permata Virtual Account (pulsa Permata)
    And user tap pada tombol Bayar (pulsa Permata)
    And user masuk ke halaman Informasi Pembayaran (pulsa Permata)
    And user membayar lunas tagihan melalui Permata Virtual Account (pulsa Permata)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa Permata)

    Examples:
      |pulsa|
      |50   |
      |100  |
      |200  |
      |300  |
      |500  |


  @pulsaPermata_noHPInvalid
  Scenario: Transaksi Tidak Dapat Dilanjutkan (input nomor handphone kurang dari 8 digit)
    Given user telah login di aplikasi mobile Sepulsa (pulsa Permata)
    And user berada di halaman beranda Sepulsa (pulsa Permata)
    When user tap tombol Isi Pulsa (pulsa Permata)
    And user memasukkan nomor telepon "081234" dengan jumlah kurang dari delapan digit (pulsa Permata)
    And user memilih nominal pulsa (pulsa Permata)
    Then akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' (pulsa Permata)
