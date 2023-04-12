public class Aktor {
    protected String nama;
    protected String nomorHp;
    protected String alamat;
    protected String username;
    protected String pass;
    protected String id;


    
    public Aktor(String id,String nama, String nomorHp, String alamat, String username, String pass) {
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
        this.username = username;
        this.pass = pass;
        this.id = id;
    }

    public Aktor(){
        
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

}
