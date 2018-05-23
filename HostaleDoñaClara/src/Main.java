
import Modelo.Clases.*;
import Modelo.Dao.EmpresaDao;
import Modelo.Dao.OrdenDeCompraDao;
import Modelo.Dao.ProductosDao;
import Modelo.Dao.UsuarioDao;
import static java.lang.Math.round;
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
        //2- metodo pago mas usado
        //promedio perdida mensual
        
        int anno = 2018;
        int mes = 4;
        OrdenDeCompraDao odao = new OrdenDeCompraDao();
        int valor = odao.solicitudesNoTerminadas(anno, mes);
        System.out.println("----------->"+valor);
        
        /*
        int anno = 2018;
        int mes = 3;
        String q ="select count(valorBruto) \n" +
                    " from Factura where ordenDeCompra is not null "
                + "and extract(month from fecha)= :mes "
                + "and extract(year from fecha) = :anno"; 
        
        String q1 ="select count(monto) \n" +
                " from OrdenDeCompra "
                 + "where extract(month from recepcion)= :mes "
                + "and extract(year from recepcion) = :anno"; 
        Object  lista = (Object)sesion.createQuery(q)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
        Object  lista2 = (Object)sesion.createQuery(q1)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
        int valor = round(Integer.parseInt(lista.toString())*100/Integer.parseInt(lista2.toString()));
        System.out.println("---->"+valor);    
        
        for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                System.out.println(row[0]+"<>");
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
    }
    
}
