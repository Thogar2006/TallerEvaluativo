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
    private ArrayList <Habitacion> habitaciones;

    public ControladorHabitacion() {
        habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    public boolean agregarHabitacion(Habitacion habitacion){
       //for (int i = 0; i < habitaciones.size(); i++) {
            //if(habitaciones.get(i).getCapacidad() > 0){
                habitaciones.add(habitacion);
                return true;
            //}
        //}
        //return false;
    }
    
    public Habitacion buscarHabitacion(int numero){
        for (int i = 0; i < habitaciones.size(); i++) {
            if(habitaciones.get(i) != null && numero == habitaciones.get(i).getNumero()){
                return habitaciones.get(i);
            }
        }
        return null;
    }
    
    public boolean editarHabitacion(Habitacion habitacion){
        Habitacion aux = buscarHabitacion(habitacion.getNumero());
        for (int i = 0; i < habitaciones.size(); i++) {
            if(aux != null){
                aux.setTipo(habitacion.getTipo());
                aux.setCapacidad(habitacion.getCapacidad());
                aux.setEstado(habitacion.getEstado());
                return true;
            }
        }
        return false;
    }
    
    public boolean elimnarHabitacion(int numero){
        for (int i = 0; i < habitaciones.size(); i++) {
            if(habitaciones.get(i) != null ){
                habitaciones.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    
    
}
