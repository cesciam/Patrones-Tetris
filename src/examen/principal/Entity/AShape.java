package examen.principal.Entity;

import examen.principal.Shape;

public abstract class AShape {
    protected int coords[][];
    protected int colorOrdinal;

    public abstract AShape clone();

    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }

    /* Mira las coordenadas de la pieza y buscan la posicion minima en x e y */
    public int minX()
    {
        int m = coords[0][0];
        for (int i=0; i < 4; i++) {
            m = Math.min(m, coords[i][0]);
        }
        return m;
    }

    public int minY()
    {
        int m = coords[0][1];
        for (int i=0; i < 4; i++) {
            m = Math.min(m, coords[i][1]);
        }
        return m;
    }

    public AShape rotateRight()
    {

        AShape result = this.clone();


        for (int i = 0; i < 4; ++i) {
            result.setX(i, -y(i));
            result.setY(i, x(i));
        }
        return result;
    }

    public AShape rotateLeft()
    {
        AShape result = clone();

        for (int i = 0; i < 4; ++i) {
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }
        return result;
    }


    public int getColorOrdinal() {
        return colorOrdinal;
    }

    public void setColorOrdinal(int colorOrdinal) {
        this.colorOrdinal = colorOrdinal;
    }
}
