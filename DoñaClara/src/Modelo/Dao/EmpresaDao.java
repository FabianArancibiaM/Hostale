/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Empresa;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class EmpresaDao {
    private Session sesion;

    public EmpresaDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public List<String> listaRubros(){
        Query q = sesion.createQuery("select rubro from Empresa Group By rubro");
        return q.list();        
    }
}
