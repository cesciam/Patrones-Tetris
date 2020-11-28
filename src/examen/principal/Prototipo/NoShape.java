package examen.principal.Prototipo;

import examen.principal.iPrototipo.AShape;

public class NoShape extends AShape {

    public NoShape() {
        coords = new int[4][2];
        coords[0][0] = 0;
        coords[0][1] = 0;

        coords[1][0] = 0;
        coords[1][1] = 0;

        coords[2][0] = 0;
        coords[2][1] = 0;

        coords[3][0] = 0;
        coords[3][1] = 0;

        colorOrdinal = 0;

    }

    @Override
    public AShape clone() {
        return new NoShape();
    }
}
