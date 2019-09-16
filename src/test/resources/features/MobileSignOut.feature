Feature: [MOBILE] Sign Out

  @signout
  Scenario: User berhasil sign out dari aplikasi Sepulsa
    Given user sudah sign in di aplikasi mobile Sepulsa
    And user berada di dalam aplikasi mobile Sepulsa
    When user tap tombol menu pada aplikasi mobile Sepulsa
    And user tap tombol Sign out untuk keluar dari aplikasi mobile Sepulsa
    Then user keluar dari akun mobile Sepulsa
    And user masuk ke halaman utama aplikasi mobile Sepulsa