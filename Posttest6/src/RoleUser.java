import java.io.IOException;

public interface RoleUser {
    static LokerBarang barang1 = new LokerBarang();
    static LokerHewan hewan1 = new LokerHewan();
    public void loker(LokerHewan hewan1) throws IOException;
    public void loker(LokerBarang barang1) throws IOException;
    public void menu() throws IOException;
    public void add(LokerHewan hewan1) throws IOException;
    public void add(LokerBarang barang1)  throws IOException;
    public void read(LokerHewan hewan1)  throws IOException;
    public void read(LokerBarang barang1)  throws IOException;
    public void update(LokerHewan hewan1)  throws IOException;
    public void update(LokerBarang barang1)  throws IOException;
    public void delete(LokerHewan hewan1)  throws IOException;
    public void delete(LokerBarang barang1) throws IOException;
}
