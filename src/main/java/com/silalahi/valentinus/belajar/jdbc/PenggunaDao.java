package com.silalahi.valentinus.belajar.jdbc;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class PenggunaDao {

    private KoneksiDatabase koneksi;

    public PenggunaDao(KoneksiDatabase k) {
        this.koneksi = k;
    }

    public void simpan(Pengguna p) {
        try {
            String sql = "insert into pengguna (nama,email,no_hp,alamat) values (?,?,?,?)";
            Connection c = koneksi.connect();

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, p.getNama());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getNoHp());
            ps.setString(4, p.getAlamat());
            ps.executeUpdate();

            koneksi.disconnect(c);
        } catch (SQLException err) {
            err.printStackTrace();
        }
    }

    public List<Pengguna> cariSemua(){
        List<Pengguna> hasil = new ArrayList<Pengguna>();

        try {
            String sql = "select * from pengguna order by nama";
            Connection c = koneksi.connect();

            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Pengguna p = konversiResultSet(rs);
                hasil.add(p);
            }

            koneksi.disconnect(c);
        } catch (SQLException err) {
            err.printStackTrace();
        }

        return hasil;
    }

    private Pengguna konversiResultSet(ResultSet rs) throws SQLException {
        Pengguna p = new Pengguna();
        p.setId(rs.getInt("id"));
        p.setNama(rs.getString("nama"));
        p.setEmail(rs.getString("email"));
        p.setNoHp(rs.getString("no_hp"));
        p.setAlamat(rs.getString("alamat"));
        return p;
    }
}
