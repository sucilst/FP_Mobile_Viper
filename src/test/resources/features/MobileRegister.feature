Feature: [MOBILE] Register di Aplikasi Mobile Sepulsa

  @register
  Scenario: Registrasi Gagal (semua field kosong)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user mengosongkan kolom nama (Register) di aplikasi mobile Sepulsa
    And user mengosongkan kolom No Handphone (Register) pada kolom no handphone di aplikasi mobile Sepulsa
    And user mengosongkan kolom Email (Register) pada kolom email di aplikasi mobile Sepulsa
    And user mengosongkan kolom Password (Register) pada kolom password di aplikasi mobile Sepulsa
    And user tidak klik checkbox Syarat dan Ketentuan (Mobile)
    Then tombol Register akan tetap disable (Mobile)

  @register
  Scenario: Registrasi Gagal (kolom nama kosong)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user mengosongkan kolom nama (Register) di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi untuk mengisi semua kolom register (Mobile)

  @register
  Scenario: Registrasi Gagal (kolom no handphone kosong)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user mengosongkan kolom No Handphone (Register) pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi untuk mengisi semua kolom register (Mobile)

  @register
  Scenario: Registrasi Gagal (kolom email kosong)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user mengosongkan kolom Email (Register) pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi untuk mengisi semua kolom register (Mobile)

  @register
  Scenario: Registrasi Gagal (kolom password kosong)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user mengosongkan kolom Password (Register) pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi untuk mengisi semua kolom register (Mobile)

  @register
  Scenario: Registrasi Gagal (checkbox belum ditandai)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user tidak klik checkbox Syarat dan Ketentuan (Mobile)
    Then tombol Register akan tetap disable (Mobile)

  @register
  Scenario Outline: Registrasi Gagal (input no hp invalid)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan "<inputHP>" yang invalid pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi bahwa format no handphone untuk register invalid (Mobile)
    Examples:
    |inputHP|
    |012345678|
    |+6285691091|
    |628569109  |
    |87654321   |
    |87654321,  |

  @register
 Scenario Outline: Registrasi Gagal (input email invalid)
   Given user mengaktifkan aplikasi mobile Sepulsa
   When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
   And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
   And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
   And user memasukkan "<inputEmail>" yang invalid pada kolom email di aplikasi mobile Sepulsa
   And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
   And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
   And user tap tombol Register pada Sepulsa Mobile
   Then akan muncul notifikasi bahwa format email untuk register invalid (Mobile)
   Examples:
   |inputEmail|
   |apulinaalterraid|
   |apulina@alterraid|
   |apulinaalterra.id|

  @register
  Scenario: Registrasi Sukses (user terdaftar melalui aplikasi mobile Sepulsa)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    And user memasukkan kode OTP di Sepulsa Mobile
    And user tap tombol Verifikasi OTP di Sepulsa Mobile
    Then user diarahkan ke halaman beranda Sepulsa Mobile

  @register
  Scenario: Registrasi Gagal (user sudah terdaftar melalui aplikasi mobile Sepulsa)
    Given user mengaktifkan aplikasi mobile Sepulsa
    When user tap tombol Register untuk memiliki akun Sepulsa (Mobile)
    And user memasukkan Nama pada kolom nama di aplikasi mobile Sepulsa (sudah register)
    And user memasukkan No Handphone pada kolom no handphone di aplikasi mobile Sepulsa (sudah register)
    And user memasukkan Email pada kolom email di aplikasi mobile Sepulsa (sudah register)
    And user memasukkan Password pada kolom password di aplikasi mobile Sepulsa (sudah register)
    And user klik checkbox Syarat dan Ketentuan di Sepulsa Mobile
    And user tap tombol Register pada Sepulsa Mobile
    Then akan muncul notifikasi bahwa akun sudah terdaftar (mobile)