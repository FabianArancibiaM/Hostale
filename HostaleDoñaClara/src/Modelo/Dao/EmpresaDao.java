/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Clases.Empresa;
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
    //Segun rubro de la empresa
    public List<?> listaRubros(){
        String q = "select e.rubro, count(e.rubro) from Cliente c join  c.empresa as e group by e.rubro";
        return (List<?>)sesion.createQuery(q).list();
    }
    
    
    
}
