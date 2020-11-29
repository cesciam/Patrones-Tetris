package examen.principal.Obsevador.Concreto;

import examen.principal.Obsevador.Interfaces.IObservador;
import examen.principal.Prototipo.SquareShape;
import examen.principal.iPrototipo.AShape;

public class Observador implements IObservador {


    @Override
    public void update( ) {
        System.out.println("La figura que acaba de salir es un cuadrado.");
    }

    @Override
    public void update(int points) {
        System.out.println("El jugador ha sumado la cantidad de: "+points+" puntos.");
    }
}
