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
            return _ordenDeCompraDao.ventaMensual();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public int promedioPerdidaMensual(int anno,int mes){
        try {
            return _ordenDeCompraDao.perdidaMensual(anno,mes);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public int PorcentajeCierreEfectivo(int anno,int mes){
        try {
            return _ordenDeCompraDao.PorcentajeCierreEfectivo( anno, mes);
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
