package examen.principal.Principal;

import examen.principal.Memento.Board;
import examen.principal.Memento.Caretaker;
import examen.principal.Tetris;

public class GestorMemento {
    private Board creador;
    private Caretaker Vigilante;

    public GestorMemento(Tetris parent) {
        creador = new Board(parent);
        Vigilante = new Caretaker();
        Actualizar_Memento();
    }

    public void Actualizar_Memento() {
        Vigilante.setMemento( creador.createMemento() );
    }

    public void Devolver_Memento(int life) {
        Vigilante.getMemento().setLifesCount(life);
        creador.setMemento( Vigilante.getMemento() );
    }

    public Board getCreador() {
        return creador;
    }


}
