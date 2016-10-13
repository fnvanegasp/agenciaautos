/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Auto {
    public int numSerie;
    public String marca;
    public int año;
    public int precio;

    public Auto(int numSerie, String marca, int año, int precio) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "numSerie=" + numSerie + ", marca=" + marca + ", a\u00f1o=" + año + ", precio=" + precio + '}';
    }

    
    
}
