/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.EmpresaDao;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class EmpresaControlador {
    private EmpresaDao _empDao;

    public EmpresaControlador() {
        _empDao = new EmpresaDao();
    }
    public List<?> listaRubros(){
        try {
            return _empDao.listaRubros();
        } catch (Exception e) {
            System.out.println(e);
            return null; 
        }
    }
}
