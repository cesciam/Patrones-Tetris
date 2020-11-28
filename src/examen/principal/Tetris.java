package examen.principal;

import examen.principal.Memento.Board;
import examen.principal.Principal.GestorMemento;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Tetris extends JFrame {

    JLabel statusbar;
    JLabel lifes;
    private GestorMemento gestorMemento;

    public Tetris() {

    // Creamos una barra de estado
        statusbar = new JLabel(" 0");
        lifes = new JLabel("Vidas: "+3);
        add(statusbar, BorderLayout.SOUTH);
        add(lifes, BorderLayout.NORTH);

    // Cremos el tablero de juego
        gestorMemento = new GestorMemento(this);
        //Board board = new Board(this);
        Board board = gestorMemento.getCreador();

        add(board);
        board.start(); // este metodo arranca el juego
        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {

        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }

    public JLabel getLifes(){
        return lifes;
    }

    public void Devolver_Memento(int life){
        this.gestorMemento.Devolver_Memento(life);
    }

    public void Actualizar_Memento(){
        this.gestorMemento.Actualizar_Memento();
    }

}
