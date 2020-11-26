package examen.principal.Entity;

public class MirroredShaped extends AShape {

    public MirroredShaped() {
        coords[0][0] = 1;
        coords[0][1] = -1;

        coords[1][0] = 0;
        coords[1][1] = -1;

        coords[2][0] = 0;
        coords[2][1] = 0;

        coords[3][0] = 0;
        coords[3][1] = 1;

        colorOrdinal = 7;
    }

    @Override
    public AShape clone() {
        return new MirroredShaped();
    }
}
