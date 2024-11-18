import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Server {
    HashMap clientMap;

    Server(){
        clientMap=new HashMap<>();
        Collections.synchronizedMap(clientMap);
    }
    public void start(){
        ServerSocket serverSocket =null;
        Socket socket=null;
        try {
            serverSocket=new ServerSocket(9999);
            System.out.println("서버시작");
            while(true){
                socket=serverSocket.accept();
                System.out.println(socket.getInetAddress()+" : "+socket.getPort()+" connected");
                ServerReceiver serverReceiver=new ServerReceiver(socket);
                serverReceiver.start();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    void sendAll(String msg){
        Iterator it=clientMap.keySet().iterator();
        while (it.hasNext()){
            try {
            DataOutputStream dataOutputStream=(DataOutputStream) clientMap.get(it.next());
            dataOutputStream.writeUTF(msg);

        } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static void main(String[] args) {
        new Server().start();
    }
    class ServerReceiver extends Thread{
        Socket socket;
        DataOutputStream dataOutputStream;
        DataInputStream dataInputStream;

        ServerReceiver(Socket socket){
            this.socket=socket;
            try {
                dataInputStream=new DataInputStream(socket.getInputStream());
                dataOutputStream=new DataOutputStream(socket.getOutputStream());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run(){
            String name="";
            try {
                name=dataInputStream.readUTF();
                if(dataInputStream!=null){
                    dataOutputStream.writeUTF("already exist name "+name);
                    dataOutputStream.writeUTF("Pleas reconnect");
                    System.out.println(socket.getInetAddress()+" : "+socket.getPort()+"disconnect");
                    dataInputStream.close();
                    dataInputStream.close();
                    socket.close();
                    socket=null;
                }
                else {sendAll(name+" come in");
                    clientMap.put(name, dataInputStream);
                    while (dataInputStream!=null){
                        sendAll(dataInputStream.readUTF());

                    }
            }
        } catch (Exception e) {
                throw new RuntimeException(e);
            }finally {
                if(socket!=null){
                    sendAll(name+" exit");
                    clientMap.remove(name);
                    System.out.println(socket.getInetAddress()+" : "+ socket.getPort()+" disconnect");
                }
            }
    }
}
}