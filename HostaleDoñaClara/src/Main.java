
import Modelo.Clases.*;
import Modelo.Dao.EmpresaDao;
import Modelo.Dao.ProductosDao;
import Modelo.Dao.UsuarioDao;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.StoredProcedureQuery;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cochy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Session sesion;
        sesion = Modelo.Dao.NewHibernateUtil.getSessionFactory().openSession();
               
        //2- metodo pago mas usado
        
        //3-ciudad que utiliza mas los servicios (llamar solo el primer arreglo)
                
        /*
        //Estado de habitaciones
        String q = "select count(capacidad), capacidad, estado "
                + "from Habitacion "
                + "group by capacidad, estado "
                + "order by estado desc , capacidad desc";
        */
        
        
        /*
        String q1 =
        List<?> lista = sesion.createQuery(q1).list();
        
        for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                System.out.println(row[0]+"<>"+row[1]+"<>");
                //String row =  lista.get(i).toString();
                //System.out.println(row);
        }
        
        
        
        List<Persona> lista = pDao.ProductosMasSolicitados();
        
        for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                System.out.println(row[0].toString()+"--");
        }
        
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
        */
        EmpresaDao empDao = new EmpresaDao();
        List<?> lista = empDao.listaRubros();
        for (int i = 0; i < 10; i++) {
            Object[] row = (Object[]) lista.get(i);
            System.out.println(row[0]+"<>"+Integer.parseInt(row[1].toString())+"<>");
        }
    }
    
}
