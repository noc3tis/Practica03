package Alumnos;

public class Alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String telefono;
    private String correo;
    private String sexo;
    private String CURP;
    private int edad;
    private boolean discapacidad;
    private String estadoNacimiento;

    public Alumno(String nombre, String apaterno, String amaterno, String telefono, String correo, String CURP, boolean discapacidad, String estadoNacimiento) {
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.telefono = telefono;
        this.correo = correo;
        this.CURP = CURP;
        this.discapacidad = discapacidad;

    }


}

