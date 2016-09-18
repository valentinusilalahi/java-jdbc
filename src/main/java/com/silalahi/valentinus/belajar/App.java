package com.silalahi.valentinus.belajar;

import com.silalahi.valentinus.belajar.jdbc.*;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/belajar_jdbc";
        String username = "root";
        String password = "root";

        KoneksiDatabase  koneksi = new KoneksiDatabase(driver, url, username, password);

        Pengguna p = new Pengguna();
        p.setNama("valentinus Silalahi");
        p.setEmail("valentinus.silalahi@gmail.com");
        p.setNoHp("085721937567");
        p.setAlamat("Bandung");

        PenggunaDao pd = new PenggunaDao(koneksi);
        pd.simpan(p);

        List<Pengguna> isiDb = pd.cariSemua();
        for (Pengguna px : isiDb) {
        	System.out.println("ID : "+px.getId());
        	System.out.println("Nama : "+px.getNama());
        	System.out.println("Email : "+px.getEmail());
        	System.out.println("No Hp : "+px.getNoHp());
        	System.out.println("ALamat : "+px.getAlamat());
        }
    }
}
