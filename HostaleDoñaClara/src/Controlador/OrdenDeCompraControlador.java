/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.OrdenDeCompraDao;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class OrdenDeCompraControlador {
    private OrdenDeCompraDao _ordenDeCompraDao;

    public OrdenDeCompraControlador() {
        _ordenDeCompraDao = new OrdenDeCompraDao();
    }
    
    public List<?> promedioVentaMensual(){
        try {
            return _ordenDeCompraDao.promedioVentaMensual();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public List<?> promedioPerdidaMensual(){
        try {
            return _ordenDeCompraDao.promedioPerdidaMensual();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public List<?> PorcentajeCierreEfectivo(){
        try {
            return _ordenDeCompraDao.PorcentajeCierreEfectivo();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
