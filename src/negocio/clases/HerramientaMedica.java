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
public class HerramientaMedica {

    private int codigo;
    private String varchar;
    private int cantTotal;
    private int cantidadPrestado;

    public HerramientaMedica() {

    }

    public HerramientaMedica(int codigo, String varchar, int cantTotal, int cantidadPrestado) {
        this.codigo = codigo;
        this.varchar = varchar;
        this.cantTotal = cantTotal;
        this.cantidadPrestado = cantidadPrestado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public int getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(int cantTotal) {
        this.cantTotal = cantTotal;
    }

    public int getCantidadPrestado() {
        return cantidadPrestado;
    }

    public void setCantidadPrestado(int cantidadPrestado) {
        this.cantidadPrestado = cantidadPrestado;
    }

}
