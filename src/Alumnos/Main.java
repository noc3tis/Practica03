package Alumnos;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        public void run(){
            AlumnosFRM pantalla = new AlumnosFRM();
            pantalla.setVisible(true);


            pantalla.setBotonGuardarListener(new BotonGuardarListener() {
                @Override
                public void guardando(Alumno persona) {
                    System.out.println("Nombre: " + persona.getNombre());
                    System.out.println("Apellido paterno: " + persona.getApaterno());
                    System.out.println("Apellido materno: " + persona.getAmaterno());
                    System.out.println("CURP: " + persona.getCurp());
                    System.out.println("Correo: " + persona.getCorreo());
                    System.out.println("Telefono: " + persona.getTelefono());
                    System.out.println("Sexo: "+ persona.getSexo());
                    System.out.println("Discapacidad: " + persona.getDiscapacidad());
                    System.out.println("Edad" + persona.getEdad());

                    Path path = Path.of("C:\\XboxGames\\c.txt");
                    String contentido1 = persona.getNombre();
                    String contentido2 = persona.getApaterno();
                    String contentido3 = persona.getAmaterno();
                    String contentido4 = persona.getCurp();
                    String contentido5 = persona.getCorreo();
                    String contentido6 = persona.getTelefono();
                    String contentido7 = persona.getSexo();
                    String contenido8 = persona.getDiscapacidad();
                    int contenido9 = persona.getEdad();



                    try (FileWriter archivo = new FileWriter(path.toFile(), true)){
                        PrintWriter pw = new PrintWriter(archivo);
                        pw.println(contentido1);
                        //archivo.write(contentido1);
                        pw.println(contentido2);
                        //archivo.write(contentido2);
                        pw.println(contentido3);
                        //archivo.write(contentido3);
                        pw.println(contentido4);
                        //archivo.write(contentido4);
                        pw.println(contentido5);
                        //archivo.write(contentido5);
                        pw.println(contentido6);
                        //archivo.write(contentido6);
                        pw.println(contentido7);
                        //archivo.write(contentido7);
                        pw.println(contenido8);
                        pw.println(contenido9);

                    }
                    catch (IOError e){e.getMessage();} catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            }
        });
    }
}