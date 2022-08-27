package com.raystec.Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void talk(Socket sc) throws Exception {
		PrintWriter out = new PrintWriter(sc.getOutputStream(), true);

		BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

		String line = br.readLine();

		while (line != null) {

			System.out.println("server recieved: " + line);

			out.println(line + ".." + line);

			if (line.equals("stop")) {
				break;
			}
			line = br.readLine();
		}
		out.close();
		br.close();
		sc.close();

	}

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(2009);
		
		System.out.println("your server has been started...!");
		
		Socket client = null;
		
		boolean b = true;
		
		while (b) {
			client = ss.accept();
			talk(client);
		}
		ss.close();
		System.out.println("ok by......!");
	}
}
