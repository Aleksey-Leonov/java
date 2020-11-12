package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Client {
    private Socket socket;
    private DataOutputStream out; //исходящий поток
    private DataInputStream in; //входящий поток

    public Client() {
        try {
            System.out.println("Клиент подключается");
            socket = new Socket("Localhost", 8888);

            in = new DataInputStream(socket.getInputStream()); //создаем экземпляры ин оут и передает поток из сокета
            out = new DataOutputStream(socket.getOutputStream());

            AtomicBoolean isDrop  = new AtomicBoolean(false);

            new Thread(() -> {
                try {
                    while (true) {
                        String incomingMessage = in.readUTF();
                        System.out.println("Входящее сообщение от сервера " + incomingMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                if (isDrop.get()){
                    System.out.println("Закрытие...");
                    break;
                }
                out.writeUTF(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client socket = new Client();
    }
}
