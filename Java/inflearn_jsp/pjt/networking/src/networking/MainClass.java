package networking;

import java.net.ServerSocket;
import java.net.Socket;

public class MainClass {
	
	public static void main(String[] args) {
		
		ServerSocket serversocket = null;
		Socket socket = null;
		
		try {
			
			serversocket = new ServerSocket(9000);
			System.out.println("Ŭ���̾�Ʈ ���� �غ� �Ϸ�!!");
			
			socket = serversocket.accept();
			System.out.println("Ŭ���̾�Ʈ ����!!");
			System.out.println("socket : " + socket);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serversocket != null) serversocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
