Feature: isi pulsa dengan pembayaran BCA
  @pulsaBCA

  @pulsaBCA_input
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa menggunakan input nomor manual)
    Given user telah login di aplikasi mobile Sepulsa (pulsa bca)
    And user berada di halaman beranda Sepulsa (pulsa bca)
    When user tap tombol Isi Pulsa (pulsa bca)
    And user mengetik nomor handphone yang akan diisi pulsanya (pulsa bca)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa bca)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa bca)
    And user memilih metode pembayaran BCA Virtual Account (pulsa bca)
    And user tap pada tombol Bayar (pulsa bca)
    And user masuk ke halaman Informasi Pembayaran (pulsa bca)
    And user membayar lunas tagihan melalui BCA Virtual Account (pulsa bca)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa bca)

    Examples:
    |pulsa|
    |50   |
    |100  |
    |200  |
    |300  |
    |500  |
    |1000 |

  @pulsaBCA_phonebook
  Scenario Outline:  Transaksi Sukses (user berhasil melakukan isi pulsa dengan aplikasi mobile Sepulsa dengan input nomor telepon dari Phone Book)
    Given user telah login di aplikasi mobile Sepulsa (pulsa bca)
    And user berada di halaman beranda Sepulsa (pulsa bca)
    When user tap tombol Isi Pulsa (pulsa bca)
    And user tap tombol Ambil No Handphone dari Phone Book (pulsa BCA)
    And user memilih kontak yang akan diisi pulsanya (pulsa BCA)
    And user memilih nominal "<pulsa>" yang akan dibeli (pulsa bca)
    And user melihat harga "<pulsa>" yang harus dibayar (pulsa bca)
    And user memilih metode pembayaran BCA Virtual Account (pulsa bca)
    And user tap pada tombol Bayar (pulsa bca)
    And user masuk ke halaman Informasi Pembayaran (pulsa bca)
    And user membayar lunas tagihan melalui BCA Virtual Account (pulsa bca)
    Then status pemesanan pulsa pada halaman History berubah menjadi INVOICED (pulsa bca)

    Examples:
      |pulsa|
      |50   |
      |100  |
      |200  |
      |300  |
      |500  |
      |1000 |

  @pulsaBCA_noHPInvalid
  Scenario: Transaksi Tidak Dapat Dilanjutkan (input nomor handphone kurang dari 8 digit)
    Given user telah login di aplikasi mobile Sepulsa (pulsa bca)
    And user berada di halaman beranda Sepulsa (pulsa bca)
    When user tap tombol Isi Pulsa (pulsa bca)
    And user memasukkan nomor telepon "081234" dengan jumlah kurang dari delapan digit (pulsa bca)
    And user memilih nominal pulsa (pulsa bca)
    Then akan muncul notifikasi 'Nomor handphone kurang dari delapan digit' (pulsa bca)
