package vista;

import controlador.FotoDAO;
import modelo.Foto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;

public class paginas extends JFrame implements KeyListener{
    ImageIcon icono1 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"));
    ImageIcon icono2 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/camara.png"));
    ImageIcon icono3 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"));
    ImageIcon icono4 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"));
    ImageIcon icono5 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"));
    ImageIcon icono6 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambio.png"));
    ImageIcon icono7 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"));
    ImageIcon icono8 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma.png"));
    ImageIcon icono9 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/print.png"));

    Image imagen1 = icono1.getImage();
    Image imagen2 = icono2.getImage();
    Image imagen3 = icono3.getImage();
    Image imagen4 = icono4.getImage();
    Image imagen5 = icono5.getImage();
    Image imagen6 = icono6.getImage();
    Image imagen7 = icono7.getImage();
    Image imagen8 = icono8.getImage();
    Image imagen9 = icono9.getImage();
    ImageIcon iconoEscalado1 = new ImageIcon (imagen1.getScaledInstance(100,100,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado2 = new ImageIcon (imagen2.getScaledInstance(100,100,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado3 = new ImageIcon (imagen3.getScaledInstance(100,100,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado4 = new ImageIcon (imagen4.getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado5 = new ImageIcon (imagen5.getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado6 = new ImageIcon (imagen6.getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado7 = new ImageIcon (imagen7.getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado8 = new ImageIcon (imagen8.getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon iconoEscalado9 = new ImageIcon (imagen9.getScaledInstance(50,50,Image.SCALE_SMOOTH));
//---------------------------------------------------------------------
    JLabel lbl_imagen, lbl_fondo, lbl_txt, lbl_Id, lbl_nombre, lbl_primerAp, lbl_segundoAp, lbl_telefono, lbl_email, lbl_e1, lbl_e2, lbl_e3;
    JLabel lbl_imagen2, lbl_fondo2, lbl_txt2, lbl_Id2, lbl_nombre2, lbl_primerAp2, lbl_segundoAp2, lbl_telefono2, lbl_email2, lbl_e12, lbl_e22, lbl_e32;
    JLabel lbl_imagen3, lbl_fondo3, lbl_txt3, lbl_Id3, lbl_nombre3, lbl_primerAp3, lbl_segundoAp3, lbl_telefono3, lbl_email3, lbl_e13, lbl_e23, lbl_e33;
    JLabel lbl_imagen4, lbl_fondo4, lbl_txt4, lbl_Id4, lbl_nombre4, lbl_primerAp4, lbl_segundoAp4, lbl_telefono4, lbl_email4, lbl_e14, lbl_e24, lbl_e34;
    JLabel lbl_imagen5, lbl_fondo5, lbl_txt5, lbl_Id5, lbl_nombre5, lbl_primerAp5, lbl_segundoAp5, lbl_telefono5, lbl_email5, lbl_e15, lbl_e25, lbl_e35;
    JLabel lbl_imagen6, lbl_fondo6, lbl_txt6, lbl_Id6, lbl_nombre6, lbl_primerAp6, lbl_segundoAp6, lbl_telefono6, lbl_email6, lbl_e16, lbl_e26, lbl_e36;
    JLabel lbl_imagen7, lbl_fondo7, lbl_txt7, lbl_Id7, lbl_nombre7, lbl_primerAp7, lbl_segundoAp7, lbl_telefono7, lbl_email7, lbl_e17, lbl_e27, lbl_e37;
    JLabel lbl_imagen8, lbl_fondo8, lbl_txt8, lbl_Id8, lbl_nombre8, lbl_primerAp8, lbl_segundoAp8, lbl_telefono8, lbl_email8, lbl_e18, lbl_e28, lbl_e38;
    JLabel lbl_imagen9, lbl_fondo9, lbl_txt9, lbl_Id9, lbl_nombre9, lbl_primerAp9, lbl_segundoAp9, lbl_telefono9, lbl_email9, lbl_e19, lbl_e29, lbl_e39;
    JLabel lbl_imagen10, lbl_fondo10, lbl_txt10, lbl_Id10, lbl_nombre10, lbl_primerAp10, lbl_segundoAp10, lbl_telefono10, lbl_email10, lbl_e110, lbl_e210, lbl_e310;
    JLabel lbl_imagen11, lbl_fondo11, lbl_txt11, lbl_Id11, lbl_nombre11, lbl_primerAp11, lbl_segundoAp11, lbl_telefono11, lbl_email11, lbl_e111, lbl_e211, lbl_e311;
    JLabel lbl_imagen12, lbl_fondo12, lbl_txt12, lbl_Id12, lbl_nombre12, lbl_primerAp12, lbl_segundoAp12, lbl_telefono12, lbl_email12, lbl_e112, lbl_e212, lbl_e312;
    JLabel lbl_imagen13, lbl_fondo13, lbl_txt13, lbl_Id13, lbl_nombre13, lbl_primerAp13, lbl_segundoAp13, lbl_telefono13, lbl_email13, lbl_e113, lbl_e213, lbl_e313;
    JLabel lbl_imagen14, lbl_fondo14, lbl_txt14, lbl_Id14, lbl_nombre14, lbl_primerAp14, lbl_segundoAp14, lbl_telefono14, lbl_email14, lbl_e114, lbl_e214, lbl_e314;
    JTextField caja_id, caja_nombre, caja_primerAp, caja_segundoAp, caja_telefono, caja_email, caja_registro, caja_e1, caja_e2, caja_e3;
    JTextField caja_id2, caja_nombre2, caja_primerAp2, caja_segundoAp2, caja_telefono2, caja_email2, caja_registro2, caja_e12, caja_e22, caja_e32;
    JTextField caja_id3, caja_nombre3, caja_primerAp3, caja_segundoAp3, caja_telefono3, caja_email3, caja_registro3, caja_e13, caja_e23, caja_e33;
    JTextField caja_id4, caja_nombre4, caja_primerAp4, caja_segundoAp4, caja_telefono4, caja_email4, caja_registro4, caja_e14, caja_e24, caja_e34;
    JTextField caja_id5, caja_nombre5, caja_primerAp5, caja_segundoAp5, caja_telefono5, caja_email5, caja_registro5, caja_e15, caja_e25, caja_e35;
    JTextField caja_id6, caja_nombre6, caja_primerAp6, caja_segundoAp6, caja_telefono6, caja_email6, caja_registro6, caja_e16, caja_e26, caja_e36;
    JTextField caja_id7, caja_nombre7, caja_primerAp7, caja_segundoAp7, caja_telefono7, caja_email7, caja_registro7, caja_e17, caja_e27, caja_e37;
    JTextField caja_id8, caja_nombre8, caja_primerAp8, caja_segundoAp8, caja_telefono8, caja_email8, caja_registro8, caja_e18, caja_e28, caja_e38;
    JTextField caja_id9, caja_nombre9, caja_primerAp9, caja_segundoAp9, caja_telefono9, caja_email9, caja_registro9, caja_e19, caja_e29, caja_e39;
    JTextField caja_id10, caja_nombre10, caja_primerAp10, caja_segundoAp10, caja_telefono10, caja_email10, caja_registro10, caja_e110, caja_e210, caja_e310;
    JTextField caja_id11, caja_nombre11, caja_primerAp11, caja_segundoAp11, caja_telefono11, caja_email11, caja_registro11, caja_e111, caja_e211, caja_e311;
    JTextField caja_id12, caja_nombre12, caja_primerAp12, caja_segundoAp12, caja_telefono12, caja_email12, caja_registro12, caja_e112, caja_e212, caja_e312;
    JTextField caja_id13, caja_nombre13, caja_primerAp13, caja_segundoAp13, caja_telefono13, caja_email13, caja_registro13, caja_e113, caja_e213, caja_e313;
    JTextField caja_id14, caja_nombre14, caja_primerAp14, caja_segundoAp14, caja_telefono14, caja_email14, caja_registro14, caja_e114, caja_e214, caja_e314;
    JButton btn_agregar, btn_borrar, btn_cambio, btn_bajar, btn_buscar, btn_E1, btn_E2, btn_E3, btn_E4;
    JButton btn_agregar2, btn_borrar2, btn_cambio2, btn_bajar2, btn_buscar2, btn_E12, btn_E22, btn_E32, btn_E42;
    JButton btn_agregar3, btn_borrar3, btn_cambio3, btn_bajar3, btn_buscar3, btn_E13, btn_E23, btn_E33, btn_E43;
    JButton btn_agregar4, btn_borrar4, btn_cambio4, btn_bajar4, btn_buscar4, btn_E14, btn_E24, btn_E34, btn_E44;
    JButton btn_agregar5, btn_borrar5, btn_cambio5, btn_bajar5, btn_buscar5, btn_E15, btn_E25, btn_E35, btn_E45;
    JButton btn_agregar6, btn_borrar6, btn_cambio6, btn_bajar6, btn_buscar6, btn_E16, btn_E26, btn_E36, btn_E46;
    JButton btn_agregar7, btn_borrar7, btn_cambio7, btn_bajar7, btn_buscar7, btn_E17, btn_E27, btn_E37, btn_E47;
    JButton btn_agregar8, btn_borrar8, btn_cambio8, btn_bajar8, btn_buscar8, btn_E18, btn_E28, btn_E38, btn_E48;
    JButton btn_agregar9, btn_borrar9, btn_cambio9, btn_bajar9, btn_buscar9, btn_E19, btn_E29, btn_E39, btn_E49;
    JButton btn_agregar10, btn_borrar10, btn_cambio10, btn_bajar10, btn_buscar10, btn_E110, btn_E210, btn_E310, btn_E410;
    JButton btn_agregar11, btn_borrar11, btn_cambio11, btn_bajar11, btn_buscar11, btn_E111, btn_E211, btn_E311, btn_E411;
    JButton btn_agregar12, btn_borrar12, btn_cambio12, btn_bajar12, btn_buscar12, btn_E112, btn_E212, btn_E312, btn_E412;
    JButton btn_agregar13, btn_borrar13, btn_cambio13, btn_bajar13, btn_buscar13, btn_E113, btn_E213, btn_E313, btn_E413;
    JButton btn_agregar14, btn_borrar14, btn_cambio14, btn_bajar14, btn_buscar14, btn_E114, btn_E214, btn_E314, btn_E414;

//---------------------------------------------------------------------
    JMenuBar menuBar;
    JMenu menuAltas, menuBajas, menuCambios, menuConsultas;
    JMenuItem itemClientes, itemClientes2, itemClientes3, itemClientes4;
    JMenuItem itemEmpleados, itemEmpleados2, itemEmpleados3, itemEmpleados4;
    JMenuItem itemFormaC, itemFormaC2, itemFormaC3, itemFormaC4;
    JMenuItem itemServicio, itemServicio2, itemServicio3, itemServicio4;
    JMenuItem itemContrato, itemContrato2, itemContrato3, itemContrato4;
    JMenuItem itemOcupacion, itemOcupacion2, itemOcupacion3, itemOcupacion4;
    JMenuItem itemFormaP, itemFormaP2, itemFormaP3, itemFormaP4;
    JMenuItem itemEstudio, itemEstudio2, itemEstudio3, itemEstudio4;
    JMenuItem itemFotos, itemFotos2, itemFotos3, itemFotos4;
    JMenuItem itemHorarioF, itemHorarioS, itemCuentas, itemReporteC, itemTransaccion;

    JInternalFrame IF_Contratos = new JInternalFrame(), IF_Clientes = new JInternalFrame(), IF_Empleados = new JInternalFrame();
    JInternalFrame IF_Estudios = new JInternalFrame(), IF_Forma_Consulta = new JInternalFrame(), IF_Forma_Orden_Paquete = new JInternalFrame();
    JInternalFrame IF_Fotos = new JInternalFrame(), IF_Horario_Fotografo = new JInternalFrame(), IF_Horario_Semanal = new JInternalFrame();
    JInternalFrame IF_Ocupacion = new JInternalFrame(), IF_Servicios = new JInternalFrame(), IF_Cuentas = new JInternalFrame();
    JInternalFrame IF_ReporteC = new JInternalFrame(), IF_Transaccion = new JInternalFrame();
    String[] columnNames = {"ID Clientes", "Nombre", "Primer Ap", "Segundo Ap", "Telefono", "email"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    JTable tabla = new JTable(model), tabla2 = new JTable(model), tabla3 = new JTable(model), tabla4 = new JTable(model), tabla5 = new JTable(model), tabla6 = new JTable(model), tabla7 = new JTable(model), tabla8 = new JTable(model), tabla9 = new JTable(model), tabla10 = new JTable(model),tabla11 = new JTable(model) ,tabla12 = new JTable(model),tabla13 = new JTable(model),tabla14 = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(tabla);
    JScrollPane scrollPane2 = new JScrollPane(tabla2);
    JScrollPane scrollPane3 = new JScrollPane(tabla3);
    JScrollPane scrollPane4 = new JScrollPane(tabla4);
    JScrollPane scrollPane5 = new JScrollPane(tabla5);
    JScrollPane scrollPane6 = new JScrollPane(tabla6);
    JScrollPane scrollPane7 = new JScrollPane(tabla7);
    JScrollPane scrollPane8 = new JScrollPane(tabla8);
    JScrollPane scrollPane9 = new JScrollPane(tabla9);
    JScrollPane scrollPane10 = new JScrollPane(tabla10);
    JScrollPane scrollPane11 = new JScrollPane(tabla11);
    JScrollPane scrollPane12 = new JScrollPane(tabla12);
    JScrollPane scrollPane13 = new JScrollPane(tabla13);
    JScrollPane scrollPane14 = new JScrollPane(tabla14);
    FotoDAO fotoDAO = new FotoDAO();
    JDesktopPane desktopPane = new JDesktopPane();


    int cont = 0, cont1 = 0;
    int reg = 0;
    public paginas() {
        getContentPane().setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Estudio Fotografia");
        setSize(710, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);


        menuBar = new JMenuBar();
        menuAltas = new JMenu("Altas");
            itemClientes = new JMenuItem("Clientes");
            menuAltas.add(itemClientes);
            itemEmpleados = new JMenuItem("Empleados");
            menuAltas.add(itemEmpleados);
            itemFormaC = new JMenuItem("Forma Consulta");
            menuAltas.add(itemFormaC);
            itemOcupacion = new JMenuItem("Ocupacion");
            menuAltas.add(itemOcupacion);
            itemContrato = new JMenuItem("Contratos");
            menuAltas.add(itemContrato);
            itemServicio = new JMenuItem("Servicios");
            menuAltas.add(itemServicio);
            itemFormaP = new JMenuItem("Forma Orden Paquete");
            menuAltas.add(itemFormaP);
            itemFotos = new JMenuItem("Tipo Fotos");
            menuAltas.add(itemFotos);
            itemEstudio = new JMenuItem("Estudios");
            menuAltas.add(itemEstudio);

        menuBajas = new JMenu("Bajas");
            itemClientes2 = new JMenuItem("Clientes");
            menuBajas.add(itemClientes2);
            itemEmpleados2 = new JMenuItem("Empleados");
            menuBajas.add(itemEmpleados2);
            itemFormaC2 = new JMenuItem("Forma Consulta");
            menuBajas.add(itemFormaC2);
            itemOcupacion2 = new JMenuItem("Ocupacion");
            menuBajas.add(itemOcupacion2);
            itemContrato2 = new JMenuItem("Contratos");
            menuBajas.add(itemContrato2);
            itemServicio2 = new JMenuItem("Servicios");
            menuBajas.add(itemServicio2);
            itemFormaP2 = new JMenuItem("Forma Orden Paquete");
            menuBajas.add(itemFormaP2);
            itemFotos2 = new JMenuItem("Tipo Fotos");
            menuBajas.add(itemFotos2);
            itemEstudio2 = new JMenuItem("Estudios");
            menuBajas.add(itemEstudio2);

        menuCambios = new JMenu("Cambios");
            itemClientes3 = new JMenuItem("Clientes");
            menuCambios.add(itemClientes3);
            itemEmpleados3 = new JMenuItem("Empleados");
            menuCambios.add(itemEmpleados3);
            itemFormaC3 = new JMenuItem("Forma Consulta");
            menuCambios.add(itemFormaC3);
            itemOcupacion3 = new JMenuItem("Ocupacion");
            menuCambios.add(itemOcupacion3);
            itemContrato3 = new JMenuItem("Contratos");
            menuCambios.add(itemContrato3);
            itemServicio3 = new JMenuItem("Servicios");
            menuCambios.add(itemServicio3);
            itemFormaP3 = new JMenuItem("Forma Orden Paquete");
            menuCambios.add(itemFormaP3);
            itemFotos3 = new JMenuItem("Tipo Fotos");
            menuCambios.add(itemFotos3);
            itemEstudio3 = new JMenuItem("Estudios");
            menuCambios.add(itemEstudio3);

        menuConsultas = new JMenu("Cosultas");
            itemClientes4 = new JMenuItem("Clientes");
            menuConsultas.add(itemClientes4);
            itemEmpleados4 = new JMenuItem("Empleados");
            menuConsultas.add(itemEmpleados4);
            itemFormaC4 = new JMenuItem("Forma Consulta");
            menuConsultas.add(itemFormaC4);
            itemOcupacion4 = new JMenuItem("Ocupacion");
            menuConsultas.add(itemOcupacion4);
            itemContrato4 = new JMenuItem("Contratos");
            menuConsultas.add(itemContrato4);
            itemServicio4 = new JMenuItem("Servicios");
            menuConsultas.add(itemServicio4);
            itemFormaP4 = new JMenuItem("Forma Orden Paquete");
            menuConsultas.add(itemFormaP4);
            itemFotos4 = new JMenuItem("Tipo Fotos");
            menuConsultas.add(itemFotos4);
            itemEstudio4 = new JMenuItem("Estudios");
            menuConsultas.add(itemEstudio4);
            itemHorarioF = new JMenuItem("Horario Fotografo");
            menuConsultas.add(itemHorarioF);
            itemHorarioS = new JMenuItem("Horario Semanal");
            menuConsultas.add(itemHorarioS);
            itemCuentas = new JMenuItem("Cuentas por Cobrar");
            menuConsultas.add(itemCuentas);
            itemReporteC = new JMenuItem("Reporte Cliente");
            menuConsultas.add(itemReporteC);
            itemTransaccion = new JMenuItem("Transaccion");
            menuConsultas.add(itemTransaccion);

        itemClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt.setText("ALTAS CLIENTE");
                lbl_fondo.setBackground(Color.GREEN);
                btn_agregar.setEnabled(true);
                btn_bajar.setEnabled(false);
                btn_cambio.setEnabled(false);

                caja_id.setEnabled(true);
                caja_nombre.setEnabled(true);
                caja_primerAp.setEnabled(true);
                caja_segundoAp.setEnabled(true);
                caja_telefono.setEnabled(true);
                caja_email.setEnabled(true);

                apagarIF();
                IF_Clientes.setVisible(true);
            }
        });
        itemClientes2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt.setText("BAJAS CLIENTE");
                lbl_fondo.setBackground(Color.RED);
                btn_agregar.setEnabled(false);
                btn_bajar.setEnabled(true);
                btn_cambio.setEnabled(false);

                caja_id.setEnabled(true);
                caja_nombre.setEnabled(false);
                caja_primerAp.setEnabled(false);
                caja_segundoAp.setEnabled(false);
                caja_telefono.setEnabled(false);
                caja_email.setEnabled(false);

                apagarIF();
                IF_Clientes.setVisible(true);
            }
        });
        itemClientes3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt.setText("CAMBIOS CLIENTE");
                lbl_fondo.setBackground(Color.YELLOW);
                btn_agregar.setEnabled(false);
                btn_bajar.setEnabled(false);
                btn_cambio.setEnabled(true);

                caja_id.setEnabled(true);
                caja_nombre.setEnabled(true);
                caja_primerAp.setEnabled(true);
                caja_segundoAp.setEnabled(true);
                caja_telefono.setEnabled(true);
                caja_email.setEnabled(true);

                apagarIF();
                IF_Clientes.setVisible(true);
            }
        });
        itemClientes4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt.setText("CONSULTAS CLIENTE");
                lbl_fondo.setBackground(Color.BLUE);
                btn_agregar.setEnabled(false);
                btn_bajar.setEnabled(false);
                btn_cambio.setEnabled(false);

                caja_id.setEnabled(false);
                caja_nombre.setEnabled(false);
                caja_primerAp.setEnabled(false);
                caja_segundoAp.setEnabled(false);
                caja_telefono.setEnabled(false);
                caja_email.setEnabled(false);

                apagarIF();
                IF_Clientes.setVisible(true);
            }
        });
        itemContrato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt2.setText("ALTAS CONTRATO");
                lbl_fondo2.setBackground(Color.GREEN);
                btn_agregar2.setEnabled(true);
                btn_bajar2.setEnabled(false);
                btn_cambio2.setEnabled(false);
                apagarIF();
                IF_Contratos.setVisible(true);
            }
        });
        itemContrato2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt2.setText("BAJAS CONTRATO");
                lbl_fondo2.setBackground(Color.RED);
                btn_agregar2.setEnabled(false);
                btn_bajar2.setEnabled(true);
                btn_cambio2.setEnabled(false);
                apagarIF();
                IF_Contratos.setVisible(true);
            }
        });
        itemContrato3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt2.setText("CAMBIOS CONTRATO");
                lbl_fondo2.setBackground(Color.YELLOW);
                btn_agregar2.setEnabled(false);
                btn_bajar2.setEnabled(false);
                btn_cambio2.setEnabled(true);
                apagarIF();
                IF_Contratos.setVisible(true);
            }
        });
        itemContrato4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt2.setText("CONSULTAS CONTRATO");
                lbl_fondo2.setBackground(Color.BLUE);
                btn_agregar2.setEnabled(false);
                btn_bajar2.setEnabled(false);
                btn_cambio2.setEnabled(false);
                apagarIF();
                IF_Contratos.setVisible(true);
            }
        });
        itemEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt3.setText("ALTAS EMPLEADOS");
                lbl_fondo3.setBackground(Color.GREEN);
                btn_agregar3.setEnabled(true);
                btn_bajar3.setEnabled(false);
                btn_cambio3.setEnabled(false);
                apagarIF();
                IF_Empleados.setVisible(true);
            }
        });
        itemEmpleados2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt3.setText("BAJAS EMPLEADOS");
                lbl_fondo3.setBackground(Color.RED);
                btn_agregar3.setEnabled(false);
                btn_bajar3.setEnabled(true);
                btn_cambio3.setEnabled(false);
                apagarIF();
                IF_Empleados.setVisible(true);
            }
        });
        itemEmpleados3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt3.setText("CAMBIOS EMPLEADOS");
                lbl_fondo3.setBackground(Color.YELLOW);
                btn_agregar3.setEnabled(false);
                btn_bajar3.setEnabled(false);
                btn_cambio3.setEnabled(true);
                apagarIF();
                IF_Empleados.setVisible(true);
            }
        });
        itemEmpleados4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt3.setText("CONSULTAS EMPLEADOS");
                lbl_fondo3.setBackground(Color.BLUE);
                btn_agregar3.setEnabled(false);
                btn_bajar3.setEnabled(false);
                btn_cambio3.setEnabled(false);
                apagarIF();
                IF_Empleados.setVisible(true);
            }
        });
        itemFormaC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt4.setText("ALTAS FORMA CONSULTA");
                lbl_fondo4.setBackground(Color.GREEN);
                btn_agregar4.setEnabled(true);
                btn_bajar4.setEnabled(false);
                btn_cambio4.setEnabled(false);
                apagarIF();
                IF_Forma_Consulta.setVisible(true);
            }
        });
        itemFormaC2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt4.setText("BAJAS FORMA CONSULTA");
                lbl_fondo4.setBackground(Color.RED);
                btn_agregar4.setEnabled(false);
                btn_bajar4.setEnabled(true);
                btn_cambio4.setEnabled(false);
                apagarIF();
                IF_Forma_Consulta.setVisible(true);
            }
        });
        itemFormaC3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt4.setText("CAMBIOS FORMA CONSULTA");
                lbl_fondo4.setBackground(Color.YELLOW);
                btn_agregar4.setEnabled(false);
                btn_bajar4.setEnabled(false);
                btn_cambio4.setEnabled(true);
                apagarIF();
                IF_Forma_Consulta.setVisible(true);
            }
        });
        itemFormaC4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt4.setText("CONSULTAS FORMA CONSULTA");
                lbl_fondo4.setBackground(Color.BLUE);
                btn_agregar4.setEnabled(false);
                btn_bajar4.setEnabled(false);
                btn_cambio4.setEnabled(false);
                apagarIF();
                IF_Forma_Consulta.setVisible(true);
            }
        });
        itemFormaP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt5.setText("ALTAS FORMA ORDEN PAQUETE");
                lbl_fondo5.setBackground(Color.GREEN);
                btn_agregar5.setEnabled(true);
                btn_bajar5.setEnabled(false);
                btn_cambio5.setEnabled(false);
                apagarIF();
                IF_Forma_Orden_Paquete.setVisible(true);
            }
        });
        itemFormaP2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt5.setText("BAJAS FORMA ORDEN PAQUETE");
                lbl_fondo5.setBackground(Color.RED);
                btn_agregar5.setEnabled(false);
                btn_bajar5.setEnabled(true);
                btn_cambio5.setEnabled(false);
                apagarIF();
                IF_Forma_Orden_Paquete.setVisible(true);
            }
        });
        itemFormaP3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt5.setText("CAMBIOS FORMA ORDEN PAQUETE");
                lbl_fondo5.setBackground(Color.YELLOW);
                btn_agregar5.setEnabled(false);
                btn_bajar5.setEnabled(false);
                btn_cambio5.setEnabled(true);
                apagarIF();
                IF_Forma_Orden_Paquete.setVisible(true);
            }
        });
        itemFormaP4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt5.setText("CONSULTAS FORMA ORDEN PAQUETE");
                lbl_fondo5.setBackground(Color.BLUE);
                btn_agregar5.setEnabled(false);
                btn_bajar5.setEnabled(false);
                btn_cambio5.setEnabled(false);
                apagarIF();
                IF_Forma_Orden_Paquete.setVisible(true);
            }
        });
        itemOcupacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt6.setText("ALTAS OCUPACION");
                lbl_fondo6.setBackground(Color.GREEN);
                btn_agregar6.setEnabled(true);
                btn_bajar6.setEnabled(false);
                btn_cambio6.setEnabled(false);
                apagarIF();
                IF_Ocupacion.setVisible(true);
            }
        });
        itemOcupacion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt6.setText("BAJAS OCUPACION");
                lbl_fondo6.setBackground(Color.RED);
                btn_agregar6.setEnabled(false);
                btn_bajar6.setEnabled(true);
                btn_cambio6.setEnabled(false);
                apagarIF();
                IF_Ocupacion.setVisible(true);
            }
        });
        itemOcupacion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt6.setText("CAMBIOS OCUPACION");
                lbl_fondo6.setBackground(Color.YELLOW);
                btn_agregar6.setEnabled(false);
                btn_bajar6.setEnabled(false);
                btn_cambio6.setEnabled(true);
                apagarIF();
                IF_Ocupacion.setVisible(true);
            }
        });
        itemOcupacion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt6.setText("CONSULTAS OCUPACION");
                lbl_fondo6.setBackground(Color.BLUE);
                btn_agregar6.setEnabled(false);
                btn_bajar6.setEnabled(false);
                btn_cambio6.setEnabled(false);
                apagarIF();
                IF_Ocupacion.setVisible(true);
            }
        });
        itemFotos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt7.setText("ALTAS FOTOS");
                lbl_fondo7.setBackground(Color.GREEN);
                btn_agregar7.setEnabled(true);
                btn_bajar7.setEnabled(false);
                btn_cambio7.setEnabled(false);
                apagarIF();
                IF_Fotos.setVisible(true);
            }
        });
        itemFotos2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt7.setText("BAJAS FOTOS");
                lbl_fondo7.setBackground(Color.RED);
                btn_agregar7.setEnabled(false);
                btn_bajar7.setEnabled(true);
                btn_cambio7.setEnabled(false);
                apagarIF();
                IF_Fotos.setVisible(true);
            }
        });
        itemFotos3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt7.setText("CAMBIOS FOTOS");
                lbl_fondo7.setBackground(Color.YELLOW);
                btn_agregar7.setEnabled(false);
                btn_bajar7.setEnabled(false);
                btn_cambio7.setEnabled(true);
                apagarIF();
                IF_Fotos.setVisible(true);
            }
        });
        itemFotos4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt7.setText("CONSULTAS FOTOS");
                lbl_fondo7.setBackground(Color.BLUE);
                btn_agregar7.setEnabled(false);
                btn_bajar7.setEnabled(false);
                btn_cambio7.setEnabled(false);
                apagarIF();
                IF_Fotos.setVisible(true);
            }
        });
        itemEstudio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt8.setText("ALTAS ESTUDIO");
                lbl_fondo8.setBackground(Color.GREEN);
                btn_agregar8.setEnabled(true);
                btn_bajar8.setEnabled(false);
                btn_cambio8.setEnabled(false);
                apagarIF();
                IF_Estudios.setVisible(true);
            }
        });
        itemEstudio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt8.setText("BAJAS ESTUDIO");
                lbl_fondo8.setBackground(Color.RED);
                btn_agregar8.setEnabled(false);
                btn_bajar8.setEnabled(true);
                btn_cambio8.setEnabled(false);
                apagarIF();
                IF_Estudios.setVisible(true);
            }
        });
        itemEstudio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt8.setText("CAMBIOS ESTUDIO");
                lbl_fondo8.setBackground(Color.YELLOW);
                btn_agregar8.setEnabled(false);
                btn_bajar8.setEnabled(false);
                btn_cambio8.setEnabled(true);
                apagarIF();
                IF_Estudios.setVisible(true);
            }
        });
        itemEstudio4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt8.setText("CONSULTAS ESTUDIO");
                lbl_fondo8.setBackground(Color.BLUE);
                btn_agregar8.setEnabled(false);
                btn_bajar8.setEnabled(false);
                btn_cambio8.setEnabled(false);
                apagarIF();
                IF_Estudios.setVisible(true);
            }
        });
        itemServicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt9.setText("ALTAS SERVICIO");
                lbl_fondo9.setBackground(Color.GREEN);
                btn_agregar9.setEnabled(true);
                btn_bajar9.setEnabled(false);
                btn_cambio9.setEnabled(false);
                apagarIF();
                IF_Servicios.setVisible(true);
            }
        });
        itemServicio2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt9.setText("BAJAS SERVICIO");
                lbl_fondo9.setBackground(Color.RED);
                btn_agregar9.setEnabled(false);
                btn_bajar9.setEnabled(true);
                btn_cambio9.setEnabled(false);
                apagarIF();
                IF_Servicios.setVisible(true);
            }
        });
        itemServicio3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt9.setText("CAMBIOS SERVICIO");
                lbl_fondo9.setBackground(Color.YELLOW);
                btn_agregar9.setEnabled(false);
                btn_bajar9.setEnabled(false);
                btn_cambio9.setEnabled(true);
                apagarIF();
                IF_Servicios.setVisible(true);
            }
        });
        itemServicio4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt9.setText("CONSULTAS SERVICIO");
                lbl_fondo9.setBackground(Color.BLUE);
                btn_agregar9.setEnabled(false);
                btn_bajar9.setEnabled(false);
                btn_cambio9.setEnabled(false);
                apagarIF();
                IF_Servicios.setVisible(true);
            }
        });
        itemHorarioF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt10.setText("REPORTE HORARIO FOTOGRAFO");
                lbl_fondo10.setBackground(Color.BLUE);
                btn_agregar10.setEnabled(true);
                btn_bajar10.setEnabled(false);
                btn_cambio10.setEnabled(false);
                apagarIF();
                IF_Horario_Fotografo.setVisible(true);
            }
        });
        itemHorarioS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt11.setText("REPORTE HORARIO SEMANAL");
                lbl_fondo11.setBackground(Color.BLUE);
                btn_agregar11.setEnabled(false);
                btn_bajar11.setEnabled(true);
                btn_cambio11.setEnabled(false);
                apagarIF();
                IF_Horario_Semanal.setVisible(true);
            }
        });
        itemCuentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt12.setText("REPORTE CUENTAS POR COBRAR");
                lbl_fondo12.setBackground(Color.BLUE);
                btn_agregar12.setEnabled(false);
                btn_bajar12.setEnabled(false);
                btn_cambio12.setEnabled(true);
                apagarIF();
                IF_Cuentas.setVisible(true);
            }
        });
        itemReporteC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt13.setText("REPORTE CLIENTE");
                lbl_fondo13.setBackground(Color.BLUE);
                btn_agregar13.setEnabled(false);
                btn_bajar13.setEnabled(false);
                btn_cambio13.setEnabled(false);
                apagarIF();
                IF_ReporteC.setVisible(true);
            }
        });
        itemTransaccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_txt14.setText("REPORTE TRANSACCION DISPONIBILIDAD FOTOGRAFO");
                lbl_fondo14.setBackground(Color.BLUE);
                btn_agregar14.setEnabled(false);
                btn_bajar14.setEnabled(false);
                btn_cambio14.setEnabled(false);
                apagarIF();
                IF_Transaccion.setVisible(true);
            }
        });

        menuBar.add(menuAltas);
        menuBar.add(menuBajas);
        menuBar.add(menuCambios);
        menuBar.add(menuConsultas);

        setJMenuBar(menuBar);
