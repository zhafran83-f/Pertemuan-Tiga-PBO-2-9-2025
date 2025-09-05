# Pertemuan-Tiga-PBO-2-9-2025

# METHOD OVERLOADING
- Method Overloading adalah method yang memiliki nama method yang sama dengan method lainnya yang ada di class, namun parameternya berbeda.
- Method Overloading digunakan dengan tujuan untuk menghindari kode yang berlebihan.
- Method Overloading tidak perlu membuat method yang berbeda untuk fungsi yang mirip.

# METHOD OVERRIDING
- Method Overriding adalah method yang mempunyai nama dan parameter yang sama, namun perintah yang dijalankan berbeda.
- Method Overriding membuat ulang method yang sudah ada pada Superclass lalu ditulis lagi pada Subclass.
- Method Overriding membuat turunan yang diturunkan pada Subclass bisa diganti atau diperluas.

# STEPS PROJECT
- Membuat rancangan diagram
- Membuat kelas induk atau abstract class "Kendaraan" sebagai Superclass lalu memasukkan atribut. Setelah itu membuat abstrac class "Mesin" dan "Transportasi_Umum".
- Membuat interface class "bisa_terbang", "bisa_dikendarai" dan "bisa_mengapung" untuk menjelaskan ciri khas pesawat.
- Kemudian membuat subclass "Pesawat" yang di-implements ke interface class "bisa_terbang", "bisa_dikendarai" dan "bisa_mengapung" untuk menjelaskan bahwa pesawat bisa terbang, bisa dikendarai, dan bisa mengapung sesuai dengan interface.
- Membuat class "Mobil" dan "Motor" sebagai class Overriding yang diextends ke Kendaraan (Yang artinya "Mobil" dan "Motor" merupakan bagian dari "Kendaraan").
- Setelah itu membuat class "Helper" sebagai class Overloading yang bertujuan menampilkan informasi kendaraan dengan sederhana atau detail.
- Membuat class "Main" untuk membuat objek class "Mobil" dan "Mobil" dari abstract class "Kendaraan", memanggil method override "bergerak()", membuat objek "Pesawat" method dari interface, Membuat objek "Helper" untuk menampilkan method Overloading. Tujuannya sebagai titik menjalankan semua proram.
- Setelah selesai semua, saatnya run program pada class "Main" untuk melihat outputnya.
