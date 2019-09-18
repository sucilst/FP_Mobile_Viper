Feature: [MOBILE] Pembayaran BPJS menggunakan Metode Pembayaran BCA Virtual Account

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode BCA VA
    And informasi tagihan BPJS yang akan dibayar dengan metode BCA VA muncul di layar
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode BCA VA
    And user memilih metode pembayaran BCA Virtual Account untuk membayar tagihan BPJS
    And user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode BCA VA
    And user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode BCA VA
    And user belum membayar tagihan BPJS dengan metode BCA VA hingga lebih dari batas waktu pembayaran
    Then transaksi bayar tagihan BPJS Kesehatan dengan metode BCA VA pada halaman History tidak muncul di daftar Transaksi Sukses

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Berhasil (tagihan dibayar sebelum batas waktu habis)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode BCA VA
    And informasi tagihan BPJS yang akan dibayar dengan metode BCA VA muncul di layar
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode BCA VA
    And user memilih metode pembayaran BCA Virtual Account untuk membayar tagihan BPJS
    And user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode BCA VA
    And user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode BCA VA
    And user membayar lunas tagihan BPJS melalui BCA Virtual Account
    Then transaksi bayar tagihan BPJS Kesehatan dengan metode BCA VA pada halaman History muncul di daftar Transaksi Sukses

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS invalid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar dengan metode BCA VA
    Then layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar dengan metode BCA VA

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (tagihan BPJS sudah dibayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar dengan metode BCA VA
    And informasi tagihan BPJS yang harus dibayar dengan metode BCA VA muncul di layar
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode BCA VA
    Then layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar dengan metode BCA VA

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom no handphone kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user mengosongkan nomor handphone yang diperlukan untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode BCA VA
    And informasi tagihan BPJS yang harus dibayar dengan metode BCA VA muncul di layar
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode BCA VA
    Then user akan otomatis sign out dari aplikasi Sepulsa (BPJS BCA VA)
    And user diarahkan ke halaman utama aplikasi Sepulsa (BPJS BCA VA)

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom no BPJS Kesehatan kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user mengosongkan kolom BPJS Kesehatan yang akan dibayar dengan metode BCA VA
    Then informasi tagihan BPJS Kesehatan yang harus dibayar dengan BCA VA tidak akan muncul
    And tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan metode BCA VA tidak muncul

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom input kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user mengosongkan nomor handphone yang diperlukan untuk syarat bayar BPJS dengan metode BCA VA
    And user mengosongkan kolom BPJS Kesehatan yang akan dibayar dengan metode BCA VA
    Then informasi tagihan BPJS Kesehatan yang harus dibayar dengan BCA VA tidak akan muncul
    And tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan metode BCA VA tidak muncul

  @BPJSBCA
  Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS digitnya kurang)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode BCA VA
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode BCA VA
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode BCA VA
    And user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar dengan metode BCA VA
    Then layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar dengan metode BCA VA