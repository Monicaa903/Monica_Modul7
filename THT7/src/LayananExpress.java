public class LayananExpress extends LayananEkspedisi { // Kelas khusus penanganan pengiriman kategori premium berkecepatan tinggi
    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    }

    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 30000.0; // Penetapan tarif premium sebesar Rp 30.000 per kilogram berat efektif
    }

    public void klaimAsuransi(double nilaiBarang) {
        if (nilaiBarang > 1000000.0) { // Validasi limitasi nilai aset untuk pengaktifan skema perlindungan prioritas (VIP)
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + " untuk resi " + nomorResi + " sedang diproses prioritas.");
        } else {
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja."); // Standard Operating Procedure (SOP) reguler
        }
    }
}
