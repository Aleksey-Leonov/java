import javax.swing.*;
import java.awt.*;

public class Calculator {
    private JFrame mainFrame; //Вызываем объект для создания окна (фрейма)

    public Calculator() {
        mainFrame = new JFrame();  //создаем объект создания фрейма

        mainFrame.setTitle("Calculator"); //создали надпись сверху окна
        mainFrame.setBounds(100, 100, 300, 500); // задали параметры размера окна
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //данный параметр отвечает за то, что бы
        // программа переставала работать после нажатия на крестик.

        mainFrame.setLayout(new BorderLayout()); //вызываем менеджер компоновки лояут в swing с
        // классом BorderLayout (компоновка по сторонам света)
        JPanel top = new JPanel(); //создаем панель
        top.setLayout(new BorderLayout());  //присваеваем панеле топ фрейм внутри фрейма по сторонам света
        JPanel button = new JPanel();  //создаем панель
        button.setLayout(new GridLayout(5, 3)); //присываиваем панеле фрейм в виде таблицы 5 строк 3 ряда

        mainFrame.add(top,BorderLayout.NORTH); //добавляем в наш основной фрейм панель ТОП и размещаем ее сверху
        mainFrame.add(button,BorderLayout.CENTER); //добавляем в основной фрейм кнопки и размещаем по центру.

        JTextField outField = new JTextField(); //создаем текстовое однострочное поле
        top.add(outField, BorderLayout.CENTER); //добавляем в топ текстовое поле и размещаем в центре
        outField.setEditable(false); // применяем к текстовой однострочной строке метод,
        // чтобы нельзя было вписывать туда руками.

        DigitButtonListener dbListener = new DigitButtonListener(outField);
        for (int i = 0; i <= 9; i++) {                  //создаем объект кнопка для цифр от 0 до 9
            JButton digitBtn = new JButton(String.valueOf(i)); //создаем кнопку и присываеваем ей текстовое значение i
            button.add(digitBtn); //в панель батон добавляем новую кнопку
            digitBtn.addActionListener(dbListener);
        }
        JButton plusBtm =new JButton("+"); //создаем объект кнопка
        plusBtm.addActionListener(dbListener);
        button.add(plusBtm);
        JButton minusBtm =new JButton("-"); //создаем объект кнопка
        minusBtm.addActionListener(dbListener);
        button.add(minusBtm);

        SubmitButtonListener submitButtonListener = new SubmitButtonListener(outField);
        ClearButtonListener clearButtonListener = new ClearButtonListener(outField);
        JButton cancelBtm = new JButton("C"); //создаем объект кнопка
        cancelBtm.addActionListener(clearButtonListener);
        button.add(cancelBtm);
        JButton submitBtm = new JButton("Submit"); //создаем объект кнопка
        submitBtm.addActionListener(submitButtonListener);
        button.add(submitBtm);

        mainFrame.setVisible(true); //делаем наш конструктор видимым

    }

}
