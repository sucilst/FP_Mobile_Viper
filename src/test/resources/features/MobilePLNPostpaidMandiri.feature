Feature: [MOBILE] Listrik PLN Pascabayar dengan Metode Pembayaran Mandiri VA

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
And keterangan pelanggan yang akan bayar tagihan PLN dengan Mandiri VA ditampilkan
And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Mandiri VA
And user memilih metode pembayaran Mandiri Virtual Account untuk bayar tagihan PLN Pascabayar
And user tap pada tombol Bayar untuk bayar tagihan PLN dengan Mandiri VA
And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan Mandiri Virtual Account
And user membayar lunas tagihan PLN Pascabayar melalui Mandiri Virtual Account
Then transaksi pemesanan PLN Pascabayar dengan metode bayar Mandiri Virtual Account pada halaman History muncul di daftar Transaksi Sukses


@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar Gagal (tagihan belum dibayar melebihi batas waktu)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
And keterangan pelanggan yang akan bayar tagihan PLN dengan Mandiri VA ditampilkan
And user tap tombol Bayar Tagihan untuk bayar tagihan PLN dengan Mandiri VA
And user memilih metode pembayaran Mandiri Virtual Account untuk bayar tagihan PLN Pascabayar
And user tap pada tombol Bayar untuk bayar tagihan PLN dengan Mandiri VA
And user masuk ke halaman Informasi Pembayaran Tagihan PLN dengan Mandiri Virtual Account
And user belum membayar tagihan PLN Pascabayar dengan Mandiri VA hingga lebih dari batas waktu pembayaran
Then transaksi PLN Pascabayar dengan metode bayar Mandiri VA pada halaman History tidak ditemukan di daftar Transaksi Sukses

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (nomor tidak valid)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang tidak valid untuk dibayar dengan Mandiri VA
And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
Then keterangan pelanggan yang akan bayar tagihan PLN dengan Mandiri VA ditampilkan
And muncul notifikasi "ID Pelanggan salah" sehingga tidak bisa bayar PLN Pascabayar dengan Mandiri VA

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (sudah bayar)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengetik nomor meter PLN / ID Pelanggan Pascabayar yang sudah lunas (Mandiri VA)
And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
Then keterangan pelanggan yang akan bayar tagihan PLN dengan Mandiri VA ditampilkan
And muncul notifikasi "General Error" karena tagihan sudah dibayar sehingga tidak bisa bayar PLN Pascabayar dengan Mandiri VA

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom ID Pelanggan Kosong)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan Mandiri VA
And user mengetik nomor handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Mandiri Virtual Account tidak muncul

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom No HP Pelanggan Kosong)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
And user mengetik nomor meter PLN / ID Pelanggan untuk bayar tagihan PLN dengan Mandiri VA
Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Mandiri Virtual Account tidak muncul

@PLNPostpaidMandiri
Scenario: Transaksi PLN Pascabayar tidak dapat dilanjutkan (kolom input Kosong)
Given user telah login di aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
And user berada di halaman beranda aplikasi mobile Sepulsa untuk bayar tagihan PLN dengan Mandiri VA
When user tap tombol Listrik PLN untuk bayar tagihan PLN dengan Mandiri VA
And user tap pada pilihan Pascabayar untuk bayar tagihan PLN dengan Mandiri VA
And user mengosongkan kolom PLN / ID Pelanggan untuk bayar tagihan listrik dengan Mandiri VA
And user mengosongkan kolom handphone pemilik tagihan listrik yang akan dibayar dengan Mandiri VA
Then keterangan pelanggan yang akan membayar tagihan listrik dengan metode bayar Mandiri Virtual Account tidak muncul