package examen.principal.Prototipo;

import examen.principal.iPrototipo.AShape;

public class SShape extends AShape {
    public SShape() {
        coords = new int[4][2];
        coords[0][0] = 0;
        coords[0][1] = -1;

        coords[1][0] = 0;
        coords[1][1] = 0;

        coords[2][0] = 1;
        coords[2][1] = 0;

        coords[3][0] = 1;
        coords[3][1] = 1;

        colorOrdinal = 2;
    }

    @Override
    public AShape clone() {
        return new SShape();
    }
}
