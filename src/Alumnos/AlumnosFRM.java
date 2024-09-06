package Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlumnosFRM {
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

    public AlumnosFRM() {
        poblarComboBox();
        BtnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BtnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
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
        DefaultComboBoxModel <Genero> comboBoxModel = (DefaultComboBoxModel<Genero>) comboBoxSexo.getModel());

        for (Genero genero : Genero.values()) {
            comboBoxModel.addElement(genero);
        }
    }
}
