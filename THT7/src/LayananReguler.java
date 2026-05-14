public class LayananReguler extends LayananEkspedisi { // Implementasi relasi pewarisan properti dari superclass LayananEkspedisi
    public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000.0; // Modifikasi metode ongkir reguler berbasis tarif Rp 15.000 per kilogram efektif
    }

    public double hitungOngkir(boolean isMember, int jarakKm) { // Implementasi overloading metode untuk skema promosi dan biaya jarak
        double tarifDasar = hitungOngkir();                       // Pemanggilan kalkulasi dasar tarif reguler dari metode overriding
        if (isMember) {
            tarifDasar -= (tarifDasar * 0.10);                    // Reduksi biaya sebesar 10% untuk entitas yang terdaftar sebagai member
        }
        return tarifDasar + (jarakKm * 500.0);                    // Akumulasi akhir setelah penambahan biaya kompensasi jarak distribusi
    }
}
