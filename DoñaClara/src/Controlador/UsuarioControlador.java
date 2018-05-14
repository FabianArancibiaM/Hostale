/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.UsuarioDao;
import Modelo.Usuario;

/**
 *
 * @author Cochy
 */
public class UsuarioControlador {
    private UsuarioDao _usuarioDao = new UsuarioDao();
    
    public Usuario validarPerfil(String nombre, String clave){
        try {            
            return _usuarioDao.validarUsuario(clave, nombre);
        } catch (Exception e) {
            return null;
        }
    }
}
