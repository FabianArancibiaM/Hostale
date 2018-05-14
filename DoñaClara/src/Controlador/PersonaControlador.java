/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.PersonaDao;
import Modelo.Persona;

/**
 *
 * @author Cochy
 */
public class PersonaControlador {
    private PersonaDao _personaDao = new PersonaDao();
    
    public Persona bucarRut(String rut){
        return _personaDao.buscarPersona(rut);
    }
}
