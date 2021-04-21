package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.77",8188);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out= new DataOutputStream(socket.getOutputStream());
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String response = null; // Читаем ответ сервера
                        try {
                            response = in.readUTF();
                            System.out.println(response);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                }
            });
            thread.start();
            while (true){
                Scanner scanner = new Scanner(System.in);
                String request = scanner.nextLine();
                out.writeUTF(request); // Отправляем сообщение серверу
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
