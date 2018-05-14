/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class UsuarioDao {
    private Session sesion;

    public UsuarioDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public Usuario validarUsuario(String pass,String name){
        Usuario u = (Usuario)sesion.createQuery("from Usuario where clave = :pass and nombre = :name ")
                .setParameter("pass", pass)
                .setParameter("name", name).uniqueResult(); 
        return u;
    }
}
