public class LayananInternasional extends LayananEkspedisi {
    private String negaraTujuan;       // Enkapsulasi data spesifik wilayah kedaulatan negara tujuan distribusi
    private double nilaiBarangUSD;     // Dokumentasi nilai valuasi komoditas dalam satuan mata uang asing (USD)

    public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
        this.negaraTujuan = negaraTujuan;
        this.nilaiBarangUSD = nilaiBarangUSD;
    }

    @Override
    public double hitungOngkir() {
        double tarifDasar = hitungBeratEfektif() * 200000.0; // Standar biaya lintas negara sebesar Rp 200.000 per kilogram efektif
        double pajak = 0.0;
        if (nilaiBarangUSD > 50.0) {
            pajak = tarifDasar * 0.20; // Pembebanan instrumen bea masuk sebesar 20% jika ambang batas barang terpenuhi
        }
        return tarifDasar + pajak; // Konsolidasi total kewajiban finansial pengiriman logistik internasional
    }

    public void cetakManifest() {
        System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD); // Pelaporan pabean resmi
    }
}
