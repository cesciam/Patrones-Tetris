package examen.principal.Entity;

import examen.principal.Shape;

public class SquareShape extends AShape {

    public SquareShape() {
        coords[0][0] = 0;
        coords[0][1] = 0;

        coords[1][0] = 1;
        coords[1][1] = 0;

        coords[2][0] = 0;
        coords[2][1] = 1;

        coords[3][0] = 1;
        coords[3][1] = 1;

        colorOrdinal = 5;
    }

    @Override
    public AShape clone() {
        return new SquareShape();
    }

    @Override
    public AShape rotateLeft(){
        return  this;
    }

    @Override
    public AShape rotateRight(){
        return this;
    }
}
