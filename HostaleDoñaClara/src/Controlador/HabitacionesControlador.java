/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.HabitacionDao;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class HabitacionesControlador {
    private HabitacionDao _habitacionDao;

    public HabitacionesControlador() {
        _habitacionDao = new HabitacionDao();
    }
    
    public List<?> estadoHabitaciones(){
        try {
            return _habitacionDao.estadoHabitaciones();
        } catch (Exception e) {
            System.out.println(e);
            return null; 
        }
    }
    public List<?> habitacionMasSolicitadas(){
        try {
            return _habitacionDao.HaitacionesMasSolicitadas();
        } catch (Exception e) {
            System.out.println(e);
            return null; 
        }
    }
    public List<?> fechaMayorAuge(){
        try {
            return _habitacionDao.fechaMayorAuge();
        } catch (Exception e) {
            System.out.println(e);
            return null; 
        }
    }
}
