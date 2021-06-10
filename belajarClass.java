/**
 * Membuat Class pada java
 * Nama class harus sama dengan nama file
 * Penulisan class biasanya menggunakan camelCase
 */

class belajarClass {
    // Membuat field untuk object pada class "belajarObject"
    String nama; // variable nama
    String alamat; // variable alamat
    final String negara = "Indonesia"; // variable final negara


    /**
     * Membuat method
     * Gunakan kata kunci "void" jika method tidak mengembalikan data
     * Gunakan tipe data jika method akan mengembalikan data
     */

    // Method tanpa parameter
    void salam() {
        System.out.println("Assalamualaikum " + nama);
    }

    // Method dengan paramater
    void salam(String paramNama) {
        System.out.println("Assalamualaikum " + paramNama + ", nama saya " + nama);
    }

    /**
     * Membuat constructor
     * Constructor = Method yang pertama kali dipanggil ketika membuat object
     * Nama constructor harus sama dengan nama Class
     * Constructor bisa mempunyai parameter atau tidak
     */

    // Constructor tanpa parameter
    belajarClass(){
    }

    // Constructor dengan parameter
    belajarClass(String paramNama) {
    }
}
