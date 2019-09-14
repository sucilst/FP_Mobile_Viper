Feature: [MOBILE] Listrik PLN Prabayar dengan Metode Pembayaran BCA VA

@listrikPLN
Scenario: Pembelian PLN Prabayar Berhasil dengan aplikasi mobile Sepulsa (input ID pelanggan secara manual)
Given user telah login di aplikasi mobile Sepulsa
And user berada di halaman beranda aplikasi mobile Sepulsa
When user tap tombol Listrik PLN
And user mengetik nomor meter PLN / ID Pelanggan
And user mengetik nomor handphone penerima token listrik
And keterangan pelanggan ditampilkan
And user memilih nominal token listrik
And user memilih metode pembayaran BCA Virtual Account
And user tap pada tombol Bayar
And user masuk ke halaman Informasi Pembayaran
And user membayar lunas tagihan melalui BCA Virtual Account
Then status pemesanan pulsa pada halaman History berubah menjadi "INVOICED"
And kode token diterima di nomor handphone yang telah didaftarkan


@listrikPLN
Scenario: Pembelian PLN Prabayar tidak dapat dilanjutkan (nomor tidak valid)
Given user telah login di aplikasi mobile Sepulsa
And user berada di halaman beranda aplikasi mobile Sepulsa
When user tap tombol Listrik PLN
And user mengetik nomor meter PLN / ID Pelanggan yang tidak valid
And user mengetik nomor handphone penerima token listrik
Then keterangan pelanggan ditampilkan
And muncul notifikasi "ID Pelanggan salah"
