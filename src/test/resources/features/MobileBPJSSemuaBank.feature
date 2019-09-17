Feature: [MOBILE] Pembayaran BPJS menggunakan Metode Pembayaran VA Semua Bank (Permata)

  @BPJSSemuaBank
Scenario: Transaksi BPJS Kesehatan Berhasil (tagihan dibayar sebelum batas waktu habis)
 Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
 And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
 When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
  And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank
  And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank
  And informasi tagihan BPJS  yang akan dibayar dengan metode VA Semua Bank muncul di layar
  And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode VA Semua Bank
  And user memilih metode pembayaran Virtual Account Semua Bank untuk membayar tagihan BPJS
  And user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode VA Semua Bank
  And user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode VA Semua Bank
  And user membayar lunas tagihan BPJS melalui Virtual Account Semua Bank
  Then status pembayaran BPJS Kesehatan dengan Virtual Account Semua Bank pada halaman History berubah menjadi "INVOICED"
  And user dapat melihat bukti pembayaran BPJS dengan metode Virtual Account Semua Bank

  @BPJSSemuaBank
Scenario: Transaksi BPJS Kesehatan Gagal (tagihan belum dibayar melebihi batas waktu)
  Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
  And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank
  And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank
  And informasi tagihan BPJS  yang akan dibayar dengan metode VA Semua Bank muncul di layar
  And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode VA Semua Bank
  And user memilih metode pembayaran Virtual Account Semua Bank untuk membayar tagihan BPJS
  And user tap pada tombol Bayar untuk membayar tagihan BPJS dengan metode VA Semua Bank
  And user masuk ke halaman Informasi Pembayaran BPJS yang harus dibayar dengan metode VA Semua Bank
  And user belum membayar tagihan BPJS dengan metode VA Semua Bank hingga lebih dari batas waktu pembayaran
  Then transaksi BPJS Kesehatan dengan Virtual Account Semua Bank di aplikasi mobile Sepulsa statusnya berubah jadi EXPIRED

  @BPJSSemuaBank
Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS invalid)
  Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
  And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank
  And user memasukkan no BPJS Kesehatan yang tidak valid untuk dibayar dengan metode VA Semua Bank
  Then layar akan menunjukkan bahwa nomor BPJS tidak terdaftar dan tidak dapat dibayar dengan metode VA Semua Bank

  @BPJSSemuaBank
Scenario: Transaksi BPJS Kesehatan Gagal (tagihan BPJS sudah dibayar)
  Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
  When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
  And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank
  And user memasukkan no BPJS Kesehatan yang sudah dibayar untuk dibayar dengan metode VA Semua Bank
  And informasi tagihan BPJS yang harus dibayar dengan metode VA Semua Bank muncul di layar
  And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode VA Semua Bank
  Then layar akan menunjukkan bahwa tagihan BPJS sudah terbayar sehingga tidak dapat dibayar dengan metode VA Semua Bank

  @BPJSSemuaBank
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom no handphone kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
    And user mengosongkan nomor handphone yang diperlukan untuk syarat bayar BPJS dengan metode VA Semua Bank
    And user memasukkan no BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank
    And informasi tagihan BPJS yang harus dibayar dengan metode VA Semua Bank muncul di layar
    And user tap tombol Bayar Tagihan untuk lanjut pembayaran BPJS dengan metode VA Semua Bank
    Then user akan otomatis sign out dari aplikasi Sepulsa (BPJS VA Semua Bank)
    And user diarahkan ke halaman utama aplikasi Sepulsa (BPJS VA Semua Bank)

  @BPJSSemuaBank
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom no BPJS Kesehatan kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode VA Semua Bank
    When user tap tombol Bayar BPJS Kesehatan untuk untuk bayar BPJS dengan metode VA Semua Bank
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan metode VA Semua Bank
    And user mengosongkan kolom BPJS Kesehatan yang akan dibayar dengan metode VA Semua Bank
    Then informasi tagihan yang harus dibayar dengan BPJS Kesehatan tidak akan muncul
    And tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan metode VA Semua Bank tidak muncul