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
import negocio.clases.Paciente;
import negocio.clases.Salon;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class SalonDao {

    private Conector conn;
    private PreparedStatement sentence;

    public SalonDao() {
        this.conn = new Conector();
        this.sentence = null;
    }

    public int insert(Salon s) {

        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("INSERT INTO simame.salon values(?, ?, ?, ?)"));

                getSentence().setInt(1, s.getNumSalon());
                getSentence().setInt(2, s.getCantCamas());
                getSentence().setString(3, s.getArea());
                getSentence().setInt(4, s.getDoctor().getCedula());
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

    public List<Salon> getAll() {

        try {
            if (getConn().conectarse()) {

                setSentence(getConn().getConn().prepareStatement("SELECT * FROM simame.salon"));

                List<Salon> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    Salon s = new Salon();
                    s.setNumSalon(result.getInt(1));
                    s.setCantCamas(result.getInt(2));
                    s.setArea(result.getString("area"));
                    s.setDoctor(new Doctor());
                    s.getDoctor().setCedula(result.getInt(4));
                    all.add(s);
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

    public Salon getByNum(int numSalon) {
        try {
            Salon s = new Salon();

            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.salon "
                        + "WHERE num_salon = ?"));
                getSentence().setInt(1, numSalon);
                List<Salon> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();

                while (result.next()) {
                    s.setDoctor(new Doctor());
                    s.setNumSalon(result.getInt(1));
                    s.setCantCamas(result.getInt(2));
                    s.setArea(result.getString("area"));
                    s.getDoctor().setCedula(result.getInt(4));
                    all.add(s);
                }
                getConn().disconnect();
                if (s.getDoctor() != null) {
                    return s;
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

    public Salon getByArea(String area) {
        try {

            Salon s = new Salon();
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.salon "
                        + "WHERE area like ?"));
                getSentence().setString(1, "%" + area + "%");
                List<Salon> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    s.setDoctor(new Doctor());
                    s.setNumSalon(result.getInt(1));
                    s.setCantCamas(result.getInt(2));
                    s.setArea(result.getString("area"));
                    s.getDoctor().setCedula(result.getInt(4));
                    all.add(s);
                }
                getConn().disconnect();
                if (s.getDoctor() != null) {
                    return s;
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

    public int update(Salon s) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement(""
                        + "UPDATE simame.salon "
                        + "SET cant_camas = ?, area = ?, cedula_doctor = ? "
                        + "WHERE num_salon = ?"));

                getSentence().setInt(1, s.getCantCamas());
                getSentence().setString(2, s.getArea());
                getSentence().setInt(3, s.getDoctor().getCedula());
                getSentence().setInt(4, s.getNumSalon());
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

    public int delete(Salon s) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("DELETE FROM simame.salon WHERE num_salon= ?"));
                getSentence().setInt(1, s.getNumSalon());
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
