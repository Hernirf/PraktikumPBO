public class LokerBarang extends User {
    private String namabarang;
    private int berat;
    
    public LokerBarang(String nama, String nomorHp, String alamat, String tanggal, int harga, int jumlahhari,
            int nomor_loker, String namabarang, int berat) {
        super(nama, nomorHp, alamat, tanggal, harga, jumlahhari, nomor_loker);
        this.namabarang = namabarang;
        this.berat = berat;
    }
    public String getNamabarang() {
        return namabarang;
    }
    public void setNamabarang(String namabarang) {
        this.namabarang = namabarang;
    }
    public int getBerat() {
        return berat;
    }
    public void setBerat(int berat) {
        this.berat = berat;
    }
    

    
}