//------------------------------------------------------------------------------------------------------------------
        lbl_imagen = new JLabel();
        lbl_txt = new JLabel();
        lbl_fondo = new JLabel();
        lbl_Id = new JLabel();
        caja_id = new JTextField();
        lbl_nombre = new JLabel();
        caja_nombre = new JTextField();
        lbl_primerAp = new JLabel();
        caja_primerAp = new JTextField();
        lbl_segundoAp = new JLabel();
        caja_segundoAp = new JTextField();
        lbl_telefono = new JLabel();
        caja_telefono = new JTextField();
        lbl_email = new JLabel();
        caja_email = new JTextField();
        btn_agregar = new JButton();
        btn_borrar = new JButton();
        btn_buscar = new JButton();
        btn_cambio = new JButton();
        btn_bajar = new JButton();

        lbl_imagen2 = new JLabel();
        lbl_txt2 = new JLabel();
        lbl_fondo2 = new JLabel();
        lbl_Id2 = new JLabel();
        caja_id2 = new JTextField();
        lbl_nombre2 = new JLabel();
        caja_nombre2 = new JTextField();
        lbl_primerAp2 = new JLabel();
        caja_primerAp2 = new JTextField();
        lbl_segundoAp2 = new JLabel();
        caja_segundoAp2 = new JTextField();
        lbl_telefono2 = new JLabel();
        caja_telefono2 = new JTextField();
        lbl_email2 = new JLabel();
        caja_email2 = new JTextField();
        btn_agregar2 = new JButton();
        btn_borrar2 = new JButton();
        btn_buscar2 = new JButton();
        btn_cambio2 = new JButton();
        btn_bajar2 = new JButton();
        lbl_e12 = new JLabel();
        caja_e12 = new JTextField();
        lbl_e22 = new JLabel();
        caja_e22 = new JTextField();
        lbl_e32 = new JLabel();
        caja_e32 = new JTextField();

        lbl_imagen3 = new JLabel();
        lbl_txt3 = new JLabel();
        lbl_fondo3 = new JLabel();
        lbl_Id3 = new JLabel();
        caja_id3 = new JTextField();
        lbl_nombre3 = new JLabel();
        caja_nombre3 = new JTextField();
        lbl_primerAp3 = new JLabel();
        caja_primerAp3 = new JTextField();
        lbl_segundoAp3 = new JLabel();
        caja_segundoAp3 = new JTextField();
        lbl_telefono3 = new JLabel();
        caja_telefono3 = new JTextField();
        lbl_email3 = new JLabel();
        caja_email3 = new JTextField();
        btn_agregar3 = new JButton();
        btn_borrar3 = new JButton();
        btn_buscar3 = new JButton();
        btn_cambio3 = new JButton();
        btn_bajar3 = new JButton();
        lbl_e13 = new JLabel();
        caja_e13 = new JTextField();
        lbl_e23 = new JLabel();
        caja_e23 = new JTextField();
        lbl_e33 = new JLabel();
        caja_e33 = new JTextField();

        lbl_imagen4 = new JLabel();
        lbl_txt4 = new JLabel();
        lbl_fondo4 = new JLabel();
        lbl_Id4 = new JLabel();
        caja_id4 = new JTextField();
        lbl_nombre4 = new JLabel();
        caja_nombre4 = new JTextField();
        lbl_primerAp4 = new JLabel();
        caja_primerAp4 = new JTextField();
        lbl_segundoAp4 = new JLabel();
        caja_segundoAp4 = new JTextField();
        lbl_telefono4 = new JLabel();
        caja_telefono4 = new JTextField();
        lbl_email4 = new JLabel();
        caja_email4 = new JTextField();
        btn_agregar4 = new JButton();
        btn_borrar4 = new JButton();
        btn_buscar4 = new JButton();
        btn_cambio4 = new JButton();
        btn_bajar4 = new JButton();
        lbl_e14 = new JLabel();
        caja_e14 = new JTextField();
        lbl_e24 = new JLabel();
        caja_e24 = new JTextField();
        lbl_e34 = new JLabel();
        caja_e34 = new JTextField();

        lbl_imagen5 = new JLabel();
        lbl_txt5 = new JLabel();
        lbl_fondo5 = new JLabel();
        lbl_Id5 = new JLabel();
        caja_id5 = new JTextField();
        lbl_nombre5 = new JLabel();
        caja_nombre5 = new JTextField();
        lbl_primerAp5 = new JLabel();
        caja_primerAp5 = new JTextField();
        lbl_segundoAp5 = new JLabel();
        caja_segundoAp5 = new JTextField();
        lbl_telefono5 = new JLabel();
        caja_telefono5 = new JTextField();
        lbl_email5 = new JLabel();
        caja_email5 = new JTextField();
        btn_agregar5 = new JButton();
        btn_borrar5 = new JButton();
        btn_buscar5 = new JButton();
        btn_cambio5 = new JButton();
        btn_bajar5 = new JButton();
        lbl_e15 = new JLabel();
        caja_e15 = new JTextField();
        lbl_e25 = new JLabel();
        caja_e25 = new JTextField();
        lbl_e35 = new JLabel();
        caja_e35 = new JTextField();

        lbl_imagen6 = new JLabel();
        lbl_txt6 = new JLabel();
        lbl_fondo6 = new JLabel();
        lbl_Id6 = new JLabel();
        caja_id6 = new JTextField();
        lbl_nombre6 = new JLabel();
        caja_nombre6 = new JTextField();
        lbl_primerAp6 = new JLabel();
        caja_primerAp6 = new JTextField();
        lbl_segundoAp6 = new JLabel();
        caja_segundoAp6 = new JTextField();
        lbl_telefono6 = new JLabel();
        caja_telefono6 = new JTextField();
        lbl_email6 = new JLabel();
        caja_email6 = new JTextField();
        btn_agregar6 = new JButton();
        btn_borrar6 = new JButton();
        btn_buscar6 = new JButton();
        btn_cambio6 = new JButton();
        btn_bajar6 = new JButton();
        lbl_e16 = new JLabel();
        caja_e16 = new JTextField();
        lbl_e26 = new JLabel();
        caja_e26 = new JTextField();
        lbl_e36 = new JLabel();
        caja_e36 = new JTextField();

        lbl_imagen7 = new JLabel();
        lbl_txt7 = new JLabel();
        lbl_fondo7 = new JLabel();
        lbl_Id7 = new JLabel();
        caja_id7 = new JTextField();
        lbl_nombre7 = new JLabel();
        caja_nombre7 = new JTextField();
        lbl_primerAp7 = new JLabel();
        caja_primerAp7 = new JTextField();
        lbl_segundoAp7 = new JLabel();
        caja_segundoAp7 = new JTextField();
        lbl_telefono7 = new JLabel();
        caja_telefono7 = new JTextField();
        lbl_email7 = new JLabel();
        caja_email7 = new JTextField();
        btn_agregar7 = new JButton();
        btn_borrar7 = new JButton();
        btn_buscar7 = new JButton();
        btn_cambio7 = new JButton();
        btn_bajar7 = new JButton();
        lbl_e17 = new JLabel();
        caja_e17 = new JTextField();
        lbl_e27 = new JLabel();
        caja_e27 = new JTextField();
        lbl_e37 = new JLabel();
        caja_e37 = new JTextField();

        lbl_imagen8 = new JLabel();
        lbl_txt8 = new JLabel();
        lbl_fondo8 = new JLabel();
        lbl_Id8 = new JLabel();
        caja_id8 = new JTextField();
        lbl_nombre8 = new JLabel();
        caja_nombre8 = new JTextField();
        lbl_primerAp8 = new JLabel();
        caja_primerAp8 = new JTextField();
        lbl_segundoAp8 = new JLabel();
        caja_segundoAp8 = new JTextField();
        lbl_telefono8 = new JLabel();
        caja_telefono8 = new JTextField();
        lbl_email8 = new JLabel();
        caja_email8 = new JTextField();
        btn_agregar8 = new JButton();
        btn_borrar8 = new JButton();
        btn_buscar8 = new JButton();
        btn_cambio8 = new JButton();
        btn_bajar8 = new JButton();
        lbl_e18 = new JLabel();
        caja_e18 = new JTextField();
        lbl_e28 = new JLabel();
        caja_e28 = new JTextField();
        lbl_e38 = new JLabel();
        caja_e38 = new JTextField();

        lbl_imagen9 = new JLabel();
        lbl_txt9 = new JLabel();
        lbl_fondo9 = new JLabel();
        lbl_Id9 = new JLabel();
        caja_id9 = new JTextField();
        lbl_nombre9 = new JLabel();
        caja_nombre9 = new JTextField();
        lbl_primerAp9 = new JLabel();
        caja_primerAp9 = new JTextField();
        lbl_segundoAp9 = new JLabel();
        caja_segundoAp9 = new JTextField();
        lbl_telefono9 = new JLabel();
        caja_telefono9 = new JTextField();
        lbl_email9 = new JLabel();
        caja_email9 = new JTextField();
        btn_agregar9 = new JButton();
        btn_borrar9 = new JButton();
        btn_buscar9 = new JButton();
        btn_cambio9 = new JButton();
        btn_bajar9 = new JButton();
        lbl_e19 = new JLabel();
        caja_e19 = new JTextField();
        lbl_e29 = new JLabel();
        caja_e29 = new JTextField();
        lbl_e39 = new JLabel();
        caja_e39 = new JTextField();

        lbl_imagen10 = new JLabel();
        lbl_txt10 = new JLabel();
        lbl_fondo10 = new JLabel();
        lbl_Id10 = new JLabel();
        caja_id10= new JTextField();
        lbl_nombre10 = new JLabel();
        caja_nombre10 = new JTextField();
        lbl_primerAp10 = new JLabel();
        caja_primerAp10 = new JTextField();
        lbl_segundoAp10 = new JLabel();
        caja_segundoAp10 = new JTextField();
        lbl_telefono10 = new JLabel();
        caja_telefono10 = new JTextField();
        lbl_email10 = new JLabel();
        caja_email10 = new JTextField();
        btn_agregar10 = new JButton();
        btn_borrar10 = new JButton();
        btn_buscar10 = new JButton();
        btn_cambio10 = new JButton();
        btn_bajar10 = new JButton();
        lbl_e110 = new JLabel();
        caja_e110 = new JTextField();
        lbl_e210 = new JLabel();
        caja_e210 = new JTextField();
        lbl_e310 = new JLabel();
        caja_e310 = new JTextField();

        lbl_imagen11 = new JLabel();
        lbl_txt11 = new JLabel();
        lbl_fondo11 = new JLabel();
        lbl_Id11 = new JLabel();
        caja_id11 = new JTextField();
        lbl_nombre11 = new JLabel();
        caja_nombre11 = new JTextField();
        lbl_primerAp11 = new JLabel();
        caja_primerAp11 = new JTextField();
        lbl_segundoAp11 = new JLabel();
        caja_segundoAp11 = new JTextField();
        lbl_telefono11 = new JLabel();
        caja_telefono11 = new JTextField();
        lbl_email11 = new JLabel();
        caja_email11 = new JTextField();
        btn_agregar11 = new JButton();
        btn_borrar11 = new JButton();
        btn_buscar11 = new JButton();
        btn_cambio11 = new JButton();
        btn_bajar11 = new JButton();
        lbl_e111 = new JLabel();
        caja_e111 = new JTextField();
        lbl_e211 = new JLabel();
        caja_e211 = new JTextField();
        lbl_e311 = new JLabel();
        caja_e311 = new JTextField();

        lbl_imagen12 = new JLabel();
        lbl_txt12 = new JLabel();
        lbl_fondo12 = new JLabel();
        lbl_Id12 = new JLabel();
        caja_id12 = new JTextField();
        lbl_nombre12 = new JLabel();
        caja_nombre12 = new JTextField();
        lbl_primerAp12 = new JLabel();
        caja_primerAp12 = new JTextField();
        lbl_segundoAp12 = new JLabel();
        caja_segundoAp12 = new JTextField();
        lbl_telefono12 = new JLabel();
        caja_telefono12 = new JTextField();
        lbl_email12 = new JLabel();
        caja_email12 = new JTextField();
        btn_agregar12 = new JButton();
        btn_borrar12 = new JButton();
        btn_buscar12 = new JButton();
        btn_cambio12 = new JButton();
        btn_bajar12 = new JButton();
        lbl_e112 = new JLabel();
        caja_e112 = new JTextField();
        lbl_e212 = new JLabel();
        caja_e212 = new JTextField();
        lbl_e312 = new JLabel();
        caja_e312 = new JTextField();

        lbl_imagen13 = new JLabel();
        lbl_txt13 = new JLabel();
        lbl_fondo13 = new JLabel();
        lbl_Id13 = new JLabel();
        caja_id13 = new JTextField();
        lbl_nombre13 = new JLabel();
        caja_nombre13 = new JTextField();
        lbl_primerAp13 = new JLabel();
        caja_primerAp13 = new JTextField();
        lbl_segundoAp13 = new JLabel();
        caja_segundoAp13 = new JTextField();
        lbl_telefono13 = new JLabel();
        caja_telefono13 = new JTextField();
        lbl_email13 = new JLabel();
        caja_email13 = new JTextField();
        btn_agregar13 = new JButton();
        btn_borrar13 = new JButton();
        btn_buscar13 = new JButton();
        btn_cambio13 = new JButton();
        btn_bajar13 = new JButton();
        lbl_e113 = new JLabel();
        caja_e113 = new JTextField();
        lbl_e213 = new JLabel();
        caja_e213 = new JTextField();
        lbl_e313 = new JLabel();
        caja_e313 = new JTextField();

        lbl_imagen14 = new JLabel();
        lbl_txt14 = new JLabel();
        lbl_fondo14 = new JLabel();
        lbl_Id14 = new JLabel();
        caja_id14 = new JTextField();
        lbl_nombre14 = new JLabel();
        caja_nombre14 = new JTextField();
        lbl_primerAp14 = new JLabel();
        caja_primerAp14 = new JTextField();
        lbl_segundoAp14 = new JLabel();
        caja_segundoAp14 = new JTextField();
        lbl_telefono14 = new JLabel();
        caja_telefono14 = new JTextField();
        lbl_email14 = new JLabel();
        caja_email14 = new JTextField();
        btn_agregar14 = new JButton();
        btn_borrar14 = new JButton();
        btn_buscar14 = new JButton();
        btn_cambio14 = new JButton();
        btn_bajar14 = new JButton();
        lbl_e114 = new JLabel();
        caja_e114 = new JTextField();
        lbl_e214 = new JLabel();
        caja_e214 = new JTextField();
        lbl_e314 = new JLabel();
        caja_e314 = new JTextField();
