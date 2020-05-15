/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.clases;

import java.util.Date;
import utilities.SwingUtilities;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class Paciente {

    private int numAsegurado;
    private String nombre;
    private String direccion;
    private int edad;
    private Date fechaNacimiento;
    private String email;
    private int telefono;
    private String profesion;

    public Paciente() {

    }

    public Paciente(int numAsegurado, String nombre, String direccion, Date fechaNacimiento, String email, int telefono, String profesion) {
        this.numAsegurado = numAsegurado;
        this.nombre = nombre;
        this.edad = SwingUtilities.calculateAge(fechaNacimiento);
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    public int getNumAsegurado() {
        return numAsegurado;
    }

    public void setNumAsegurado(int numAsegurado) {
        this.numAsegurado = numAsegurado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

}
