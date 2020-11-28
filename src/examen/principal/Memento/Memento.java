package examen.principal.Memento;

import examen.principal.iPrototipo.AShape;

public class Memento {

    private int lifesCount;
    private int numLinesRemoved;
    private AShape[] board;

    public Memento(int lifesCount, int numLinesRemoved, AShape[] boardP) {
        this.lifesCount = lifesCount;
        this.numLinesRemoved = numLinesRemoved;
        board = new AShape[boardP.length];
        for(int i = 0; i< board.length; i++){

            board[i] = boardP[i];
        }
    }

    public int getLifesCount() {
        return lifesCount;
    }

    public void setLifesCount(int lifesCount) {
        this.lifesCount = lifesCount;
    }

    public int getNumLinesRemoved() {
        return numLinesRemoved;
    }

    public void setNumLinesRemoved(int numLinesRemoved) {
        this.numLinesRemoved = numLinesRemoved;
    }

    public AShape[] getBoard() {
        return board;
    }

    public void setBoard(AShape[] board) {
        this.board = board;
    }
}
