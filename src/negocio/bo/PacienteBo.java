/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.bo;

import datos.PacienteDao;
import java.util.List;
import negocio.clases.Paciente;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class PacienteBo {

    private PacienteDao dao;

    public PacienteBo() {
        this.dao = new PacienteDao();
    }

    public PacienteBo(PacienteDao dao) {
        this.dao = dao;
    }

    public PacienteDao getDao() {
        return dao;
    }

    public void setDao(PacienteDao dao) {
        this.dao = dao;
    }

    public List<Paciente> getByName(String name) {
        return getDao().getByName(name);
    }

    public Paciente getById(int numAsegurado) {
        return getDao().getById(numAsegurado);
    }

    public int delete(Paciente p) {
        return getDao().delete(p);
    }

    public int update(Paciente p) {
        return getDao().update(p);
    }

    public List<Paciente> getAll() {
        return getDao().getAll();
    }

    public int insert(Paciente p) {
        return getDao().insert(p);
    }

}
