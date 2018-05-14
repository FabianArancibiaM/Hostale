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
    private HabitacionDao _habitacionDao = new HabitacionDao();
    
    public List<?> estadoHabitaciones(){
        return _habitacionDao.estadoHabitaciones();
    }
}
