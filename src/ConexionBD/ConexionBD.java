package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.Foto;

public class ConexionBD{

    private static Connection conexion = null;
    private static PreparedStatement pstm;
    private static ResultSet rs;


    private ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/Estudio_Fotografia";

            conexion = DriverManager.getConnection(URL,"root","KevinDany1");

        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE DRIVER");
        }catch (SQLException e) {
            System.out.println("Error de ruta URL");
        }
    }
    static void cerrarConexion(){
        try {
            pstm.close();
            conexion.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    public static Connection getConexion() {
        if (conexion == null) {
            new ConexionBD();
        }
        return conexion;
    }

    public static ResultSet ejecutarConsulta(String consultaSQL){
        rs = null;

        try {
            pstm = conexion.prepareStatement(consultaSQL);
            rs = pstm.executeQuery(consultaSQL);

        } catch (SQLException e) {
            throw new RuntimeException("Error en Instruccion SQL");
        }

        return rs;
    }
    public static boolean agregarCliente(Foto a) {
        try {
            pstm = conexion.prepareStatement("insert into clientes values(?,?,?,?,?,?)");

            pstm.setInt(1, a.getId_cliente());
            pstm.setString(2,a.getNombre());
            pstm.setString(3,a.getPrimerAp());
            pstm.setString(4,a.getSegundoAp());
            pstm.setString(5,a.getTelefono());
            pstm.setString(6,a.getEmail());

            pstm.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static boolean eliminarCliente(String instruccion){
        try {
            String consulta = instruccion;
            pstm = conexion.prepareStatement(consulta);
            pstm.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public static  ResultSet ConsultarRegistro(String consulta){

        try {
            pstm = conexion.prepareStatement(consulta);
            return pstm.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return null;
    }

    //CAMBIOS------------------------------------------------------------------------------------

    public static boolean actualizarCliente(Foto a){
        try {
            pstm = conexion.prepareStatement("UPDATE clientes SET nombre_cliente=?,primerAp=?,segundoAp=?,telefono=?, email=? where id_clientes="+a.getId_cliente()+"");
            pstm.setString(1,a.getNombre());
            pstm.setString(2,a.getPrimerAp());
            pstm.setString(3,a.getSegundoAp());
            pstm.setString(4,a.getTelefono());
            pstm.setString(5,a.getEmail());

            pstm.executeUpdate();

            return true;

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }
}

