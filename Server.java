package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket serverSocket; // чудак, обладающий информацией о сервере
    private Socket clientSocket;
    private DataOutputStream out;
    private DataInputStream in;

    public Server (){
        try {
            System.out.println("Запуск сервера...");
            serverSocket = new ServerSocket(8888); //запуск сервера

            System.out.println("Сервер ожидает соединения");
            clientSocket = serverSocket.accept();// ассепт метод который выполняется в блок режиме (сервер ждет подключение клиента)
            System.out.println("Клиент подключился к серверу "+ clientSocket);

            in = new DataInputStream(clientSocket.getInputStream()); //создаем экземпляры ин оут и передает поток из сокета
            out = new DataOutputStream(clientSocket.getOutputStream());

            Scanner scanner = new Scanner(System.in);

            new Thread(() -> {
                while (true){
                    try {
                        out.writeUTF(scanner.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true){
                String incomingMessage = in.readUTF();
                System.out.println("Входящее сообщение от клиента " + incomingMessage);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection () {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server();
    }
}
