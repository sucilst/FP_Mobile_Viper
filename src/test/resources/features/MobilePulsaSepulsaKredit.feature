Feature: isi pulsa dengan pembayaran Sepulsa Kredit
   @pulsaSK_input_full
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa SK)
    And user berada di halaman beranda Sepulsa (pulsa SK)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa SK)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa SK)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa SK)
    And user memilih metode pembayaran Sepulsa Kredit (pulsa SK)
    And user tap pada tombol Bayar (pulsa SK)
    And user masuk ke halaman Informasi Pembayaran (pulsa SK)
    And user membayar lunas tagihan melalui Sepulsa Kredit (pulsa SK)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa SK)

    Examples:
      |pulsa|
      |50   |

  @pulsaSK_phonebook
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa dengan input nomor telepon dari Phone Book)
    Given user telah login di aplikasi mobile Sepulsa (pulsa SK)
    And user berada di halaman beranda Sepulsa (pulsa SK)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user tap tombol Ambil No Handphone dari Phone Book (pulsa SK)
    And user memilih kontak yang akan diisi pulsanya (pulsa SK)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa SK)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa SK)
    And user memilih metode pembayaran Sepulsa Kredit (pulsa SK)
    And user tap pada tombol Bayar (pulsa SK)
    And user masuk ke halaman Informasi Pembayaran (pulsa SK)
    And user membayar lunas tagihan melalui Sepulsa Kredit (pulsa SK)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa SK)

    Examples:
      |pulsa|
      |50   |

  @pulsaSK_noHPInvalid
  Scenario: Transaksi Tidak Dapat Dilanjutkan (input nomor handphone kurang dari 8 digit)
    Given user telah login di aplikasi mobile Sepulsa (pulsa SK)
    And user berada di halaman beranda Sepulsa (pulsa SK)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user memasukkan nomor telepon "081234" dengan jumlah kurang dari delapan digit (pulsa SK)
    And user memilih nominal pulsa (pulsa SK)
    Then akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' (pulsa SK)

  @pulsaSK_input_split
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa SK)
    And user berada di halaman beranda Sepulsa (pulsa SK)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa SK)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa SK)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa SK)
    And user memilih metode pembayaran Sepulsa Kredit dan "<pembayaran>" lainnya untuk membayar sisanya (pulsa SK)
    And user tap pada tombol Bayar (pulsa SK)
    And user masuk ke halaman Informasi "<pembayaran>" (pulsa SK)
    And user membayar lunas tagihan melalui pembayaran (pulsa SK)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa SK)

    Examples:
      |pulsa|pembayaran|
      |500  |bca       |

  @pulsaSK_input_nol
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa SK)
    And user berada di halaman beranda Sepulsa (pulsa SK)
    When user tap tombol Isi Pulsa (pulsa SK)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa SK)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa SK)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa SK)
    Then user tidak melihat metode pembayaran Sepulsa Kredit (pulsa SK)

    Examples:
      |pulsa|
      |100  |