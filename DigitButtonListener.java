import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DigitButtonListener implements ActionListener{
    private JTextField outField; //создаем текстовую строку
    private StringBuilder sb; //создаем объект который принимает информацию о строке а потом добавляет ее в конец


    public DigitButtonListener(JTextField outField) { //чтоб принимать текст из класса калькулятор, создаем констрктор
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource(); //создаем кнопку
        String val = sb.append(outField.getText())
                .append(jButton.getText())
                .toString();
        outField.setText(val);
        sb.setLength(0); //обнуляем состояние

    }


}
