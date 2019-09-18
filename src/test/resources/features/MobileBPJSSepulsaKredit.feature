Feature: [MOBILE] Pembayaran BPJS menggunakan Sepulsa Kredit

@BPJSSepulsaKredit
Scenario: Transaksi BPJS Kesehatan Berhasil (deposit cukup)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
And user memasukkan no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit
And informasi tagihan BPJS Kesehatan yang akan dibayar dengan Sepulsa Kredit muncul di layar
And user tap tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan Sepulsa Kredit
And deposit Sepulsa Kredit cukup untuk melunasi tagihan BPJS Kesehatan
And user memilih metode pembayaran Sepulsa Kredit untuk melunasi tagihan BPJS Kesehatan
Then user menerima bukti pelunasan pembayaran BPJS Kesehatan
And transaksi bayar tagihan BPJS Kesehatan dengan Sepulsa Kredit pada halaman History muncul di daftar Transaksi Sukses

@BPJSSepulsaKredit
Scenario: Transaksi BPJS Kesehatan Tidak Dapat Dilanjutkan (deposit kurang)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
And user memasukkan no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit
And informasi tagihan BPJS Kesehatan yang akan dibayar dengan Sepulsa Kredit muncul di layar
And user tap tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan Sepulsa Kredit
And deposit Sepulsa Kredit kurang dari tagihan BPJS Kesehatan
Then tombol Bayar Tagihan untuk Pembayaran BPJS Kesehatan dengan Sepulsa Kredit tidak akan muncul

  @BPJSSepulsaKreditKosong
  Scenario: Fitur Transaksi BPJS Kesehatan dengan Sepulsa Kredit tidak tersedia (saldo nol)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    When user tidak punya saldo Sepulsa Credit untuk bayar tagihan BPJS Kesehatan
    And user mencoba untuk membayar tagihan BPJS Kesehatan dengan Sepulsa Kredit
    Then fitur Pembayaran BPJS Kesehatan dengan Sepulsa Kredit tidak akan muncul

@BPJSSepulsaKreditKosong
Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS invalid)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
And user memasukkan no BPJS Kesehatan yang tidak valid untuk dilunasi dengan metode Sepulsa Kredit
Then layar akan menunjukkan bahwa nomor ID BPJS tidak terdaftar (Sepulsa Kredit)

@BPJSSepulsaKredit
Scenario: Transaksi BPJS Kesehatan Gagal (tagihan BPJS sudah dibayar)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
And user memasukkan no BPJS Kesehatan yang sudah dibayar (Sepulsa Kredit)
And informasi tagihan BPJS Kesehatan yang akan dibayar dengan Sepulsa Kredit muncul di layar
And user tap tombol Bayar Tagihan untuk melanjutkan pembayaran dengan Sepulsa Kredit
Then layar akan menunjukkan bahwa tagihan BPJS sudah terbayar (Sepulsa Kredit)

@BPJSSepulsaKreditKosong
Scenario: Transaksi BPJS Kesehatan Gagal (kolom no handphone kosong)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user mengosongkan nomor handphone untuk syarat bayar BPJS dengan metode Sepulsa Kredit
And user memasukkan no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit
And informasi tagihan BPJS Kesehatan yang akan dibayar dengan Sepulsa Kredit muncul di layar
And user tap tombol Bayar Tagihan untuk melanjutkan pembayaran BPJS dengan Sepulsa Kredit
Then user akan otomatis sign out dari aplikasi Sepulsa (Sepulsa Kredit)
And user diarahkan ke halaman utama aplikasi Sepulsa (Sepulsa Kredit)

@BPJSSepulsaKreditKosong
Scenario: Transaksi BPJS Kesehatan Gagal (kolom no BPJS Kesehatan kosong)
Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
And user mengosongkan kolom no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit
Then informasi tagihan BPJS yang akan dibayar dengan Sepulsa Kredit tidak akan muncul
And tombol Bayar Tagihan tidak muncul sehingga tidak bisa lanjut pembayaran dengan Sepulsa Kredit

  @BPJSSepulsaKreditKosong
  Scenario: Transaksi BPJS Kesehatan Gagal (kolom input kosong)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
    And user mengosongkan nomor handphone untuk syarat bayar BPJS dengan metode Sepulsa Kredit
    And user mengosongkan kolom no BPJS Kesehatan yang akan dilunasi dengan Sepulsa Kredit
    Then informasi tagihan BPJS yang akan dibayar dengan Sepulsa Kredit tidak akan muncul
    And tombol Bayar Tagihan tidak muncul sehingga tidak bisa lanjut pembayaran dengan Sepulsa Kredit

  @BPJSSepulsaKreditKosong
  Scenario: Transaksi BPJS Kesehatan Gagal (no BPJS digitnya kurang)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar BPJS dengan metode Sepulsa Kredit
    When user tap tombol Bayar BPJS Kesehatan untuk bayar BPJS dengan Sepulsa Kredit
    And user memasukkan nomor handphone untuk syarat bayar BPJS dengan Sepulsa Kredit
    And user memasukkan no BPJS Kesehatan yang digitnya kurang untuk dibayar dengan metode Sepulsa Kredit
    Then layar akan menunjukkan bahwa nomor BPJS salah dan tidak dapat dibayar dengan metode Sepulsa Kredit

