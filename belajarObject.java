public class belajarObject {
    public static void main(String[] args) {

        /**
         * Membuat object pada java
         * Membuat object harus menggunakan kata: new namaClass();
         *
         */

        var objek1 = new belajarClass(); // Penulisan 1

        belajarClass objek2 = new belajarClass(); // Penulisan 2

        // Penulisan 3
        belajarClass objek3;
        objek3 = new belajarClass();


        /**
         * Mengakses field dari class "belajarclass"
         * Mengakses field dari class: nama_object.field
         */
        objek1.nama = "Zainuddin"; // deklarasi variable nama pada objek1
        objek1.alamat = "Balikpapan"; // deklarasi variable alamat pada objek2
        // objek1.negara = " Indonesia"; // Error karena variable final tidak bisa diubah

        System.out.println(objek1.nama);
        System.out.println(objek1.alamat);
        System.out.println(objek1.negara); // variable final hanya bisa dipanggil


        /**
         * Mengakses method pada class "belajarClass"
         * Mengakses method dari class: nama_object.method()
         */
        objek2.nama = "Bulbasaur"; // deklarasi variable nama pada objek2
        objek2.salam(); // method tanpa parameter
        objek2.salam("Santuy"); // method dengan parameter

    }
}
