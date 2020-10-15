import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitButtonListener implements ActionListener {
    private JTextField outField;

    public SubmitButtonListener(JTextField outField) {
        this.outField = outField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String val = outField.getText();
        Object expResult1 = null;
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");
        try {
            expResult1 = scriptEngine.eval(val);
        } catch (ScriptException scriptException) {
            scriptException.printStackTrace();
        }
        outField.setText(expResult1.toString());
    }
}
