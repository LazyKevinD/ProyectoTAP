package controlador;
import ConexionBD.ConexionBD;
import modelo.Foto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import ConexionBD.ConexionBD;
import vista.paginas;

public class FotoDAO implements Runnable{
    private int filtro;
    public boolean agregarCliente(Foto a){
        boolean resultado=false;
        resultado=ConexionBD.agregarCliente(a);
        return resultado;
    }
    public boolean actualizarCliente(Foto a) {
        boolean resultado = false;
        resultado=ConexionBD.actualizarCliente(a);
        return resultado;
    }
    public Foto buscar(int filtro){
        Foto a = new Foto();
        String sql = "SELECT * FROM clientes WHERE id_clientes ="+filtro+";";

        ResultSet rs=ConexionBD.ConsultarRegistro(sql);

        try {

            if(rs.next()) {
                a.setId_cliente(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setPrimerAp(rs.getString(3));
                a.setSegundoAp(rs.getString(4));
                a.setTelefono(rs.getString(5));
                a.setEmail(rs.getString(6));
            }else {;
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }
    public boolean eliminarCliente(String idE) {
        String instruccion = "DELETE FROM clientes WHERE id_clientes = '"+idE+"';";
        boolean resultado = false;
        resultado = ConexionBD.eliminarCliente(instruccion);
        return resultado;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null,"CONECTANDO");
        buscar(this.filtro);
        new paginas();
    }

    public ArrayList<Foto> buscarU(String filtro){
        ArrayList<Foto> listaUsuarios = new ArrayList<>();
        String sql="SELECT * FROM usuarios WHERE usuario ='"+filtro+"';";
        ResultSet rs=ConexionBD.ConsultarRegistro(sql);

        try {
            if(rs.next()) {
                do {
                    listaUsuarios.add(new Foto(rs.getString(1),rs.getString(2)));
                }while(rs.next());

            }else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public ArrayList<Foto> buscarC(String filtro){
        ArrayList<Foto> listaUsuarios = new ArrayList<>();
        String sql="SELECT * FROM clientes";
        ResultSet rs=ConexionBD.ConsultarRegistro(sql);

        try {
            if(rs.next()) {
                do {
                    listaUsuarios.add(new Foto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
                }while(rs.next());

            }else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }
    public void setFiltro(int filtro) {
        this.filtro = filtro;
    }
}