package examen.principal.Entity;

public class LShape extends AShape {

    public LShape() {
        coords[0][0] = -1;
        coords[0][1] = -1;

        coords[1][0] = 0;
        coords[1][1] = -1;

        coords[2][0] = 0;
        coords[2][1] = 0;

        coords[3][0] = 0;
        coords[3][1] = 1;

        colorOrdinal = 6;
    }

    @Override
    public AShape clone() {
        return new LShape();
    }
}
