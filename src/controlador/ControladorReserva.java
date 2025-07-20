/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import modelo.EstadoHabitacion;
import modelo.Habitacion;
import modelo.Huesped;
import modelo.Reserva;


/**
 *
 * @author bossstore
 */
public class ControladorReserva {
    
    private ArrayList<Reserva> reservas;
    private int contadorId = 1;

    public ControladorReserva() {
        reservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public Reserva buscarReserva(int id) {
        for (Reserva r : reservas) {
            if (r.getIdReserva() == id) {
                return r;
            }
        }
        return null;
    }

    public boolean agregarReserva(Reserva reserva, ControladorHabitacion controladorHabitacion) {
    // Validar fechas
        LocalDate hoy = LocalDate.now();
        if (reserva.getFechaEntrada().isBefore(hoy)) 
            return false;
        if (!reserva.getFechaSalida().isAfter(reserva.getFechaEntrada())) 
            return false;

    // Verificar si el huésped existe
        if (reserva.getHuesped() == null) return false;

    // Verificar disponibilidad de la habitación
        for (Reserva r : reservas) {
            if (r.getHabitacion().getNumero() == reserva.getHabitacion().getNumero()) {
                boolean seCruzan = !reserva.getFechaSalida().isBefore(r.getFechaEntrada()) &&
                                   !reserva.getFechaEntrada().isAfter(r.getFechaSalida());
            if (seCruzan) return false;
        }
    }

    // Registrar
    reservas.add(reserva);
    reserva.getHabitacion().setEstado(EstadoHabitacion.OCUPADA); // Si deseas actualizar el estado
    return true;
}

    public boolean eliminarReserva(int id) {
        Reserva r = buscarReserva(id);
        if (r != null) {
            reservas.remove(r);
            return true;
        }
        return false;
    }
}
    
    

