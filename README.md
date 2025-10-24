 DocumentationPractice
Proyek ini dibuat untuk latihan dokumentasi dan penggunaan Git dalam mengelola proyek
Java sederhana.
Program ini hanya menampilkan pesan sambutan ke layar, sebagai contoh latihan dasar
Git dan Java.
 Deskripsi Proyek
DocumentationPractice adalah program Java sederhana yang digunakan untuk memahami:
Struktur proyek Java.
Penggunaan Git dan GitHub.
Penulisan dokumentasi dengan file README.md .
 Struktur Folder Proyek
DocumentationPractice/ │ ├── src/ │ └── Main.java → Berisi kode utama program Java │
├── bin/ → Folder hasil kompilasi (otomatis setelah javac dijalankan) │ ├── README.md
→ Dokumentasi proyek │ └── .gitignore → File untuk mengabaikan file/folder tertentu
saat push ke GitHub
Persyaratan Sistem
Sebelum menjalankan proyek ini, pastikan perangkat Anda memenuhi syarat berikut:
Komponen Versi Minimum Keterangan
Java JDK 8 atau lebih baru Digunakan untuk kompilasi dan
menjalankan program
Git Terinstal di sistem Untuk melakukan commit dan push ke
GitHub
Text Editor
/ IDE
Bebas (VS Code, IntelliJ,
Notepad++, dll)
Untuk menulis dan mengedit kode
Java
Cek apakah Java sudah terinstal:
java -version
git --version
 Cara compile & jalankan
1. Simpan kode di file Main.java di dalam folder src/ .
2. Buka terminal dan arahkan ke folder proyek:
cd /path/to/CODELAB MODUL 3
3. Compile program:
javac -d bin src/Main.java
4. Jalankan Program:
javac -d bin src/Main.java
 Contoh Output
Selamat datang di DocumentationPractice!
Program ini menampilkan pesan sederhana untuk latihan dokumentasi Git dan Java.
