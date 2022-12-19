package projectuap;
import db.DBHelper;
import java.util.ArrayList;

public class ProjectUAP {

//    public static void main(String[] args) {
//        Barang brg = new Barang("baecode123", "2022-10", "sabun", 30000, 300, 1000, "alat mandi");
//        BarangModel bm = new BarangModel();
        
        Kategori ktg = new Kategori(365, "Makanan", "alat mandi", 65);
        BarangModel bm = new BarangModel();
//        bm.addBarang(brg);
//        bm.deleteBarang("baecode123");
        
//        bm.addKategori(ktg)
//        bm.deleteKategori(365)
        
        ArrayList <Barang> bmm + bm.getBarang(){
            for(int i= 0; i< bmm.size(); i++){
                System.out.println("barcode; " + bmm.get(i).getBarcode());
                System.out.println("expired; " + bmm.get(i).getExpired());
                System.out.println("nama; " + bmm.get(i).getNama_produk());
                
            }
        
        
    }

    
}
