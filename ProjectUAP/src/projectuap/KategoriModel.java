package projectuap;

import db.DBHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KategoriModel {
     private final Connection CONN;

    public KategoriModel() {
        this.CONN = DBHelper.getConnection();
    }
    public void addKategori(Kategori ktg){
        String insert =ktg.getDiskon() + ",'"+"INSERT INTO kategori (daya_tahan,nama_produk,harga,jumlah,diskon) VALUES ('"+ktg.getDaya_tahan()+"','"+ktg.getNama_produk()+"'," + ktg.getHarga()+"," + ktg.getJumlah()+","+ ")";
        System.out.println(insert);
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil memasukkan data"); 
            }else{
                System.out.println("Gagal memasukkan data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    public void deleteKategori(String dth){
        String insert ="DELETE FROM barang WHERE barcode='"+dth+"'";
        try {
            if(CONN.createStatement().executeUpdate(insert)>0){
                System.out.println("berhasil menghapus data"); 
            }else{
                System.out.println("Gagal menghapus data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(KategoriModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data");
        }
    }
    
}