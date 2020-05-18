/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.clases.Doctor;
import negocio.clases.Usuario;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class LogInDao {

    private Conector conn;
    private PreparedStatement sentence;

    public LogInDao() {
        this.conn = new Conector();
        this.sentence = null;
    }

    public int userExists(Usuario user) {

        try {

            Usuario u = null;

            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT *"
                        + " FROM simame.usuario "
                        + "WHERE usuario = ?"));
                getSentence().setString(1, user.getUsuario());
                //  List<Usuario> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    u = new Usuario();
                    u.setUsuario(result.getString("usuario"));
                    u.setPassword(result.getString("password"));
                    //   all.add(d);

                }
                getConn().disconnect();
                if (u != null) {
                    if (user.getPassword().equals(u.getPassword())) {
                        return 1;
                    }
                    else{
                       return 2;
                    }
                }
                else{
                    return 3;
                }

            } else {
                return 4;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 5;
        }

    }

    public Conector getConn() {
        return conn;
    }

    public void setConn(Conector conn) {
        this.conn = conn;
    }

    public PreparedStatement getSentence() {
        return sentence;
    }

    public void setSentence(PreparedStatement sentence) {
        this.sentence = sentence;
    }

}
