 Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran BCA VA

  @PLNPostpaidBCA
  Scenario: Transaksi PLN Pascabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
    And keterangan pelanggan yang akan bayar tagihan PLN dengan BCA VA ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan BCA VA
    And user memilih metode pembayaran BCA Virtual Account untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan BCA VA
    And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan BCA Virtual Account
    And user membayar lunas tagihan PLN Pascabayar melalui BCA Virtual Account
    Then transaksi pemesanan PLN Pascabayar dengan metode bayar BCA Virtual Account pada halaman History muncul di daftar Transaksi Sukses


  @PLNPostpaidBCA
  Scenario: Transaksi PLN Pascabayar Gagal (tagihan belum dibayar melebihi batas waktu)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
    And keterangan pelanggan yang akan bayar tagihan PLN dengan BCA VA ditampilkan
    And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan BCA VA
    And user memilih metode pembayaran BCA Virtual Account untuk bayar tagihan PLN Pascabayar
    And user tap pada tombol Bayar untuk bayar tagihan PLN dengan BCA VA
    And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan BCA Virtual Account
    And user belum membayar tagihan PLN Pascabayar dengan BCA VA hingga lebih dari batas waktu pembayaran
    Then transaksi PLN Pascabayar dengan metode bayar BCA VA pada halaman History tidak ditemukan di daftar Transaksi Sukses

  @PLNPostpaidBCA
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan BCA VA
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
    Then keterangan pelanggan yang akan bayar tagihan PLN dengan BCA VA ditampilkan
    And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa bayar PLN Pascabayar dengan BCA VA

  @PLNPostpaidBCA
  Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
    Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
    When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
    And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
    And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (BCA VA)
    And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
    Then keterangan pelanggan yang akan bayar tagihan PLN dengan BCA VA ditampilkan
    And muncul notifikasi "General Error" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan BCA VA

   @PLNPostpaidBCA
   Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
     Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
     And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
     And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan BCA VA
     And user mengetik nomor handphone penerima token listrik yang akan dibayar dengan Mandiri Virtual Account
     Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar BCA Virtual Account tidak muncul

   @PLNPostpaidBCA
   Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
     Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
     And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
     And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
     And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan BCA VA
     Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar BCA Virtual Account tidak muncul

   @PLNPostpaidBCA
   Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom input Kosong)
     Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan BCA VA
     When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan BCA VA
     And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan BCA VA
     And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan BCA VA
     And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan BCA VA
     Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar BCA Virtual Account tidak muncul