public class LayananEkspedisi {
    protected String nomorResi;        // Atribut pengenal unik paket yang dapat diakses oleh kelas turunan
    protected double beratAktualKg;   // Atribut representasi bobot asli paket dalam satuan kilogram
    protected double panjang;          // Atribut dimensi panjang paket dalam satuan centimeter
    protected double lebar;            // Atribut dimensi lebar paket dalam satuan centimeter
    protected double tinggi;           // Atribut dimensi tinggi paket dalam satuan centimeter

    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        this.nomorResi = nomorResi;
        this.beratAktualKg = beratAktualKg;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungBeratEfektif() {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000.0; // Perhitungan konversi dimensi fisik menjadi bobot volumetrik
        return Math.max(beratAktualKg, beratVolumetrik);               // Evaluasi nilai tertinggi antara bobot fisik dan bobot dimensi
    }

    public void cetakResi() {
        System.out.println("Nomor Resi: " + nomorResi);
        System.out.println("Berat Efektif: " + hitungBeratEfektif() + " kg"); 
    }

    public double hitungOngkir() {
        return 0.0; 
    }
}