//--------------------------------------IF_CLIENTES-------------------------------------------------------------------
        IF_Clientes.getContentPane().setLayout(null);
        IF_Clientes.setBackground(new Color(204, 200, 200));
        IF_Clientes.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Clientes.setTitle("CLIENTES");
        IF_Clientes.setSize(700, 550);
        IF_Clientes.setMaximizable(true);
        IF_Clientes.setIconifiable(true);
        IF_Clientes.setClosable(true);
        IF_Clientes.setResizable(true);
        IF_Clientes.setLayout(null);

        lbl_imagen.setIcon(iconoEscalado1);
        lbl_imagen.setBounds(0, 0, 150, 150);
        IF_Clientes.add(lbl_imagen);

        lbl_txt.setText("ALTAS CLIENTES");
        lbl_txt.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt.setForeground(Color.white);
        lbl_txt.setBounds(100, 0, 684, 60);
        IF_Clientes.add(lbl_txt);
        lbl_fondo.setBounds(0, 0, 684, 60);
        lbl_fondo.setBackground(Color.green);
        lbl_fondo.setOpaque(true);
        IF_Clientes.add(lbl_fondo);

        lbl_Id.setText("ID CLIENTE:");
        lbl_Id.setBounds(100, 85, 150, 10);
        IF_Clientes.add(lbl_Id);
        caja_id.addKeyListener(this);
        caja_id.setBounds(250, 80, 170, 20);
        IF_Clientes.add(caja_id);

        lbl_nombre.setText("NOMBRE(S):");
        lbl_nombre.setBounds(100, 120, 150, 10);
        IF_Clientes.add(lbl_nombre);
        caja_nombre.addKeyListener(this);
        caja_nombre.setBounds(180, 115, 240, 20);
        IF_Clientes.add(caja_nombre);

        lbl_primerAp.setText("PRIMER APELLIDO:");
        lbl_primerAp.setBounds(100, 155, 150, 10);
        IF_Clientes.add(lbl_primerAp);
        caja_primerAp.addKeyListener(this);
        caja_primerAp.setBounds(250, 150, 170, 20);
        IF_Clientes.add(caja_primerAp);

        lbl_segundoAp.setText("SEGUNDO APELLIDO:");
        lbl_segundoAp.setBounds(100, 185, 150, 10);
        IF_Clientes.add(lbl_segundoAp);
        caja_segundoAp.addKeyListener(this);
        caja_segundoAp.setBounds(250, 180, 170, 20);
        IF_Clientes.add(caja_segundoAp);

        lbl_telefono.setText("TELEFONO:");
        lbl_telefono.setBounds(100, 215, 150, 10);
        IF_Clientes.add(lbl_telefono);
        caja_telefono.addKeyListener(this);
        caja_telefono.setBounds(250, 210, 170, 20);
        IF_Clientes.add(caja_telefono);

        lbl_email.setText("EMAIL:");
        lbl_email.setBounds(100, 245, 150, 10);
        IF_Clientes.add(lbl_email);
        caja_email.addKeyListener(this);
        caja_email.setBounds(250, 240, 170, 20);
        IF_Clientes.add(caja_email);

        scrollPane.setBounds(50,320,480,100);
        IF_Clientes.add(scrollPane);

        btn_agregar.setIcon(iconoEscalado4);
        btn_agregar.setBackground(Color.GREEN);
        btn_agregar.setBounds(460, 100, 50, 50);
        IF_Clientes.add(btn_agregar);
        btn_agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(caja_id.getText().equals("") || caja_nombre.getText().equals("") || caja_primerAp.getText().equals("") || caja_segundoAp.getText().equals("") || caja_telefono.getText().equals("") || caja_email.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Llene todas las cajas");
                }else{
                    reg = fotoDAO.buscarClientes("").size();
                    for(int i = 0; i<reg; i++){
                        if(fotoDAO.buscarClientes("").get(i).getId_cliente() != Integer.parseInt(caja_id.getText()))
                            cont1++;
                    }
                    if(cont1 == reg){
                        Foto f1 = new Foto(Integer.parseInt(caja_id.getText()), caja_nombre.getText(), caja_primerAp.getText(), caja_segundoAp.getText(),
                                caja_telefono.getText(), caja_email.getText());

                        if (fotoDAO.agregarFoto(f1)){
                            JOptionPane.showMessageDialog(null, "SE AGREGO");
                            actualizarTablas(tabla);
                        } else
                            JOptionPane.showMessageDialog(null, "NO SE PUDO AGREGAR");
                    }else
                        JOptionPane.showMessageDialog(null, "ID REPETIDO");
                    cont1 = 0;
                }
            }
        });

        btn_borrar.setIcon(iconoEscalado8);
        btn_borrar.setBackground(Color.WHITE);
        btn_borrar.setBounds(560, 300, 50, 50);
        IF_Clientes.add(btn_borrar);
        btn_borrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                metodoMagicoParaRestablecerComponentes(caja_email, caja_id, caja_nombre, caja_primerAp, caja_segundoAp, caja_telefono, tabla);
            }
        });

        btn_cambio.setIcon(iconoEscalado6);
        btn_cambio.setBackground(Color.YELLOW);
        btn_cambio.setBounds(560, 100, 50, 50);
        IF_Clientes.add(btn_cambio);
        btn_cambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(caja_id.getText().equals("") || caja_nombre.getText().equals("") || caja_primerAp.getText().equals("") || caja_segundoAp.getText().equals("") || caja_telefono.getText().equals("") || caja_email.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Llene todas las cajas");
                }else{
                        Foto f1 = new Foto(Integer.parseInt(caja_id.getText()), caja_nombre.getText(), caja_primerAp.getText(), caja_segundoAp.getText(),
                                caja_telefono.getText(), caja_email.getText());

                    if (fotoDAO.actualizarCliente(f1)){
                        JOptionPane.showMessageDialog(null, "SE ACTUALIZO");
                        actualizarTablas(tabla);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO ESE ID");
                }
            }
        });

        btn_buscar.setIcon(iconoEscalado7);
        btn_buscar.setBackground(Color.BLUE);
        btn_buscar.setBounds(560, 200, 50, 50);
        IF_Clientes.add(btn_buscar);
        btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarTablas(tabla);
            }
        });

        btn_bajar.setIcon(iconoEscalado5);
        btn_bajar.setBackground(Color.RED);
        btn_bajar.setBounds(460, 200, 50, 50);
        IF_Clientes.add(btn_bajar);
        btn_bajar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(caja_id.getText().equals("")) {
                    JOptionPane.showMessageDialog(getParent(), "INGRESE UN NUMERO DE CONTROL CORRECTO", "AVISO", JOptionPane.ERROR_MESSAGE);
                }else {
                        Foto f1 = new Foto(Integer.parseInt(caja_id.getText()), caja_nombre.getText(), caja_primerAp.getText(), caja_segundoAp.getText(),
                                caja_telefono.getText(), caja_email.getText());
                    if(fotoDAO.eliminarFoto(caja_id.getText())) {
                        JOptionPane.showMessageDialog(null, "SE ELIMINO");
                        actualizarTablas(tabla);
                        cont = 0;
                    }else
                        JOptionPane.showMessageDialog(null, "NO SE ENCONTRO ESE ID");
                }
            }
        });

        caja_registro = new JTextField();
        caja_registro.setBounds(320, 450, 50, 20);
        IF_Clientes.add(caja_registro);
        caja_registro.setEnabled(false);

        btn_E1 = new JButton("|<");
        btn_E1.setBackground(Color.PINK);
        btn_E1.setBounds(200, 450, 50, 20);
        IF_Clientes.add(btn_E1);
        btn_E1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont = 0;
                if(fotoDAO.buscarClientes("").size() != 0){
                    caja_registro.setText(String.valueOf(cont));
                    caja_id.setText(String.valueOf(fotoDAO.buscarClientes("").get(cont).getId_cliente()));
                    caja_nombre.setText(fotoDAO.buscarClientes("").get(cont).getNombre());
                    caja_primerAp.setText(fotoDAO.buscarClientes("").get(cont).getPrimerAp());
                    caja_segundoAp.setText(fotoDAO.buscarClientes("").get(cont).getSegundoAp());
                    caja_telefono.setText(fotoDAO.buscarClientes("").get(cont).getTelefono());
                    caja_email.setText(fotoDAO.buscarClientes("").get(cont).getEmail());
                }
            }
        });

        btn_E2 = new JButton("<");
        btn_E2.setBackground(Color.PINK);
        btn_E2.setBounds(260, 450, 50, 20);
        IF_Clientes.add(btn_E2);
        btn_E2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cont != 0){
                    cont --;
                }
                if(fotoDAO.buscarClientes("").size() != 0){
                    caja_registro.setText(String.valueOf(cont));
                    caja_id.setText(String.valueOf(fotoDAO.buscarClientes("").get(cont).getId_cliente()));
                    caja_nombre.setText(fotoDAO.buscarClientes("").get(cont).getNombre());
                    caja_primerAp.setText(fotoDAO.buscarClientes("").get(cont).getPrimerAp());
                    caja_segundoAp.setText(fotoDAO.buscarClientes("").get(cont).getSegundoAp());
                    caja_telefono.setText(fotoDAO.buscarClientes("").get(cont).getTelefono());
                    caja_email.setText(fotoDAO.buscarClientes("").get(cont).getEmail());
                }
            }
        });

        btn_E3 = new JButton(">");
        btn_E3.setBackground(Color.PINK);
        btn_E3.setBounds(380, 450, 50, 20);
        IF_Clientes.add(btn_E3);
        btn_E3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cont != fotoDAO.buscarClientes("").size()-1){
                    cont ++;
                }
                if(fotoDAO.buscarClientes("").size() != 0){
                    caja_registro.setText(String.valueOf(cont));
                    caja_id.setText(String.valueOf(fotoDAO.buscarClientes("").get(cont).getId_cliente()));
                    caja_nombre.setText(fotoDAO.buscarClientes("").get(cont).getNombre());
                    caja_primerAp.setText(fotoDAO.buscarClientes("").get(cont).getPrimerAp());
                    caja_segundoAp.setText(fotoDAO.buscarClientes("").get(cont).getSegundoAp());
                    caja_telefono.setText(fotoDAO.buscarClientes("").get(cont).getTelefono());
                    caja_email.setText(fotoDAO.buscarClientes("").get(cont).getEmail());
                }
            }
        });

        btn_E4 = new JButton(">|");
        btn_E4.setBackground(Color.PINK);
        btn_E4.setBounds(440, 450, 50, 20);
        IF_Clientes.add(btn_E4);
        btn_E4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont = fotoDAO.buscarClientes("").size()-1;
                if(fotoDAO.buscarClientes("").size() != 0){
                    caja_registro.setText(String.valueOf(cont));
                    caja_id.setText(String.valueOf(fotoDAO.buscarClientes("").get(cont).getId_cliente()));
                    caja_nombre.setText(fotoDAO.buscarClientes("").get(cont).getNombre());
                    caja_primerAp.setText(fotoDAO.buscarClientes("").get(cont).getPrimerAp());
                    caja_segundoAp.setText(fotoDAO.buscarClientes("").get(cont).getSegundoAp());
                    caja_telefono.setText(fotoDAO.buscarClientes("").get(cont).getTelefono());
                    caja_email.setText(fotoDAO.buscarClientes("").get(cont).getEmail());
                }
            }
        });

        desktopPane.add(IF_Clientes);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------

        IF_Contratos = new JInternalFrame();
        IF_Contratos.getContentPane().setLayout(null);
        IF_Contratos.setBackground(new Color(204, 200, 200));
        IF_Contratos.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Contratos.setTitle("CONTRATOS");
        IF_Contratos.setSize(700, 550);
        IF_Contratos.setMaximizable(true);
        IF_Contratos.setIconifiable(true);
        IF_Contratos.setClosable(true);
        IF_Contratos.setResizable(true);
        IF_Contratos.setLayout(null);

        lbl_imagen2.setIcon(iconoEscalado3);
        lbl_imagen2.setBounds(0, 0, 150, 150);
        IF_Contratos.add(lbl_imagen2);

        lbl_txt2.setText("ALTAS CONTRATO");
        lbl_txt2.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt2.setForeground(Color.white);
        lbl_txt2.setBounds(100, 0, 684, 60);
        IF_Contratos.add(lbl_txt2);
        lbl_fondo2.setBounds(0, 0, 684, 60);
        lbl_fondo2.setBackground(Color.green);
        lbl_fondo2.setOpaque(true);
        IF_Contratos.add(lbl_fondo2);

        lbl_Id2.setText("ID CONTRATO:");
        lbl_Id2.setBounds(100, 85, 150, 10);
        IF_Contratos.add(lbl_Id2);
        caja_id2.setBounds(250, 80, 170, 20);
        IF_Contratos.add(caja_id2);

        lbl_nombre2.setText("ID FORMA CONSULTA:");
        lbl_nombre2.setBounds(100, 120, 150, 10);
        IF_Contratos.add(lbl_nombre2);
        caja_nombre2.setBounds(250, 115, 170, 20);
        IF_Contratos.add(caja_nombre2);

        lbl_primerAp2.setText("FORMAS PAGO:");
        lbl_primerAp2.setBounds(100, 155, 150, 10);
        IF_Contratos.add(lbl_primerAp2);
        caja_primerAp2.setBounds(250, 150, 170, 20);
        IF_Contratos.add(caja_primerAp2);

        lbl_segundoAp2.setText("SOLICITUDES ADICIONALES:");
        lbl_segundoAp2.setBounds(100, 185, 150, 10);
        IF_Contratos.add(lbl_segundoAp2);
        caja_segundoAp2.setBounds(250, 180, 170, 20);
        IF_Contratos.add(caja_segundoAp2);

        lbl_telefono2.setText("TELEFONO:");
        lbl_telefono2.setBounds(100, 215, 150, 10);
        IF_Contratos.add(lbl_telefono2);
        caja_telefono2.setBounds(250, 210, 170, 20);
        IF_Contratos.add(caja_telefono2);

        lbl_email2.setText("DETALLES:");
        lbl_email2.setBounds(100, 245, 150, 10);
        IF_Contratos.add(lbl_email2);
        caja_email2.setBounds(250, 240, 170, 20);
        IF_Contratos.add(caja_email2);

        lbl_e12.setText("PAQUETES:");
        lbl_e12.setBounds(100, 275, 150, 10);
        IF_Contratos.add(lbl_e12);
        caja_e12.setBounds(250, 270, 170, 20);
        IF_Contratos.add(caja_e12);

        lbl_e22.setText("PAQUETES:");
        lbl_e22.setBounds(100, 305, 150, 10);
        IF_Contratos.add(lbl_e22);
        caja_e22.setBounds(250, 300, 170, 20);
        IF_Contratos.add(caja_e22);

        lbl_e32.setText("PAQUETES:");
        lbl_e32.setBounds(100, 335, 150, 10);
        IF_Contratos.add(lbl_e32);
        caja_e32.setBounds(250, 330, 170, 20);
        IF_Contratos.add(caja_e32);

        scrollPane2.setBounds(50,320,480,100);
        IF_Contratos.add(scrollPane2);

        btn_agregar2.setIcon(iconoEscalado4);
        btn_agregar2.setBackground(Color.GREEN);
        btn_agregar2.setBounds(460, 100, 50, 50);
        IF_Contratos.add(btn_agregar2);

        btn_borrar2.setIcon(iconoEscalado8);
        btn_borrar2.setBackground(Color.WHITE);
        btn_borrar2.setBounds(560, 300, 50, 50);
        IF_Contratos.add(btn_borrar2);

        btn_cambio2.setIcon(iconoEscalado6);
        btn_cambio2.setBackground(Color.YELLOW);
        btn_cambio2.setBounds(560, 100, 50, 50);
        IF_Contratos.add(btn_cambio2);

        btn_buscar2.setIcon(iconoEscalado7);
        btn_buscar2.setBackground(Color.BLUE);
        btn_buscar2.setBounds(560, 200, 50, 50);
        IF_Contratos.add(btn_buscar2);

        btn_bajar2.setIcon(iconoEscalado5);
        btn_bajar2.setBackground(Color.RED);
        btn_bajar2.setBounds(460, 200, 50, 50);
        IF_Contratos.add(btn_bajar2);

        caja_registro2 = new JTextField();
        caja_registro2.setBounds(320, 450, 50, 20);
        IF_Contratos.add(caja_registro2);
        caja_registro2.setEnabled(false);

        btn_E12 = new JButton("|<");
        btn_E12.setBackground(Color.PINK);
        btn_E12.setBounds(200, 450, 50, 20);
        IF_Contratos.add(btn_E12);

        btn_E22 = new JButton("<");
        btn_E22.setBackground(Color.PINK);
        btn_E22.setBounds(260, 450, 50, 20);
        IF_Contratos.add(btn_E22);

        btn_E32 = new JButton(">");
        btn_E32.setBackground(Color.PINK);
        btn_E32.setBounds(380, 450, 50, 20);
        IF_Contratos.add(btn_E32);

        btn_E42 = new JButton(">|");
        btn_E42.setBackground(Color.PINK);
        btn_E42.setBounds(440, 450, 50, 20);
        IF_Contratos.add(btn_E42);

        desktopPane.add(IF_Contratos);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Empleados = new JInternalFrame();
        IF_Empleados.getContentPane().setLayout(null);
        IF_Empleados.setBackground(new Color(204, 200, 200));
        IF_Empleados.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Empleados.setTitle("Empleados");
        IF_Empleados.setSize(700, 550);
        IF_Empleados.setMaximizable(true);
        IF_Empleados.setIconifiable(true);
        IF_Empleados.setClosable(true);
        IF_Empleados.setResizable(true);
        IF_Empleados.setLayout(null);

        lbl_imagen3.setIcon(iconoEscalado1);
        lbl_imagen3.setBounds(0, 0, 150, 150);
        IF_Empleados.add(lbl_imagen3);

        lbl_txt3.setText("ALTAS EMPLEADOS");
        lbl_txt3.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt3.setForeground(Color.white);
        lbl_txt3.setBounds(100, 0, 684, 60);
        IF_Empleados.add(lbl_txt3);
        lbl_fondo3.setBounds(0, 0, 684, 60);
        lbl_fondo3.setBackground(Color.green);
        lbl_fondo3.setOpaque(true);
        IF_Empleados.add(lbl_fondo3);

        lbl_Id3.setText("ID EMPLEADO:");
        lbl_Id3.setBounds(100, 85, 150, 10);
        IF_Empleados.add(lbl_Id3);
        caja_id3.setBounds(250, 80, 170, 20);
        IF_Empleados.add(caja_id3);

        lbl_nombre3.setText("NOMBRE:");
        lbl_nombre3.setBounds(100, 120, 150, 10);
        IF_Empleados.add(lbl_nombre3);
        caja_nombre3.setBounds(250, 115, 170, 20);
        IF_Empleados.add(caja_nombre3);

        lbl_primerAp3.setText("PRIMER AP:");
        lbl_primerAp3.setBounds(100, 155, 150, 10);
        IF_Empleados.add(lbl_primerAp3);
        caja_primerAp3.setBounds(250, 150, 170, 20);
        IF_Empleados.add(caja_primerAp3);

        lbl_segundoAp3.setText("SEGUNDO AP:");
        lbl_segundoAp3.setBounds(100, 185, 150, 10);
        IF_Empleados.add(lbl_segundoAp3);
        caja_segundoAp3.setBounds(250, 180, 170, 20);
        IF_Empleados.add(caja_segundoAp3);

        lbl_telefono3.setText("OCUPACION:");
        lbl_telefono3.setBounds(100, 215, 150, 10);
        IF_Empleados.add(lbl_telefono3);
        caja_telefono3.setBounds(250, 210, 170, 20);
        IF_Empleados.add(caja_telefono3);

        scrollPane3.setBounds(50,320,480,100);
        IF_Empleados.add(scrollPane3);

        btn_agregar3.setIcon(iconoEscalado4);
        btn_agregar3.setBackground(Color.GREEN);
        btn_agregar3.setBounds(460, 100, 50, 50);
        IF_Empleados.add(btn_agregar3);

        btn_borrar3.setIcon(iconoEscalado8);
        btn_borrar3.setBackground(Color.WHITE);
        btn_borrar3.setBounds(560, 300, 50, 50);
        IF_Empleados.add(btn_borrar2);

        btn_cambio3.setIcon(iconoEscalado6);
        btn_cambio3.setBackground(Color.YELLOW);
        btn_cambio3.setBounds(560, 100, 50, 50);
        IF_Empleados.add(btn_cambio3);

        btn_buscar3.setIcon(iconoEscalado7);
        btn_buscar3.setBackground(Color.BLUE);
        btn_buscar3.setBounds(560, 200, 50, 50);
        IF_Empleados.add(btn_buscar3);

        btn_bajar3.setIcon(iconoEscalado5);
        btn_bajar3.setBackground(Color.RED);
        btn_bajar3.setBounds(460, 200, 50, 50);
        IF_Empleados.add(btn_bajar3);

        caja_registro3 = new JTextField();
        caja_registro3.setBounds(320, 450, 50, 20);
        IF_Empleados.add(caja_registro3);
        caja_registro3.setEnabled(false);

        btn_E13 = new JButton("|<");
        btn_E13.setBackground(Color.PINK);
        btn_E13.setBounds(200, 450, 50, 20);
        IF_Empleados.add(btn_E13);

        btn_E23 = new JButton("<");
        btn_E23.setBackground(Color.PINK);
        btn_E23.setBounds(260, 450, 50, 20);
        IF_Empleados.add(btn_E23);

        btn_E33 = new JButton(">");
        btn_E33.setBackground(Color.PINK);
        btn_E33.setBounds(380, 450, 50, 20);
        IF_Empleados.add(btn_E33);

        btn_E43 = new JButton(">|");
        btn_E43.setBackground(Color.PINK);
        btn_E43.setBounds(440, 450, 50, 20);
        IF_Empleados.add(btn_E43);

        desktopPane.add(IF_Empleados);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Forma_Consulta = new JInternalFrame();
        IF_Forma_Consulta.getContentPane().setLayout(null);
        IF_Forma_Consulta.setBackground(new Color(204, 200, 200));
        IF_Forma_Consulta.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Forma_Consulta.setTitle("FORMA CONSULTA");
        IF_Forma_Consulta.setSize(700, 550);
        IF_Forma_Consulta.setMaximizable(true);
        IF_Forma_Consulta.setIconifiable(true);
        IF_Forma_Consulta.setClosable(true);
        IF_Forma_Consulta.setResizable(true);
        IF_Forma_Consulta.setLayout(null);

        lbl_imagen4.setIcon(iconoEscalado3);
        lbl_imagen4.setBounds(0, 0, 150, 150);
        IF_Forma_Consulta.add(lbl_imagen4);

        lbl_txt4.setText("ALTAS FORMAS CONSULTA");
        lbl_txt4.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt4.setForeground(Color.white);
        lbl_txt4.setBounds(100, 0, 684, 60);
        IF_Forma_Consulta.add(lbl_txt4);
        lbl_fondo4.setBounds(0, 0, 684, 60);
        lbl_fondo4.setBackground(Color.green);
        lbl_fondo4.setOpaque(true);
        IF_Forma_Consulta.add(lbl_fondo4);

        lbl_Id4.setText("ID TRABAJOS:");
        lbl_Id4.setBounds(100, 85, 150, 10);
        IF_Forma_Consulta.add(lbl_Id4);
        caja_id4.setBounds(250, 80, 170, 20);
        IF_Forma_Consulta.add(caja_id4);

        lbl_nombre4.setText("LOCACION:");
        lbl_nombre4.setBounds(100, 120, 150, 10);
        IF_Forma_Consulta.add(lbl_nombre4);
        caja_nombre4.setBounds(250, 115, 170, 20);
        IF_Forma_Consulta.add(caja_nombre4);

        lbl_primerAp4.setText("FECHA:");
        lbl_primerAp4.setBounds(100, 155, 150, 10);
        IF_Forma_Consulta.add(lbl_primerAp4);
        caja_primerAp4.setBounds(250, 150, 170, 20);
        IF_Forma_Consulta.add(caja_primerAp4);

        lbl_segundoAp4.setText("HORARIO:");
        lbl_segundoAp4.setBounds(100, 185, 150, 10);
        IF_Forma_Consulta.add(lbl_segundoAp4);
        caja_segundoAp4.setBounds(250, 180, 170, 20);
        IF_Forma_Consulta.add(caja_segundoAp4);

        lbl_telefono4.setText("CLIENTE:");
        lbl_telefono4.setBounds(100, 215, 150, 10);
        IF_Forma_Consulta.add(lbl_telefono4);
        caja_telefono4.setBounds(250, 210, 170, 20);
        IF_Forma_Consulta.add(caja_telefono4);

        lbl_e14.setText("FOTOGRAFO PRINCIPAL:");
        lbl_e14.setBounds(100, 245, 150, 10);
        IF_Forma_Consulta.add(lbl_e14);
        caja_e14.setBounds(250, 240, 170, 20);
        IF_Forma_Consulta.add(caja_e14);

        lbl_e24.setText("FOTOGRAFO SECUNDARIO:");
        lbl_e24.setBounds(100, 275, 150, 10);
        IF_Forma_Consulta.add(lbl_e24);
        caja_e24.setBounds(250, 270, 170, 20);
        IF_Forma_Consulta.add(caja_e24);

        lbl_e34.setText("SERVICIO:");
        lbl_e34.setBounds(100, 305, 150, 10);
        IF_Forma_Consulta.add(lbl_e34);
        caja_e34.setBounds(250, 300, 170, 20);
        IF_Forma_Consulta.add(caja_e34);

        scrollPane4.setBounds(50,320,480,100);
        IF_Forma_Consulta.add(scrollPane4);

        btn_agregar4.setIcon(iconoEscalado4);
        btn_agregar4.setBackground(Color.GREEN);
        btn_agregar4.setBounds(460, 100, 50, 50);
        IF_Forma_Consulta.add(btn_agregar4);

        btn_borrar4.setIcon(iconoEscalado8);
        btn_borrar4.setBackground(Color.WHITE);
        btn_borrar4.setBounds(560, 300, 50, 50);
        IF_Forma_Consulta.add(btn_borrar4);

        btn_cambio4.setIcon(iconoEscalado6);
        btn_cambio4.setBackground(Color.YELLOW);
        btn_cambio4.setBounds(560, 100, 50, 50);
        IF_Forma_Consulta.add(btn_cambio4);

        btn_buscar4.setIcon(iconoEscalado7);
        btn_buscar4.setBackground(Color.BLUE);
        btn_buscar4.setBounds(560, 200, 50, 50);
        IF_Forma_Consulta.add(btn_buscar4);

        btn_bajar4.setIcon(iconoEscalado5);
        btn_bajar4.setBackground(Color.RED);
        btn_bajar4.setBounds(460, 200, 50, 50);
        IF_Forma_Consulta.add(btn_bajar4);

        caja_registro4 = new JTextField();
        caja_registro4.setBounds(320, 450, 50, 20);
        IF_Forma_Consulta.add(caja_registro4);
        caja_registro4.setEnabled(false);

        btn_E14 = new JButton("|<");
        btn_E14.setBackground(Color.PINK);
        btn_E14.setBounds(200, 450, 50, 20);
        IF_Forma_Consulta.add(btn_E14);

        btn_E24 = new JButton("<");
        btn_E24.setBackground(Color.PINK);
        btn_E24.setBounds(260, 450, 50, 20);
        IF_Forma_Consulta.add(btn_E24);

        btn_E34 = new JButton(">");
        btn_E34.setBackground(Color.PINK);
        btn_E34.setBounds(380, 450, 50, 20);
        IF_Forma_Consulta.add(btn_E34);

        btn_E44 = new JButton(">|");
        btn_E44.setBackground(Color.PINK);
        btn_E44.setBounds(440, 450, 50, 20);
        IF_Forma_Consulta.add(btn_E44);

        desktopPane.add(IF_Forma_Consulta);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Forma_Orden_Paquete = new JInternalFrame();
        IF_Forma_Orden_Paquete.getContentPane().setLayout(null);
        IF_Forma_Orden_Paquete.setBackground(new Color(204, 200, 200));
        IF_Forma_Orden_Paquete.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Forma_Orden_Paquete.setTitle("FORMA ORDEN PAQUETE");
        IF_Forma_Orden_Paquete.setSize(700, 550);
        IF_Forma_Orden_Paquete.setMaximizable(true);
        IF_Forma_Orden_Paquete.setIconifiable(true);
        IF_Forma_Orden_Paquete.setClosable(true);
        IF_Forma_Orden_Paquete.setResizable(true);
        IF_Forma_Orden_Paquete.setLayout(null);

        lbl_imagen5.setIcon(iconoEscalado3);
        lbl_imagen5.setBounds(0, 0, 150, 150);
        IF_Forma_Orden_Paquete.add(lbl_imagen5);

        lbl_txt5.setText("ALTAS FORMAS CONSULTA");
        lbl_txt5.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt5.setForeground(Color.white);
        lbl_txt5.setBounds(100, 0, 684, 60);
        IF_Forma_Orden_Paquete.add(lbl_txt5);
        lbl_fondo5.setBounds(0, 0, 684, 60);
        lbl_fondo5.setBackground(Color.green);
        lbl_fondo5.setOpaque(true);
        IF_Forma_Orden_Paquete.add(lbl_fondo5);

        lbl_Id5.setText("ID TRABAJOS:");
        lbl_Id5.setBounds(100, 85, 150, 10);
        IF_Forma_Orden_Paquete.add(lbl_Id5);
        caja_id5.setBounds(250, 80, 170, 20);
        IF_Forma_Orden_Paquete.add(caja_id5);

        lbl_nombre5.setText("LOCACION:");
        lbl_nombre5.setBounds(100, 120, 150, 10);
        IF_Forma_Orden_Paquete.add(lbl_nombre5);
        caja_nombre5.setBounds(250, 115, 170, 20);
        IF_Forma_Orden_Paquete.add(caja_nombre5);

        lbl_primerAp5.setText("FECHA:");
        lbl_primerAp5.setBounds(100, 155, 150, 10);
        IF_Forma_Orden_Paquete.add(lbl_primerAp5);
        caja_primerAp5.setBounds(250, 150, 170, 20);
        IF_Forma_Orden_Paquete.add(caja_primerAp5);

        scrollPane5.setBounds(50,320,480,100);
        IF_Forma_Orden_Paquete.add(scrollPane5);

        btn_agregar5.setIcon(iconoEscalado4);
        btn_agregar5.setBackground(Color.GREEN);
        btn_agregar5.setBounds(460, 100, 50, 50);
        IF_Forma_Orden_Paquete.add(btn_agregar5);

        btn_borrar5.setIcon(iconoEscalado8);
        btn_borrar5.setBackground(Color.WHITE);
        btn_borrar5.setBounds(560, 300, 50, 50);
        IF_Forma_Orden_Paquete.add(btn_borrar5);

        btn_cambio5.setIcon(iconoEscalado6);
        btn_cambio5.setBackground(Color.YELLOW);
        btn_cambio5.setBounds(560, 100, 50, 50);
        IF_Forma_Orden_Paquete.add(btn_cambio5);

        btn_buscar5.setIcon(iconoEscalado7);
        btn_buscar5.setBackground(Color.BLUE);
        btn_buscar5.setBounds(560, 200, 50, 50);
        IF_Forma_Orden_Paquete.add(btn_buscar5);

        btn_bajar5.setIcon(iconoEscalado5);
        btn_bajar5.setBackground(Color.RED);
        btn_bajar5.setBounds(460, 200, 50, 50);
        IF_Forma_Orden_Paquete.add(btn_bajar5);

        caja_registro5 = new JTextField();
        caja_registro5.setBounds(320, 450, 50, 20);
        IF_Forma_Orden_Paquete.add(caja_registro5);
        caja_registro5.setEnabled(false);

        btn_E15 = new JButton("|<");
        btn_E15.setBackground(Color.PINK);
        btn_E15.setBounds(200, 450, 50, 20);
        IF_Forma_Orden_Paquete.add(btn_E15);

        btn_E25 = new JButton("<");
        btn_E25.setBackground(Color.PINK);
        btn_E25.setBounds(260, 450, 50, 20);
        IF_Forma_Orden_Paquete.add(btn_E25);

        btn_E35 = new JButton(">");
        btn_E35.setBackground(Color.PINK);
        btn_E35.setBounds(380, 450, 50, 20);
        IF_Forma_Orden_Paquete.add(btn_E35);

        btn_E45 = new JButton(">|");
        btn_E45.setBackground(Color.PINK);
        btn_E45.setBounds(440, 450, 50, 20);
        IF_Forma_Orden_Paquete.add(btn_E45);

        desktopPane.add(IF_Forma_Orden_Paquete);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Ocupacion = new JInternalFrame();
        IF_Ocupacion.getContentPane().setLayout(null);
        IF_Ocupacion.setBackground(new Color(204, 200, 200));
        IF_Ocupacion.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Ocupacion.setTitle("OCUPACION");
        IF_Ocupacion.setSize(700, 550);
        IF_Ocupacion.setMaximizable(true);
        IF_Ocupacion.setIconifiable(true);
        IF_Ocupacion.setClosable(true);
        IF_Ocupacion.setResizable(true);
        IF_Ocupacion.setLayout(null);

        lbl_imagen6.setIcon(iconoEscalado1);
        lbl_imagen6.setBounds(0, 0, 150, 150);
        IF_Ocupacion.add(lbl_imagen6);

        lbl_txt6.setText("ALTAS OCUPACION");
        lbl_txt6.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt6.setForeground(Color.white);
        lbl_txt6.setBounds(100, 0, 684, 60);
        IF_Ocupacion.add(lbl_txt6);
        lbl_fondo6.setBounds(0, 0, 684, 60);
        lbl_fondo6.setBackground(Color.green);
        lbl_fondo6.setOpaque(true);
        IF_Ocupacion.add(lbl_fondo6);

        lbl_Id6.setText("ID OCUPACION:");
        lbl_Id6.setBounds(100, 85, 150, 10);
        IF_Ocupacion.add(lbl_Id6);
        caja_id6.setBounds(250, 80, 170, 20);
        IF_Ocupacion.add(caja_id6);

        lbl_nombre6.setText("OCUPACION:");
        lbl_nombre6.setBounds(100, 120, 150, 10);
        IF_Ocupacion.add(lbl_nombre6);
        caja_nombre6.setBounds(250, 115, 170, 20);
        IF_Ocupacion.add(caja_nombre6);

        scrollPane6.setBounds(50,320,480,100);
        IF_Ocupacion.add(scrollPane6);

        btn_agregar6.setIcon(iconoEscalado4);
        btn_agregar6.setBackground(Color.GREEN);
        btn_agregar6.setBounds(460, 100, 50, 50);
        IF_Ocupacion.add(btn_agregar6);

        btn_borrar6.setIcon(iconoEscalado8);
        btn_borrar6.setBackground(Color.WHITE);
        btn_borrar6.setBounds(560, 300, 50, 50);
        IF_Ocupacion.add(btn_borrar6);

        btn_cambio6.setIcon(iconoEscalado6);
        btn_cambio6.setBackground(Color.YELLOW);
        btn_cambio6.setBounds(560, 100, 50, 50);
        IF_Ocupacion.add(btn_cambio6);

        btn_buscar6.setIcon(iconoEscalado7);
        btn_buscar6.setBackground(Color.BLUE);
        btn_buscar6.setBounds(560, 200, 50, 50);
        IF_Ocupacion.add(btn_buscar6);

        btn_bajar6.setIcon(iconoEscalado5);
        btn_bajar6.setBackground(Color.RED);
        btn_bajar6.setBounds(460, 200, 50, 50);
        IF_Ocupacion.add(btn_bajar6);

        caja_registro6 = new JTextField();
        caja_registro6.setBounds(320, 450, 50, 20);
        IF_Ocupacion.add(caja_registro6);
        caja_registro6.setEnabled(false);

        btn_E16 = new JButton("|<");
        btn_E16.setBackground(Color.PINK);
        btn_E16.setBounds(200, 450, 50, 20);
        IF_Ocupacion.add(btn_E16);

        btn_E26 = new JButton("<");
        btn_E26.setBackground(Color.PINK);
        btn_E26.setBounds(260, 450, 50, 20);
        IF_Ocupacion.add(btn_E26);

        btn_E36 = new JButton(">");
        btn_E36.setBackground(Color.PINK);
        btn_E36.setBounds(380, 450, 50, 20);
        IF_Ocupacion.add(btn_E36);

        btn_E46 = new JButton(">|");
        btn_E46.setBackground(Color.PINK);
        btn_E46.setBounds(440, 450, 50, 20);
        IF_Ocupacion.add(btn_E46);

        desktopPane.add(IF_Ocupacion);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Fotos = new JInternalFrame();
        IF_Fotos.getContentPane().setLayout(null);
        IF_Fotos.setBackground(new Color(204, 200, 200));
        IF_Fotos.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Fotos.setTitle("FOTOS");
        IF_Fotos.setSize(700, 550);
        IF_Fotos.setMaximizable(true);
        IF_Fotos.setIconifiable(true);
        IF_Fotos.setClosable(true);
        IF_Fotos.setResizable(true);
        IF_Fotos.setLayout(null);

        lbl_imagen7.setIcon(iconoEscalado2);
        lbl_imagen7.setBounds(0, 0, 150, 150);
        IF_Fotos.add(lbl_imagen7);

        lbl_txt7.setText("ALTAS FOTOS");
        lbl_txt7.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt7.setForeground(Color.white);
        lbl_txt7.setBounds(100, 0, 684, 60);
        IF_Fotos.add(lbl_txt7);
        lbl_fondo7.setBounds(0, 0, 684, 60);
        lbl_fondo7.setBackground(Color.green);
        lbl_fondo7.setOpaque(true);
        IF_Fotos.add(lbl_fondo7);

        lbl_Id7.setText("ID FOTOS:");
        lbl_Id7.setBounds(100, 85, 150, 10);
        IF_Fotos.add(lbl_Id7);
        caja_id7.setBounds(250, 80, 170, 20);
        IF_Fotos.add(caja_id7);

        lbl_nombre7.setText("TIPO:");
        lbl_nombre7.setBounds(100, 120, 150, 10);
        IF_Fotos.add(lbl_nombre7);
        caja_nombre7.setBounds(250, 115, 170, 20);
        IF_Fotos.add(caja_nombre7);

        scrollPane7.setBounds(50,320,480,100);
        IF_Fotos.add(scrollPane7);

        btn_agregar7.setIcon(iconoEscalado4);
        btn_agregar7.setBackground(Color.GREEN);
        btn_agregar7.setBounds(460, 100, 50, 50);
        IF_Fotos.add(btn_agregar7);

        btn_borrar7.setIcon(iconoEscalado8);
        btn_borrar7.setBackground(Color.WHITE);
        btn_borrar7.setBounds(560, 300, 50, 50);
        IF_Fotos.add(btn_borrar7);

        btn_cambio7.setIcon(iconoEscalado6);
        btn_cambio7.setBackground(Color.YELLOW);
        btn_cambio7.setBounds(560, 100, 50, 50);
        IF_Fotos.add(btn_cambio7);

        btn_buscar7.setIcon(iconoEscalado7);
        btn_buscar7.setBackground(Color.BLUE);
        btn_buscar7.setBounds(560, 200, 50, 50);
        IF_Fotos.add(btn_buscar7);

        btn_bajar7.setIcon(iconoEscalado5);
        btn_bajar7.setBackground(Color.RED);
        btn_bajar7.setBounds(460, 200, 50, 50);
        IF_Fotos.add(btn_bajar7);

        caja_registro7 = new JTextField();
        caja_registro7.setBounds(320, 450, 50, 20);
        IF_Fotos.add(caja_registro7);
        caja_registro7.setEnabled(false);

        btn_E17 = new JButton("|<");
        btn_E17.setBackground(Color.PINK);
        btn_E17.setBounds(200, 450, 50, 20);
        IF_Fotos.add(btn_E17);

        btn_E27 = new JButton("<");
        btn_E27.setBackground(Color.PINK);
        btn_E27.setBounds(260, 450, 50, 20);
        IF_Fotos.add(btn_E27);

        btn_E37 = new JButton(">");
        btn_E37.setBackground(Color.PINK);
        btn_E37.setBounds(380, 450, 50, 20);
        IF_Fotos.add(btn_E37);

        btn_E47 = new JButton(">|");
        btn_E47.setBackground(Color.PINK);
        btn_E47.setBounds(440, 450, 50, 20);
        IF_Fotos.add(btn_E47);

        desktopPane.add(IF_Fotos);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Estudios = new JInternalFrame();
        IF_Estudios.getContentPane().setLayout(null);
        IF_Estudios.setBackground(new Color(204, 200, 200));
        IF_Estudios.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Estudios.setTitle("ESTUDIOS");
        IF_Estudios.setSize(700, 550);
        IF_Estudios.setMaximizable(true);
        IF_Estudios.setIconifiable(true);
        IF_Estudios.setClosable(true);
        IF_Estudios.setResizable(true);
        IF_Estudios.setLayout(null);

        lbl_imagen8.setIcon(iconoEscalado2);
        lbl_imagen8.setBounds(0, 0, 150, 150);
        IF_Estudios.add(lbl_imagen8);

        lbl_txt8.setText("ALTAS ESTUDIOS");
        lbl_txt8.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt8.setForeground(Color.white);
        lbl_txt8.setBounds(100, 0, 684, 60);
        IF_Estudios.add(lbl_txt8);
        lbl_fondo8.setBounds(0, 0, 684, 60);
        lbl_fondo8.setBackground(Color.green);
        lbl_fondo8.setOpaque(true);
        IF_Estudios.add(lbl_fondo8);

        lbl_Id8.setText("ID ESTUDIOS:");
        lbl_Id8.setBounds(100, 85, 150, 10);
        IF_Estudios.add(lbl_Id8);
        caja_id8.setBounds(250, 80, 170, 20);
        IF_Estudios.add(caja_id8);

        lbl_nombre8.setText("NOMBRE ESTUDIO:");
        lbl_nombre8.setBounds(100, 120, 150, 10);
        IF_Estudios.add(lbl_nombre8);
        caja_nombre8.setBounds(250, 115, 170, 20);
        IF_Estudios.add(caja_nombre8);

        lbl_nombre8.setText("DIRECCION:");
        lbl_nombre8.setBounds(100, 150, 150, 10);
        IF_Estudios.add(lbl_nombre8);
        caja_nombre8.setBounds(250, 145, 170, 20);
        IF_Estudios.add(caja_nombre8);

        scrollPane8.setBounds(50,320,480,100);
        IF_Estudios.add(scrollPane8);

        btn_agregar8.setIcon(iconoEscalado4);
        btn_agregar8.setBackground(Color.GREEN);
        btn_agregar8.setBounds(460, 100, 50, 50);
        IF_Estudios.add(btn_agregar8);

        btn_borrar8.setIcon(iconoEscalado8);
        btn_borrar8.setBackground(Color.WHITE);
        btn_borrar8.setBounds(560, 300, 50, 50);
        IF_Estudios.add(btn_borrar8);

        btn_cambio8.setIcon(iconoEscalado6);
        btn_cambio8.setBackground(Color.YELLOW);
        btn_cambio8.setBounds(560, 100, 50, 50);
        IF_Estudios.add(btn_cambio8);

        btn_buscar8.setIcon(iconoEscalado7);
        btn_buscar8.setBackground(Color.BLUE);
        btn_buscar8.setBounds(560, 200, 50, 50);
        IF_Estudios.add(btn_buscar8);

        btn_bajar8.setIcon(iconoEscalado5);
        btn_bajar8.setBackground(Color.RED);
        btn_bajar8.setBounds(460, 200, 50, 50);
        IF_Estudios.add(btn_bajar8);

        caja_registro8 = new JTextField();
        caja_registro8.setBounds(320, 450, 50, 20);
        IF_Estudios.add(caja_registro8);
        caja_registro8.setEnabled(false);

        btn_E18 = new JButton("|<");
        btn_E18.setBackground(Color.PINK);
        btn_E18.setBounds(200, 450, 50, 20);
        IF_Estudios.add(btn_E18);

        btn_E28 = new JButton("<");
        btn_E28.setBackground(Color.PINK);
        btn_E28.setBounds(260, 450, 50, 20);
        IF_Estudios.add(btn_E28);

        btn_E38 = new JButton(">");
        btn_E38.setBackground(Color.PINK);
        btn_E38.setBounds(380, 450, 50, 20);
        IF_Estudios.add(btn_E38);

        btn_E48 = new JButton(">|");
        btn_E48.setBackground(Color.PINK);
        btn_E48.setBounds(440, 450, 50, 20);
        IF_Estudios.add(btn_E48);

        desktopPane.add(IF_Estudios);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Servicios = new JInternalFrame();
        IF_Servicios.getContentPane().setLayout(null);
        IF_Servicios.setBackground(new Color(204, 200, 200));
        IF_Servicios.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Servicios.setTitle("SERVICIOS");
        IF_Servicios.setSize(700, 550);
        IF_Servicios.setMaximizable(true);
        IF_Servicios.setIconifiable(true);
        IF_Servicios.setClosable(true);
        IF_Servicios.setResizable(true);
        IF_Servicios.setLayout(null);

        lbl_imagen9.setIcon(iconoEscalado2);
        lbl_imagen9.setBounds(0, 0, 150, 150);
        IF_Servicios.add(lbl_imagen9);

        lbl_txt9.setText("ALTAS SERVICIOS");
        lbl_txt9.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt9.setForeground(Color.white);
        lbl_txt9.setBounds(100, 0, 684, 60);
        IF_Servicios.add(lbl_txt9);
        lbl_fondo9.setBounds(0, 0, 684, 60);
        lbl_fondo9.setBackground(Color.green);
        lbl_fondo9.setOpaque(true);
        IF_Servicios.add(lbl_fondo9);

        lbl_Id9.setText("ID SERVICIO:");
        lbl_Id9.setBounds(100, 85, 150, 10);
        IF_Servicios.add(lbl_Id9);
        caja_id9.setBounds(250, 80, 170, 20);
        IF_Servicios.add(caja_id9);

        lbl_nombre9.setText("TIPO:");
        lbl_nombre9.setBounds(100, 120, 150, 10);
        IF_Servicios.add(lbl_nombre9);
        caja_nombre9.setBounds(250, 115, 170, 20);
        IF_Servicios.add(caja_nombre9);

        scrollPane9.setBounds(50,320,480,100);
        IF_Servicios.add(scrollPane9);

        btn_agregar9.setIcon(iconoEscalado4);
        btn_agregar9.setBackground(Color.GREEN);
        btn_agregar9.setBounds(460, 100, 50, 50);
        IF_Servicios.add(btn_agregar9);

        btn_borrar9.setIcon(iconoEscalado8);
        btn_borrar9.setBackground(Color.WHITE);
        btn_borrar9.setBounds(560, 300, 50, 50);
        IF_Servicios.add(btn_borrar9);

        btn_cambio9.setIcon(iconoEscalado6);
        btn_cambio9.setBackground(Color.YELLOW);
        btn_cambio9.setBounds(560, 100, 50, 50);
        IF_Servicios.add(btn_cambio9);

        btn_buscar9.setIcon(iconoEscalado7);
        btn_buscar9.setBackground(Color.BLUE);
        btn_buscar9.setBounds(560, 200, 50, 50);
        IF_Servicios.add(btn_buscar9);

        btn_bajar9.setIcon(iconoEscalado5);
        btn_bajar9.setBackground(Color.RED);
        btn_bajar9.setBounds(460, 200, 50, 50);
        IF_Servicios.add(btn_bajar9);

        caja_registro9 = new JTextField();
        caja_registro9.setBounds(320, 450, 50, 20);
        IF_Servicios.add(caja_registro9);
        caja_registro9.setEnabled(false);

        btn_E19 = new JButton("|<");
        btn_E19.setBackground(Color.PINK);
        btn_E19.setBounds(200, 450, 50, 20);
        IF_Servicios.add(btn_E19);

        btn_E29 = new JButton("<");
        btn_E29.setBackground(Color.PINK);
        btn_E29.setBounds(260, 450, 50, 20);
        IF_Servicios.add(btn_E29);

        btn_E39 = new JButton(">");
        btn_E39.setBackground(Color.PINK);
        btn_E39.setBounds(380, 450, 50, 20);
        IF_Servicios.add(btn_E39);

        btn_E49 = new JButton(">|");
        btn_E49.setBackground(Color.PINK);
        btn_E49.setBounds(440, 450, 50, 20);
        IF_Servicios.add(btn_E49);

        desktopPane.add(IF_Servicios);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Horario_Fotografo = new JInternalFrame();
        IF_Horario_Fotografo.getContentPane().setLayout(null);
        IF_Horario_Fotografo.setBackground(new Color(204, 200, 200));
        IF_Horario_Fotografo.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Horario_Fotografo.setTitle("HORARIO FOTOGRAFO");
        IF_Horario_Fotografo.setSize(700, 550);
        IF_Horario_Fotografo.setMaximizable(true);
        IF_Horario_Fotografo.setIconifiable(true);
        IF_Horario_Fotografo.setClosable(true);
        IF_Horario_Fotografo.setResizable(true);
        IF_Horario_Fotografo.setLayout(null);

        lbl_imagen10.setIcon(iconoEscalado3);
        lbl_imagen10.setBounds(0, 0, 150, 150);
        IF_Horario_Fotografo.add(lbl_imagen10);

        lbl_txt10.setText("HORARIO FOTOGRAFO");
        lbl_txt10.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt10.setForeground(Color.white);
        lbl_txt10.setBounds(100, 0, 684, 60);
        IF_Horario_Fotografo.add(lbl_txt10);
        lbl_fondo10.setBounds(0, 0, 684, 60);
        lbl_fondo10.setBackground(Color.blue);
        lbl_fondo10.setOpaque(true);
        IF_Horario_Fotografo.add(lbl_fondo10);

        lbl_Id10.setText("HORARIO FOTOGRAFO:");
        lbl_Id10.setBounds(100, 85, 150, 10);
        IF_Horario_Fotografo.add(lbl_Id10);
        caja_id10.setBounds(250, 80, 170, 20);
        IF_Horario_Fotografo.add(caja_id10);

        lbl_nombre10.setText("NUMERO CONTRATO:");
        lbl_nombre10.setBounds(100, 120, 150, 10);
        IF_Horario_Fotografo.add(lbl_nombre10);
        caja_nombre10.setBounds(250, 115, 170, 20);
        IF_Horario_Fotografo.add(caja_nombre10);

        scrollPane10.setBounds(50,320,480,100);
        IF_Horario_Fotografo.add(scrollPane10);

        btn_borrar10.setIcon(iconoEscalado9);
        btn_borrar10.setBackground(Color.WHITE);
        btn_borrar10.setBounds(560, 300, 50, 50);
        IF_Horario_Fotografo.add(btn_borrar10);

        desktopPane.add(IF_Horario_Fotografo);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Horario_Semanal = new JInternalFrame();
        IF_Horario_Semanal.getContentPane().setLayout(null);
        IF_Horario_Semanal.setBackground(new Color(204, 200, 200));
        IF_Horario_Semanal.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Horario_Semanal.setTitle("HORARIO SEMANAL");
        IF_Horario_Semanal.setSize(700, 550);
        IF_Horario_Semanal.setMaximizable(true);
        IF_Horario_Semanal.setIconifiable(true);
        IF_Horario_Semanal.setClosable(true);
        IF_Horario_Semanal.setResizable(true);
        IF_Horario_Semanal.setLayout(null);

        lbl_imagen11.setIcon(iconoEscalado3);
        lbl_imagen11.setBounds(0, 0, 150, 150);
        IF_Horario_Semanal.add(lbl_imagen11);

        lbl_txt11.setText("HORARIO SEMANAL");
        lbl_txt11.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt11.setForeground(Color.white);
        lbl_txt11.setBounds(100, 0, 684, 60);
        IF_Horario_Semanal.add(lbl_txt11);
        lbl_fondo11.setBounds(0, 0, 684, 60);
        lbl_fondo11.setBackground(Color.blue);
        lbl_fondo11.setOpaque(true);
        IF_Horario_Semanal.add(lbl_fondo11);

        lbl_Id11.setText("DIA DE INICIO:");
        lbl_Id11.setBounds(100, 85, 150, 10);
        IF_Horario_Semanal.add(lbl_Id11);
        caja_id11.setBounds(250, 80, 170, 20);
        IF_Horario_Semanal.add(caja_id11);

        scrollPane11.setBounds(50,320,480,100);
        IF_Horario_Semanal.add(scrollPane11);

        btn_borrar11.setIcon(iconoEscalado9);
        btn_borrar11.setBackground(Color.WHITE);
        btn_borrar11.setBounds(560, 300, 50, 50);
        IF_Horario_Semanal.add(btn_borrar11);

        desktopPane.add(IF_Horario_Semanal);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Cuentas = new JInternalFrame();
        IF_Cuentas.getContentPane().setLayout(null);
        IF_Cuentas.setBackground(new Color(204, 200, 200));
        IF_Cuentas.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Cuentas.setTitle("CUENTAS POR COBRAR");
        IF_Cuentas.setSize(700, 550);
        IF_Cuentas.setMaximizable(true);
        IF_Cuentas.setIconifiable(true);
        IF_Cuentas.setClosable(true);
        IF_Cuentas.setResizable(true);
        IF_Cuentas.setLayout(null);

        lbl_imagen12.setIcon(iconoEscalado3);
        lbl_imagen12.setBounds(0, 0, 150, 150);
        IF_Cuentas.add(lbl_imagen12);

        lbl_txt12.setText("CUENTAS POR COBRAR");
        lbl_txt12.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt12.setForeground(Color.white);
        lbl_txt12.setBounds(100, 0, 684, 60);
        IF_Cuentas.add(lbl_txt12);
        lbl_fondo12.setBounds(0, 0, 684, 60);
        lbl_fondo12.setBackground(Color.blue);
        lbl_fondo12.setOpaque(true);
        IF_Cuentas.add(lbl_fondo12);

        scrollPane12.setBounds(50,320,480,100);
        IF_Cuentas.add(scrollPane12);

        btn_borrar12.setIcon(iconoEscalado9);
        btn_borrar12.setBackground(Color.WHITE);
        btn_borrar12.setBounds(560, 300, 50, 50);
        IF_Cuentas.add(btn_borrar12);

        desktopPane.add(IF_Cuentas);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_ReporteC = new JInternalFrame();
        IF_ReporteC.getContentPane().setLayout(null);
        IF_ReporteC.setBackground(new Color(204, 200, 200));
        IF_ReporteC.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_ReporteC.setTitle("CUENTAS POR COBRAR");
        IF_ReporteC.setSize(700, 550);
        IF_ReporteC.setMaximizable(true);
        IF_ReporteC.setIconifiable(true);
        IF_ReporteC.setClosable(true);
        IF_ReporteC.setResizable(true);
        IF_ReporteC.setLayout(null);

        lbl_imagen13.setIcon(iconoEscalado3);
        lbl_imagen13.setBounds(0, 0, 150, 150);
        IF_ReporteC.add(lbl_imagen13);

        lbl_txt13.setText("CUENTAS POR COBRAR");
        lbl_txt13.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt13.setForeground(Color.white);
        lbl_txt13.setBounds(100, 0, 684, 60);
        IF_ReporteC.add(lbl_txt13);
        lbl_fondo13.setBounds(0, 0, 684, 60);
        lbl_fondo13.setBackground(Color.blue);
        lbl_fondo13.setOpaque(true);
        IF_ReporteC.add(lbl_fondo13);

        scrollPane13.setBounds(50,320,480,100);
        IF_ReporteC.add(scrollPane13);

        btn_borrar13.setIcon(iconoEscalado9);
        btn_borrar13.setBackground(Color.WHITE);
        btn_borrar13.setBounds(560, 300, 50, 50);
        IF_ReporteC.add(btn_borrar13);

        desktopPane.add(IF_ReporteC);
        add(desktopPane, BorderLayout.CENTER);
