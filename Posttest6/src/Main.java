import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;


public  final class  Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<User> user = new ArrayList<User>();
    static ArrayList<Admin> admin = new ArrayList<Admin>();
    static Admin Admin1 = new Admin("1A", "Bintang", "0823", "Jalan Ramania", "admin1", "admin123");
    static User user1 = new User("1U", "Herni", "0821", "Asmaba", "user1", "user123");
    static User user2 = new User("2U", "Hernii", "0821", "Asmaba", "user2", "user123");
    static public String idLogin;
    public static void main(String[] args) throws IOException {
        user.add(user1);
        user.add(user2);
        admin.add(Admin1);
        menu_utama();
    }

    public static void menu_utama()throws IOException{
        while(true){
            System.out.println(" ");
            System.out.println("=====================================");
            System.out.println("1. Login");
            System.out.println("2. Keluar Program");
            System.out.println("=====================================");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch(pilihan){
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

        }
    }


    public static void login()throws IOException{
        User myclass = new User();
        Admin menuAdmin = new Admin();
        
        int kondisi=0;
        System.out.print("Masukkan Username: ");
        String username = br.readLine();
        System.out.print("Masukkan Password: ");
        String pass = br.readLine();
        for(int i=0; i <  user.size(); i++){
            if (username.equals(user.get(i).getUsername()) && pass.equals(user.get(i).getPass())){
                kondisi =1;
                idLogin = user.get(i).getId();
                myclass.menu();
                
            }
        }

        for(int i=0; i <  admin.size(); i++){
            if (username.equals(admin.get(i).getUsername()) && pass.equals(admin.get(i).getPass())){
                kondisi =1;
                menuAdmin.Menu();
            }
        }

        if (kondisi==0){
            System.out.println("Password dan Username anda salah");
            menu_utama();
        }
        
    }
}
