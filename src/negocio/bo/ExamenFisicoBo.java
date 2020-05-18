/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.bo;

import datos.DoctorDao;
import datos.ExamenFisicoDao;
import datos.PacienteDao;
import java.util.ArrayList;
import java.util.List;
import negocio.clases.ExamenFisico;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class ExamenFisicoBo {

    private ExamenFisicoDao dao;
    private PacienteDao pacienteDao;
    private DoctorDao doctorDao;

    public ExamenFisicoBo() {
        this.dao = new ExamenFisicoDao();
        this.pacienteDao = new PacienteDao();
        this.doctorDao = new DoctorDao();
    }

    public int insert(ExamenFisico exf) {
        return getDao().insert(exf);
    }

    public int update(ExamenFisico exf) {
        return getDao().update(exf);
    }

    public List<ExamenFisico> getAll() {
        List<ExamenFisico> list = new ArrayList<>();
        int i = 0;
        for (ExamenFisico exf : getDao().getAll()) {
            int numAsegurado = getDao().getAll().get(i).getPaciente().getNumAsegurado();
            ExamenFisico updated = getDao().getByPatientId(numAsegurado);
            updated.setPaciente(getPacienteDao().getById(numAsegurado));
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
            list.add(updated);
            i++;
        }
        return list;
    }

    public ExamenFisico getByPatientId(int numAsegurado) {

        ExamenFisico updated = getDao().getByPatientId(numAsegurado);
        if (updated != null) {
            updated.setPaciente(getPacienteDao().getById(numAsegurado));
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
        }
        return updated;
    }

    public ExamenFisico getByCode(int code) {
        ExamenFisico updated = getDao().getByCode(code);
        if (updated != null) {
            updated.setPaciente(getPacienteDao().getById(updated.getPaciente().getNumAsegurado()));
            updated.setDoctor(getDoctorDao().getById(updated.getDoctor().getCedula()));
        }
        return updated;
    }

    public int delete(ExamenFisico ex) {
        return getDao().delete(ex);
    }

    public PacienteDao getPacienteDao() {
        return pacienteDao;
    }

    public void setPacienteDao(PacienteDao pacienteDao) {
        this.pacienteDao = pacienteDao;
    }

    public DoctorDao getDoctorDao() {
        return doctorDao;
    }

    public void setDoctorDao(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }

    public ExamenFisicoDao getDao() {
        return dao;
    }

    public void setDao(ExamenFisicoDao dao) {
        this.dao = dao;
    }

}
