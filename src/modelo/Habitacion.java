/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bossstore
 */
public class Habitacion {
    private int numero;
    private String tipo;
    private int capacidad;
    private EstadoHabitacion estado;  // <-- Enum, no String

    public Habitacion(int numero, String tipo, int capacidad, EstadoHabitacion estado) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }
}