package com.chat.server;

import com.chat.auth.AuthenticationService;
import com.chat.auth.BasicAuthenticationService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer implements Server{
    private Set<ClientHandler> clients;
    private AuthenticationService authenticationService;

    public ChatServer() {
        try {
            System.out.println("Запуск сервера...");
            ServerSocket serverSocket = new ServerSocket(8888);
            clients = new HashSet<>();
            authenticationService = new BasicAuthenticationService();
            System.out.println("Сервер запущен...");

            while (true) {
                System.out.println("Сервер ожидает клиентов...");
                // делает ожидание, пока не придёт к нему информация с serverSocket.accept();
                Socket socket = serverSocket.accept();

                System.out.println("Клиент подключился:  " + socket );
                new ClientHandler(this, socket);
            }
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в работе сервера", e);
        }
    }

    @Override
    public synchronized void broadcastMessage(String message) {
        // метод оповещает клиента о подключении другого клиента
        clients.forEach(client -> client.sendMessage(message));
    }

    @Override
    public synchronized void sendPrivateMessage(String from, String name, String privateMessage) {
        // занимается пересылкой сообщений
        for (ClientHandler client : clients) {
            if (client.getName().equals(name)) {
                client.sendMessage(from + ": (private) " + privateMessage);
            }
        }
    }

    @Override
    public synchronized boolean isLoggedIn(String nickname) {
        // проверяет если в системе клиент с тем же логином и возвращает true или false
        return clients.stream()
                .filter(clientHandler -> clientHandler.getName().equals(nickname))
                .findFirst()
                .isPresent();
    }

    @Override
    public synchronized void subscribe(ClientHandler client) {
        // если в в чате нет одинаковых по имени клиентов ,то добовляет его в чат
        clients.add(client);
    }

    @Override
    public synchronized void unsubscribe(ClientHandler client) {
        clients.remove(client);
    }

    @Override
    public AuthenticationService getAuthenticationService() {
        // авторизация клиента
        return authenticationService;
    }

    @Override
    public Set<ClientHandler> getClients() {
        return clients;
    }
}