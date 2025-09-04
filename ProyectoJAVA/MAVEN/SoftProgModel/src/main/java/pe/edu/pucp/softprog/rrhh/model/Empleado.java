
package pe.edu.pucp.softprog.rrhh.model;

import java.util.Date;

public class Empleado extends Persona{
    private String cargo;
    private boolean activo;
    private  double sueldo;

    public Empleado() {
    }

    public Empleado(String cargo, boolean activo, double sueldo, int idPersona, String dni, String apellidoPaterno, char genero, Date fechaNacimiento) {
        super(idPersona, dni, apellidoPaterno, genero, fechaNacimiento);
        this.cargo = cargo;
        this.activo = activo;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
