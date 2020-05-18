/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import negocio.clases.Doctor;
import negocio.clases.ExamenFisico;
import negocio.clases.HerramientaMedica;
import negocio.clases.Paciente;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class HerramientaMedicaDao {

    private Conector conn;
    private PreparedStatement sentence;

    public HerramientaMedicaDao() {
        this.conn = new Conector();
        this.sentence = null;
    }

    public int insert(HerramientaMedica hm) {

        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("INSERT INTO simame.herramienta_medica values(?, ?, ?, ?)"));

                getSentence().setInt(1, hm.getCodigo());
                getSentence().setString(2, hm.getDescripcion());
                getSentence().setInt(3, hm.getCantTotal());
                getSentence().setInt(4, hm.getCantidadPrestado());
                getSentence().executeUpdate();
                getConn().disconnect();

                return 0;

            } else {
                return 1;
            }
        } catch (SQLException sqle) {

            sqle.printStackTrace();
            if (sqle.getSQLState().startsWith("23")) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    public List<HerramientaMedica> getAll() {
        try {
            if (getConn().conectarse()) {

                setSentence(getConn().getConn().prepareStatement("SELECT * FROM simame.herramienta_medica"));

                List<HerramientaMedica> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    HerramientaMedica hm = new HerramientaMedica();

                    hm.setCodigo(result.getInt(1));
                    hm.setDescripcion(result.getString("descripcion"));
                    hm.setCantTotal(result.getInt(3));
                    hm.setCantidadPrestado(result.getInt(4));
                    all.add(hm);
                }
                getConn().disconnect();
                return all;
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public HerramientaMedica getByCode(int code) {
        try {

            HerramientaMedica hm = new HerramientaMedica();

            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.herramienta_medica "
                        + "WHERE codigo = ?"));
                getSentence().setInt(1, code);
                List<HerramientaMedica> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();

                while (result.next()) {
                    hm.setCodigo(result.getInt(1));
                    hm.setDescripcion(result.getString("descripcion"));
                    hm.setCantTotal(result.getInt(3));
                    hm.setCantidadPrestado(result.getInt(4));
                    all.add(hm);
                }
                getConn().disconnect();
                if (hm != null) {
                    return hm;
                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<HerramientaMedica> getByDesc(String description) {
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.herramienta_medica "
                        + "WHERE descripcion like ?"));
                getSentence().setString(1, "%" + description + "%");
                List<HerramientaMedica> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    HerramientaMedica hm = new HerramientaMedica();

                    hm.setCodigo(result.getInt(1));
                    hm.setDescripcion(result.getString("descripcion"));
                    hm.setCantTotal(result.getInt(3));
                    hm.setCantidadPrestado(result.getInt(4));
                    all.add(hm);
                }
                getConn().disconnect();
                return all;
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public int update(HerramientaMedica hm) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("UPDATE simame.herramienta_medica "
                        + "SET descripcion = ?, cantidad_total = ?, cantidad_prestado = ? "
                        + "WHERE codigo = ?"));

                getSentence().setString(1, hm.getDescripcion());
                getSentence().setInt(2, hm.getCantTotal());
                getSentence().setDouble(3, hm.getCantidadPrestado());
                getSentence().setInt(4, hm.getCodigo());
                getSentence().executeUpdate();
                getConn().disconnect();

                return 0;

            } else {
                return 1;
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            if (sqle.getSQLState().startsWith("23")) {
                return 2;
            } else {
                return 3;
            }
        }

    }

    public int delete(HerramientaMedica hm) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("DELETE FROM simame.herramienta_medica WHERE codigo= ?"));
                getSentence().setInt(1, hm.getCodigo());
                int result = getSentence().executeUpdate();
                getConn().disconnect();
                if (result == 0) {
                    return 0;
                } else {
                    return 1;
                }

            } else {
                return 2;
            }
        } catch (SQLIntegrityConstraintViolationException sql) {
            sql.printStackTrace();
            return 4;
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            return 3;
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
