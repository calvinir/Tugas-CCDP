/**
 * Kelas ContohClass digunakan untuk mendemonstrasikan dokumentasi menggunakan Javadoc.
 */
public class ContohClass {

    /**
     * Metode ini menghitung jumlah dua bilangan.
     * 
     * @param a Bilangan pertama yang akan dijumlahkan.
     * @param b Bilangan kedua yang akan dijumlahkan.
     * @return Hasil penjumlahan dari bilangan a dan b.
     * @throws IllegalArgumentException jika a atau b bernilai negatif.
     */
    public int jumlah(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Bilangan tidak boleh negatif.");
        }
        return a + b;
    }
}
