package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendButtonChat implements ActionListener {
    private JTextField writeChat;
    private JTextArea outField;

    public SendButtonChat(JTextField writeChat, JTextArea outField) {
        this.writeChat = writeChat;
        this.outField = outField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Check");
            outField.append(writeChat.getText() + "\n");
            writeChat.setText("");
    }
}
