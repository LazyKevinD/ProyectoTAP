package ConexionBD;
import java.sql.*;

public class ConexionBD {

    private Connection conexion;
    private Statement stm;
    private ResultSet rs;

    public ConexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String URL = "jdbc:mysql://localhost:3306/Estudio_Fotografia";

            conexion = DriverManager.getConnection(URL,"root","KevinDany1");

            System.out.println("CONEXION ESTABLECIDA");
            System.out.println("Ya casi soy ISC");

        } catch (ClassNotFoundException e) {
            System.out.println("ERROR DE DRIVER");
        }catch (SQLException e) {
            System.out.println("Error de ruta URL");
        }
    }

    //metodo ABC (Altas, Bajas, Cambios)
    public boolean ejecutarInstruccionDML(String instruccionDML){
        boolean res = false;

        try {
            stm = conexion.createStatement();
            if(stm.executeUpdate(instruccionDML) >= 1){
                res = true;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error en Instruccion SQL");
        }

        return res;
    }

    public ResultSet ejecutarConsulta(String consultaSQL){
        rs = null;

        try {
            stm = conexion.createStatement();
            rs = stm.executeQuery(consultaSQL);

        } catch (SQLException e) {
            throw new RuntimeException("Error en Instruccion SQL");
        }

        return rs;
    }

    public void cerrarConexion(){
        try {
            conexion.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new ConexionBD();
    }

}

