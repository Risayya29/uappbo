package projectuap;
import db.DBHelper;

public class ProjectUAP {

    public static void main(String[] args) {
        Barang brg = new Barang("baecode123", "2022-10", "sabun", 30000, 300, 1000, "alat mandi");
        BarangModel bm = new BarangModel();
//        bm.addBarang(brg);
        bm.deleteBarang("baecode123");
    }
    
}