//_-------------------------------------------------------------------------------------------------------------------
        IF_Transaccion = new JInternalFrame();
        IF_Transaccion.getContentPane().setLayout(null);
        IF_Transaccion.setBackground(new Color(204, 200, 200));
        IF_Transaccion.setDefaultCloseOperation(HIDE_ON_CLOSE);
        IF_Transaccion.setTitle("CUENTAS POR COBRAR");
        IF_Transaccion.setSize(700, 550);
        IF_Transaccion.setMaximizable(true);
        IF_Transaccion.setIconifiable(true);
        IF_Transaccion.setClosable(true);
        IF_Transaccion.setResizable(true);
        IF_Transaccion.setLayout(null);

        lbl_imagen14.setIcon(iconoEscalado3);
        lbl_imagen14.setBounds(0, 0, 150, 150);
        IF_Transaccion.add(lbl_imagen13);

        lbl_txt14.setText("CUENTAS POR COBRAR");
        lbl_txt14.setFont(new Font("Helvetica", Font.PLAIN, 30));
        lbl_txt14.setForeground(Color.white);
        lbl_txt14.setBounds(100, 0, 684, 60);
        IF_Transaccion.add(lbl_txt14);
        lbl_fondo14.setBounds(0, 0, 684, 60);
        lbl_fondo14.setBackground(Color.blue);
        lbl_fondo14.setOpaque(true);
        IF_Transaccion.add(lbl_fondo14);

        lbl_Id11.setText("NOMBRE FOTOGRAFO:");
        lbl_Id11.setBounds(100, 85, 150, 10);
        IF_Horario_Semanal.add(lbl_Id11);
        caja_id11.setBounds(250, 80, 170, 20);
        IF_Horario_Semanal.add(caja_id11);

        lbl_Id11.setText("FECHA:");
        lbl_Id11.setBounds(100, 115, 150, 10);
        IF_Horario_Semanal.add(lbl_Id11);
        caja_id11.setBounds(250, 110, 170, 20);
        IF_Horario_Semanal.add(caja_id11);

        scrollPane14.setBounds(50,320,480,100);
        IF_Transaccion.add(scrollPane13);

        btn_borrar14.setIcon(iconoEscalado9);
        btn_borrar14.setBackground(Color.WHITE);
        btn_borrar14.setBounds(560, 300, 50, 50);
        IF_Transaccion.add(btn_borrar14);

        desktopPane.add(IF_Transaccion);
        add(desktopPane, BorderLayout.CENTER);

    }



    public void keyTyped(KeyEvent e) {
        Component c=(Component) e.getSource();
        char caracter=e.getKeyChar();
        if(c==caja_telefono){
            if(!(caracter>47&&caracter<58)) {
                e.consume();
            }
        } else if (c==caja_id) {
            if(!(caracter>47&&caracter<58)) {
                e.consume();
            }
        } else if (c==caja_nombre) {
            if(!(caracter>64&&caracter<91||caracter>96&&caracter<123||caracter==32)) {
                e.consume();
            }
        } else if (c==caja_primerAp) {
            if(!(caracter>64&&caracter<91||caracter>96&&caracter<123||caracter==32)) {
                e.consume();
            }
        } else if (c==caja_segundoAp) {
            if(!(caracter>64&&caracter<91||caracter>96&&caracter<123||caracter==32)) {
                e.consume();
            }
        } else if (c==caja_email) {
            if(!(caracter>64&&caracter<91||caracter>96&&caracter<123||caracter==32)) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void actualizarTablas(JTable tabla){

        String controlador = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/Estudio_Fotografia";
        String consulta = "SELECT * FROM clientes";

        ResultSetTableModel modeloTabla = null;

        try {
            modeloTabla = new ResultSetTableModel(controlador, URL, consulta);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        tabla.setModel(modeloTabla);
    }

    public void apagarIF(){
        IF_Contratos.setVisible(false);
        IF_Clientes.setVisible(false);
        IF_Forma_Consulta.setVisible(false);
        IF_Empleados.setVisible(false);
        IF_Estudios.setVisible(false);
        IF_Forma_Orden_Paquete.setVisible(false);
        IF_Servicios.setVisible(false);
        IF_Ocupacion.setVisible(false);
        IF_Fotos.setVisible(false);
        IF_Horario_Fotografo.setVisible(false);
        IF_Horario_Semanal.setVisible(false);
    }
    public void metodoMagicoParaRestablecerComponentes(JComponent ... componentes){
        String[] columnNames = {"ID Clientes", "Nombre", "Primer Ap", "Segundo Ap", "Telefono", "email"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for(JComponent x : componentes){
            if(x instanceof JTextField){
                ((JTextField)x).setText("");
            }else if(x instanceof JComboBox<?>){
                ((JComboBox)x).setSelectedIndex(0);
            }else if(x instanceof JRadioButton){
                ((JRadioButton)x).setSelected(false);
            }else if(x instanceof JTable){
                ((JTable)x).setModel(model);
            }
        }
    }


}