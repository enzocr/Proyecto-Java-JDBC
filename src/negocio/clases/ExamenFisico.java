/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.clases;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class ExamenFisico {

    private int codigo;
    private Paciente paciente;
    private int peso;
    private double altura;
    private int presionArterial;
    private double temperatura;
    private String enfermedad;
    private Doctor doctor;

    public ExamenFisico() {

    }

    public ExamenFisico(int codigo, Paciente p, int peso, double altura, int presionArterial, double temperatura, String enfermedad, Doctor d) {
        this.codigo = codigo;
        this.paciente = p;
        this.peso = peso;
        this.altura = altura;
        this.presionArterial = presionArterial;
        this.temperatura = temperatura;
        this.enfermedad = enfermedad;
        this.doctor = d;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente p) {
        this.paciente = p;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(int presionArterial) {
        this.presionArterial = presionArterial;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor d) {
        this.doctor = d;
    }

}
