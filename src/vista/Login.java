package vista;

import ConexionBD.ConexionBD;
import controlador.FotoDAO;
import modelo.Foto;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Image;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.*;

public class Login extends JFrame{
    JLabel lbl_Usuario, lbl_Contraseña;
    JTextField caja_Usuario;
    JPasswordField caja_Contraseña;
    JButton btn_Ingresar;
    JLabel lbl_imagen;
    Color C1 = new Color(79, 255, 88);

    public Login() throws IOException {
        getContentPane().setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,470);
        setBackground(new Color(152, 183, 248));
        setLocationRelativeTo(null);
        setTitle("Ingresar");
        setVisible(true);

        lbl_imagen = new JLabel();
        ImageIcon icono = new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"));
        Image imagen = icono.getImage();
        ImageIcon iconoEscalado = new ImageIcon (imagen.getScaledInstance(150,150,Image.SCALE_SMOOTH));
        lbl_imagen.setIcon(iconoEscalado);
        lbl_imagen.setBounds(70, 35, 150, 150);
        add(lbl_imagen);

        lbl_Usuario = new JLabel("Nombre");
        lbl_Usuario.setBounds(50, 180, 100, 25);
        lbl_Usuario.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
        add(lbl_Usuario);

        caja_Usuario = new JTextField();
        caja_Usuario.setBounds(50, 210, 185, 25);
        add(caja_Usuario);

        lbl_Contraseña = new JLabel("Contraseña");
        lbl_Contraseña.setBounds(50, 250, 100, 25);
        lbl_Contraseña.setFont(new Font("Berlin Sans FB", Font.PLAIN, 16));
        add(lbl_Contraseña);

        caja_Contraseña = new JPasswordField();
        caja_Contraseña.setBounds(50, 280, 185, 25);
        add(caja_Contraseña);

        btn_Ingresar = new JButton("Ingresar");
        btn_Ingresar.setBounds(95, 340, 100, 35);
        btn_Ingresar.setBackground(C1);
        btn_Ingresar.setForeground(Color.black);
        btn_Ingresar.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
        btn_Ingresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Connection a = ConexionBD.getConexion();
                FotoDAO f = new FotoDAO();


                ArrayList<Foto> listaUsuarios = new ArrayList<>();
                listaUsuarios = f.buscarU(caja_Usuario.getText());
                if(listaUsuarios!=null) {
                    if(listaUsuarios.get(0).getContraseña().equals(caja_Contraseña.getText())) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                Thread hilo = new Thread(f);
                                hilo.start();
                                setVisible(false);
                            }
                        });
                    }else {
                        JOptionPane.showMessageDialog(null,"Contreseña incorrecta");
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Usuario inexistente");
                }
            }
        });
        add(btn_Ingresar);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Login();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
