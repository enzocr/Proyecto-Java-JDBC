/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio.bo;

import datos.HerramientaMedicaDao;
import java.util.List;
import negocio.clases.HerramientaMedica;

/**
 *
 * @author Enzo Quartino Zamora
 * <github.com/enzocr || email: enzoquartino@gmail.com>
 */
public class HerramientaMedicaBo {

    private HerramientaMedicaDao dao;

    public HerramientaMedicaBo() {
        this.dao = new HerramientaMedicaDao();
    }

    public int insert(HerramientaMedica hm) {
        return getDao().insert(hm);
    }

    public List<HerramientaMedica> getAll() {
        return getDao().getAll();
    }

    public HerramientaMedica getByCode(int code) {
        return getDao().getByCode(code);
    }

    public List<HerramientaMedica> getByDesc(String description) {
        return getDao().getByDesc(description);
    }

    public int update(HerramientaMedica hm) {
        return getDao().update(hm);
    }

    public int delete(HerramientaMedica hm) {
        return getDao().delete(hm);
    }

    public HerramientaMedicaDao getDao() {
        return dao;
    }

    public void setDao(HerramientaMedicaDao dao) {
        this.dao = dao;
    }

}
