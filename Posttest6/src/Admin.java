import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Admin extends Aktor implements RoleAdmin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<LokerBarang> loker_barang = User.loker_barang;
    static ArrayList<LokerHewan> loker_hewan = User.loker_hewan;
    static ArrayList<User> user =  Main.user ;


    public Admin(String id,String nama, String nomorHp, String alamat, String username, String pass) {
        super(id, nama, nomorHp, alamat, username, pass);
    }

    public Admin(){

    }
    

    @Override
    public void LihatUser() {
        if (user.size()==0){
            System.out.println("Data user barang kosong");
        }
        else{
            for (int i=0; i <  user.size(); i++){
                System.out.println("ID User     : " + user.get(i).getId());
                System.out.println("Nama        : " + user.get(i).getNama());
                System.out.println("Nomor Hp    : " + user.get(i).getNomorHp());
                System.out.println("Alamat      : " + user.get(i).getAlamat());
                System.out.println("Username    : " + user.get(i).getUsername());
                System.out.println("\n");
            }
        }
        
    }

    @Override
    public void lihatLokerBarang() {
        if (loker_barang.size()==0){
            System.out.println("Data loker barang kosong");
        }
        else{
            for (int i=0; i <  loker_barang.size(); i++){
                System.out.println("ID User     : " + loker_barang.get(i).getId_user());
                System.out.println("Nomor Loker : " + loker_barang.get(i).getNomor_loker());
                System.out.println("Nama Barang : " + loker_barang.get(i).getNamabarang());
                System.out.println("Berat Barang: " + loker_barang.get(i).getBerat() + " KG");
                System.out.println("Jumlah Hari : " + loker_barang.get(i).getJumlahhari());
                System.out.println("Harga       : Rp." + loker_barang.get(i).getHarga());
                System.out.println("Tanggal     : " + loker_barang.get(i).getTanggal());
                System.out.println("\n");
            }
        }
        
    }

    @Override
    public void lihatLokerHewan() {
        if (loker_hewan.size()==0){
            System.out.println("Data loker hewan kosong");
        }
        else{
            for (int i=0; i <  loker_hewan.size(); i++){
                System.out.println("ID User     : " + loker_hewan.get(i).getId_user());
                System.out.println("Nomor Loker : " + loker_hewan.get(i).getNomor_loker());
                System.out.println("Jenis Hewan : " + loker_hewan.get(i).getJenis_hewan());
                System.out.println("Nama Hewan  : " + loker_hewan.get(i).getNama_hewan());
                System.out.println("Jumlah Hari : " + loker_hewan.get(i).getJumlahhari());
                System.out.println("Harga       : Rp." + loker_hewan.get(i).getHarga());
                System.out.println("Tanggal     : " + loker_hewan.get(i).getTanggal());
                System.out.println("\n");
            }
        }
        
    }

    @Override
    public void Menu() throws IOException {
        while(true){
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("1. Lihat Data User");
            System.out.println("2. Lihat Data Loker Hewan");
            System.out.println("3. Lihat Data Loker Barang");
            System.out.println("4. Logout");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    LihatUser();;
                    break;
                case 2:
                    lihatLokerHewan();
                    break;
                case 3:
                    lihatLokerBarang();
                    break;
                case 4:
                    Main.menu_utama();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
        
    }
    

    
    
}
