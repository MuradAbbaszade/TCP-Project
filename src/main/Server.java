package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import util.ServerUtility;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(6799);
		while (true) {
			Socket socket = serverSocket.accept();
			String result = ServerUtility.readFromClient(socket);
			ServerUtility.writeIntoFile(result);
		}
	}

}
