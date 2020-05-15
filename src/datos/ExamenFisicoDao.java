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

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class ExamenFisicoDao {

    private Conector conn;
    private PreparedStatement sentence;

    public ExamenFisicoDao() {
        this.conn = new Conector();
        this.sentence = null;
    }

    public int insert(ExamenFisico exf) {
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("INSERT INTO simame.examen_fisico values(?, ?, ?, ?, ?, ?, ?, ?)"));

                getSentence().setInt(1, exf.getCodigo());
                getSentence().setInt(2, exf.getPaciente().getNumAsegurado());
                getSentence().setInt(3, exf.getPeso());
                getSentence().setDouble(4, exf.getAltura());
                getSentence().setInt(5, exf.getPresionArterial());
                getSentence().setDouble(6, exf.getTemperatura());
                getSentence().setString(7, exf.getEnfermedad());
                getSentence().setInt(8, exf.getDoctor().getCedula());
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

    public int update(ExamenFisico exf) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement(""
                        + "UPDATE simame.examen_fisico "
                        + "SET num_asegurado = ?, peso = ?, altura = ?, "
                        + "presion_arterial = ?, temperatura = ?, enfermedad = ?, cedula_doctor = ? "
                        + "WHERE codigo_examen = ?"));

                getSentence().setInt(1, exf.getPaciente().getNumAsegurado());
                getSentence().setInt(2, exf.getPeso());
                getSentence().setDouble(3, exf.getAltura());
                getSentence().setInt(4, exf.getPresionArterial());
                getSentence().setDouble(5, exf.getTemperatura());
                getSentence().setString(6, exf.getEnfermedad());
                getSentence().setInt(7, exf.getDoctor().getCedula());
                getSentence().setInt(8, exf.getCodigo());
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

    public List<ExamenFisico> getAll() {

        try {
            if (getConn().conectarse()) {

                setSentence(getConn().getConn().prepareStatement("SELECT * FROM simame.examen_fisico"));

                List<ExamenFisico> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    ExamenFisico exf = new ExamenFisico();
                    exf.setCodigo(result.getInt(1));
                    exf.setPaciente(new Paciente());
                    exf.getPaciente().setNumAsegurado(result.getInt(2));
                    exf.setPeso(result.getInt(3));
                    exf.setAltura(result.getDouble(4));
                    exf.setPresionArterial(result.getInt(5));
                    exf.setTemperatura(result.getDouble(6));
                    exf.setEnfermedad(result.getString("enfermedad"));
                    exf.setDoctor(new Doctor());
                    exf.getDoctor().setCedula(result.getInt(8));
                    all.add(exf);
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

    public ExamenFisico getByPatientId(int numAsegurado) {
        try {
            ExamenFisico exf = new ExamenFisico();

            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.examen_fisico "
                        + "WHERE num_asegurado = ?"));
                getSentence().setInt(1, numAsegurado);
                List<ExamenFisico> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();

                while (result.next()) {
                    exf.setDoctor(new Doctor());
                    exf.setPaciente(new Paciente());
                    exf.setCodigo(result.getInt(1));
                    exf.getPaciente().setNumAsegurado(result.getInt(2));
                    exf.setPeso(result.getInt(3));
                    exf.setAltura(result.getDouble(4));
                    exf.setPresionArterial(result.getInt(5));
                    exf.setTemperatura(result.getDouble(6));
                    exf.setEnfermedad(result.getString("enfermedad"));
                    exf.getDoctor().setCedula(result.getInt(8));
                    all.add(exf);
                }
                getConn().disconnect();
                if (exf.getPaciente() != null) {

                    return exf;
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

    public ExamenFisico getByCode(int code) {
        try {
            ExamenFisico exf = new ExamenFisico();

            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.examen_fisico "
                        + "WHERE codigo_examen = ?"));
                getSentence().setInt(1, code);
                List<ExamenFisico> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    exf.setDoctor(new Doctor());
                    exf.setPaciente(new Paciente());
                    exf.setCodigo(result.getInt(1));
                    exf.getPaciente().setNumAsegurado(result.getInt(2));
                    exf.setPeso(result.getInt(3));
                    exf.setAltura(result.getDouble(4));
                    exf.setPresionArterial(result.getInt(5));
                    exf.setTemperatura(result.getDouble(6));
                    exf.setEnfermedad(result.getString("enfermedad"));
                    exf.getDoctor().setCedula(result.getInt(8));
                    all.add(exf);
                }
                getConn().disconnect();
                if (exf.getPaciente() == null) {
                    return null;
                } else {
                    return exf;
                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    public int delete(ExamenFisico ex) {

        try {
            if (getConn().conectarse()) {

                setSentence(conn.getConn().prepareStatement("DELETE FROM simame.examen_fisico WHERE codigo_examen= ?"));
                getSentence().setInt(1, ex.getCodigo());
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
