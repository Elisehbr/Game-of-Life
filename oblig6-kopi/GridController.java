
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridController implements ActionListener {
    private Verden verden;
    private GridModel model;
    private GridView view;

    public GridController(int numRows, int numCols) {
        model = new GridModel(numRows, numCols);
        view = new GridView(numRows, numCols, this);
        verden = new Verden(numRows, numCols);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        for (int i = 0; i < verden.rutenett.antRader; i++) {
            for (int j = 0; j < verden.rutenett.antKolonner; j++) {
                if (model.hentCelle(i, j) == ' ') {
                    model.settCelle(i, j, '*');
                } else {
                    model.settCelle(i, j, ' ');
                }
                
            }
        }
        view.update(model);
    }
}
