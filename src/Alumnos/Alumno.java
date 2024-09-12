package Alumnos;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String sexo;
    private String CURP;
    int edad;



    public Alumno(String nombre, String apaterno, String amaterno, String sexo,  String CURP, String correo, String telefono, boolean discapacidad) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.CURP = CURP;
        this.discapacidad = discapacidad;
        this.sexo = sexo;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApaterno() {
        return apaterno;
    }
    public String getAmaterno() {
        return amaterno;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public String getCurp() {
        return CURP;
    }


    public String getDiscapacidad() {
        if (discapacidad==true) {
            return  "Si";
        }else{
            return "No";
        }
    }

    public String getSexo() {
        return sexo;
    }

    private int calcularedad(String curp){
        String año = CURP.substring(4,6);
        String mes = CURP.substring(6,8);
        String dia = CURP.substring(8,10);
        int añoNaciento = Integer.parseInt(año);
        int mesNaciento = Integer.parseInt(mes);
        int diaNaciento = Integer.parseInt(dia);
        if (añoNaciento <= LocalDate.now().getYear() % 100){
            añoNaciento +=2000;
        }else{
            añoNaciento += 1900;
        }
        LocalDate fechaNacimiento = LocalDate.of(añoNaciento, mesNaciento, diaNaciento);
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }
    public int getEdad() {
        return calcularedad(this.CURP);
    }

}

