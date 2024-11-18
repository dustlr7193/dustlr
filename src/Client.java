import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
      try {
          Socket socket = new Socket("127.0.0.1", 9999);
          System.out.println("name: ");
          Scanner scanner=new Scanner(System.in);
          String name=scanner.nextLine();
          Thread sender=new Thread(new ClientSender(socket,name));
          Thread receiver=new Thread(new ClientReceiver(socket));

          sender.start();
          receiver.start();

      } catch (IOException e) {
          throw new RuntimeException(e);
      }

    }
    static class ClientSender extends Thread{
        String name;
        Socket socket;
        DataOutputStream dataOutputStream;

        ClientSender(Socket socket,String name){
            this.socket=socket;
            this.name=name;
            try {
                dataOutputStream=new DataOutputStream(socket.getOutputStream());
                } catch (IOException e) {
                throw new RuntimeException(e);
            }
            }
            @Override
        public void run(){
            Scanner scanner=new Scanner(System.in);
            try {
                if(dataOutputStream!=null) dataOutputStream.writeUTF(name);
                    while (dataOutputStream!=null) {
                        String msg=scanner.nextLine();
                        if(msg.equals("quit"))
                            break;
                        dataOutputStream.writeUTF(" ["+name+"] "+msg);
                    }
                    dataOutputStream.close();
                    socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            }
        }
        static class ClientReceiver extends Thread{
        Socket socket;
        DataInputStream dataInputStream;

        ClientReceiver(Socket socket) {
            this.socket=socket;
            try {
                dataInputStream=new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        public void run(){
            while (dataInputStream!=null){
                try {
                    System.out.println(dataInputStream.readUTF());
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
            try {
                dataInputStream.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        }

    }
