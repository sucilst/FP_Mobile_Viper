Feature: Sign in di aplikasi mobile Sepulsa

  @signin
  Scenario: Sign In berhasil (dengan email)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan email yang terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then user masuk ke halaman beranda aplikasi Sepulsa (mobile sign in)

  @signin
  Scenario: Sign In berhasil (dengan no handphone)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan no handphone yang terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then user masuk ke halaman beranda aplikasi Sepulsa (mobile sign in)

  @signin
  Scenario Outline: Sign In gagal (format invalid)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan "<email>" yang merupakan format input tidak valid di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then akan muncul notifikasi bahwa input email atau password salah (Mobile)

  Examples:
    |email|
    |apulinaalterraid|
    |apulina@alterraid|
    |apulinaalterra.id|
    |812345           |
    |+62812345678     |
    |0912345678.      |

  @signin
  Scenario: Sign In gagal (email tidak terdaftar)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan email yang tidak terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then akan muncul notifikasi bahwa input email atau password salah (Mobile)

  @signin
  Scenario: Sign In gagal (no handphone tidak terdaftar)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan no handphone yang tidak terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then akan muncul notifikasi bahwa input email atau password salah (Mobile)

  @signin
  Scenario: Sign In gagal (email terdaftar, password salah)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan email yang terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password yang salah di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then akan muncul notifikasi bahwa input email atau password salah (Mobile)

  @signin
  Scenario: Sign In gagal (no handphone terdaftar, password salah)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user memasukkan no handphone yang terdaftar di kolom No. Handphone atau Email (mobile sign in)
    And user memasukkan password yang salah di kolom password (mobile sign in)
    And user melakukan tap pada tombol Sign In (mobile sign in)
    Then akan muncul notifikasi bahwa input email atau password salah (Mobile)

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone kosong, kolom password terisi)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user mengosongkan kolom No. Handphone atau Email
    And user memasukkan password di kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom (Sign In Mobile)

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone terisi, kolom password kosong)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user mengisi kolom No. Handphone atau Email
    And user mengosongkan kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom (Sign In Mobile)

  @signin
  Scenario: Sign In gagal (kolom email atau no handphone kosong, kolom password kosong)
    Given user membuka aplikasi Sepulsa untuk sign in
    When user memilih tab SIGN IN (mobile sign in)
    And user mengosongkan kolom No. Handphone atau Email
    And user mengosongkan kolom password
    And user melakukan tap pada tombol Sign In
    Then akan muncul notifikasi untuk mengisi semua kolom (Sign In Mobile)