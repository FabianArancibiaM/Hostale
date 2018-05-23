/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.PersonaDao;
import Modelo.Clases.Persona;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class PersonaControlador {
    private PersonaDao _personaDao;

    public PersonaControlador() {
        _personaDao = new PersonaDao();
    }
    
    public Persona bucarRut(String rut){
        try {
            return _personaDao.buscarPersona(rut);
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public List<?> promedioEdad(String rut){
        try {
            return _personaDao.PromedioEdad();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
