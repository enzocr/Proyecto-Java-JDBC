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
public class Salon {

    private int numSalon;
    private int cantCamas;
    private String area;
    private Doctor doctor;

    public Salon() {

    }

    public Salon(int numSalon, int cantCamas, String area, Doctor d) {
        this.numSalon = numSalon;
        this.cantCamas = cantCamas;
        this.area = area;
        this.doctor = d;
    }

    public int getNumSalon() {
        return numSalon;
    }

    public void setNumSalon(int numSalon) {
        this.numSalon = numSalon;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor d) {
        this.doctor = d;
    }

}
