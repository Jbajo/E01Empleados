package com.cice.controlador;

import com.cice.modelo.Director;
import com.cice.modelo.Empleado;
import com.cice.modelo.Gerente;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class ManejadorClases {
    public static Gerente copiarEmpleadoGerente(Empleado empleado, String departamento){
        Gerente gerente = new Gerente();
        gerente.setNombre(empleado.getNombre());
        gerente.setSalario(empleado.getSalario());
        gerente.setFechaNacimiento(empleado.getFechaNacimiento());
        gerente.setDni(empleado.getDni());
        gerente.incentivo();
        return gerente;
    }

    public static Empleado copiarGerenteEmpleado(Gerente gerente){
        gerente.eliminarIncentivo();
        Empleado empleado = new Empleado();
        empleado.setNombre(gerente.getNombre());
        empleado.setSalario(gerente.getSalario());
        empleado.setFechaNacimiento(gerente.getFechaNacimiento());
        empleado.setDni(gerente.getDni());
        return empleado;
    }

    public static Director copiarGerenteDirector(Gerente gerente){
        gerente.eliminarIncentivo();
        Director director = new Director();
        director.setNombre(gerente.getNombre());
        director.setSalario(gerente.getSalario());
        director.setFechaNacimiento(gerente.getFechaNacimiento());
        director.setDni(gerente.getDni());
        director.setDepartamento(gerente.getDepartamento());
        director.incentivo();
        return director;
    }

    public static Empleado copiarDirectorGerente (Director director){
        director.eliminarIncentivo();
        Gerente gerente = new Gerente();
        gerente.setNombre(director.getNombre());
        gerente.setSalario(director.getSalario());
        gerente.setFechaNacimiento(director.getFechaNacimiento());
        gerente.setDni(director.getDni());
        gerente.incentivo();
        return gerente;
    }
}
