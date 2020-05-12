/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.clases;

/**
 *
 * @author enzoq
 */
public class ExamenFisico {

    private int codigo;
    private Integer numAsegurado;
    private int peso;
    private double altura;
    private int presionArterial;
    private double temperatura;
    private String enfermedad;
    private Integer cedulaDoctor;

    public ExamenFisico() {

    }

    public ExamenFisico(int codigo, Integer numAsegurado, int peso, double altura, int presionArterial, double temperatura, String enfermedad, Integer cedulaDoctor) {
        this.codigo = codigo;
        this.numAsegurado = numAsegurado;
        this.peso = peso;
        this.altura = altura;
        this.presionArterial = presionArterial;
        this.temperatura = temperatura;
        this.enfermedad = enfermedad;
        this.cedulaDoctor = cedulaDoctor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Integer getNumAsegurado() {
        return numAsegurado;
    }

    public void setNumAsegurado(Integer numAsegurado) {
        this.numAsegurado = numAsegurado;
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

    public Integer getCedulaDoctor() {
        return cedulaDoctor;
    }

    public void setCedulaDoctor(Integer cedulaDoctor) {
        this.cedulaDoctor = cedulaDoctor;
    }

}
