package com.silalahi.valentinus.belajar.jdbc;

import java.sql.*;

public class KoneksiDatabase {

    private String driver;
    private String url;
    private String username;
    private String password;

    public KoneksiDatabase(String driver, String url, String username, String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection connect() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException err) {
            err.printStackTrace();
        } catch (SQLException err) {
            err.printStackTrace();
        }
        return null;
    }

    public void disconnect(Connection koneksi) {
        if (koneksi != null) {
            try {
                koneksi.close();
            } catch (SQLException err) {
                err.printStackTrace();
            }
        }
    }
}
