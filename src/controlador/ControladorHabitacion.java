/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Habitacion;

/**
 *
 * @author bossstore
 */


public class ControladorHabitacion {
    private ArrayList<Habitacion> habitaciones;

    public ControladorHabitacion() {
        habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public boolean agregarHabitacion(Habitacion habitacion) {
        if (buscarHabitacion(habitacion.getNumero()) != null) 
            return false;
        if (habitacion.getCapacidad() <= 0 || habitacion.getEstado() == null) 
            return false;
        habitaciones.add(habitacion);
        return true;
    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion h : habitaciones) {
            if (h.getNumero() == numero) 
                return h;
        }
        return null;
    }

    public boolean editarHabitacion(Habitacion habitacion) {
        Habitacion existente = buscarHabitacion(habitacion.getNumero());
        if (existente != null) {
            if (habitacion.getCapacidad() <= 0 || habitacion.getEstado() == null) 
                return false;
            existente.setTipo(habitacion.getTipo());
            existente.setCapacidad(habitacion.getCapacidad());
            existente.setEstado(habitacion.getEstado());
            return true;
        }
        return false;
    }

    public boolean eliminarHabitacion(int numero) {
        Habitacion h = buscarHabitacion(numero);
        if (h != null) {
            habitaciones.remove(h);
            return true;
        }
        return false;
    }
}
