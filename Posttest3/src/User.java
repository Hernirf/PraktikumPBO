public class User {
    protected String nama;
    protected String nomorHp;
    protected String alamat;
    protected String tanggal;
    protected int harga;
    protected int jumlahhari;
    protected int nomor_loker;
    public User(String nama, String nomorHp, String alamat, String tanggal, int harga, int jumlahhari,
            int nomor_loker) {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.harga = harga;
        this.jumlahhari = jumlahhari;
        this.nomor_loker = nomor_loker;

        
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorHp() {
        return nomorHp;
    }
    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getJumlahhari() {
        return jumlahhari;
    }
    public void setJumlahhari(int jumlahhari) {
        this.jumlahhari = jumlahhari;
    }
    public int getNomor_loker() {
        return nomor_loker;
    }
    public void setNomor_loker(int nomor_loker) {
        this.nomor_loker = nomor_loker;
    }


    

    
    
    



}
