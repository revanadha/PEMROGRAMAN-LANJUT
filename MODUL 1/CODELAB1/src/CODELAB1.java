import java.util.Arrays;

public class CODELAB1 {
    public static void main(String[] args){
        String[] nama = {"adi", "budi", "cahyo", "diana", "Eva"};
        String namaTerpanjang = cariNamaTerpanjang(nama);
        System.out.printf("Nama terpanjang adalah : " + namaTerpanjang);
    }

    public static String cariNamaTerpanjang(String[] array){
        String namaMax = array[0];
        for (String nama : array){
            if (nama.length() > namaMax.length()){
                namaMax = nama;
            }
        } // cari panjang maks
        int max = array[0].length();
        for (String nama : array) {
            if (nama.length() > max) {
                max = nama.length();
            }
        }

        // ambil semua nama yang panjangnya = maks
        java.util.List<String> hasil = new java.util.ArrayList<>();
        for (String nama : array) {
            if (nama.length() == max) {
                hasil.add(nama);
            }
        }

        return Arrays.toString(hasil.toArray());
    }
}
