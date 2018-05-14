
import Modelo.Dao.EmpresaDao;
import Modelo.Dao.HabitacionDao;
import Modelo.Dao.PersonaDao;
import Modelo.Dao.UsuarioDao;
import Modelo.Empresa;
import Modelo.Persona;
import Modelo.Usuario;
import java.util.List;

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
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        EmpresaDao emDao = new EmpresaDao();
        List<String> lista = null;
        try {
            lista = emDao.listaRubros();
                       
        } catch (Exception e) {
            System.out.println(e);
        }
        for (String empresa : lista) {
            System.out.println(empresa + "\n");
        }      
        */
        /*
        UsuarioDao usuDao = new UsuarioDao();
        System.out.println("clave admin");
        System.out.println("usuario admin");
        String clave = "admin";
        String usuario = "admin";
        PersonaDao pdao  = new PersonaDao();
        Usuario usu = usuDao.validarUsuario(clave, usuario);
        System.out.println(usu.getPersona().getRut());
        Persona p = pdao.buscarPersona(usu.getPersona().getRut());
        System.out.println(p.getNombre()+" "+ p.getApellido());
        
        try {
            if (usu.getPerfil().equalsIgnoreCase("Administrador")) {
                System.out.println("yes");
            }else{
                System.out.println("nones");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        String rut = "18498633-0";
        
        PersonaDao pdao  = new PersonaDao();
        Persona p = pdao.buscarPersona(rut);
        System.out.println(p.getNombre()+" "+ p.getApellido());
        */
        
        HabitacionDao hDao = new HabitacionDao();
        List<?> lista = hDao.estadoHabitaciones();
        String[] estado= new String[3];
        int[] cantidad = new int[3];
        for (int i = 0; i < lista.size(); i++) {
            Object[] row = (Object[]) lista.get(i);
            estado[i] = row[0].toString();
            cantidad[i]=Integer.parseInt(row[1].toString());
        }
        for (int i = 0; i < estado.length; i++) {
            System.out.println(estado[i] + "<->" +cantidad[i]);
        }
        System.out.println("----->"+estado[2].toString());
        
        
        
        
    }
    
}
