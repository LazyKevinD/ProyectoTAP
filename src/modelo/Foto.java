package modelo;

public class Foto {
    private int id_cliente;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private String telefono;
    private String email;

    private String usuario;

    private String contraseña;
    public Foto(){

    }
    public Foto(int id_cliente, String nombre, String primerAp, String segundoAp, String telefono, String email) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.telefono = telefono;
        this.email = email;
    }

    public Foto(String u, String c) {
        this.usuario = u;
        this.contraseña = c;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int Id_Cliente) {
        this.id_cliente = Id_Cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String u) {
        this.usuario = u;
    }
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String c) {
        this.contraseña = c;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "id_cliente='" + id_cliente + '\'' +
                ", nombre='" + nombre + '\'' +
                ", primerAp='" + primerAp + '\'' +
                ", segundoAp='" + segundoAp + '\'' +
                ", telefono=" + telefono +
                ", email=" + email +
                '}';
    }
}
