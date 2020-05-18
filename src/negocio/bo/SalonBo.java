/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.bo;

import datos.DoctorDao;
import datos.SalonDao;
import java.util.ArrayList;
import java.util.List;
import negocio.clases.ExamenFisico;
import negocio.clases.Salon;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class SalonBo {

    private SalonDao dao;
    private DoctorDao doctorDao;

    public SalonBo() {
        this.doctorDao = new DoctorDao();
        this.dao = new SalonDao();
    }

    public int insert(Salon s) {
        return getDao().insert(s);
    }

    public List<Salon> getAll() {
        List<Salon> list = new ArrayList<>();
        int i = 0;
        for (Salon updated : getDao().getAll()) {
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
            list.add(updated);
            i++;
        }
        return list;
    }

    public Salon getByNum(int numSalon) {
        Salon updated = getDao().getByNum(numSalon);
        if (updated != null) {
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
        }
        return updated;
    }

    public Salon getByArea(String area) {
        Salon updated = getDao().getByArea(area);
        if (updated != null) {
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
        }
        return updated;
    }

    public int update(Salon s) {
        return getDao().update(s);
    }

    public int delete(Salon s) {
        return getDao().delete(s);
    }

    public DoctorDao getDoctorDao() {
        return doctorDao;
    }

    public void setDoctorDao(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public SalonDao getDao() {
        return dao;
    }

    public void setDao(SalonDao dao) {
        this.dao = dao;
    }

}
