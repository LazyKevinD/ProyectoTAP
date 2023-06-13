package controlador;
import ConexionBD.ConexionBD;
import modelo.Foto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FotoDAO implements Runnable{
    //Metodos ABCC (CRUD)------------------------------------------------------------------------
    ConexionBD conexion = new ConexionBD();
    //ALTAS--------------------------------------------------------------------------------------
    public boolean agregarFoto(Foto a){
        boolean res = false;

        String sql = "INSERT INTO clientes values(\""+a.getId_cliente()+"\", \""+a.getNombre()+"\", \""+a.getPrimerAp()+"\", \""+a.getSegundoAp()+"\", \""+a.getTelefono()+"\", \""+a.getEmail()+"\");";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }
    //BAJAS--------------------------------------------------------------------------------------
    public boolean eliminarFoto(String ID_Cliente){
        boolean res = false;

        String sql = "DELETE FROM clientes WHERE id_clientes = '" + ID_Cliente  + "'";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //CAMBIOS------------------------------------------------------------------------------------

    public boolean actualizarCliente(Foto a){
        boolean res = false;

        String sql = "UPDATE clientes SET Nombre_Cliente='"+ a.getNombre() +"'," +
                " PrimerAp='"+ a.getPrimerAp() +"'," +
                " SegundoAp='"+ a.getSegundoAp() +"'," +
                " Telefono='"+ a.getTelefono() +"'," +
                " Email='"+ a.getEmail() +"' WHERE ID_Clientes="+a.getId_cliente()+"";

        res = conexion.ejecutarInstruccionDML(sql);

        return res;
    }

    //CONSULTAS----------------------------------------------------------------------------------

    public Foto buscarCliente (String filtro){
        return null;
    }

    public ArrayList<Foto> buscarClientes(String filtro){
        ArrayList<Foto> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        ResultSet rs = conexion.ejecutarConsulta(sql);

        try {
            rs.next();
            do{
                int idc = rs.getInt(1);
                String n = rs.getString("Nombre_Cliente");
                String pa = rs.getString(3);
                String sa = rs.getString(4);
                String t = rs.getString(5);
                String e = rs.getString(6);

                listaClientes.add(new Foto(idc, n, pa, sa, t, e));
            }while(rs.next());

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaClientes;
    }
    public ArrayList<Foto> buscarUsuarios(String filtro){
        ArrayList<Foto> listaUsuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        ResultSet rs = conexion.ejecutarConsulta(sql);

        try {
            rs.next();
            do{
                String u = rs.getString("Usuario");
                String c = rs.getString("Contraseña");

                listaUsuarios.add(new Foto(u,c));
            }while(rs.next());

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return listaUsuarios;
    }

    @Override
    public void run() {

    }
}
