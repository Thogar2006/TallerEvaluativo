/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Huesped;

/**
 *
 * @author bossstore
 */
public class ControladorHuesped {
    
    private ArrayList <Huesped> huespedes;

    public ControladorHuesped() {
        huespedes = new ArrayList<>();
    }

    public ArrayList<Huesped> getHuespedes() {
        return huespedes;
    }
    
    public boolean agregarHuesped(Huesped huesped) {
    // Validar que los campos no estén vacíos
        if (huesped.getNombre().trim().isEmpty() || huesped.getDocumento().trim().isEmpty() || huesped.getCorreo().trim().isEmpty() || huesped.getTelefono().trim().isEmpty()) {
            return false;
        }

    // Validar que el correo contenga '@'
        if (!huesped.getCorreo().contains("@")) {
            return false;
        }

    // Si pasa las validaciones, se agrega a la lista
        huespedes.add(huesped);
        return true;
    } 
    
    public Huesped buscarHuesped(String documento) {
        for (Huesped h : huespedes) {
            if (h != null && h.getDocumento().equalsIgnoreCase(documento)) {
                return h;
            }
        }
        return null; // No encontrado
    }
    
}
