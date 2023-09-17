
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class GridView {

    

    private JButton[][] buttons;
    private JFrame vindu;
    private JPanel hovedPanel;
    
    public GridView(int numRows, int numCols, ActionListener listener) {

        vindu = new JFrame("Game of Life");
        //vindu.setSize(800, 600); //Setter en størrelse på vinduet når det åpnes
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // lukker programmet når man krysser ut vinduet
        
        //Hovedpanel
        hovedPanel = new JPanel();
        hovedPanel.setLayout(new BorderLayout());
        vindu.add(hovedPanel, BorderLayout.NORTH);

        buttons = new JButton[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                JButton button = new JButton(" ");
                button.addActionListener(listener);
                buttons[i][j] = button;
                hovedPanel.add(button);
            }
        }

        vindu.pack(); // Komprimerer vinduet - pakker det sammen
        vindu.setLocationRelativeTo(null); // Åpner programmet midt i skjermen 
        vindu.setVisible(true); // Gjør det synlig
    }
    

    public void update(GridModel model) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                buttons[i][j].setText(Character.toString(model.hentCelle(i, j)));
            }
        }
    }
}



