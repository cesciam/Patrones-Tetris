package examen.principal.Entity;

public class LineShape extends AShape {

    public LineShape() {
        coords[0][0] = 0;
        coords[0][1] = -1;

        coords[1][0] = 0;
        coords[1][1] = 0;

        coords[2][0] = 0;
        coords[2][1] = 1;

        coords[3][0] = 0;
        coords[3][1] = 2;

        colorOrdinal = 3;
    }

    @Override
    public AShape clone() {
        return new LineShape();
    }
}
