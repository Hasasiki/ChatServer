package OS_Project;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	//���������
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SocketServer socketServer = new SocketServer();
		//����һ����������socket
		socketServer.oneServer();
	}

	public void oneServer() {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = null;
			try {
				server = new ServerSocket(5209);
				//ָ���󶨵Ķ˿ڲ������˶˿�
			}
		}
	}

}
