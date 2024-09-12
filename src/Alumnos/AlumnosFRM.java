package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class AlumnosFRM extends JFrame{
    //In
    private JTextField txtNombre;
    private JTextField txtAPaterno;
    private JTextField txtAMaterno;
    private JTextField txtCorrero;
    private JTextField txtTelefono;
    private JComboBox comboBoxSexo;
    private JCheckBox CBDiscapacidad;
    private JButton BtnAceptar;
    private JButton BtnCancelar;
    private JTextField txtCURP;
    private JPanel pnlPrincipal;
    private BotonGuardarListener botonGuardarListener;

    public AlumnosFRM() {
        setTitle("Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlPrincipal);
        setLocationRelativeTo(null);
        poblarComboBox();
        pack();
        BtnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDatos();
            }
        });
        BtnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }
    public void setBotonGuardarListener(BotonGuardarListener botonGuardarListener) {
        this.botonGuardarListener = botonGuardarListener;
    }

    private void enviarDatos(){
        String nombre = txtNombre.getText();
        String apaterno = txtAPaterno.getText();
        String amaterno = txtAMaterno.getText();
        String correo = txtCorrero.getText();
        String telefono = txtTelefono.getText();
        String sexo = comboBoxSexo.getSelectedItem().toString();
        boolean discapacidad = CBDiscapacidad.isSelected();
        String curp = txtCURP.getText();

        if (curp.length()==18){
            //Llama al metodo de interfaz que tiene un metodo que guarda los datos del objeto datos
            if(botonGuardarListener != null){

            //Se crea un objeto del tipo alumno
            Alumno datos = new Alumno(nombre, apaterno, amaterno, sexo, curp, correo, telefono, discapacidad);

                botonGuardarListener.guardando(datos);
            }
            Borrar();
        }else{
            JOptionPane.showMessageDialog(null, "La CURP debe tener 18 caracteres");
        }


    }
    private void Borrar(){
        txtNombre.setText("");
        txtAPaterno.setText("");
        txtAMaterno.setText("");
        txtCorrero.setText("");
        txtTelefono.setText("");
        comboBoxSexo.setSelectedIndex(0);
        CBDiscapacidad.setSelected(false);
        txtCURP.setText("");
    }
    private void poblarComboBox(){
        DefaultComboBoxModel <Genero> comboBoxModel = (DefaultComboBoxModel<Genero>) comboBoxSexo.getModel();

        for (Genero genero : Genero.values()) {
            comboBoxModel.addElement(genero);
        }
    }







}
