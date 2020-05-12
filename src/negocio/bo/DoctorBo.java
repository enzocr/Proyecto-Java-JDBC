/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.bo;

import datos.DoctorDao;
import java.util.List;
import negocio.clases.Doctor;

/**
 *
 * @author enzoq
 */
public class DoctorBo {

    private DoctorDao dao;

    public DoctorBo() {
        this.dao = new DoctorDao();
    }

    public DoctorBo(DoctorDao dao) {
        this.dao = dao;
    }

    public DoctorDao getDao() {
        return dao;
    }

    public void setDao(DoctorDao dao) {
        this.dao = dao;
    }

    public List<Doctor> getByName(String text) {
        return getDao().getByName(text);
    }

    public Doctor getById(int cedula) {
        return getDao().getById(cedula);
    }

    public int delete(Doctor d) {
        return getDao().delete(d);
    }

    public int update(Doctor d) {
        return getDao().update(d);
    }

    public List<Doctor> getAll() {
        return getDao().getAll();
    }

    public int insert(Doctor d) {
        return getDao().insert(d);
    }

}
