public class LokerHewan extends User{
    private String jenis_hewan;
    private String nama_hewan;
    
    public LokerHewan(String nama, String nomorHp, String alamat, String tanggal, int harga, int jumlahhari,
            int nomor_loker, String jenis_hewan, String nama_hewan) {
        super(nama, nomorHp, alamat, tanggal, harga, jumlahhari, nomor_loker);
        this.jenis_hewan = jenis_hewan;
        this.nama_hewan = nama_hewan;
    }
    
    public String getJenis_hewan() {
        return jenis_hewan;
    }
    public void setJenis_hewan(String jenis_hewan) {
        this.jenis_hewan = jenis_hewan;
    }
    public String getNama_hewan() {
        return nama_hewan;
    }
    public void setNama_hewan(String nama_hewan) {
        this.nama_hewan = nama_hewan;
    }

    
    

}
