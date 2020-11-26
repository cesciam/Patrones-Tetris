package examen.principal;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Tetris extends JFrame {

    JLabel statusbar;

    public Tetris() {

    // Creamos una barra de estado
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

    // Cremos el tablero de juego
        Board board = new Board(this);
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
}