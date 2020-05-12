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

/**
 *
 * @author enzoq
 */
public class DoctorDao {

    private Conector conn;
    private PreparedStatement sentence;

    public DoctorDao() {
        this.conn = new Conector();
        this.sentence = null;
    }

    public int insert(Doctor d) {
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("INSERT INTO simame.doctor values(?, ?, ?, ?, ?, ?, ?)"));

                getSentence().setInt(1, d.getCedula());
                getSentence().setString(2, d.getNombre());
                getSentence().setString(3, d.getApellido());
                getSentence().setString(4, d.getEspecialidad());
                getSentence().setDouble(5, d.getSalario());
                getSentence().setString(6, d.getDireccion());
                getSentence().setInt(7, d.getTelefono());
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

    public List<Doctor> getAll() {
        try {
            if (getConn().conectarse()) {

                setSentence(getConn().getConn().prepareStatement("SELECT * FROM simame.doctor"));

                List<Doctor> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    Doctor d = new Doctor();
                    d.setCedula(result.getInt(1));
                    d.setNombre(result.getString("nombre"));
                    d.setApellido(result.getString("apellido"));
                    d.setEspecialidad(result.getString("especialidad"));
                    d.setSalario(result.getDouble(5));
                    d.setDireccion(result.getString("direccion"));
                    d.setTelefono(result.getInt("telefono"));
                    all.add(d);
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

    public int update(Doctor d) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement(""
                        + "UPDATE simame.doctor "
                        + "SET nombre = ?, apellido = ?, especialidad = ?, "
                        + "salario = ?, direccion = ?, telefono = ? "
                        + "WHERE cedula = ?"));

                getSentence().setString(1, d.getNombre());
                getSentence().setString(2, d.getApellido());
                getSentence().setString(3, d.getEspecialidad());
                getSentence().setDouble(4, d.getSalario());
                getSentence().setString(5, d.getDireccion());
                getSentence().setInt(6, d.getTelefono());
                getSentence().setInt(7, d.getCedula());
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

    public int delete(Doctor d) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("DELETE FROM simame.doctor WHERE cedula= ?"));
                getSentence().setInt(1, d.getCedula());
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

    public Doctor getById(int cedula) {

        try {

            Doctor d = new Doctor();
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT *"
                        + " FROM simame.doctor "
                        + "WHERE cedula = ?"));
                getSentence().setInt(1, cedula);
                List<Doctor> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    d.setCedula(result.getInt(1));
                    d.setNombre(result.getString("nombre"));
                    d.setApellido(result.getString("apellido"));
                    d.setEspecialidad(result.getString("especialidad"));
                    d.setSalario(result.getDouble(5));
                    d.setDireccion(result.getString("direccion"));
                    d.setTelefono(result.getInt("telefono"));
                    all.add(d);

                }
                getConn().disconnect();
                if (d == null) {
                    return null;
                } else {
                    return d;
                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public List<Doctor> getByName(String name) {
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("SELECT *"
                        + " FROM simame.doctor "
                        + "WHERE nombre like ?"));
                getSentence().setString(1, "%" + name + "%");
                List<Doctor> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    Doctor d = new Doctor();
                    d.setCedula(result.getInt(1));
                    d.setNombre(result.getString("nombre"));
                    d.setApellido(result.getString("apellido"));
                    d.setEspecialidad(result.getString("especialidad"));
                    d.setSalario(result.getDouble(5));
                    d.setDireccion(result.getString("direccion"));
                    d.setTelefono(result.getInt("telefono"));
                    all.add(d);
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
