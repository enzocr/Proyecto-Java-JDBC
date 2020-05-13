package datos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import negocio.clases.Paciente;
import utilities.SwingUtilities;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class PacienteDao {
    
    private Conector conn;
    private PreparedStatement sentence;
    
    public PacienteDao() {
        this.conn = new Conector();
        this.sentence = null;
    }
    
    public int insert(Paciente p) {
       
        Date dateSql = SwingUtilities.convertUtilToSql(p.getFechaNacimiento());
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("INSERT INTO simame.paciente values(?, ?, ?, ?, ?, ?, ?, ?)"));
                
                getSentence().setInt(1, p.getNumAsegurado());
                getSentence().setString(2, p.getNombre());
                getSentence().setString(3, p.getDireccion());
                getSentence().setInt(4, p.getEdad());
                getSentence().setDate(5, dateSql);
                getSentence().setString(6, p.getEmail());
                getSentence().setInt(7, p.getTelefono());
                getSentence().setString(8, p.getProfesion());
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
    
    public List<Paciente> getAll() {
        try {
            if (getConn().conectarse()) {
                
                setSentence(getConn().getConn().prepareStatement("SELECT * FROM simame.paciente"));
                
                List<Paciente> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    Paciente p = new Paciente();
                    p.setNumAsegurado(result.getInt(1));
                    p.setNombre(result.getString("nombre"));
                    p.setDireccion(result.getString("direccion"));
                    p.setEdad(result.getInt(4));
                    p.setFechaNacimiento(result.getDate(5));
                    p.setEmail(result.getString(6));
                    p.setTelefono(result.getInt("telefono"));
                    p.setProfesion(result.getString("profesion"));
                    all.add(p);
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
    
    public int update(Paciente p) {
        
        try {
            if (getConn().conectarse()) {
                
                setSentence(conn.getConn().prepareStatement(""
                        + "UPDATE simame.paciente "
                        + "SET nombre = ?, direccion = ?, "
                        + "edad = ?, fecha_nacimiento = ?, email = ?, "
                        + "telefono = ?, profesion = ? "
                        + "WHERE num_asegurado = ?"));
                getSentence().setString(1, p.getNombre());
                getSentence().setString(2, p.getDireccion());
                getSentence().setInt(3, p.getEdad());
                getSentence().setDate(4, (Date) p.getFechaNacimiento());
                getSentence().setString(5, p.getEmail());
                getSentence().setInt(6, p.getTelefono());
                getSentence().setString(7, p.getProfesion());
                getSentence().setInt(8, p.getNumAsegurado());
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
    
    public int delete(Paciente p) {
        
        try {
            if (getConn().conectarse()) {
                
                setSentence(conn.getConn().prepareStatement("DELETE FROM simame.paciente WHERE num_asegurado= ?"));
                getSentence().setInt(1, p.getNumAsegurado());
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
    
    public Paciente getById(int numAsegurado) {
        
        try {
            
            Paciente p = new Paciente();
            if (getConn().conectarse()) {
                
                setSentence(conn.getConn().prepareStatement("SELECT *"
                        + " FROM simame.paciente "
                        + "WHERE num_asegurado = ?"));
                getSentence().setInt(1, numAsegurado);
                List<Paciente> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    p.setNumAsegurado(result.getInt(1));
                    p.setNombre(result.getString("nombre"));
                    p.setDireccion(result.getString("direccion"));
                    p.setEdad(result.getInt(4));
                    p.setFechaNacimiento(result.getDate(5));
                    p.setEmail(result.getString(6));
                    p.setTelefono(result.getInt("telefono"));
                    p.setProfesion(result.getString("profesion"));
                    
                    all.add(p);
                    
                }
                getConn().disconnect();
                if (p == null) {
                    return null;
                } else {
                    return p;
                }
            } else {
                return null;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    public List<Paciente> getByName(String name) {
        try {
            if (getConn().conectarse()) {
                setSentence(conn.getConn().prepareStatement("SELECT * "
                        + "FROM simame.paciente "
                        + "WHERE nombre like ?"));
                getSentence().setString(1, "%" + name + "%");
                List<Paciente> all = new ArrayList<>();
                ResultSet result = getSentence().executeQuery();
                while (result.next()) {
                    Paciente p = new Paciente();
                    p.setNumAsegurado(result.getInt(1));
                    p.setDireccion(result.getString("direccion"));
                    p.setEdad(result.getInt(3));
                    p.setFechaNacimiento(result.getDate(4));
                    p.setEmail(result.getString(5));
                    p.setTelefono(result.getInt(6));
                    p.setTelefono(result.getInt("telefono"));
                    p.setProfesion(result.getString("profesion"));
                    all.add(p);
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
