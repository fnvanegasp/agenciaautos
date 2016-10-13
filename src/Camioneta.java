/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Camioneta extends Auto{
    private int capacidad;
    private int numEjes;
    private int numRodadas;

    public Camioneta(int capacidad, int numEjes, int numRodadas, int numSerie, String marca, int año, int precio) {
        super(numSerie, marca, año, precio);
        this.capacidad = capacidad;
        this.numEjes = numEjes;
        this.numRodadas = numRodadas;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "capacidad=" + capacidad + ", numEjes=" + numEjes + ", numRodadas=" + numRodadas + '}';
    }

    
    
}
