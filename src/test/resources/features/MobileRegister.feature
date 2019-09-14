Feature: [MOBILE] Register di Aplikasi Mobile Sepulsa

  @register
  Scenario: Registrasi Sukses (user terdaftar melalui aplikasi mobile Sepulsa)
    Given user mengaktifkan aplikasi mobile Sepulsa
    And user belum sign in di aplikasi Sepulsa
    When user tap tombol Register
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan
    And user tap tombol Register
    And user memasukkan kode OTP
    And user tap tombol Verifikasi OTP
    Then user diarahkan ke halaman beranda Sepulsa


