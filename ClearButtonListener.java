import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {
    private JTextField outField;

    public ClearButtonListener(JTextField outField) {
        this.outField = outField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String val = outField.getText();
        String result = " ";
        outField.setText(result);


    }
}
