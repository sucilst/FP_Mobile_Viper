Feature: Sign in di aplikasi mobile Sepulsa

  @signin
  Scenario: Sign In berhasil (dengan email)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan email yang terdaftar di kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then user masuk ke halaman beranda aplikasi Sepulsa

  @signin
  Scenario: Sign In berhasil (dengan no handphone)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan no handphone yang terdaftar di kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then user masuk ke halaman beranda aplikasi Sepulsa

  @signin
  Scenario: Sign In gagal (email tidak terdaftar)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan email yang tidak terdaftar di kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi "Email atau password salah"

  @signin
  Scenario: Sign In gagal (no handphone tidak terdaftar)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan no handphone yang tidak terdaftar di kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi "Email atau password salah"

  @signin
  Scenario: Sign In gagal (email terdaftar, password salah)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan email yang terdaftar di kolom No. Handphone atau Email
    And user memasukkan password yang salah di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi "Email atau password salah"

  @signin
  Scenario: Sign In gagal (no handphone terdaftar, password salah)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user memasukkan no handphone yang terdaftar di kolom No. Handphone atau Email
    And user memasukkan password yang salah di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi "Email atau password salah"

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone kosong, kolom password terisi)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user mengosongkan kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone terisi, kolom password kosong)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user mengisi kolom No. Handphone atau Email
    And user mengosongkan kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone kosong, kolom password kosong)
    Given user membuka aplikasi Sepulsa
    When user memilih tab SIGN IN
    And user mengosongkan kolom No. Handphone atau Email
    And user mengosongkan kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom