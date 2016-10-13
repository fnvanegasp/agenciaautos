/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Compacto extends Auto{
    private int pasajeros;

    public Compacto(int pasajeros, int numSerie, String marca, int año, int precio) {
        super(numSerie, marca, año, precio);
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Compacto{" + "pasajeros=" + pasajeros + '}';
    }

    
    
    
}
