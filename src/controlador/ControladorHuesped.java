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
    
    public boolean agregarHuesped(Huesped huesped){
        huespedes.add(huesped);
        return true;
    }
    
    public Huesped buscarHuesped(String documento){
        for (int i = 0; i < huespedes.size(); i++) {
            if(huespedes.get(i) != null){
                return huespedes.get(i);
            }
        }
        return null;
    }
    
    public boolean eliminarHuesped(String documento){
        for (int i = 0; i < huespedes.size(); i++) {
            if(huespedes.get(i) != null){
                return true;
            }
        }
        return false;
    }
    
    
    
}
