package com.company;

import javax.swing.*;
import java.awt.*;

public class Chat {
    private JFrame mainFrame;
    JTextArea outField;
    JTextField writeChat;

    public Chat() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Chat Leonov's");
        mainFrame.setBounds(200, 200, 700, 700);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setLayout(new BorderLayout()); //вызываем менеджер компоновки лояут в swing с
        // классом BorderLayout (компоновка по сторонам света)
        JPanel textChat = new JPanel(); //создаем панель
        textChat.setLayout(new BorderLayout());  //присваеваем панеле топ фрейм внутри фрейма по сторонам света


        mainFrame.add(textChat, BorderLayout.CENTER); //добавляем в наш основной фрейм панель CENTER и размещаем ее сверху


        outField = new JTextArea(); //создаем текстовое многострочное поле
        textChat.add(outField, BorderLayout.CENTER); //добавляем в CENTER текстовое поле и размещаем в центре
        outField.setEditable(false); // применяем к текстовой однострочной строке метод,
        // чтобы нельзя было вписывать туда руками.

        JPanel writeChatPanel = new JPanel();
        writeChatPanel.setLayout(new BorderLayout());

        mainFrame.add(writeChatPanel, BorderLayout.SOUTH);
        writeChat = new JTextField();
        writeChatPanel.add(writeChat, BorderLayout.CENTER);

        JPanel sendButtonPanel = new JPanel();
        sendButtonPanel.setLayout(new BorderLayout());
        writeChatPanel.add(sendButtonPanel, BorderLayout.EAST);


        JButton sendButton = new JButton(String.valueOf("SEND"));
        sendButtonPanel.add(sendButton);

        SendButtonChat sendButtonChat = new SendButtonChat(writeChat,outField);
        sendButton.addActionListener(sendButtonChat);


        mainFrame.setVisible(true);
    }



}
