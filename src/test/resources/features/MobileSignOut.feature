Feature: [MOBILE] Sign Out

  @signout
  Scenario: User berhasil sign out dari aplikasi Sepulsa
    Given user sudah sign in di aplikasi Sepulsa
    And user berada di dalam aplikasi Sepulsa
    When user tap tombol menu
    And user tap tombol Sign out
    Then user keluar dari akun Sepulsa
    And user masuk ke halaman utama aplikasi Sepulsa