/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author bossstore
 */
public class Reserva {
    private int idReserva;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Habitacion habitacio;
    private Huesped huesped;

    public Reserva(int idReserva, LocalDate fechaEntrada, LocalDate fechaSalida, Habitacion habitacio, Huesped huesped) {
        this.idReserva = idReserva;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacio = habitacio;
        this.huesped = huesped;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacio() {
        return habitacio;
    }

    public void setHabitacio(Habitacion habitacio) {
        this.habitacio = habitacio;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }
    
    
    
    
}
