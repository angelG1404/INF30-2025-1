
package pe.edu.pucp.softprog.rrhh.model;

import java.util.Date;

public class Persona {
    private int idPersona;
    private String dni;
    private String apellidoPaterno;
    private char genero;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(int idPersona, String dni, String apellidoPaterno, char genero, Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.apellidoPaterno = apellidoPaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
