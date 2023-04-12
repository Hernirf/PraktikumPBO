public abstract class Loker {
    protected String id_user;
    protected String tanggal;
    protected int harga;
    protected int jumlahhari;
    protected int nomor_loker;
    
    public Loker(){
        
    }
    public Loker(String id_user,String tanggal, int harga, int jumlahhari,int nomor_loker) {
        this.id_user = id_user;
        this.tanggal = tanggal;
        this.harga = harga;
        this.jumlahhari = jumlahhari;
        this.nomor_loker = nomor_loker;

        
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

    public abstract void tambah();

    public abstract void edit();

    public String getId_user() {
        return id_user;
    }
    public void setId_user(String id_user) {
        this.id_user = id_user;
    }



}
