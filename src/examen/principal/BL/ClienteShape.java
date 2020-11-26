package examen.principal.BL;

import examen.principal.Entity.*;

import java.util.Random;

public class ClienteShape {
    private AShape lineShape;
    private AShape lShape;
    private AShape mirroredShaped;
    private AShape noShape;
    private AShape squareShape;
    private AShape sShape;
    private AShape tShape;
    private AShape zShape;

    public ClienteShape() {
        lShape = new LShape();
        mirroredShaped = new MirroredShaped();
        noShape = new NoShape();
        squareShape = new SquareShape();
        sShape = new SShape();
        tShape = new TShape();
        zShape = new ZShape();
    }

    public AShape getRandomShape(){
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;

        switch (x) {
            case 1: return lineShape.clone();
            case 2: return lShape.clone();
            case 3: return mirroredShaped.clone();
            case 4: return squareShape.clone();
            case 5: return sShape.clone();
            case 6: return tShape.clone();
            case 7: return zShape.clone();
            default: return noShape.clone();
        }
    }

    public AShape getNoShape(){
        return  noShape.clone();
    }
}
