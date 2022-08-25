package com.raystec.Networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {

		Socket client = new Socket("127.0.0.1", 2009);

		PrintWriter out = new PrintWriter(client.getOutputStream(), true);

		BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));

		System.out.println("Client side");

		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String line = br1.readLine();

		while (line != null) {

			out.println(line);

			System.out.println("Server Side: " + br.readLine());

			if ("chlbhg".equals(line)) {
				break;
			}
			line = br1.readLine();
		}
		out.close();
		br.close();

		br1.close();
		client.close();
	}

}
