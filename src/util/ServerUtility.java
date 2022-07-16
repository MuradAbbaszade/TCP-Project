package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ServerUtility {

	public static void writeIntoFile(String s) throws IOException {
		Path filePath = Paths.get("text1");
		Files.write(filePath, s.getBytes());
	}

	public static String readFromClient(Socket socket) throws IOException {
		InputStream is = socket.getInputStream();
		InputStreamReader reader = new InputStreamReader(is);
		BufferedReader bReader = new BufferedReader(reader);
		String result = bReader.readLine();
		while (bReader.readLine() != null) {
			result += bReader.readLine();
		}
		return result;
	}
}
