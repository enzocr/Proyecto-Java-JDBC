/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class Conector {

    private Connection conn;

    public boolean conectarse() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String host = "localhost";
            int port = 3307;
            String db = "simame";
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + pass + "&useSSL=false";
            String usuario = "root";
            String password = "root";

            this.conn = DriverManager.getConnection(url, usuario, password);
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }

    public boolean disconnect() {
        try {
            this.conn.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public Connection getConn() {
        if (conn == null) {
            conectarse();
            return conn;
        } else {
            return conn;
        }
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
