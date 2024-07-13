import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 800);
        frame.getContentPane().setBackground(new Color(30, 40, 50));
        frame.setLayout(new BorderLayout());

        JLabel textField = new JLabel();
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 0, 250));
        textField.setFont(new Font("Serif", Font.BOLD, 70));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setText("Tic-Tac-Toe");
        textField.setOpaque(true);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(textField);
        
        Game game = new Game(textField);
        JPanel buttonPanel = game.createButtonPanel();

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(buttonPanel);
        frame.setVisible(true);
        
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                game.firstTurn();
            }
        }, 2000);
    }
}
